package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio06 {
	
	/*Faca um programa que receba um codigo numerico inteiro e um vetor
	 * de cinco posicoes de numeros reais. Se o codigo for ZERO, termine o programa.
	 * Se o codigo for 1, mostre o vetor na ordem direita. Se o codigo for 2, mostre 
	 * o vetor na ordem inversa. 
	 */
	
	/*vetor = []
	 * escreva "Digite o Codigo: "
	 * receber o codigo
	 * se codigo > 0 entao
	 * 		para i = 0, enquanto i < 5 processar
	 * 		escrever "Digite um Valor:"
	 * 		receber valor
	 * 		vetor[i] = valor
	 * se codigo == 1 entao
	 * 		para i = 0, enquanto i < 5 processar
	 * 			escrever vetor[i]
	 * se codigo == 2 entao
	 * 		i = 4
	 * 		enquanto i >= 0 processar
	 * 			escrever vetor [i]
	 * 			i = i - 1
	 */

	public static void main(String[] args) {

		//Variaveis
		float[] vetor = new float[5];
		int codigo;
		Scanner teclado = new Scanner (System.in);
		
		
		//Entrada
		System.out.print("Informe o Codigo: ");
		codigo = teclado.nextInt();
		
		if(codigo != 0 && codigo <= 2) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Informe um Numero Real: ");
				vetor[i] = teclado.nextFloat();
			}
			if(codigo == 1) {
				for(int i = 0; i < 5; i++) {
					System.out.println(vetor[i]);
					
				}
			}
			if(codigo == 2) {
				for (int i = (vetor.length - 1); i >= 0; i--) {
					System.out.println(vetor[i]);
					
				}
			}
		}
		teclado.close();

	}

}
