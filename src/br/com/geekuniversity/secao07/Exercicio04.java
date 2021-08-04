package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio04 {
	
	/*Construa um Algoritmo que leia 10 valores interiros e 
	 * positivos e:
	 * 
	 * a)Encontre o maior valor;
	 * b)Encontre o menor valor;
	 * c)Calcule a media dos numeros lidos
	 * 
	 * maior = 0
	 * menor = -1
	 * soma = 0
	 * para i = 0, enquanto i <= 10 processar
	 * 		receber valor
	 * 		enquanto valor < 0 processar
	 * 			receber valor
	 * 		se o valor > maior entao
	 * 			maior = valor
	 * 		se menor == -1 or valor < menor entao
	 * 			menor = valor
	 * escrever "Maior: " + maior
	 * escrever "Manor: " + menor
	 * escrever "Media: " + (soma / 10)
	 */

	public static void main(String[] args) {
		
		//Variaveis
		int valor, maior = -999, menor = 999, soma = 0;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe um Valor: ");
			valor = teclado.nextInt();
			
			if(valor > 0) {
				if(valor > maior) {
					maior = valor;
				}
				if(valor < menor) {
					menor = valor;
				}
				soma = soma + valor;
			}else {
				i--;
			}
			
		}
		media = soma / 10;
		System.out.println("O maior Numero eh: " + maior);
		System.out.println("O Menor Numero eh: " + menor);
		System.out.println("A Media dos Numeros eh: " + media);
		teclado.close();
		
	}

}
