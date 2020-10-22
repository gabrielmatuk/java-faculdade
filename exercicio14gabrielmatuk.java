package Roteiro1;

import java.util.*;
public class exercicio14gabrielmatuk {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		double base;
		double altura;
		double area;
		double potencia;
		
		System.out.println("Digite a medida da base: ");
		base = teclado.nextDouble();
		System.out.println("Digite a medida da altura: ");
		altura = teclado.nextDouble();
	
		area = base*altura;
		potencia = area*18;
	
		System.out.println("Área do comodo é: " + area);
		System.out.println("Potência do comodo é: " + potencia );
	
	
		teclado.close();
	}

} 