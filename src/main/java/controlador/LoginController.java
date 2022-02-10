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
		getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 Obtener los parametros de la Vista
		String usuario = request.getParameter("user");
		String clave = request.getParameter("pass");
		//2 Lammar al modelo para autenticar
		AdministradorDAO adminDAO = new AdministradorDAO();
		Administrador adminAuten = adminDAO.autenticar(usuario, clave);
		if(adminAuten != null) {
			HttpSession miSesion = request.getSession();
			miSesion.setAttribute("usuario", adminAuten);
			//3 Llamar a la vista o al controlador
			request.getRequestDispatcher("ListarPersonaController").forward(request, response);
		}else {
			response.sendRedirect("/jsp/login.jsp");
		}
	}
}
