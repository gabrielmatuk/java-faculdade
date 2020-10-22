package Roteiro1;

import java.util.*;
public class exercicio17gabrielmatuk {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double numR;
		int resultado;
		System.out.println("Insira um número com decimal aqui: ");
		numR = teclado.nextDouble();
		
		resultado = (int)numR;
		double resultado1 =numR-(int)resultado;
		
		
		System.out.println("A parte inteira do número é: " + resultado);	
		System.out.println("A parte fracionada do número é: " + resultado1);	
		
		
		
		
		teclado.close();
		
	}
}