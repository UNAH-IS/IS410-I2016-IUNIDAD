package clases;

public class Pago {
	private String fecha_pago;
	private String monto;
	private String moneda;
	private String numero_cuota;

	public Pago(){}

	public Pago(Prestamo prestamos, String fecha_pago, String monto, String moneda, String numero_cuota ) {
		this.fecha_pago = fecha_pago;
		this.monto = monto;
		this.moneda = moneda;
		this.numero_cuota = numero_cuota;
	}

	public String getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(String fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getNumero_cuota() {
		return numero_cuota;
	}

	public void setNumero_cuota(String numero_cuota) {
		this.numero_cuota = numero_cuota;
	}

	@Override
	public String toString() {
		return  fecha_pago + ", " + ", cuota " + numero_cuota + ", cantidad: "+ monto +" " + moneda ;
	}











}
