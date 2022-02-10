package modelo.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import modelo.conexion.ConexionBDD;
import modelo.entidad.Deuda;

public class DeudaDAO {
	private static final String SQL_SELECT = "SELECT * FROM DEUDA";
	private static final String SQL_SELECT_INSERT = "INSERT INTO DEUDA (anio,valor) VALUES(?,?)";
	public DeudaDAO() {
		
	}
	
	public List<Deuda> getDeudas(){
		List<Deuda> deudas = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			pstmt = ConexionBDD.getConexion().prepareStatement(SQL_SELECT);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Deuda deuda = new Deuda(rs.getInt("id"),rs.getString("anio"),rs.getString("valor"));
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
			int aux = pstmt.executeUpdate();
			System.out.print("Numero de filas afectadas: " + aux);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
