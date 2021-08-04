package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio10 {
	
	/*Elabore um Algoritmo que dada a idade de um nadador classifique-o em uma
	 * das seguintes categorias:
	 * 
	 * infantil a = 5 a 7 anos
	 * infantil b = 8 a 11 anos
	 * juvenil a = 12 a 13 anos
	 * juvenil b = 14 a 17 anos
	 * adultos = Maiores de 18 anos 
	 * 
	 * receber idade
	 * se(idade >= 5) and (idade <= 7) entao
	 * 		escrever "Infantil A"
	 * se(idade >= 8) and (idade <= 11) entao
	 * 		escrever "Infantil B"
	 * se(idade >= 12) and (idade <= 13) entao
	 * 		escrever "Juvenil A"
	 * se(idade >= 14) and (idade <= 17) entao
	 * 		escrever "Juvenil B"
	 * se (idade >= 18) entao
	 * 		escrever "Adulto"
	 */

	public static void main(String[] args) {
		//Variaveis
		int idade;
		Scanner teclado = new Scanner (System.in);
		
		//Entradas
		System.out.print("Informe a Idade: ");
		idade = teclado.nextInt();
		
		//Processamento
		if(idade >= 5 && idade <= 7) {
			System.out.println("Infantil A");
		}else if(idade >= 8 && idade <= 11) {
			System.out.println("Infantil B");
		}else if(idade >= 12 && idade <= 13 ) {
			System.out.println("Juvenil A");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");
		}else if(idade > 18) {
			System.out.println("Adulto");
		}

		teclado.close();
	}

}
