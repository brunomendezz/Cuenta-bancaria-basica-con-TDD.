
public class CuentaCorriente extends CuentaSueldo {
	
	
 private double descubierto=150.0;
 private double deudaAlBanco=0.0;
 
 public CuentaCorriente(Double monto) {
	 super(monto);
 }

@Override
	public void extraer(Double cantidadAExtraer) {
		if(cantidadAExtraer<=super.getSaldo()) {
			super.extraer(cantidadAExtraer);
		}else {
			if(cantidadAExtraer<= super.getSaldo()+this.descubierto) {
				this.deudaAlBanco = cantidadAExtraer-super.getSaldo()+(cantidadAExtraer-super.getSaldo())*0.05;
				super.saldo+= cantidadAExtraer-super.getSaldo();
				super.saldo-=cantidadAExtraer;
				
			}
		}
		
	}

public double getDeudaAlBanco() {
	
	return this.deudaAlBanco;
}

}
