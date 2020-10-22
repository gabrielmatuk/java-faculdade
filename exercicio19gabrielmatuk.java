package Roteiro1;

import java.util.*;
public class exercicio19gabrielmatuk {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double numPositivo;
		System.out.print("Coloque um número positivo qualquer: ");
		numPositivo = teclado.nextDouble();
		
		double aoQuadrado = Math.pow(numPositivo, 2);
		double aoCubo = Math.pow(numPositivo, 3);
		double raizQuadrada = Math.sqrt(numPositivo);
		double raizCubica = Math.cbrt(numPositivo);
		
		System.out.println("O número ao quadrado é: " + aoQuadrado);
		System.out.println("O número ao cúbico é: " + aoCubo);
		System.out.println("A raíz quadrada é: " + raizQuadrada);
		System.out.println("A raíz cúbica é: " + raizCubica);
	
		
		
		
		
		
		
		teclado.close();
		
	
		
		
		
		
	}

}
