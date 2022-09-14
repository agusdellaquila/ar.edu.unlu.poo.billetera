package ar.edu.unlu.billetera;

import java.time.LocalDate;
import java.util.ArrayList;

public class CuentaNormal {
	private Double saldo;
	private Double limiteDescubierto;
	private Double montoInvertido;
	private Double montoTotal;
	private LocalDate fechaDevolucionInversion;
	private Boolean yaInvirtio;
	private Cliente titular;

	
	public CuentaNormal(Double saldo, Double limiteDescubierto, 
			Double montoInvertido, Double montoTotal, LocalDate fechaDevolucionInversion, 
			Boolean yaInvirtio, Cliente titular) {
		this.saldo = saldo;
		this.limiteDescubierto = limiteDescubierto;
		this.montoTotal = montoTotal;
		this.montoInvertido = montoInvertido;
		this.fechaDevolucionInversion = fechaDevolucionInversion;
		this.yaInvirtio = yaInvirtio;
		this.titular = titular;
	}
	
	//getters
	public Double getSaldoCuentaNormal() {
		return this.montoTotal - this.montoInvertido;
	}
}
