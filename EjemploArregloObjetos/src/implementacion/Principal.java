package implementacion;

import javax.swing.JOptionPane;

import clases.Computadora;
//Shift + Ctrl + O : Atajo para importar todas las clases no importadas
public class Principal {
	//private int arregloEnteros[];
	private Computadora computadoras[];
	private int cantidadComputadoras=0;
	
	public Principal(){
		//Preguntar al usuario cuantas computadoras ingresar
		cantidadComputadoras = 
				Integer.valueOf(JOptionPane.showInputDialog("Cantidad de computadoras a registrar"));
		//Inicializar arreglo
		computadoras = new Computadora[cantidadComputadoras];//Solo se reserva espacio en memoria, no hay instancias
		//Instanciar los items
		for(int i = 0; i<computadoras.length; i++){
			computadoras[i] = new Computadora();
			//Solicitar la informacion
			ingresarInformacion(computadoras[i]);
		}

		//Mostrar la informacion
		mostrarInformacion();
		
		
		/*computadoras[0] = new Computadora();//Si esta instanciando
		computadoras[0].setMarca("Asus");//
		
		arregloEnteros = new int[5];
		arregloEnteros[0] = 10;
		arregloEnteros[1] = 20;
		arregloEnteros[2] = 30;
		arregloEnteros[3] = 40;
		arregloEnteros[4] = 50;//ArrayIndexOutOfBounds
		
		for (int i=0;i<arregloEnteros.length;i++)
			System.out.println("Valor: "+arregloEnteros[i]);
		*/
		//nombreArreglo = new tipoDato[tamaño];
	}
	
	public void ingresarInformacion(Computadora c){
		//Ingresar informacion
		c.setMarca(JOptionPane.showInputDialog("Marca"));
		c.setModelo(JOptionPane.showInputDialog("Modelo"));
		c.setColor(JOptionPane.showInputDialog("Color"));
		c.setCapacidadDiscoBytes(Integer.valueOf(JOptionPane.showInputDialog("Capacidad de disco en Bytes")));
		c.setCapacidadMemoriaBytes(Integer.valueOf(JOptionPane.showInputDialog("Capacidad de memoria en Bytes")));
	}
	
	public void mostrarInformacion(){
		//Ingresar informacion
		String informacion = "";
		for (int i=0;i<computadoras.length;i++)
			informacion += computadoras[i].toString() + "\n";
		
		JOptionPane.showMessageDialog(null, informacion);
	}
	
	public static void main(String args[]){
		new Principal(); //Instancia Anonima
	}
}