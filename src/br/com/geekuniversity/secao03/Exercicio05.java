package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio05 {
	/*Faca um Algoritmo que converta metros em centimetros.
	 * 
	 * "converter metros  -> centimetros"
	 * 
	 * receber o tamanho em metros
	 * m,ultiplicar o tamanho por 100
	 * mostrar o resultado da multiplicacao
	 */

	public static void main(String[] args) {
		//Variaveis
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.print("Informe o valor em metros: ");
		metros = teclado.nextInt();
		
		//Processamento
		centimetros = ( metros * 100);
		
		//Saida
		System.out.println(metros +" metros em centimetros eh: " + centimetros);
		
		teclado.close();
				

	}

}
