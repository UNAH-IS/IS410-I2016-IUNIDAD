package clases;

public class PersonaUniversitaria {
	protected String nombre;
	protected String apellido;
	protected String genero;
	protected int edad;
	protected String carrera;
	protected String identidad;
	
	
	public PersonaUniversitaria(String nombre, 
			String apellido, 
			String genero,
			int edad, 
			String carrera, 
			String identidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
		this.carrera = carrera;
		this.identidad = identidad;
	}
	
	public PersonaUniversitaria(){}
	
	public void matricular(){}
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

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
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

