package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Excercicio03 {
	
	/*Faca um programa que carregue um vetor com dez numeros inteiros.
	 * Mostre o vetor na ordem inversa a que foi digitado.
	 * 
	 * vetor = []
	 * para i = 0, enquanto i <= 10 processar
	 * 		escrever "Digite um valor: "
	 * receber valor
	 * vetor[i] = valor
	 * 
	 * i = 9
	 * enquanto i >= 0 processar
	 * 		escrever vetor[i]
	 * `	i = i -1
	 */

	public static void main(String[] args) {
		//Variaveis
		int[]vetor = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o Valor para o Vetor: ");
			vetor[i] = teclado.nextInt();
			
		}
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.println(vetor[i]);
		}
		teclado.close();
	}

}
