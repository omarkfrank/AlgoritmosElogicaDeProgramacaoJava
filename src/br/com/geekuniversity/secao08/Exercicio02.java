package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio02 {
	
	/*Escreva um Algoritmo que leia dois vetores de 10 posicoes e faca a soma
	 * dos elementos de mesmo indice, colocando o resultado em um terceiro vetor.
	 * Mostre o vetor resultante.
	 * 
	 * vetor1 = []
	 * vetor2 = []
	 * soma = []
	 * para i = 0, enquanto i < 10 processar
	 * 		escrever "Digite um valor para o primeiro vetor: "
	 * 		receber valor1
	 * 		escrever "Digite um valor para o segundo vetor: "
	 * 		receber valor2
	 * 		vetor1[i] = valor1
	 * 		vetor2[i] = valor2
	 * 		soma[i] = (valor1 + valor2)
	 * para i = 0, enquanto i < 10 processar
	 * 		escrever soma[i]
	 *  
	 */

	public static void main(String[] args) {
		//Variaveis
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] soma = new int[10];
		Scanner teclado = new Scanner(System.in);
		//Entrada//Processamento
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o Valor para o Primeiro Vetor: ");
			vetor1[i] = teclado.nextInt();
			System.out.print("Informe o Valor para o Segundo Vetor: ");
			vetor2[i] = teclado.nextInt();
			soma[i] = vetor1[i] + vetor2[i];
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(soma[i]);
		}
		teclado.close();
	}

}
