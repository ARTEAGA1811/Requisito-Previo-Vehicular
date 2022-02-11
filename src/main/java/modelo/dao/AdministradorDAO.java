package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.conexion.ConexionBDD;
import modelo.entidad.Administrador;

public class AdministradorDAO {
	public AdministradorDAO() {
		
	}
	
	public Administrador autenticar(String nombre, String clave) {
		Administrador adminAuten = null;
		
		try {
			ResultSet rs = null;
			PreparedStatement pstmt = null;
			pstmt = ConexionBDD.getConexion().prepareStatement("SELECT * FROM ADMINISTRADOR WHERE nombre = ? AND clave = ?");
			pstmt.setString(1, nombre);
			pstmt.setString(2, clave);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				adminAuten = new Administrador();
				adminAuten.setId(rs.getInt("id"));
				adminAuten.setNombre(rs.getString("nombre"));
				adminAuten.setClave(rs.getString("clave"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adminAuten;
	}
	
	
}
