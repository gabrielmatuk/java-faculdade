package Roteiro1;

import java.util.*;
public class exercicio7gabrielmatuk {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

	double ladoA;
	double ladoB;
	
	
	System.out.println("Insira aqui a base do seu retângulo: ");
	ladoA = teclado.nextDouble();
	System.out.println("Insira aqui a altura do seu retângulo: ");
	ladoB = teclado.nextDouble();

	
	double perimetro = (2*ladoA + 2*ladoB);
	
	System.out.println("O perímetro do seu retângulo é: " + perimetro);
	
	
	
	
	teclado.close();
	
	}
}
