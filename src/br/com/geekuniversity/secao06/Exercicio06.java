package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio06 {
	
	/*Elabore um algoritmo que leia as variaveis 'c' e 'n' , respectivamente
	 * codigo e numero de horas trabalhadas de um operario. Calcule o salario sabendo-se 
	 * que ele ganha R$10,00 por hora. Quando o numero de horas exceder a 50
	 * calcule o excesso de pagamento armazenando-o na variavel 'e' .
	 * Caso contrario, zerar tal variavel.
	 * A hora excedente de trabalho vale R$20,00. No final do processamento, imprimir
	 * o salario total e o excedente.
	 * 
	 *  e= 0
	 *  receber  c
	 *  receber n 
	 *  se n > 50 entao
	 *  	e = n - 50
	 *  	n = n - e
	 *  extra = e * 20
	 *  salario = n * 10
	 *  escreva "Salario: " + salario
	 * escreva "Extra: " + extra
	 */

	public static void main(String[] args) {
		//Variaveis
		int c;
		float n, e = 0, salario, valor_hora = (float)10.00;
		Scanner teclado = new Scanner (System.in);
		
		//Entradas
		System.out.print("Informe o codigo: ");
		c = teclado.nextInt();
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();
		
		//Processamento
		if(n > 50) {
			e = (float)(n - 50) * (float)20.00;
			salario = (50 * valor_hora) + e;
			System.out.printf("Salario ToTal R$ %.2f\n", salario);
			System.out.printf("Salario Excedente: R$ %.2f\n", e);
		}else {
			salario = n * valor_hora;
			System.out.printf("Salario Total R$ %.2f\n", salario);
			System.out.printf("Salario Excedente R$ %.2f\n", e);
		}
		teclado.close();
	}
}