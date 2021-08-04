package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio07 {
	
	/*Sua organizacao acaba de contratar um estagiario para trabalhar no 
	 * Suporte de Informatica, com a intencao de fazer um levantamanto nas sucatas 
	 * encontradas nessa area. A primeira tarefa dele eh testar todos os cerca de 200 mouses 
	 * que se encontram la, testando e anotando o estado de cada um deles, para verificar
	 * o que se pode aproveitar deles.
	 * Foi requisitado que voce desenvolva um programa para registrar este levantamento.
	 * O programa devera receber um numero indeterminado de entradas, cada um contendo:
	 * Um numero de identificacao do mouse o tipo de defeito:
	 * 
	 *   - necessita esfera;
	 *   - necessita de limpeza;
	 *   - necessita troca do cabo ou conector;
	 *   - quebrado ou inutilizado;
	 *   
	 * Uma identificacao igual a 0(zero) encerra o programa. Ao final o programa devera 
	 * emitir o seguinte relatorio:
	 * 
	 * Quantidade de Mouses: 100
	 * 
	 * Situacao									Quantidade			Percentual
	 * 
	 * 1-Necessita da Esfera						40					40%
	 * 2-Necessita de Limpeza						30					30%
	 * 3-Necessita Troca do Cabo ou Conector		15					15%
	 * 4-Quebrado ou Inutilizado					15					15%
	 * 
	 * escrever "Digite o id do Mouse "
	 * receber identificacao
	 * quantidade = 0
	 * necessita_esfera = 0
	 * necessita_limpeza = 0
	 * necessita_troca_de_cabo = 0
	 * quebrado = 0
	 * enquanto indentificacao != 0 processar
	 * 		escreva "Identifique o Defeito: "
	 * 		escreva "1 = necessitade esfera"
	 * 		escreva "2 = necessita de limpeza"
	 * 		escreva "3 = necessita troca do cabo conector"
	 * 		escreva "4 = quebrado ou inutilizado"
	 * 		escrever "Digite o Defeito: "
	 * 		receber defeito
	 * 		se defeito == 1 entao
	 * 			necessita_esfera = necessita_esfera + 1
	 * 		se defeito == 2 entao
	 * 			necessita_limpeza = necessita_limpeza + 1
	 * 		se defeito == 3 entao
	 * 			necessita_troca_de_cabo = necessita_troca_cabo + 1
	 * 		se defeito == 4 entao
	 * 			quebrado = quebrado + 1
	 * 		quantidade = quantidade + 1
	 * 		escrever "Digite o id do Mouse: "
	 * 		receber identificacao
	 * 
	 * perc_esfera = (necessita_esfera * 100) / quantidade
	 * perc_limpeza = (necessita_limpeza * 100) / quantidade
	 * perc_cabo = (necessita_troca_cabo * 100) / quantidade
	 * perc_quebrado = (quebrado * 100) / quantidade
	 * 
	 * escrever "Quantidade de Mouses: " + quantidade
	 * escrever "Situacao		Quantidade		Percentual"
	 * escrever "1 = Necessita da Esfera " + necessita_esfera + perc_esfera
	 * escrever "2 = Necessita de Limpeza " + necessita_limpeza + perc_limpeza
	 * escrever "3 = Necessita Troca do Cabo ou Conector " + necessita_troca_cabo + perc_cabo
	 * escrever "4 = Quebrado ou Inutilizado " + quebrado + perc_quebrado 
	 */

	public static void main(String[] args) {
		//Variaveis
		int contatorTotal = 0, contadorSit1 = 0, contadorSit2 = 0,contadorSit3 = 0, contadorSit4 = 0,
				identificacao, defeito;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.print("\nInforme a Identificacao: ");
		identificacao = teclado.nextInt();
		
		while(identificacao != 0) {
			//Entrada
			System.out.println("\n1 - Necessita de Esfera.");
			System.out.println("2 - Necessita de Limpeza.");
			System.out.println("3 - Necessita Troca de Cabo ou Conector.");
			System.out.println("4 - Quebrado ou Inutilizado.");
			System.out.print("\nInforme o Defeito: ");
			
			defeito = teclado.nextInt();
			
			//Processamento
			if(defeito == 1) {
				contadorSit1 = contadorSit1 + 1;
			}
			if(defeito == 2) {
				contadorSit2 = contadorSit2 + 1;
			}
			if(defeito == 3) {
				contadorSit3 = contadorSit3 + 1;
			}
			if(defeito == 4) {
				contadorSit4 = contadorSit4 + 1;
			}
			contatorTotal = contatorTotal + 1;
			//Entradas
			System.out.print("\nInforme a Identificacao: ");
			identificacao = teclado.nextInt();
		}
		float porcentagem1, porcentagem2, porcentagem3, porcentagem4;
		porcentagem1 = ((float)contadorSit1 / (float)contatorTotal) * (float)100.00;
		porcentagem2 = ((float)contadorSit2 / (float)contatorTotal) * (float)100.00;
		porcentagem3 = ((float)contadorSit3 / (float)contatorTotal) * (float)100.00;
		porcentagem4 = ((float)contadorSit4 / (float)contatorTotal) * (float)100.00;
		
		System.out.printf("\nQuantidade de Mouses %d\n", contatorTotal);
		System.out.println("\tSituacao \t\t\t\tQuantidade \t\tPercentual");
		System.out.printf("1 - Necessidade de Esfera \t\t\t%d \t\t\t%.2f%%\n", contadorSit1, porcentagem1);
		System.out.printf("2 - Necessita de Limpeza. \t\t\t%d \t\t\t%.2f%%\n", contadorSit2, porcentagem2);
		System.out.printf("3 - Necessita Troca de Cabo ou Conector. \t%d \t\t\t%.2f%%\n", contadorSit3, porcentagem3);
		System.out.printf("4 - Quebrado ou Inutilizado. \t\t\t%d \t\t\t%.2f%%\n", contadorSit4, porcentagem4);
		teclado.close();
	}

}
