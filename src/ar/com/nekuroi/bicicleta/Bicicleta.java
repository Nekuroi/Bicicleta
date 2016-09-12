package ar.com.nekuroi.bicicleta;

/*
 * Nuevo > Projecto Java > 1.7						|| Convención general:
 * Clic Derecho en src > Nuevo Paquete				|| Dominio empezando por pais + nombre de la aplicacion en minúscula: EJ: ar.edu.unlam.bicicleta
 * Clic Derecho en el paquete > Nuevo Clase			|| Sustantivo en CamelCase
 * Atributos (Variables)							|| Sustantivo en camelCase (1ra letra en minúscula)
 * Métodos (Funciones)								|| Verbos en camelCase (1ra letra en minúscula)
 */

public class Bicicleta {
	
	//Atributos:

	private Integer platoActual;
	private Integer pinionActual;
	private Integer velocidad;
	private Integer cadencia;
	
	//Declaración de CONSTANTES						|| Todo en mayúsculas, palabras separadas por '_'.
	
	private final Integer PLATO_MAXIMO;
	private final Integer PINION_MAXIMO;
	
	//Constructor:									|| Determina el valor de los atributos al momento de instaciación.
	
	public Bicicleta(){
		platoActual = 1;
		pinionActual = 1;
		PLATO_MAXIMO = 1;
		PINION_MAXIMO = 1;
		velocidad = 0;
		cadencia = 0;
	}
	
	public Bicicleta(Integer PLATO_MAXIMO, Integer PINION_MAXIMO){
		
		if(PLATO_MAXIMO >= 2){
			this.PLATO_MAXIMO = PLATO_MAXIMO;
		}else{
			this.PLATO_MAXIMO = 1;
		}
		
		if(PINION_MAXIMO >= 2){
			this.PINION_MAXIMO = PINION_MAXIMO;
		}else{
			this.PINION_MAXIMO = 1;
		}
		
		platoActual = 1;
		pinionActual = 1;
		velocidad = 0;
		cadencia = 0;
	}
	
	//Métodos:
	
	//SETs
	
	public void setPlatoActual(Integer platoActual){
		if(platoActual >= 1 && platoActual <= PLATO_MAXIMO){
			this.platoActual = platoActual;
		}
	}
	
	public void setPinionActual(Integer pinionActual){
		if(pinionActual >= 1 && pinionActual <= PINION_MAXIMO){
			this.pinionActual = pinionActual;
		}
	}
	
	public void acelerar(){
		velocidad++;
	}
	
	public void frenar(){
		velocidad--;
	}
	
	public void setVelocidad(Integer velocidad){
		this.velocidad = velocidad;
	}
	
	public void setCadencia(Integer cadencia){
		this.cadencia = cadencia;
	}
	
	//GETs
	
	public Integer getCadencia(){
		return cadencia;
	}
		
	public Integer getPlato(){
		return platoActual;
	}
	
	public Integer getPinion(){
		return pinionActual;
	}
	
	public Integer getVelocidad(){
		return velocidad;
	}
	
}
