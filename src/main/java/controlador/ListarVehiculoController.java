package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.VehiculoDAO;
import modelo.entidad.Vehiculo;


@WebServlet("/ListarVehiculoController")
public class ListarVehiculoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListarVehiculoController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		VehiculoDAO miVehiculoDAO = new VehiculoDAO();
		List <Vehiculo> listaVehiculos = miVehiculoDAO.getVehiculos();
		request.setAttribute("vehiculos", listaVehiculos);
		getServletContext().getRequestDispatcher("/jsp/administrador/listaVehiculos.jsp").forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
