package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio02 {
	
	/*Elabore um algoritmo que leia um numero. Se positivo armazene-o em 'a', 
	 * se for negativo, em 'b'. No final mostrar resultado.
	 * 
	 *  receber valor
	 *  se valor > 0 entao
	 *  	a - valor
	 *  	escrever "Valor Pocitivo"
	 *  	escrever a
	 *  senao
	 *  	b = valor
	 *  	escrever "Valor Negativo"
	 *  	escrever b
	 */

	public static void main(String[] args) {
		//Variaveis
		int numero, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Informe um numero: ");
		numero = teclado.nextInt();
		
		//Processamento
		if(numero > 0) {
			a = numero;
			//Saida
			System.out.println(a);
		}else {
			b = numero;
			//Saida
			System.out.println(b);
			
		}
		teclado.close();
	}
	
}
