package Roteiro1;

import java.util.*;
public class exercicio18gabrielmatuk {
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	double salarioMin;
	double qntdQuilo;
	System.out.println("Insira o salário minímo: ");
	salarioMin = teclado.nextDouble();
	
	System.out.println("Insira a quantidade de quilowatt aqui: ");
	qntdQuilo = teclado.nextDouble();
	
	
	double quiloWat = (salarioMin / 5) ;
	double precoQui = (quiloWat * qntdQuilo);
	double descQui =  precoQui - (precoQui * 0.15);
	
	System.out.println("O preço por quilowatt é: " + quiloWat);
	
	System.out.println("O preço do quilowatt nessa residência é:" + precoQui);
	
	System.out.println("O preço com desconto é :" + descQui);
	
	
	
	
	
	teclado.close();
	}
}
