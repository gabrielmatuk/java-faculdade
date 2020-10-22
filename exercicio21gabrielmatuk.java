package Roteiro1;

import java.util.*;
public class exercicio21gabrielmatuk {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double angGraus;
		double altParede;
		double tamEscada;
		double angRad;
		
	System.out.println("Digite aqui o valor do angulo em graus: ");
	angGraus = teclado.nextDouble();
	System.out.println("Digite aqui a altura da parede: ");
	altParede = teclado.nextDouble();
	
	angRad = (angGraus*3.1415)/180;
	tamEscada = altParede/Math.sin(angRad);
	
	System.out.println("O Tamanho da escada deve ser: " + tamEscada);
	
	
	
	
		teclado.close();
	}

}