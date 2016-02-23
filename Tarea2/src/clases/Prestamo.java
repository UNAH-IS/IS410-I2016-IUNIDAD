package clases;

import java.util.ArrayList;

public class Prestamo {
	private String codigo_prestamo;
	private Prestatario prestatario;
	private Aval aval1;
	private Aval aval2;
	private Agente agente;
	private Sucursal sucursal;

	public Prestamo(){}

	public Prestamo(String codigo_prestamo,Prestatario prestatario, Aval aval1, Aval aval2, Agente agente, Sucursal sucursal) {
		this.codigo_prestamo= codigo_prestamo;
		this.prestatario = prestatario;
		this.aval1 = aval1;
		this.aval2 = aval2;
		this.agente = agente;
		this.sucursal = sucursal;

	}

	private String getCodigo_prestamo() {
		return codigo_prestamo;
	}

	private void setCodigo_prestamo(String codigo_prestamo) {
		this.codigo_prestamo = codigo_prestamo;
	}

	public Prestatario getPrestatario() {
		return prestatario;
	}

	public void setPrestatario(Prestatario prestatario) {
		this.prestatario = prestatario;
	}

	public Aval getAval1() {
		return aval1;
	}

	public void setAval1(Aval aval1) {
		this.aval1 = aval1;
	}

	public Aval getAval2() {
		return aval2;
	}

	public void setAval2(Aval aval2) {
		this.aval2 = aval2;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return  codigo_prestamo + " - " +  prestatario ;
	}








}
