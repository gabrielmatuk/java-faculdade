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
		
		System.out.print("Digite o valor do sal�rio m�nimo: ");
		salarioMinimo = teclado.nextDouble();
		System.out.print("Digite o tempo de horas trabalhadas: ");
		horasTrabalhadas = teclado.nextDouble();
		System.out.print("Digite o tempo de horas extras: ");
		horasExtra = teclado.nextDouble();
	
		
//		QUEST�O A:
		valorHoraTrabalhada = salarioMinimo * 0.125;
//		QUEST�O B:	
		valorHoraExtra = salarioMinimo * 0.25;
//		QUEST�O C: 
		salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
//		QUEST�O D:
		quantiaReceberExtra = horasExtra * valorHoraExtra;
//		QUEST�O E:
		salarioReceber = salarioBruto + quantiaReceberExtra;
		
		System.out.println("O Salario a receber �: " + salarioReceber);
		
		
		
		
		
		
		
		
		
		
		
		teclado.close();
				
		
	}
}
