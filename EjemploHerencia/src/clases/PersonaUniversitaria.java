package clases;

import java.util.ArrayList;

public abstract class PersonaUniversitaria {
	protected String nombre;
	protected String apellido;
	protected String genero;
	protected int edad;
	protected Carrera carrera; //Composicion
	protected ArrayList<Carrera> carreras; //Colecciones
	protected String identidad;
	
	
	public PersonaUniversitaria(String nombre, 
			String apellido, 
			String genero,
			int edad, 
			Carrera carrera, 
			String identidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
		this.carrera = carrera;
		this.identidad = identidad;
	}
	
	public PersonaUniversitaria(){}
	
	public abstract void matricular();
		
	public void aprobar(){}
	public void reprobrar(){}
	public void mostrarInformacion(){}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public String getIdentidad() {
		return identidad;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

	@Override
	public String toString() {
		return "PersonaUniversitaria [nombre=" + nombre + ", apellido="
				+ apellido + ", genero=" + genero + ", edad=" + edad
				+ ", carrera=" + carrera + ", identidad=" + identidad + "]";
	}	
}

