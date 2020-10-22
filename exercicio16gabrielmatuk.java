package Roteiro1;

import java.util.*;
public class exercicio16gabrielmatuk {
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
	
	int minutosIn;
	
	System.out.println("Insira o valor em minutos: ");
	minutosIn = teclado.nextInt();
	
	int horas = minutosIn / 60;
	int minutos = minutosIn % 60;
	
	System.out.println("O Valor em Horas é: " + horas);	
	System.out.println("O Valor em Horas e minutos é: " + minutos + horas);	
		
	
	
	teclado.close();
	}
}
