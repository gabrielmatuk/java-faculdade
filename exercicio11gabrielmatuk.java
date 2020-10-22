package Roteiro1;

import java.util.*;
public class exercicio11gabrielmatuk {
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	double salarioJoao;
	double conta1;
	double conta2;
	
	System.out.println("Insira o salário de João: ");
	salarioJoao = teclado.nextDouble();
	System.out.println("Insira o valor da primeira conta: ");
	conta1 = teclado.nextDouble();
	System.out.println("Insira o valor da segunda conta: ");
	conta2 = teclado.nextDouble();
	
	double contaJuros1 = (conta1 * 0.02) + conta1; 
	double contaJuros2 = (conta2 * 0.02) + conta2;
	
	double salarioF = salarioJoao -(contaJuros1 + contaJuros2); 
	
	System.out.println("O salário após pagar as duas contas é: " + salarioF);
	
	
	
	
	teclado.close();
	}
}
