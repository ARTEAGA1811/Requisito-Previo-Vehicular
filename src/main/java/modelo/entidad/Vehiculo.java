package modelo.entidad;

import java.io.Serializable;

public class Vehiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String placa;
	private String chasis;
	private String marca;
	private String modelo;
	private String propietario;
	private String anio;

	public Vehiculo() {
		
	}
	
	

	public Vehiculo(int id, String placa, String chasis, String marca, String modelo, String propietario, String anio) {
		super();
		this.id = id;
		this.placa = placa;
		this.chasis = chasis;
		this.marca = marca;
		this.modelo = modelo;
		this.propietario = propietario;
		this.anio = anio;
	}
	



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	


	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", placa=" + placa + ", chasis=" + chasis + ", marca=" + marca + ", modelo="
				+ modelo + ", propietario=" + propietario + ", anio=" + anio + "]";
	}
	
	

}
