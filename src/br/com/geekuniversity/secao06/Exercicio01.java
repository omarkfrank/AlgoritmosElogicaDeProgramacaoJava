package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio01 {
	
	/*Ler uma variavel numerica n e imprimi-la somente se a mesma for maior
	 * que 100, caso contrario imprima com valor zero.
	 * 
	 * receber valor
	 * se valor > 100 entao
	 * 		escrever valor
	 * senao
	 * 		valor = 0
	 * escrever valor
	 */

	public static void main(String[] args) {
		//Variaveis
		int n;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.print("Informe um numero: ");
		n = teclado.nextInt();
		
		//Processamento
		if(n > 100) {
			System.out.println(n);
		}else {
			n = 0;
			System.out.println(n);
		}
		teclado.close();

	}

}
