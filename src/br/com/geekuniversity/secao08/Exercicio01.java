package br.com.geekuniversity.secao08;

import java.util.ArrayList;

public class Exercicio01 {
	
	/*Faca um algoritmo que carregue um vetor de 5 elementos inteiros e em seguida
	 * armazene em um vetor apenas os nmumeros pares maiores que 0(zero).
	 * No final, deve mostrar os elementos do vetor na tela.
	 * 
	 * vetor = [0,0,0,0,0]
	 * pares = []
	 * para i = 0, enquanto i < 5 processar
	 * 		escrever "Digite um Valor: "
	 * 		receber vetor [i]
	 * 		se (vetor[i] > 0) and (vetor [i] % 2 == 0) entao
	 * 			adicionar vetor [i] em pares
	 * escrever pares 
	 */

	public static void main(String[] args) {
		// Variaveis
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			vetor.add(i);
			if (i % 2 == 0) {
				if (i > 0) {
					pares.add(i);
				}
			}

		}
		for (Integer n : pares) {
			System.out.println(n);
		}

	}

}
