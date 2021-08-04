package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio07 {
	
	/*Desenvolva um Algoritmo que:
	 * 
	 * a) Leia 4 (quatro) numeros;
	 * b) Calcule o quadrado de cada um;
	 * c) Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o
	 * e finalize;
	 * d)Caso contrario, imprima os valores lidos e seus respectivos quadrados.
	 * 
	 *  receber n1
	 *  receber n2
	 *  receber n3
	 *  receber n4
	 *  
	 *  q1 = n1 ** 2
	 *  q2 = n2 ** 2
	 *  q3 = n3 ** 2
	 *  q4 = n4 ** 2
	 *  
	 *  se q3 >= 100 entao
	 *  	escreva q3
	 *  senao
	 *  	escreva q1
	 *  	escreva q2
	 *  	escreva q3
	 *  	escreva q4
	 */

	public static void main(String[] args) {
		//Variaveis
		int num1, num2, num3, num4, q1, q2, q3, q4;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.print("Informe o numero 1: ");
		num1 = teclado.nextInt();
		System.out.print("Informe o numero 2: ");
		num2 = teclado.nextInt();
		System.out.print("Informe o numero 3: ");
		num3 = teclado.nextInt();
		System.out.print("Informe o numero 4: ");
		num4 = teclado.nextInt();
		
		//Processamento
		q1 = num1 * num1;
		q2 = num2 * num2;
		q3 = num3 * num3;
		q4 = num4 * num4;
	
		if(q3 >= 1000) {
			//Saida
			System.out.println(q3);
		}else {
			//Saidas
			System.out.printf("\nNum1: %d Quadrado: %d\n", num1, q1);
			System.out.printf("Num2: %d Quadrado: %d\n", num2, q2);
			System.out.printf("Num3: %d Quadrado: %d\n", num3, q3);
			System.out.printf("Num4: %d Quadrado: %d\n", num4, q4);
		}
		teclado.close();
	}
}
