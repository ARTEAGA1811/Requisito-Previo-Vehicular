package modelo.entidad;

import java.io.Serializable;

public class Administrador implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String nombre;
	private String clave;
	

	public Administrador() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	@Override
	public String toString() {
		return "Administrador [id=" + id + ", nombre=" + nombre + ", clave=" + clave + "]";
	}
	
	

}
