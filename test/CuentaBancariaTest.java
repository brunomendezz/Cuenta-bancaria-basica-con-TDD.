import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CuentaBancariaTest {

	@Test
	void queSePuedaCrearCuentaSueldo() {
		
		CuentaSueldo cuentaS = new CuentaSueldo(0.0);
		Assert.assertNotNull(cuentaS);
	}
	
	@Test
	void queSePuedaDepositarDineroEnLaCuenta() {
		CuentaSueldo cuentaS = new CuentaSueldo(0.0);
		cuentaS.depositar(4000.0);
		Double ve = 4000.0;
		Double vo=cuentaS.getSaldo();
		
		Assert.assertEquals(ve, vo);
				
		
	}
	
	@Test
	void queSePuedaExtraerDineroDeLaCuenta() {
			CuentaSueldo cuentaS = new CuentaSueldo(0.0);
			cuentaS.depositar(4000.0);
			cuentaS.extraer(500.0);
			double ve = 3500.0;
			Double vo=cuentaS.getSaldo();
		    Assert.assertEquals(ve,vo,0.01);
	}
	
	@Test
	void queSiElDineroAExtraerEsMayorAlQueHayQueNoSeExtraiga() {
		CuentaSueldo cuentaS = new CuentaSueldo(0.0);
		cuentaS.depositar(4000.0);
		cuentaS.extraer(4500.0);
		Double ve = -500.0;
		Double vo=cuentaS.getSaldo();
		Boolean chequeo = ve==vo;
	  Assert.assertEquals(false, chequeo);
	  ;  
	}
	
	@Test
	void queSePuedaCrearCuentaCajaDeAhorro() {
		
		CajaDeAhorro cuentaCa = new CajaDeAhorro(0.0);
		Assert.assertNotNull(cuentaCa);
	}
	
	@Test 
	void queSePuedaDepositarDineroEnLaCajaDeAhorro() {
		CajaDeAhorro cuentaCa = new CajaDeAhorro(0.0);
		cuentaCa.depositar(4000.0);
		Double vo= cuentaCa.getSaldo();
		Double ve = 4000.0;
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	void queALaExtraccionNro5ApliqueRecargo() {
		CajaDeAhorro cuentaCa = new CajaDeAhorro(0.0);
		cuentaCa.depositar(4000.0);
		cuentaCa.extraer(100.0);
		cuentaCa.extraer(100.0);
		cuentaCa.extraer(100.0);
		cuentaCa.extraer(100.0);
		cuentaCa.extraer(100.0);
		cuentaCa.extraer(100.0);

		Double vo= cuentaCa.getSaldo();
		Double ve = 3394.0;
		Assert.assertEquals(ve, vo);
	}
	
	@Test
	void queSeCreeUnaCuentaCorriente() {
		CuentaCorriente cuentaCo = new CuentaCorriente(0.0);
		Assert.assertNotNull(cuentaCo);
	}
	
	@Test
	void hacerSobreGiroConDescubierto(){
		CuentaCorriente cuentaCo = new CuentaCorriente(0.0);
		cuentaCo.depositar(100.0);
		cuentaCo.extraer(200.0);
	//double vo = cuentaCo.getSaldo();
	double ve = 104.0;
	double vo2 = cuentaCo.getDeudaAlBanco();
	
	Assert.assertEquals(ve, vo2,0.01);
	
	}
	
}
