package modelo;

import java.sql.Date;

public class Padecimiento {
	private String nombrePadecimiento;
	private String descripcion;
	private Date fechaPadecimiento;
	public Padecimiento(String nombrePadecimiento, String descripcion,
			Date fechaPadecimiento) {
		super();
		this.nombrePadecimiento = nombrePadecimiento;
		this.descripcion = descripcion;
		this.fechaPadecimiento = fechaPadecimiento;
	}
	public String getNombrePadecimiento() {
		return nombrePadecimiento;
	}
	public void setNombrePadecimiento(String nombrePadecimiento) {
		this.nombrePadecimiento = nombrePadecimiento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaPadecimiento() {
		return fechaPadecimiento;
	}
	public void setFechaPadecimiento(Date fechaPadecimiento) {
		this.fechaPadecimiento = fechaPadecimiento;
	}
	@Override
	public String toString() {
		return "Padecimiento [nombrePadecimiento=" + nombrePadecimiento
				+ ", descripcion=" + descripcion + ", fechaPadecimiento="
				+ fechaPadecimiento + "]";
	}
}
