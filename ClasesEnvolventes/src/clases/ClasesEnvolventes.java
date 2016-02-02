package clases;

public class ClasesEnvolventes {

	public static void main(String[] args) {
		/*int a = 2;
		Integer b = new Integer(4);
		Integer c = 65;
		
		String nombre = "Juan";
		String apellido = new String("Perez");
		System.out.println(nombre + " " +apellido);
		*/
		String x = new String(" Juan Perez ");
 		String y = new String("Hola"); 
		
		/*if (x.equals(y))
			System.out.println("Cadenas iguales");
		else 
			System.out.println("Cadenas diferentes");
		*/
		System.out.println(x.trim());
		//System.out.println(x.substring(1,3));	
		
		String telefono = "9999-1111";
		String arregloTokens[] = telefono.split("-");
		
		System.out.println(arregloTokens[0]);
		System.out.println(arregloTokens[1]);
	}
}
