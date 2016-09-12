package ar.com.nekuroi.bicicleta;

public class Ruta extends Bicicleta{
	
	public Ruta(){
		super();
	}
	
	public Ruta(Integer PLATO_MAXIMO, Integer PINION_MAXIMO){
		super(PLATO_MAXIMO, PINION_MAXIMO);
	}
	
	//Sobreescritura de Metodo: Debe tener misma entrada y salida
	
	public void acelerar(){
		super.acelerar();
		super.acelerar();
	}
}
