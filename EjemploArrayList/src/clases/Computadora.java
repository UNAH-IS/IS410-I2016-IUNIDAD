package clases;

public class Computadora {
	private String marca;
	private String modelo;
	private String color;
	private int capacidadDiscoBytes;
	private int capacidadMemoriaBytes;
	
	public Computadora(){}
	public Computadora(
			String marca, 
			String modelo, 
			String color,
			int capacidadDiscoBytes, 
			int capacidadMemoriaBytes
	) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.capacidadDiscoBytes = capacidadDiscoBytes;
		this.capacidadMemoriaBytes = capacidadMemoriaBytes;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCapacidadDiscoBytes() {
		return capacidadDiscoBytes;
	}
	public void setCapacidadDiscoBytes(int capacidadDiscoBytes) {
		this.capacidadDiscoBytes = capacidadDiscoBytes;
	}
	public int getCapacidadMemoriaBytes() {
		return capacidadMemoriaBytes;
	}
	public void setCapacidadMemoriaBytes(int capacidadMemoriaBytes) {
		this.capacidadMemoriaBytes = capacidadMemoriaBytes;
	}
	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo
				+ ", color=" + color + ", capacidadDiscoBytes="
				+ capacidadDiscoBytes + ", capacidadMemoriaBytes="
				+ capacidadMemoriaBytes + "]";
	}
}
