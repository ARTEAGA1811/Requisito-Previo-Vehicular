package modelo.entidad;

import java.io.Serializable;

public class Deuda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String anio;
	private String valor;
	
	public Deuda(int id, String anio, String valor) {
		super();
		this.id = id;
		this.anio = anio;
		this.valor = valor;
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
	@Override
	public String toString() {
		return "Deuda [id=" + id + ", anio=" + anio + ", valor=" + valor + "]";
	}
	
	
	
	
	
	
	

}
