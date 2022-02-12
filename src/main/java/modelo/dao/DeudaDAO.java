package modelo.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.conexion.ConexionBDD;
import modelo.entidad.Deuda;

public class DeudaDAO {
	private static final String SQL_SELECT = "SELECT * FROM DEUDA WHERE idVehiculo = ?";
	private static final String SQL_SELECT_INSERT = "INSERT INTO DEUDA (anio,valor, idVehiculo) VALUES(?,?,?)";
	public DeudaDAO() {
		
	}
	
	public List<Deuda> getDeudas(int idVehiculo){
		List<Deuda> deudas = new ArrayList<>();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			pstmt = ConexionBDD.getConexion().prepareStatement(SQL_SELECT);
			pstmt.setInt(1, idVehiculo);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Deuda deuda = new Deuda(rs.getInt("id"),rs.getString("anio"),rs.getString("valor"), idVehiculo);
				deudas.add(deuda);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deudas;
	}
	
	public boolean registrar(Deuda miDeuda) {
		PreparedStatement pstmt = null;
		try {
			pstmt = ConexionBDD.getConexion().prepareStatement(SQL_SELECT_INSERT);
			pstmt.setString(1, miDeuda.getAnio());
			pstmt.setString(2, miDeuda.getValor());
			pstmt.setInt(3, miDeuda.getIdVehiculo());
			int aux = pstmt.executeUpdate();
			System.out.print("Numero de filas afectadas: " + aux);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	
}
