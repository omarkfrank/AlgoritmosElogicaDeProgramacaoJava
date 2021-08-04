package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio09 {
	
	/*A Secretaria de Meio Ambiente que controla o indice de poluicao mantem 3 grupos
	 * de industrias que sao altamente poluentes do meio ambiente.O indice de poluicao aceitavel
	 * varia de 0,05 ateh 0,25. Se o indice sobe para 0,3 as industrias do 1º grupo sao intimadas
	 * a suspenderem suas atividades, se o indice crescer para 0,4 as industrias do 1º e 2º 
	 * grupo sao intimadas a suspenderem suas atividades, se o indice atingir 0,5 todos os 
	 * grupos devem ser notificados a paralisarem suas atividades.
	 * Faca um algoritmo que leia o indice de poluicao medido e emita a notificacao adequada
	 * aos diferentes grupos de empresas.
	 * 
	 * receber poluicao
	 * se (poluicao >= 0,3) and (poluicao < 0,4) entao
	 * 		escrever "Grupo 1 Suspender Atividades"
	 * se (poluicao >= 0,4) and (poluicao < 0,5) entao
	 * 		escrever "Grupo 1 e Grupo 2 Suspender Atividades"
	 * se (poluicao >= 0,5) entao
	 * 		escrever "Todos os Grupos Suspender Atividades"
	 * senao
	 * 		escrever "Niveis Aceitaveis" 
	 */

	public static void main(String[] args) {
		
		//Variaveis
		float indice;
		Scanner teclado = new Scanner (System.in);

		
		//Entradas
		System.out.print("Informe o Indice de Poluicao: ");
		indice = teclado.nextFloat();
		
		//Processamento:
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Atencao: Industrias do Primeiro Grupo devem Suspender as Atividades.");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Atencao: Industrias do Primeiro e do Segundo Grupo devem suspender as Atividades.");
		}else if(indice >= 0.5) {
			System.out.println("Atencao: Todos os Grupos devem suspender suas Atividades");
		}
		teclado.close();
	}

}
