package Roteiro1;

import java.util.*;
public class exercicio17gabrielmatuk {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double numR;
		int resultado;
		System.out.println("Insira um n�mero com decimal aqui: ");
		numR = teclado.nextDouble();
		
		resultado = (int)numR;
		double resultado1 =numR-(int)resultado;
		
		
		System.out.println("A parte inteira do n�mero �: " + resultado);	
		System.out.println("A parte fracionada do n�mero �: " + resultado1);	
		
		
		
		
		teclado.close();
		
	}
}