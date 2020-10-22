package Roteiro1;

import java.util.*;
public class exercicio15gabrielmatuk {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
	// A = pi.r2
	double pi = 3.1416;
	double raio;
	
	System.out.println("Insira o valor do raio: ");
	raio = teclado.nextDouble();
		
	double area = pi * ( raio * raio);
	
	System.out.println("A área da circunferência é: " + area);
	
	
	
	
	
		teclado.close();
	
	}
}
