package clases;
public class Aval extends Persona {
	private int codigo_aval;
	private int parentesco_aval;

	public Aval(){}

	public Aval(String nombre, String apellido, String identidad, String genero, String fecha_nacimiento,
			int codigo_aval, int parentesco_aval) {
		super(nombre, apellido, identidad, genero, fecha_nacimiento);
		this.codigo_aval = codigo_aval;
		this.parentesco_aval = parentesco_aval;
	}

	public int getCodigo_aval() {
		return codigo_aval;
	}

	public void setCodigo_aval(int codigo_aval) {
		this.codigo_aval = codigo_aval;
	}

	public int getParentesco_aval() {
		return parentesco_aval;
	}

	public void setParentesco_aval(int parentesco_aval) {
		this.parentesco_aval = parentesco_aval;
	}

	@Override
	public String toString() {
		return "Aval [codigo_aval=" + codigo_aval + ", parentesco_aval=" + parentesco_aval + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", identidad=" + identidad + ", genero=" + genero + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}




}
