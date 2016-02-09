package implementacion;

import java.util.ArrayList;

import clases.Alumno;
import clases.Carrera;
import clases.Maestro;
import clases.PersonaUniversitaria;

public class Principal {
	private ArrayList<PersonaUniversitaria> personas;
	private PersonaUniversitaria p;
	public Principal(){
		personas = new ArrayList<PersonaUniversitaria>();
		p = new Alumno();
		//objetoTipoPadre = new ClaseHija();
		
		Carrera carrera = 
				new Carrera(115,"Ingenieria en sistemas",54, 5, "Eduardo Gross");
		
		Alumno a = new Alumno(
				"Juan","Perez","M",20,
				new Carrera(115,"Ingenieria en sistemas",54, 5, "Eduardo Gross"),"102265656",
				"199821321"
		);
		
		Alumno a1 = new Alumno(
				"Luis","Mendez","M",20,
				carrera,"102265656",
				"199821321"
		);
		
		Alumno a2 = new Alumno(
				"Maria","Rodriguez","F",20,
				carrera,"102265656",
				"199821321"
		);
		
		Alumno a3 = new Alumno(
				"Mario","Lopez","M",20,
				carrera,"102265656",
				"199821321"
		);
		
		Maestro m = new Maestro(
				"Pedro","Rodriguez","M",50,
				carrera,"4554665",
				"4654654",3456.66
		);
		
		Maestro m1 = new Maestro(
				"Matusalen","Lainez","M",50,
				carrera,"4554665",
				"4654654",3456.66
		);
		
		Maestro m2 = new Maestro(
				"Rodrigo","Rodriguez","M",50,
				carrera,"4554665",
				"4654654",3456.66
		);
		
		Maestro m3 = new Maestro(
				"Jose","Gomez","M",50,
				carrera,"4554665",
				"4654654",3456.66
		);
		
		personas.add(a);
		personas.add(m2);
		personas.add(a2);
		personas.add(m3);
		personas.add(a3);
		personas.add(m);
		personas.add(a1);
		personas.add(m1);
		
		//Se puede enviar como parametro cualquier objeto que fue
		//creado a partir de una clase hija de PersonaUniversitaria
		metodoX(a);
		metodoX(m);
		metodoX(p);
		
		
		mostrarAlumnos();
		mostrarMaestros();
		
		for (int i = 0; i<personas.size();i++)
			personas.get(i).matricular();
	}
	
	public void mostrarAlumnos(){
		System.out.println("-------Listado alumnos-------");
		for (int i = 0; i<personas.size(); i++){
			if (personas.get(i) instanceof Alumno)
				System.out.println(personas.get(i));
		}
	}
	
	public void mostrarMaestros(){
		System.out.println("-------Listado maestros-------");
		for (int i = 0; i<personas.size(); i++){
			if (personas.get(i) instanceof Maestro){
				Maestro mi = (Maestro)personas.get(i);
				System.out.println(
						mi.getNombre() + 
						", Salario: " + mi.getSalario());
			}
		}
	}
	
	public void metodoX(PersonaUniversitaria p){
		
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
