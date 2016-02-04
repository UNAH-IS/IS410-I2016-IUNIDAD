package implementacion;

import clases.Alumno;
import clases.PersonaUniversitaria;

public class Principal {
	public Principal(){
		PersonaUniversitaria pu;
		Alumno a = new Alumno(
				"Juan","Perez","M",20,
				"Ing. Sistemas","102265656",
				"199821321"
		);
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
