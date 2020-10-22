package Roteiro1;

import java.util.*;
public class exercicio20gabrielmatuk {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salarioMinimo;
		double horasTrabalhadas;
		double horasExtra;
		double valorHoraTrabalhada;
		double valorHoraExtra;
		double salarioBruto;
		double quantiaReceberExtra;
		double salarioReceber;
		
		System.out.print("Digite o valor do salário mínimo: ");
		salarioMinimo = teclado.nextDouble();
		System.out.print("Digite o tempo de horas trabalhadas: ");
		horasTrabalhadas = teclado.nextDouble();
		System.out.print("Digite o tempo de horas extras: ");
		horasExtra = teclado.nextDouble();
	
		
//		QUESTÃO A:
		valorHoraTrabalhada = salarioMinimo * 0.125;
//		QUESTÃO B:	
		valorHoraExtra = salarioMinimo * 0.25;
//		QUESTÃO C: 
		salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
//		QUESTÃO D:
		quantiaReceberExtra = horasExtra * valorHoraExtra;
//		QUESTÃO E:
		salarioReceber = salarioBruto + quantiaReceberExtra;
		
		System.out.println("O Salario a receber é: " + salarioReceber);
		
		
		
		
		
		
		
		
		
		
		
		teclado.close();
				
		
	}
}
