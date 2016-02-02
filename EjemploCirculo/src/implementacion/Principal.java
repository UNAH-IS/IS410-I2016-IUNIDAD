package implementacion;

import clases.Circulo;


public class Principal {
	//Declaracion de variables globales dentro de la clase
	private static int a;
	private final int CONSTANTE_ENTERA = 10;
	
	public static void main(String[] args) {
		//Declaracion de variables locales
		/*a = 1;
		Circulo b;//b es un objeto del tipo Circulo
		b = new Circulo();//Se instancia b
		
		Circulo c = new Circulo();//Definicion e instanciacion en una sola linea
		c.setX(5);
		c.setY(10);
		c.setDiametro(20);
		c.setColor("Verde");
		
		System.out.println("Area:" + c.calcularArea());
		System.out.println("Area:" + c.calcularArea(12));
		System.out.println("Area:" + c.calcularArea(12.5));
		System.out.println("X:" + c.getX());
		System.out.println("X:" + c.valorStatico);
		*/
		System.out.println("Valor estatico: "+Circulo.valorStatico);
		
		Circulo c = new Circulo();//Definicion e instanciacion en una sola linea
		c.setX(10);
		c.setY(10);
		c.setDiametro(10);
		c.setColor("Rosado");
		
		Circulo d = new Circulo(10, 10, 10, "Rojo");
		d.setColor("Verde fluorescente");
		//Si se imprime un objeto se llama automaticamente al metodo toString
		System.out.println(d);
	}
}
