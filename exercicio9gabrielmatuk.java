package Roteiro1;

import java.util.*;
public class exercicio9gabrielmatuk {
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	double lado;
	
	System.out.println("Insira aqui o n�mero de lados do pol�gono regular: ");
	lado = teclado.nextDouble();
	
	double diagonal = lado * (lado - 3) / 2;
	
	System.out.println("O n�mero de diagonais do seu pol�gono regular �: " + diagonal);
	
	
	
	teclado.close();
	
	}
}
