package ar.com.nekuroi.bicicleta;

/*
 * Nuevo > Projecto Java > 1.7						|| Convenci�n general:
 * Clic Derecho en src > Nuevo Paquete				|| Dominio empezando por pais + nombre de la aplicacion en min�scula: EJ: ar.edu.unlam.bicicleta
 * Clic Derecho en el paquete > Nuevo Clase			|| Sustantivo en CamelCase
 * Atributos (Variables)							|| Sustantivo en camelCase (1ra letra en min�scula)
 * M�todos (Funciones)								|| Verbos en camelCase (1ra letra en min�scula)
 */

public class Bicicleta {
	
	//Atributos:

	private Integer engranajePlato;
	private Integer engranajePinion;
	private Double velocidad;
	private String tipo;
	
	//M�todos:
	
	public void cambiarPlato(Integer engranajePlato){
		this.engranajePlato = engranajePlato;
	}
	
	public void cambiarPinion(Integer engranajePinion){
		this.engranajePinion = engranajePinion;
	}
	
	public void cambiarVelocidad(Double velocidad){
		this.velocidad = velocidad;
	}
	
	public void cambiarTipo(String tipo){
		if(tipo.equals("Mountain") || tipo.equals("Playera") || tipo.equals("Carrera")){
			this.tipo = tipo;
		}
	}
	
	public Integer mostrarPlato(){
		return engranajePlato;
	}
	
	public Integer mostrarPinion(){
		return engranajePinion;
	}
	
	public Double mostrarVelocidad(){
		return velocidad;
	}
	
	public String mostrarTipo(){
		return tipo;
	}

}
