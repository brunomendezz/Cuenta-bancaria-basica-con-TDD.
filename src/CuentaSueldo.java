
public class CuentaSueldo {

	protected Double saldo;
	
	public CuentaSueldo(Double monto) {
		this.saldo=monto;
	}

	public void depositar(Double cantidad) {
		this.saldo += cantidad;
		
	}

	public Double getSaldo() {
		return saldo;
		
		
	}

	public void extraer(Double cantidadAExtraer) {
		if(cantidadAExtraer<=this.saldo) 
		this.saldo-=cantidadAExtraer;
		
	

}
}
