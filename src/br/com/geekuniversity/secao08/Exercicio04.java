package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio04 {
	
	/*Escreva um Algoritmo que leia e mostre um vetor de 20 elementos inteiros, em seguida,
	 * mostre a soma de todos os elementos.
	 * 
	 * vetor = []
	 * soma = 0
	 * para i = 0, enquanto i < 20 processar
	 * 		escrever "Digite um valor :"
	 * 		receber valor
	 * 		vetor[i] = valor
	 * 		soma = soma + valor
	 * escrever "Soma: " + soma
	 */

	public static void main(String[] args) {
		//Variaveis
		int[] vetor = new int[20];
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		for(int i = 0; i < 20; i++) {
			System.out.printf("Informe o Valor para o Vetor %d/20\n", (i+1));
			vetor[i] = teclado.nextInt();
			soma = soma + vetor[i];
		}
		System.out.printf("A Soma eh %d", soma);
		teclado.close();

	}

}
