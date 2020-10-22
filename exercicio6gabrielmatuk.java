package Roteiro1;

import java.util.*;
public class exercicio6gabrielmatuk {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double salarioFixo;
		double bonus;
	
		System.out.println("Insira o salário fixo aqui: ");
		salarioFixo = teclado.nextDouble();
		
		System.out.println("Insira a bonificação de venda: ");
		bonus = teclado.nextDouble();
		
		double bonificacao = salarioFixo + (bonus * 0.04);
		
		System.out.println("O salário final do funcionário é: " + bonificacao);
		
		
		
		teclado.close();
		
	}
}