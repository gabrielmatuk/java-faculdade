package Roteiro1;

import java.util.*;
public class exercicio19gabrielmatuk {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double numPositivo;
		System.out.print("Coloque um n�mero positivo qualquer: ");
		numPositivo = teclado.nextDouble();
		
		double aoQuadrado = Math.pow(numPositivo, 2);
		double aoCubo = Math.pow(numPositivo, 3);
		double raizQuadrada = Math.sqrt(numPositivo);
		double raizCubica = Math.cbrt(numPositivo);
		
		System.out.println("O n�mero ao quadrado �: " + aoQuadrado);
		System.out.println("O n�mero ao c�bico �: " + aoCubo);
		System.out.println("A ra�z quadrada �: " + raizQuadrada);
		System.out.println("A ra�z c�bica �: " + raizCubica);
	
		
		
		
		
		
		
		teclado.close();
		
	
		
		
		
		
	}

}
