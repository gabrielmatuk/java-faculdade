package Roteiro1;

import java.util.Scanner;
public class exercicio1gabrielmatuk {
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double n1;
		double n2;
		double n3;
		
		System.out.println("Insira o primeiro número aqui: ");
		n1 = teclado.nextDouble();
		System.out.println("Insira o segundo número aqui: ");
		n2 = teclado.nextDouble();
		System.out.println("Insira o terceiro número aqui: ");
		n3 = teclado.nextDouble();
		
		
		double somaNum = n1 + n2 + n3;
		double mediaNum = somaNum / 3;
			
		System.out.println("A soma dos números é: " + somaNum);
		System.out.println("A média dos números é: " + mediaNum);
		
		
		teclado.close();
		
		
		
		
		
	}
}
