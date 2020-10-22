package Roteiro1;

import java.util.*;
public class exercicio13gabrielmatuk {
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	
	double anoAtual;
	double numCopas;
	
	System.out.println("Digite o ano atual: ");
	anoAtual = teclado.nextDouble();
	
	numCopas = (anoAtual - 1930)/4 - 1;
	
	System.out.println("A quantidade de copas é: " + numCopas );
	
	
	teclado.close();
	
	}
}
