package Roteiro1;

import java.util.*;

public class exercicio5gabrielmatuk {
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double salarioBase;
		
		System.out.print("Insira o salário base do funcionário: ");
		salarioBase = teclado.nextDouble();
		
		double bonus = (0.10 * salarioBase) + salarioBase; // 10%
		double imposto = bonus - (bonus * 0.05); // 5%
		
		
		
		System.out.print("O salário a receber desse funcionário é: " + imposto);
		
		
		
		
		teclado.close();
	}
}
