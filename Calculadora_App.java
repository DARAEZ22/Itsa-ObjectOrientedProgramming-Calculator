package operaciones;

import java.util.Scanner;

class Calculadora_App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer número:");
		double V1= sc.nextDouble();
		System.out.println("Ingresa el segundo número:");
		double V2= sc.nextDouble();
		
		
		Suma S1= new Suma(V1,V2);
		S1.calcular();
		
		Multiplicar M1= new Multiplicar(V1,V2);
		M1.calcular();
		sc.close(); 
	
		
	}

}
