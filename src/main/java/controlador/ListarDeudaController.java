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
import modelo.dao.VehiculoDAO;
import modelo.entidad.Deuda;
import modelo.entidad.Vehiculo;

@WebServlet("/ListarDeudaController")
public class ListarDeudaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListarDeudaController() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int miId = Integer.parseInt(request.getParameter("idVehiculo"));
		String miPlaca = request.getParameter("placa");

		System.out.println("Se imprime el id: " + miId);
		
		//if(request.getParameter("idVehiculo") == null) {
		//	miId = Integer.parseInt(String.valueOf(request.getAttribute("idVehiculo")));
		//	miPlaca = (String) request.getAttribute("placa");	
		//}
		
		DeudaDAO miDeudaDao = new DeudaDAO();
		List<Deuda> misDeudas= miDeudaDao.getDeudas(miId);
		
		
		//Agregar datos al request
		request.setAttribute("deudas", misDeudas );
		request.setAttribute("placa", miPlaca);
		
		
		//Se debe redireccionar a la pagina de listar deudas	
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/administrador/listaDeudas.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
