package clases;

public class Principal {

	public Principal(){
		Alumno a = new Alumno("Juan");
		//Alumno b = a;
		Alumno b = new Alumno(a);
		a.setNombre("Pedro");
		System.out.println(a.getNombre());//Pedro
		System.out.println(b.getNombre());//Juan
	}
	public static void main(String[] args) {
		new Principal();
	}

}
