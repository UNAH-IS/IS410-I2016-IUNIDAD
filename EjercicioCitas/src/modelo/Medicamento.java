package modelo;

import java.sql.Date;

public class Medicamento {
	private String nombre;
	private String presentacion;
	private Date fechaVencimiento;
	public Medicamento(String nombre, String presentacion, Date fechaVencimiento) {
		this.nombre = nombre;
		this.presentacion = presentacion;
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	@Override
	public String toString() {
		return nombre;
	}	
	
}
