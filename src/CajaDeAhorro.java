
public class CajaDeAhorro extends CuentaSueldo {
	
public CajaDeAhorro(Double monto) {
	super(monto);
}
	private int cantidadDeExtracciones=0;

	@Override public void extraer(Double cantidadAExtraer) {
		if(cantidadAExtraer<=super.saldo) {
			
			if(this.cantidadDeExtracciones >=5) {
		super.saldo-=(cantidadAExtraer+6);
		cantidadDeExtracciones++;
			
		}else {
			super.saldo-=(cantidadAExtraer);
			cantidadDeExtracciones++;
			
		}
			}
		
	

}
	
}
