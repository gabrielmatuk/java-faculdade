package Roteiro1;

import java.util.*;
public class exercicio18gabrielmatuk {
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	double salarioMin;
	double qntdQuilo;
	System.out.println("Insira o sal�rio min�mo: ");
	salarioMin = teclado.nextDouble();
	
	System.out.println("Insira a quantidade de quilowatt aqui: ");
	qntdQuilo = teclado.nextDouble();
	
	
	double quiloWat = (salarioMin / 5) ;
	double precoQui = (quiloWat * qntdQuilo);
	double descQui =  precoQui - (precoQui * 0.15);
	
	System.out.println("O pre�o por quilowatt �: " + quiloWat);
	
	System.out.println("O pre�o do quilowatt nessa resid�ncia �:" + precoQui);
	
	System.out.println("O pre�o com desconto � :" + descQui);
	
	
	
	
	
	teclado.close();
	}
}
