package clases;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected String identidad;
	protected String genero;
	protected String fecha_nacimiento;

	public Persona(){}

	public Persona(String nombre, String apellido, String identidad, String genero, String fecha_nacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.identidad = identidad;
		this.genero = genero;
		this.fecha_nacimiento = fecha_nacimiento;
	}

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

	public String getIdentidad() {
		return identidad;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", identidad=" + identidad + ", genero="
				+ genero + ", fecha_nacimiento=" + fecha_nacimiento + "]";
	}



}
