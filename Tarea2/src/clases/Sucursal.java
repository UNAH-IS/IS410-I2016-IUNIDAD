package clases;

public class Sucursal {
	private String nombre_agencia;
	private String direccion;
	private String telefono;

	public Sucursal(){}

	public Sucursal(String nombre_agencia, String direccion, String telefono) {
		super();
		this.nombre_agencia = nombre_agencia;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre_agencia() {
		return nombre_agencia;
	}

	public void setNombre_agencia(String nombre_agencia) {
		this.nombre_agencia = nombre_agencia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Sucursal [nombre_agencia=" + nombre_agencia + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}



}
