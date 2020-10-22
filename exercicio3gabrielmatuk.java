package Roteiro1;

import java.util.*;

public class exercicio3gabrielmatuk {
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double n1;
		double n2;
		double n3;
		
		System.out.println("Insira o primeiro número: ");
		n1 = teclado.nextDouble();
		System.out.println("Insira o segundo número: ");
		n2 = teclado.nextDouble();
		System.out.println("Insira o terceiro número: ");
		n3 = teclado.nextDouble();
 	
		double mult = n1 * n2;
		double div = mult / n3;
		
		System.out.println("A multiplicação dos dois primeiros números dividido pelo terceiro é: " + div);
		
		
		
		
		
		teclado.close();
		
	}
}
