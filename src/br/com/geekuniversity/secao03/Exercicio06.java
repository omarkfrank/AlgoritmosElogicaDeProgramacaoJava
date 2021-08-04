package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio06 {
	/*Faca um Algoritmo que pergunte quanto voce ganha por hora e o 
	 * numero de horas trabalhadas no mes.
	 * Calcule e mostre o total do seu solario no referido mes.
	 * 
	 * "calcula salario"
	 * 
	 * receber a quantidade de horas trabalhadas
	 * receber o valor da hora
	 * multiplicar o numero de horas trabalhadas pelo valor da hora
	 * mostrar o resuldado da multiplicacao
	 */

	public static void main(String[] args) {
		//Variaveis
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.print("Qual o valor que voce ganha por hora? ");
		valor_por_hora = teclado.nextFloat();
		
		System.out.print("Quantas horas voce trabalhou neste mes? ");
		horas_trabalhadas = teclado.nextInt();
		
		//Processamento
		salario = (horas_trabalhadas * valor_por_hora);
		
		//Saida
		System.out.println("Neste mes voce vai receber R$" + salario);
		
		teclado.close();
	}

}
