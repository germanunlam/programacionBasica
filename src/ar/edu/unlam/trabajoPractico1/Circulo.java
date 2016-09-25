package ar.edu.unlam.trabajoPractico1;

public class Circulo {

	
	private Integer radio;
	private double perimetro;
	
	
	
	public void Circulo(Integer radio){
		this.radio=radio;
		
	}
	
	public void sacarElPerimetro(){
		
		perimetro=radio*3.14*2;
		
				
	}
public double mostrarPerimetro(){
	return(perimetro);
	
	
	
}
	public Integer getRadio() {
		return radio;
	}

	public void setRadio(Integer radio) {
		this.radio = radio;
	}

		
	
	
	
	

	
	
}
