package Roteiro1;

import java.util.*;
public class exercicio24gabrielmatuk {
	public static void main(String[]args) { 
		
		Scanner teclado = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double x1;
		double x2;
		
		System.out.println("Insira o valor de A: " );
		a = teclado.nextDouble();
		System.out.println("Insira o valor de B: ");
		b = teclado.nextDouble();
		System.out.println("Insira o valor de C: ");
		c = teclado.nextDouble();
	
		double delta = ((b*b)-(4*a*c));
		
		if (delta >= 0) {
				
			x1 = (-b + (Math.sqrt(delta))) / (2*a);
			x2 = (-b - (Math.sqrt(delta))) / (2*a);
		System.out.println("a raíz de x1 é: " + x1);	
		System.out.println("a raíz de x2 é: " + x2);		
						}
	
		else {
			System.out.println("Delta inválido");
		     }
	
	
		teclado.close();
	
	}
}
	