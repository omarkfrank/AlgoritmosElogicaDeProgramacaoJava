package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio04 {
	
	/*Tendo como dados de entrada a altura e o sexo de uma pessoa, contrua 
	 * ul algoritmo que calcule seu peso ideal, utilizando as seguintes formulas:
	 * Para Homens: (72.7*altura) - 58
	 * Para Mulheres: (62.1*altura) - 44.7
	 * 
	 * receber altura
	 * receber sexo
	 * se sexo == 'M' or sexo == 'm' entao
	 * 		peso_ideal = (72.7*altura) - 58
	 * se sexo == 'F' or sexo =='f' entao
	 * 		peso_ideal = (62.1*altura) - 44.7
	 * escrever peso_ideal
	 */

	public static void main(String[] args) {
		//Variaveis
		float altura, peso_ideal;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.print("Informe sua altura: ");
		altura = teclado.nextFloat();
		
		System.out.print("Informe o sexo m/f:");
		sexo = teclado.next().charAt(0);
		
		//Processamento
		if(sexo == 'm') {
			peso_ideal = (float)(72.7 * altura) - 58; //cast
			System.out.printf("Seu peso ideal eh: %.2f", peso_ideal);
		}
		else if(sexo == 'f') {
			peso_ideal = (float)(62.1 * altura) - (float)44.7;
			System.out.printf("Seu peso ideal eh: %.2f", peso_ideal); //cast
		}
		else if(sexo != 'm' && sexo != 'f') {
			System.out.println("Sexo nao reconhecido! ");
			peso_ideal = 0;
		}
		teclado.close();		

	}

}
