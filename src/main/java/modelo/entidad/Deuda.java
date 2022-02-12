package modelo.entidad;

import java.io.Serializable;

public class Deuda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String anio;
	private String valor;
	private int idVehiculo;
	
	public Deuda(int id, String anio, String valor, int idVehiculo) {
		this.id = id;
		this.anio = anio;
		this.valor = valor;
		this.idVehiculo = idVehiculo;
	}
	
	public Deuda(String anio, String valor, int idVehiculo) {
		this.anio = anio;
		this.valor = valor;
		this.idVehiculo = idVehiculo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	
	@Override
	public String toString() {
		return "Deuda [id=" + id + ", anio=" + anio + ", valor=" + valor + "]";
	}
	
	
	
	
	
	
	

}
