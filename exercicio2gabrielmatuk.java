package Roteiro1;

import java.util.*;
public class exercicio2gabrielmatuk {
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double num;
		
		System.out.print("Insira um n�mero qualquer aqui: ");
		num = teclado.nextDouble();
		
		double suc = num + 1;
		double ant = num - 1;
		
		System.out.println("O sucessor do seu n�mero �: " + suc);
		System.out.println("O antecessor do seu n�mero �: " + ant);
		
		
		
		
		teclado.close();
		
	}
	

}
