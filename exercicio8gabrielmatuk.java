package Roteiro1;

import java.util.*;
public class exercicio8gabrielmatuk {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double baseMaior;
		double baseMenor;
		double altura;
		
		System.out.println("Insira aqui o valor da Base Maior: ");
		baseMaior = teclado.nextDouble();
		System.out.println("Insira aqui o valor da Base Menor: ");
		baseMenor = teclado.nextDouble();
		System.out.println("Insira aqui o valor da altura: ");
		altura = teclado.nextDouble();
		
		
		final double area = (baseMaior + baseMenor)*altura / 2;
		
		System.out.println("A �rea total do terreno �: " + area);
		System.out.println("O pre�o m�dio do terreno �: " + area);
		
		
									
	teclado.close();	
		
	}
}