package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio06 {
	
	/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de 
	 * qualquer numero inteiro entre 1 a 10. O usuario deve informar de 
	 * qual numero ele deseja ver a tabuada. A saida deve ser igual o 
	 * exemplo abaixo:
	 * 
	 *  Tabuada de 5:
	 *  5 X 1 = 5
	 *  5 X 2 = 10
	 *  ...
	 *  5 X 10 = 50
	 *  
	 *  escrever "Informe um numero"
	 *  receber numero
	 *  enquanto numero > 10 processar
	 *  	escrever "Numero deve ser menor que 10"
	 *  	escrever "Informe um numero "
	 *  	receber numero
	 *  escrever "Tabuada de " + numero
	 *  para i = 0, enquanto i <= 10 processar
	 *  	valor = numero * i
	 *  escrever numero + "X" + i + "=" + valor
	 */

	public static void main(String[] args) {
		//Variavel
		int numero;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.print("Informe um Numero entre Um e Dez: ");
		numero = teclado.nextInt();
		
		//Processamento
		while(numero < 1 || numero > 10) {
			//Entrada
			System.out.println("Informe um Numero entre Um e Dez: ");
			numero = teclado.nextInt();
		}
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", numero, i, (numero * i));
		}
		teclado.close();

	}

}
