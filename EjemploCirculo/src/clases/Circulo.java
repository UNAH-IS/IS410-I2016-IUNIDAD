package clases;

public class Circulo {
	private int x;
	private int y;
	private int diametro;
	private String color;
	public static int valorStatico =5;
	
	public Circulo(){}
	
	public Circulo(int x, int y, int diametro, String color) {
		this.x = x;
		this.y = y;
		this.diametro = diametro;
		this.color = color;
	}
	
	
	
	/*public Circulo(	int x,
					int y,
					int diametro,
					String color
	){
		this.x = x;
		this.y = y;
		this.diametro = diametro;
		this.color = color;
	}*/

	//Mostrar el objeto como cadena
	@Override
	public String toString() {
		return "Circulo [x=" + x + ", y=" + y + ", diametro=" + diametro
				+ ", color=" + color + "]";
	}

	public double calcularArea(){
		return Math.PI * Math.pow((diametro/2),2);
	}
	
	

	public double calcularArea(int diametro){
		return Math.PI * Math.pow((diametro/2),2);
	}
	
	public double calcularArea(double diametro){
		return Math.PI * Math.pow((diametro/2),2);
	}
	
	public void colorear(){
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
