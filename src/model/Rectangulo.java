package model;

public class Rectangulo{
	
	private double base;
	private double altura;
	
	public Rectangulo(double b, double h){
		
		base = b;
		altura = h;
		
	}
	
	public double calcularArea(){
		double area = 0;
		area = (base * altura);
			return area;
	} 
	
	public double calcularPerimetro(){
		double perimetro = 0;
		perimetro = ((2*base)+(2*altura));
			return perimetro;
	} 
	
	public double calcularLongitudDiagonal(){
		double longitud = 0;
		longitud = Math.sqrt((Math.pow(base,2) + Math.pow(altura,2)));
			return longitud;
	}
	
	
}