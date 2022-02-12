package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.DeudaDAO;
import modelo.dao.VehiculoDAO;
import modelo.entidad.Deuda;
import modelo.entidad.Vehiculo;


@WebServlet("/ConsultarVehiculoController")
public class ConsultarVehiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ConsultarVehiculoController() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String placa_chasis = request.getParameter("rbtnRadio");
		String valor_placa_chasis = request.getParameter("valor_placa_chasis");
		System.out.println("La placa o chasis: " + placa_chasis);
		System.out.println("Valor de la placa o chasis: " + valor_placa_chasis);
		
		VehiculoDAO miVehiculoDAO = new VehiculoDAO();
		Vehiculo miVehiculo = miVehiculoDAO.getVehiculo(placa_chasis,valor_placa_chasis);
		
		DeudaDAO miDeudaDao = new DeudaDAO();
		List<Deuda> misDeudas = miDeudaDao.getDeudas(miVehiculo.getId());
		
		request.setAttribute("miVehiculo", miVehiculo);
		request.setAttribute("misDeudas", misDeudas);
		
		getServletContext().getRequestDispatcher("/jsp/consulta/informacionVehiculo.jsp").forward(request, response);
	
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

