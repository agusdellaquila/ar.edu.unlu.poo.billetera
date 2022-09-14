package ar.edu.unlu.billetera;

import java.time.LocalDate;

public class Compra {
	private Boolean estaPago;
	private Integer idCompra;
	private Double monto;
	private LocalDate fecha;
	
	public Compra(Boolean estaPago, Integer idCompra, Double monto, LocalDate fecha) {
		this.estaPago = estaPago;
		this.idCompra = idCompra;
		this.monto = monto;
		this.fecha = fecha;
	}
	
	//getters
	public Boolean getStatus() {
		return this.estaPago;
	}
	public Double getMonto() {
		return this.monto;
	}
}
