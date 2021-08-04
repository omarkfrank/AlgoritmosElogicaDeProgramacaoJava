package br.com.geekuniversity.secao07;

public class Exercicio02 {
	
	/*Faca um Algoritmo que conte de 1 a 100 e a cada multiplo
	 *  de 10 emita uma mensagem: "Multiplo de 10 ".
	 *  
	 *  para i = 1, enquanto i <= 100, processar
	 *  		escrever i
	 *  		se (i % 10 == 0) entao
	 *  			escrever "Multiplo de 10: " + i
	 */

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			if(i % 10 ==0) {
				System.out.println("Multiplo de 10");
			}
		}

	}

}
