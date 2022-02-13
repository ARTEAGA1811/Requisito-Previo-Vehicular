package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.VehiculoDAO;
import modelo.entidad.Vehiculo;

@WebServlet("/ActualizarVehiculoController")
public class ActualizarVehiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ActualizarVehiculoController() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VehiculoDAO vehiculodao = new VehiculoDAO();
		Vehiculo miVehiculo = new Vehiculo();
		
		int id = vehiculodao.getVehiculo("placa", request.getParameter("placa")).getId();
		
		miVehiculo.setAnio(request.getParameter("anio"));
		miVehiculo.setChasis(request.getParameter("chasis"));
		miVehiculo.setModelo(request.getParameter("modelo"));
		miVehiculo.setPropietario(request.getParameter("propietario"));
		miVehiculo.setPlaca(request.getParameter("placa"));
		miVehiculo.setMarca(request.getParameter("marca"));
		miVehiculo.setId(id);
		
		boolean estaActualizado = vehiculodao.actualizar(miVehiculo);
		if(estaActualizado) {
			request.getRequestDispatcher("ListarVehiculoController").forward(request, response);
		}else {
			System.out.println("Error al actualizar el vehiculo");
			request.getRequestDispatcher("ListarVehiculoController").forward(request, response);		
		}
	}

}
