package clases;

public class Alumno {
	private String nombre;

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//Constructor por copia
	public Alumno(Alumno a){
		this.nombre = a.getNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}	
