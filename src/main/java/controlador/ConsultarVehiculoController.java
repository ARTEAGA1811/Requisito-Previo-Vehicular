package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.VehiculoDAO;
import modelo.entidad.Vehiculo;


@WebServlet("/ConsultarVehiculoController")
public class ConsultarVehiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ConsultarVehiculoController() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("idVehiculo"));
		VehiculoDAO miVehiculoDAO = new VehiculoDAO();
		Vehiculo miVehiculo = miVehiculoDAO.getVehiculo(id);
		
		request.setAttribute("miVehiculo", miVehiculo);
		getServletContext().getRequestDispatcher("/jsp/consulta/informacionVehiculo.jsp").forward(request, response);
	
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

