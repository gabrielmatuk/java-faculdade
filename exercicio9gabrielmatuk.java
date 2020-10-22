package Roteiro1;

import java.util.*;
public class exercicio9gabrielmatuk {
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	double lado;
	
	System.out.println("Insira aqui o número de lados do polígono regular: ");
	lado = teclado.nextDouble();
	
	double diagonal = lado * (lado - 3) / 2;
	
	System.out.println("O número de diagonais do seu polígono regular é: " + diagonal);
	
	
	
	teclado.close();
	
	}
}
