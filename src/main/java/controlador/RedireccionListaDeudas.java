package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.persistence.jpa.jpql.parser.EncapsulatedIdentificationVariableExpression;

import modelo.dao.DeudaDAO;
import modelo.entidad.Deuda;

/**
 * Servlet implementation class RedireccionListaDeudas
 */
@WebServlet("/RedireccionListaDeudas")
public class RedireccionListaDeudas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedireccionListaDeudas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("entra aca");
		try {
			System.out.println("Estoy en redireccion: " + request.getParameter("idVehiculo"));
			System.out.println("Estoy en redireccion: " + request.getParameter("placa"));
			
		}catch(Exception e) {
			System.out.println("No se pudieron obtener los datos 1");
		}
		
		try {
			System.out.println("Estoy en redireccion: " + request.getAttribute("idVehiculo"));
			System.out.println("Estoy en redireccion: " + request.getAttribute("placa"));
			
		}catch(Exception e) {
			System.out.println("No se pudieron obtener los datos 2");
		}
		
		
		
		String idd = String.valueOf(request.getAttribute("idVehiculo"));
		int miId = Integer.parseInt(idd);
		String miPlaca = (String) request.getAttribute("placa");
		
		System.out.println(miId + " " + miPlaca);
		
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
		doGet(request, response);
	}

}
