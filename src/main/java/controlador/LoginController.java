package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dao.AdministradorDAO;
import modelo.entidad.Administrador;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
    	
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/jsp/consulta/consulta_login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 Obtener los parametros de la Vista
		String usuario = request.getParameter("txtUsuario");
		String clave = request.getParameter("txtClave");
		//2 Llamar al modelo para autenticar
		AdministradorDAO adminDAO = new AdministradorDAO();
		Administrador adminAuten = adminDAO.autenticar(usuario, clave);
		
		if(adminAuten != null) {
			HttpSession miSesion = request.getSession();
			miSesion.setAttribute("miAdmin", adminAuten);
			request.setAttribute("nombreAdmin", adminAuten.getNombre().toUpperCase());
			
			//request.getServletContext().getRequestDispatcher("/ListarVehiculoController").forward(request, response);
			request.getRequestDispatcher("ListarVehiculoController").forward(request, response);
		}else {
			request.setAttribute("autenticacion", "falso");
			getServletContext().getRequestDispatcher("/jsp/consulta/consulta_login.jsp").forward(request, response);
			
		}
	}
}
