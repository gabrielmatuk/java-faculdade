package Roteiro1;

import java.util.*;
public class exercicio23gabrielmatuk {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Insira aqui o número de pessoas entrevistadas: ");
		final int entrevistadas = teclado.nextInt();
		
		System.out.println("Insira o número de pessoas que gostam de A, B e C: ");
		final int ABC = teclado.nextInt();
		
		System.out.println("Insira o número de pessoas que gostam de A e B: ");
		final int AB = teclado.nextInt();
		
		System.out.println("Insira o número de pessoas que gostam de A e C: ");
		final int AC = teclado.nextInt();
		
		System.out.print("Insira o número de pessoas que gostam de B e C:");
		final int BC = teclado.nextInt();
		
		System.out.print("Insira o número de pessoas que gostam de A: ");
		final int A = teclado.nextInt();
		
		System.out.print("Insira o número de pessoas que gostam de B: ");
		final int B = teclado.nextInt();
		
		System.out.print("Insira o número de pessoas que gostam de C: ");
		final int C = teclado.nextInt();
		
		final int interAB = AB - ABC;
		final int interAC = AC - ABC;
		final int interBC = BC - ABC;
		
		final int ATotal = A - (interAB+interAC+ABC);
		final int BTotal = B - (interAB+interBC+ABC);
		final int CTotal = C - (interBC+interAC+ABC);
		
		//
		final int naoGostam = entrevistadas - ATotal - BTotal - CTotal - interAB - interAC - interBC - ABC;
		System.out.println("O número de entrevistados que não gostam é : " + naoGostam);
		
		
		
		
		
		teclado.close();
	}
}