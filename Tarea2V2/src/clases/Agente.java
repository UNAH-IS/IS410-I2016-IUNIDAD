package clases;

public class Agente extends Persona {
	private int codigo_empleado;
	private double salario_base;

	public Agente(){}

	public Agente(String nombre, String apellido, String identidad, String genero, String fecha_nacimiento,
			int codigo_empleado, int salario_base) {
		super(nombre, apellido, identidad, genero, fecha_nacimiento);
		this.codigo_empleado = codigo_empleado;
		this.salario_base = salario_base;
	}

	public int getCodigo_empleado() {
		return codigo_empleado;
	}

	public void setCodigo_empleado(int codigo_empleado) {
		this.codigo_empleado = codigo_empleado;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(int salario_base) {
		this.salario_base = salario_base;
	}

	@Override
	public String toString() {
		return "Agente [codigo_empleado=" + codigo_empleado + ", salario_base=" + salario_base + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", identidad=" + identidad + ", genero=" + genero + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}




}
