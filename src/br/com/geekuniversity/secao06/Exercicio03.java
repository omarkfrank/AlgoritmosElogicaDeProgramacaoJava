package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio03 {
	
	/*Ler um numero e verificar se ele eh par ou impar. Quando for par armazenar
	 * esse valor em 'p' e quando for impar armazena-lo em 'i'.
	 * Exibir 'p' e 'i' no final do processamento.
	 * 
	 * p = 0
	 * i = 0
	 * receber valor
	 * se (valor / 2 == 0) entao
	 * 		p = valor
	 * senao
	 * 		i = valor
	 * escrever p
	 * escrever i
	 */

	public static void main(String[] args) {
		//Variaveis
		int numero, p= 0, i= 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.print("Informe um numero: ");
		numero = teclado.nextInt();
		
		//Processamento
		if(numero % 2 == 0) {
			p = numero;
		}else {
			i = numero;
		}
		System.out.println(p);
		System.out.println(i);
		teclado.close();

	}

}
