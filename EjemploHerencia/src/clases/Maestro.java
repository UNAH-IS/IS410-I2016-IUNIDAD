package clases;

public class Maestro extends PersonaUniversitaria {
	private String numeroEmpleado;
	private double salario;
	
	public Maestro(String nombre, String apellido, String genero, int edad,
			Carrera carrera, String identidad, String numeroEmpleado,
			double salario) {
		super(nombre, apellido, genero, edad, carrera, identidad);
		this.numeroEmpleado = numeroEmpleado;
		this.salario = salario;
	}

	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + "Maestro [numeroEmpleado=" + numeroEmpleado + ", salario="
				+ salario + "]";
	}
	
	@Override
	public void matricular(){
		System.out.println("Matricular Maestro");
	}
}
