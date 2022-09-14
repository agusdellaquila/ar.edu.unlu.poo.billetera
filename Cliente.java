package ar.edu.unlu.billetera;

public class Cliente {
	private String nombre;
	private Integer id;
	private CuentaNormal cuentaNormal;
	private CuentaCredito cuentaCredito;
	
	public Cliente(String nombre, Integer id, CuentaNormal cuentaNormal,
			CuentaCredito cuentaCredito) {
		this.nombre = nombre;
		this.id = id;
		this.cuentaNormal = cuentaNormal;
		this.cuentaCredito = cuentaCredito;
	}
	
	public Double getSaldoTotal() {
		Double saldoNormal = this.cuentaNormal.getSaldoCuentaNormal();
		Double saldoCredito = this.cuentaCredito.getSaldoDeudorCuentaCredito();
		
		return saldoNormal - saldoCredito;
	}
}
