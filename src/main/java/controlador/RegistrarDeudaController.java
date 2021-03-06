package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.DeudaDAO;
import modelo.entidad.Deuda;

/**
 * Servlet implementation class RegistrarDeudaController
 */
@WebServlet("/RegistrarDeudaController")
public class RegistrarDeudaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrarDeudaController() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. Llamo a la vista o al controlador
		request.getRequestDispatcher("ListarDeudaController").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idVehiculo = Integer.parseInt(request.getParameter("id"));
		String nuevoValor  = request.getParameter("valor");
		String nuevoAnio = request.getParameter("anio");
		String miPlaca = request.getParameter("placa");
		
		System.out.println("RegistrarDeuda: " + idVehiculo + " " + miPlaca);
		
		Deuda miDeuda = new Deuda(nuevoAnio, nuevoValor, idVehiculo);
		
		DeudaDAO miDeudaDAO = new DeudaDAO();
		miDeudaDAO.registrar(miDeuda);
		
		request.setAttribute("idVehiculo", idVehiculo);
		request.setAttribute("placa", miPlaca);
		
		request.getServletContext().getRequestDispatcher("/RedireccionListaDeudas").forward(request,response);
		//request.getServletContext().getRequestDispatcher("/ListarDeudaController").forward(request,response);
		
	}

}
