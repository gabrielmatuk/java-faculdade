package Roteiro1;

import java.util.*;

public class exercicio3gabrielmatuk {
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double n1;
		double n2;
		double n3;
		
		System.out.println("Insira o primeiro n�mero: ");
		n1 = teclado.nextDouble();
		System.out.println("Insira o segundo n�mero: ");
		n2 = teclado.nextDouble();
		System.out.println("Insira o terceiro n�mero: ");
		n3 = teclado.nextDouble();
 	
		double mult = n1 * n2;
		double div = mult / n3;
		
		System.out.println("A multiplica��o dos dois primeiros n�meros dividido pelo terceiro �: " + div);
		
		
		
		
		
		teclado.close();
		
	}
}
