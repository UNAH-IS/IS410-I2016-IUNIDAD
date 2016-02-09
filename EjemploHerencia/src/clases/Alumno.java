package clases;

public class Alumno extends PersonaUniversitaria{
	private String cuenta;
	
	/*public Alumno(String nombre, 
			String apellido, 
			String genero,
			int edad, 
			String carrera, 
			String identidad,
			String cuenta){
		super(nombre, apellido, genero, edad, carrera, identidad);
		this.cuenta = cuenta;
	}*/
	
	
	
	public Alumno(){}
	
	public Alumno(String nombre, String apellido, String genero, int edad,
			Carrera carrera, String identidad, String cuenta) {
		super(nombre, apellido, genero, edad, carrera, identidad);
		this.cuenta = cuenta;
	}


	public void estudiar(){}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Alumno [cuenta=" + cuenta + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", genero=" + genero + ", edad="
				+ edad + ", carrera=" + carrera + ", identidad=" + identidad
				+ "]";
	}

	public void matricular(){
		//Ejecutar instrucciones de clase padre:
		/*System.out.println("Desde alumno llamar a matricular de la clase padre");
		super.matricular();*/
		System.out.println("Matricular Alumno");
	}
}
