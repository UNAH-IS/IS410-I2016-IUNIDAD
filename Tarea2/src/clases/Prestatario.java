package clases;
public class Prestatario extends Persona {
	private String fecha_registro;

	public Prestatario(){}

	public Prestatario(String nombre, String apellido, String identidad, String genero, String fecha_nacimiento,
			String fecha_registro) {
		super(nombre, apellido, identidad, genero, fecha_nacimiento);
		this.fecha_registro = fecha_registro;
	}

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	@Override
	public String toString() {
		return  nombre + " " + apellido;
	}




}
