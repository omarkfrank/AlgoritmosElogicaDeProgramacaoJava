package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio02 {
	/*Faca um Algorimto para "calcular o estoque medio de uma peca",
	 * sendo que:
	 * 
	 *  estoque_medio = (quantidade_minima + quantidade_maxima) / 2
	 *  
	 *  "Calcular o Estoque Medio"
	 *  
	 *  receber quantidade_minima
	 *  receber quantidade_maxima
	 *  somar quantidade_minima e quantidade_maxima
	 *  dividir o resuldado da soma por 2
	 *  mostrar o resultado da divisao
	 */
	

	public static void main(String[] args) {
		//Variaveis
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.print("Informe a Quantidade Minima: ");
		quantidade_minima = teclado.nextInt();
		
		System.out.print("Informe a Quantidade Maxima: ");
		quantidade_maxima = teclado.nextInt();
		
		//Processamento
		estoque_medio = (quantidade_minima + quantidade_maxima)/2;
		
		//Saida
		System.out.println("O Estoque Medio eh: "+estoque_medio);
		
		teclado.close();
		

	}

}
