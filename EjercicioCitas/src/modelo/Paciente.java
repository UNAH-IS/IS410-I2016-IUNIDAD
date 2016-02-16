package modelo;

import java.util.ArrayList;

public class Paciente extends Persona{
	private ArrayList<Padecimiento> padeciemiento;

	public Paciente(String nombre, String apellido, int edad, String genero,
			ArrayList<Padecimiento> padeciemiento) {
		super(nombre, apellido, edad, genero);
		this.padeciemiento = padeciemiento;
	}

	public ArrayList<Padecimiento> getPadeciemiento() {
		return padeciemiento;
	}

	public void setPadeciemiento(ArrayList<Padecimiento> padeciemiento) {
		this.padeciemiento = padeciemiento;
	}

	@Override
	public String toString() {
		return nombre + " "+ apellido + " ("+ edad + ")";
	} 
}
