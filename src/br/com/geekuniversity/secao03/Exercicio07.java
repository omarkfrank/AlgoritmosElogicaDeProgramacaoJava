package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio07 {
	/*Tendo como dados de entrada a altura de uma pessoa, construa 
	 * um algoritmo que calcule seu peso ideal, usando a seguinte formula:
	 * (72.7*altura) - 58
	 * 
	 * "calcula peso ideal"
	 * 
	 * receber a a altura da pessoa
	 * multiplicara altura por 72.7
	 * diminuir 58 do resultado da multiplicacao
	 * mostrar o valor da subtracao 
	 * 
	 */

	public static void main(String[] args) {
		//Variaveis
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.print("Qual a sua altura? ");
		altura = teclado.nextFloat();
		
		//Processamento
		peso_ideal = (float) ((altura*72.7) - 58); //cast
		
		//Saida
		System.out.printf("Seu peso ideal seria: %.2f",peso_ideal);
		
		teclado.close();

	}

}
