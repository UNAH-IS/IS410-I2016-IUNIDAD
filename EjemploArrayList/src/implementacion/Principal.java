package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Computadora;

public class Principal {
	//private ArrayList<String> cadenas;
	private ArrayList<Computadora> computadoras;
	
	public Principal(){
		/*cadenas = new ArrayList<String>();
		cadenas.add("Juan");//0
		cadenas.add("Pedro");//1
		cadenas.add("Luis");//2
		cadenas.add("Maria");//3
		*/
		//System.out.println(cadenas.get(2));
		/*for(int i=0; i<cadenas.size(); i++)
			System.out.println(cadenas.get(i));
		*/
		//for each
		/*for (String cadena : cadenas)
			System.out.println(cadena);*/
		//---------------------------------------
		/*
		computadoras.add(ingresarInformacion());
		System.out.println(computadoras.get(0).toString());*/
		computadoras = new ArrayList<Computadora>();
		menu();
		
	}
	
	public void menu(){
		int opcion;
		do {
			opcion = Integer.valueOf(JOptionPane.showInputDialog(
						"0 Salir\n"
					+ "1 Agregar un registro\n"
					+ "2 Modificar un registro\n"
					+ "3 Eliminar un registro\n"
					+ "4 Mostrar informacion"));
			switch (opcion) {
				case 0:
					System.out.println("Salir");
					break;
				case 1:
					System.out.println("Agregar");
					computadoras.add(ingresarRegistro(null));
					break;
				case 2:
					System.out.println("Modificar");
					modificarRegistro();
					break;
				case 3:
					System.out.println("Eliminar");
					eliminarRegistro();
					break;
				case 4:
					System.out.println("Mostrar informacion");
					mostrarInformacion();
					break;
				default:
					System.out.println("Opcion invalida");
					break;
			}
		}while(opcion!=0);
	}
	
	public Computadora ingresarRegistro(Computadora computadora){
		//Ingresar informacion
		Computadora c;
		if (computadora == null)
			c = new Computadora();
		else 
			c = computadora;
		
		c.setMarca(JOptionPane.showInputDialog("Marca"));
		c.setModelo(JOptionPane.showInputDialog("Modelo"));
		c.setColor(JOptionPane.showInputDialog("Color"));
		c.setCapacidadDiscoBytes(Integer.valueOf(JOptionPane.showInputDialog("Capacidad de disco en Bytes")));
		c.setCapacidadMemoriaBytes(Integer.valueOf(JOptionPane.showInputDialog("Capacidad de memoria en Bytes")));
		return c;
	}
	
	public void eliminarRegistro(){
		
	}
	
	public void modificarRegistro(){
		//Solicitar al usuario que indice desea modificar
		int indice = Integer.valueOf(
				JOptionPane.showInputDialog(
						"Que indice desea modificar? (0 al "+(computadoras.size()-1)+")")
		);
		
		Computadora c = computadoras.get(indice);
		computadoras.set(indice, ingresarRegistro(c));
		
		//Solicitar los datos nuevos al usuario
		//Actualizar los datos en el ArrayList
	}
	
	public void mostrarInformacion(){
		//Ingresar informacion
		String informacion = "";
		for (int i=0;i<computadoras.size();i++)
			informacion += computadoras.get(i).toString() + "\n";
		
		JOptionPane.showMessageDialog(null, informacion);
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
