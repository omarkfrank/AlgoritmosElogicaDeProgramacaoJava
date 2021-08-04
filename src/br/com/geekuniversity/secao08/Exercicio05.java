package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio05 {
	/*Faca um programa que carregue um vetor com dez numeros inteiros.
	 * Calcule e mostre os numeros superiores a 50 e suas respectivas posicoes.
	 * Mostrar mensagem se nao existir nenhum numero nesta condicao.
	 */
	
	/*vetor = []
	 * maiors_50 = falso
	 * para i = 0, enquanto i < 10 processar
	 * 		escrever Digite um valor:
	 * 		receber valor
	 * 		vetor[i] = valor
	 * 		se valor > 50 entao
	 * 			escrever "Valor " + valor + " maior do que 50 na posicao " + i
	 * 			maiores_50 = verdadeiro
	 *
	 *se maiores_50 == falso entao
	 *	escrevre "Nao existem valores meiores do que 50"
	 */
	public static void main(String[] args) {
		//Variaveis
		int[] vetor = new int [10];
		boolean tem_maior_50 = false;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada / Processamento
		for (int i = 0; i < 10; i++) {
			System.out.printf("Informe o Valor para o Vetor %d/10\n", (i+1));
			vetor[i] = teclado.nextInt();
			}
		for (int i = 0; i < 10; i++){
			if(vetor[i] > 50) {
				System.out.printf("O Numero %d esta na Posicao %d\n", vetor[i], i);
				tem_maior_50 = true;
			}
			
		}
		if(!tem_maior_50) {
			System.out.println("Nao existe nenhum numero maior que 50");
		}
		teclado.close();

	}

}
