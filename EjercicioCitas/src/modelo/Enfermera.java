package modelo;

public class Enfermera extends Persona {
	private int codigoColegiacion;
	private String examenes;
	public Enfermera(String nombre, String apellido, int edad, String genero,
			int codigoColegiacion, String examenes) {
		super(nombre, apellido, edad, genero);
		this.codigoColegiacion = codigoColegiacion;
		this.examenes = examenes;
	}
	public int getCodigoColegiacion() {
		return codigoColegiacion;
	}
	public void setCodigoColegiacion(int codigoColegiacion) {
		this.codigoColegiacion = codigoColegiacion;
	}
	public String getExamenes() {
		return examenes;
	}
	public void setExamenes(String examenes) {
		this.examenes = examenes;
	}
	@Override
	public String toString() {
		return nombre + " " + apellido;
	}	 
}
