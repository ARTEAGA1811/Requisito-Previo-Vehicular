package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.VehiculoDAO;
import modelo.entidad.Vehiculo;

/**
 * Servlet implementation class RedireccionController
 */
@WebServlet("/RedireccionController")
public class RedireccionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RedireccionController() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Si es 0 se redirige a la GUI de registrar un nuevo auto
		//Si es 1 se redirige a la GUI de actualizar un auto
		if(request.getParameter("redireccion").equals("0")) {
			getServletContext().getRequestDispatcher("/jsp/administrador/registrarVehiculo.jsp").forward(request, response);
		}else if(request.getParameter("redireccion").equals("1")) {
			String miPlaca = request.getParameter("placa");
			VehiculoDAO vehiculodao = new VehiculoDAO();
			
			Vehiculo miVehiculo = vehiculodao.getVehiculo("placa", miPlaca);
			
			request.setAttribute("placa", miVehiculo.getPlaca());
			request.setAttribute("marca", miVehiculo.getMarca());
			request.setAttribute("anio", miVehiculo.getAnio());
			request.setAttribute("modelo", miVehiculo.getModelo());
			request.setAttribute("chasis", miVehiculo.getChasis());
			request.setAttribute("propietario", miVehiculo.getPropietario());
			
			getServletContext().getRequestDispatcher("/jsp/administrador/actualizarVehiculo.jsp").forward(request, response);
		}else {
			System.out.println("Ha ocurrido un error en la redireccion");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
