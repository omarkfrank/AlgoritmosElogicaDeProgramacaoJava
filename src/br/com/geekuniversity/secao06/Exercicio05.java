package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio05 {
	
	/*Joao da Silva, pescador, comprou um microcomputador para controlar o
	 * rendimento diario de seu trabalho. Toda vez que ele traz um peso de peixes
	 * maior que o estabelecido pelo regulamento de pesca do estado de 
	 * Sao Paulo (50 quilos) deve pagar uma multa de 4,00 por quilo exedente.
	 * Joao precisa que voce faca um algoritmo que leia a variavel 'p' (peso de peixes)
	 * e verificque se ha excesso. Se houver, gravar a variavel 'e' (excesso) e na 
	 * variavel 'm' o valor da multa que Joao devera pagar. Caso contrario, mostrar
	 * tais variaveis com o conteudo 'zero'.
	 * 
	 *   e = 0
	 *   m = 0
	 *   receber peso
	 *   se peso > 50 entao
	 *   e = peso - 50
	 *   m = e * 4
	 * escrever "Peso: " + peso
	 * escrever "Excesso: " + e
	 * escrever "Multa: " - m
	 */

	public static void main(String[] args) {
		//Variaveis
		float p, m;
		String e = "excesso";
		Scanner teclado = new Scanner(System.in);
		//Entradas
		System.out.print("Informe o peso dos peixes: ");
		p = teclado.nextFloat();
		//Processamento
		if(p > 50) {
			m = (float)(p - 50) * (float) 4.00;//cast
			//Saida
			System.out.printf("Voce devera pagar R$ %.2f em multas", m);
		}else {
			m = 0;
			e = "0";
			//Saida
			System.out.println("Multas: " +m);
			System.out.println("Excesso: " + e);
		}
		teclado.close();

	}

}
