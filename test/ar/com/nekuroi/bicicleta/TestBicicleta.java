package ar.com.nekuroi.bicicleta;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBicicleta {

	@Test
	public void testCrearRuta() {
		Ruta miBici = new Ruta(2, 6);
		
		//AssertEquals(<Metodo llamado>, <Valor esperado>, <precisión>) 
		assertEquals(miBici.getPlato(),1,0);
	}
	
	@Test
	public void testCrearPlayera(){
		Bicicleta miBici = new Bicicleta();
		miBici.setPinionActual(2);
		assertNotEquals(miBici.getPinion(),2,0);
	}

}
