package ui;
import model.*;
import java.util.Scanner;

public class Main{

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la base del rectangulo");
		double base = sc.nextDouble();
		System.out.println("Ingrese la altura del rectangulo");
		double altura = sc.nextDouble();
		
		Rectangulo r = new Rectangulo(base,altura);
			double rectangulo = r.calcularArea();
			System.out.println("El area del rectangulo es: " + rectangulo);
			double recta = r.calcularPerimetro();
			System.out.println("El perimetro del rectangulo es: " + recta);
			double reta = r.calcularLongitudDiagonal();
			System.out.println("La longutud diagonal del rectangulo es: " + reta);
		 
	}
	
}