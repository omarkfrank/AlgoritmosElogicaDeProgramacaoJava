package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio08 {
	
	/*Faca um Algoritmo que leia um numero inteiro e mostre uma menssagem
	 * indicando se este numero eh par ou impar, e se eh positivo ou negativo.
	 * 
	 *  receber n1
	 *  se (n1 % 2 == 0) entao
	 *  	escreva "Numero par"
	 *  senao
	 *  	escreva "Numero impar"
	 *  se (n1 > 0) entao
	 *  	escreva "Numero maior que zero"
	 *  senao
	 *  	escreva "Numero menor do que zero"
	 */

	public static void main(String[] args) {
		// Variaveis
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.print("Informe um numero: ");
		numero = teclado.nextInt();
		
		//Processamento
		if(numero %2 == 0 ) {
			if(numero > 0 ){
				System.out.printf("O numero %d eh par e positivo.\n", numero);
			}else {
				System.out.printf("O numero %d eh par e negativo\n", numero);
			}
		}else {
			if(numero >0) {
				System.out.printf("O numero %d eh impar e positivo.\n", numero);
			}else {
				System.out.printf("O numero %d eh impar e negativo.\n", numero);
			}
		}
		teclado.close();

	}

}
