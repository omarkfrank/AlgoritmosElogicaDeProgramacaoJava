package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio05 {
	
	/*Faca um programa que leia um nome de usuario e a sua senha e nao
	 * aceite a senha igual ao nome do usuario, mostrando uma mensagem de 
	 * erro e voltando a pedir as informacoes.
	 * 
	 * escrever "Infome o nome: "
	 * receber nome
	 * escrever "Informe a senha: "
	 * receber a senha
	 * enquanto senha == nome processar
	 * 		escrever "Senha nao pode ser igual ao nome "
	 * 		escrever "Informe o nome "
	 * 		receber nome
	 * 		escrever "Informe a senha "
	 * 		recebe senha
	 * 
	 */

	public static void main(String[] args) {
		
		//Variaveis
		String nome, senha;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println("Informe o Nome: ");
		nome = teclado.next();
		
		System.out.println("Informe a Senha: ");
		senha = teclado.next();
		
		//Processamento
		while(nome.equals(senha)) {
			
			System.out.println("Erro! O Nome de Usuario e Senha devem ser Diferentes!");
			
		//Entrada
			System.out.println("Informe o Nome: ");
			nome = teclado.next();
			
			System.out.println("Informe a Senha: ");
			senha = teclado.next();
		}
		teclado.close();
	}

}
