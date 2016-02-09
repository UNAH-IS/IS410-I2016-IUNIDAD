package clases;

public class Carrera {
	private int codigoCarrera;
	private String nombreCarrera;
	private int cantidadAsignaturas;
	private int aniosDuracion;
	private String jefeDepartamento;
	
	public Carrera(int codigoCarrera, String nombreCarrera,
			int cantidadAsignaturas, int aniosDuracion, String jefeDepartamento) {
		this.codigoCarrera = codigoCarrera;
		this.nombreCarrera = nombreCarrera;
		this.cantidadAsignaturas = cantidadAsignaturas;
		this.aniosDuracion = aniosDuracion;
		this.jefeDepartamento = jefeDepartamento;
	}
	
	public Carrera(){}

	public int getCodigoCarrera() {
		return codigoCarrera;
	}

	public void setCodigoCarrera(int codigoCarrera) {
		this.codigoCarrera = codigoCarrera;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public int getCantidadAsignaturas() {
		return cantidadAsignaturas;
	}

	public void setCantidadAsignaturas(int cantidadAsignaturas) {
		this.cantidadAsignaturas = cantidadAsignaturas;
	}

	public int getAniosDuracion() {
		return aniosDuracion;
	}

	public void setAniosDuracion(int aniosDuracion) {
		this.aniosDuracion = aniosDuracion;
	}

	public String getJefeDepartamento() {
		return jefeDepartamento;
	}

	public void setJefeDepartamento(String jefeDepartamento) {
		this.jefeDepartamento = jefeDepartamento;
	}

	@Override
	public String toString() {
		return "Carrera [codigoCarrera=" + codigoCarrera + ", nombreCarrera="
				+ nombreCarrera + ", cantidadAsignaturas="
				+ cantidadAsignaturas + ", aniosDuracion=" + aniosDuracion
				+ ", jefeDepartamento=" + jefeDepartamento + "]";
	}
}
