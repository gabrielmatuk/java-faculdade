package Roteiro1;

import java.util.Scanner;
public class exercicio1gabrielmatuk {
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double n1;
		double n2;
		double n3;
		
		System.out.println("Insira o primeiro n�mero aqui: ");
		n1 = teclado.nextDouble();
		System.out.println("Insira o segundo n�mero aqui: ");
		n2 = teclado.nextDouble();
		System.out.println("Insira o terceiro n�mero aqui: ");
		n3 = teclado.nextDouble();
		
		
		double somaNum = n1 + n2 + n3;
		double mediaNum = somaNum / 3;
			
		System.out.println("A soma dos n�meros �: " + somaNum);
		System.out.println("A m�dia dos n�meros �: " + mediaNum);
		
		
		teclado.close();
		
		
		
		
		
	}
}
