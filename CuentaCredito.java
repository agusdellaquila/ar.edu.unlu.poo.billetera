package ar.edu.unlu.billetera;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unlu.clubDeportivo.modelo.Socio;

public class CuentaCredito {
	private Double saldoDeudor;
	private Double limiteGasto;
	private ArrayList<Compra> compras;
	private Cliente titular;

	
	public CuentaCredito(Double saldoDeudor, Double limiteGasto, Cliente titular) {
		this.saldoDeudor = saldoDeudor;
		this.limiteGasto = limiteGasto;
		this.compras = new ArrayList<Compra>();
		this.titular = titular;
	}
	
	//getters
	public Double getSaldoDeudorCuentaCredito() {
		return this.saldoDeudor;
	}
	
	//methods
	public Double calculateDeuda() {
		Double deudaTotal = 0.0;
		for (Compra compra : compras) {
			if (compra.getStatus()) {
				deudaTotal += compra.getMonto();
			}	
		}
		return deudaTotal;
	}
}
