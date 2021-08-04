package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio04 {
	/*Faca um Algoritmo que peca dois numeros e imprima a soma.
	 * 
	 * "somar"
	 * 
	 * receber primeiro numero
	 * receber segundo numero
	 * somar os dois numeros
	 * mostrar o resultado da soma
	 */

	public static void main(String[] args) {
		//Variaveis
		int num1, num2, soma;
		Scanner teclado = new Scanner (System.in);
		
		//Entradas
		System.out.print("Informe o primeiro numero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Informe o segundo numero: ");
		num2 = teclado.nextInt();
		
		//Processamento
		soma = (num1 + num2);
		
		System.out.println("A soma eh: " + soma);
		
		teclado.close();

	}

}
