package Roteiro1;

import java.util.*;

public class exercicio4gabrielmatuk {
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

			double n1;
			double n2;
			double n3;
			double peso1;
			double peso2;
			double peso3;

			System.out.println("Coloque aqui a sua primeira nota: ");
			n1 = teclado.nextDouble();
			System.out.println("Coloque aqui o peso da primeira nota: ");
			peso1 = teclado.nextDouble();
			System.out.println("Coloque aqui a sua segunda nota: ");
			n2 = teclado.nextDouble();
			System.out.println("Coloque aqui o peso da segunda nota: ");
			peso2 = teclado.nextDouble();
			System.out.println("Coloque aqui a sua terceira nota: ");
			n3 = teclado.nextDouble();
			System.out.println("Coloque aqui o peso da terceira nota: ");
			peso3 = teclado.nextDouble();
			

			double media = (n1 * peso1) +( n2 * peso2) + (n3 * peso3);
			double peso = peso1 + peso2 + peso3;
			double mediaPond = media / peso;
			
			System.out.println("A sua média final é: " + mediaPond);


	


		teclado.close();
	}
}
