package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio01 {
	
	/*Faca um Algoritmo que determine o maior entre N numeros. A condicao
	 * de parada eh a entrada do valor 0(zero), ou seja, o algoritmo
	 * deve ficar calculando o maior ate que a entrada seja igual a 0(zero).
	 * 
	 * maior = 0
	 * receber valor
	 * enquanto o valor != 0 processar
	 * 		se valor > maior entao
	 * 			maior = valor
	 * 		receber valor
	 * escrever "Maior valor " + maior
	*/

	public static void main(String[] args) {
		
		//Variaveis
		int n, maior = 0;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.print("Informe um Numero: ");
		n = teclado.nextInt();
		
		while(n != 0) {
			if( n > maior) {
				maior = n;
			}
			System.out.print("Informe um Numero; ");
			n = teclado.nextInt();
		}
		System.out.printf("O Maior Numero eh: %d" , maior);
		teclado.close();

	}

}
