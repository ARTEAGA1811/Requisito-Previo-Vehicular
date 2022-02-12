package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.VehiculoDAO;

/**
 * Servlet implementation class EliminarVehiculoController
 */
@WebServlet("/EliminarVehiculoController")
public class EliminarVehiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EliminarVehiculoController() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. Llamo a la vista o al controlador
		request.getRequestDispatcher("ListarPersonasController").forward(request, response);
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idVehiculo = Integer.parseInt(request.getParameter("id"));
		VehiculoDAO miVehiculoDao = new VehiculoDAO();
		miVehiculoDao.eliminar(idVehiculo);
		
		doGet(request, response);
		
		
		
	}

}
