package modelo.dao;

import java.sql.PreparedStatement;
import modelo.conexion.ConexionBDD;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import modelo.entidad.Vehiculo;

public class VehiculoDAO {
	
	private static final String SQL_READ = "SELECT * FROM VEHICULO";
	private static final String SQL_INSERT = "INSERT INTO VEHICULO (placa, chasis, marca, modelo, propietario, año) VALUES (?,?,?,?,?,?)";
	private static final String SQL_UPDATE = "UPDATE VEHICULO SET  chasis = ?, marca = ?, modelo = ?, propietario = ?, anio = ? where id = ?";
	private static final String SQL_DELETE = "DELETE  FROM VEHICULO WHERE id = ?";
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;
	
	public VehiculoDAO() {
		
	}
	
	public List<Vehiculo> getVehiculos(){
		
		List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		
		Vehiculo miVehiculo = null;
		try {
						
			pstmt = ConexionBDD.getConexion().prepareStatement(SQL_READ);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				miVehiculo = new Vehiculo();
				miVehiculo.setPlaca(rs.getString("placa"));
				miVehiculo.setChasis(rs.getString("chasis"));
				miVehiculo.setMarca(rs.getString("marca"));
				miVehiculo.setModelo(rs.getString("modelo"));
				miVehiculo.setPropietario(rs.getString("propietario"));
				miVehiculo.setAnio(rs.getString("anio"));
				
				listaVehiculos.add(miVehiculo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listaVehiculos;
	}
	
	public boolean actualizar(Vehiculo miVehiculo) {
		
		try {
			pstmt = ConexionBDD.getConexion().prepareStatement(SQL_UPDATE);
			pstmt.setString(1, miVehiculo.getChasis());
			pstmt.setString(2, miVehiculo.getMarca());
			pstmt.setString(3, miVehiculo.getModelo());
			pstmt.setString(4, miVehiculo.getPropietario());
			pstmt.setString(5, miVehiculo.getAnio());
			int fila = pstmt.executeUpdate();
			System.out.println("Numero de filas afectadas :" + fila);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean eliminar(int id) {
		try {
			pstmt = ConexionBDD.getConexion().prepareStatement(SQL_DELETE);
			int fila = pstmt.executeUpdate();
			System.out.println("Numero de filas afectadas :" + fila);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean registrar(Vehiculo miVehiculo) {
		
		try {
			pstmt = ConexionBDD.getConexion().prepareStatement(SQL_INSERT);
			pstmt.setString(1, miVehiculo.getPlaca());
			pstmt.setString(2, miVehiculo.getChasis());
			pstmt.setString(3, miVehiculo.getMarca());
			pstmt.setString(4, miVehiculo.getModelo());
			pstmt.setString(5, miVehiculo.getPropietario());
			pstmt.setString(6, miVehiculo.getAnio());
			
			int fila = pstmt.executeUpdate();
			System.out.println("Numero de filas afectadas :" + fila);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public Vehiculo getVehiculo(String placa_chasis, String valor_placa_chasis) {
		
		Vehiculo miVehiculo = new Vehiculo();
		
		try {
			pstmt = ConexionBDD.getConexion().prepareStatement("SELECT * FROM VEHICULO WHERE "+placa_chasis+" = ?");
			pstmt.setString(1, valor_placa_chasis);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				miVehiculo = new Vehiculo();
				miVehiculo.setId(rs.getInt("id"));
				miVehiculo.setPlaca(rs.getString("placa"));
				miVehiculo.setChasis(rs.getString("chasis"));
				miVehiculo.setMarca(rs.getString("marca"));
				miVehiculo.setModelo(rs.getString("modelo"));
				miVehiculo.setPropietario(rs.getString("propietario"));
				miVehiculo.setAnio(rs.getString("anio"));					
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(miVehiculo);
		return miVehiculo;
	}
	
}
