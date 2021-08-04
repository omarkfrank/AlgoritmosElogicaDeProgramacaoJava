package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio02 {
	/*Faca um Algoritmo para somar dois numeros e multiplicar  o resultado 
	 * pelo primeiro numero.
	 * 
	 * "Somar e Multiplicar"
	 * 
	 * receber o primeiro numero 
	 * receber o segundo numero 
	 * somar o primeiro numero com o segundo numero
	 * multiplicar a soma dos numeros pelo primeiro numero
	 * mostrar o resultado da multiplicacao
	 */

	public static void main(String[] args) {
		//variaveis
		int num1, num2, soma, multiplicacao;
		Scanner teclado = new Scanner (System.in);
		
		//Entradas
		System.out.print("Informe o primeiro numero: ");
		num1 = teclado.nextInt();
		System.out.print("Infome o segundo numero: ");
		num2 = teclado.nextInt();
		
		//Processamento
		soma = num1 + num2;
		multiplicacao = soma * num1;
		
		//Saida
		System.out.print("O resultado da multiplicacao eh: " + multiplicacao);
		
		teclado.close();
		

	}

}
