package br.com.geekuniversity.secao07;

public class Exercicio03 {
	
	/*Elabore um programa que gera e escreve os numeros impares 
	 * dos numeros entre 100 e 200.
	 * 
	 * para i = 100, enquanto i <= 200 processar
	 * 		se (i % 2 != 0) entao
	 * 			escrever "Impar: " + i
	 */

	public static void main(String[] args) {
		for (int i = 100; i <= 200; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			
		}

	}

}
