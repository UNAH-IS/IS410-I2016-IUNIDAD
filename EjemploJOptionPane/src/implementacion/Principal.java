package implementacion;

import javax.swing.JOptionPane;

import clases.Computadora;
//Shift + Ctrl + O : Atajo para importar todas las clases no importadas
public class Principal {
	private Computadora c1;
	private Computadora c2;
	
	public Principal(){
		//Punto de partida
		c1 = new Computadora();
		c2 = new Computadora();
		
		ingresarInformacion(c1);
		ingresarInformacion(c2);
		mostrarInformacion(c1);
		mostrarInformacion(c2);
	}
	
	public void ingresarInformacion(Computadora c){
		//Ingresar informacion
		c.setMarca(JOptionPane.showInputDialog("Marca"));
		c.setModelo(JOptionPane.showInputDialog("Modelo"));
		c.setColor(JOptionPane.showInputDialog("Color"));
		c.setCapacidadDiscoBytes(Integer.valueOf(JOptionPane.showInputDialog("Capacidad de disco en Bytes")));
		c.setCapacidadMemoriaBytes(Integer.valueOf(JOptionPane.showInputDialog("Capacidad de memoria en Bytes")));
	}
	
	public void mostrarInformacion(Computadora c){
		//Ingresar informacion
		JOptionPane.showMessageDialog(null, c.toString());
	}
	
	public static void main(String args[]){
		new Principal(); //Instancia Anonima
	}
}