package modelo;

public class Medico extends Persona {
	private int numeroConsultorio;
	private String especialidad;
	public Medico(String nombre, String apellido, int edad, String genero,
			int numeroConsultorio, String especialidad) {
		super(nombre, apellido, edad, genero);
		this.numeroConsultorio = numeroConsultorio;
		this.especialidad = especialidad;
	}
	public int getNumeroConsultorio() {
		return numeroConsultorio;
	}
	public void setNumeroConsultorio(int numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	@Override
	public String toString() {
		return nombre + " " + apellido + " (" + especialidad + ")";
	}	
}
