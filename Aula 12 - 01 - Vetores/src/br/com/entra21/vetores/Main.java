package br.com.entra21.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		byte opcao;

		do {
			
			System.out.println("0 - Sair");
			System.out.println("1 - Declarando vetores");
			System.out.println("2 - Acessando vetores");
			System.out.println("3 - Atribuindo valores no indices");
			System.out.println("4 - Médias com vetores");
			opcao = input.nextByte();
			
			switch(opcao) {
			
			case 0:
				
				//vazio, apenas para não cair no default e o zero atende a condição de saida
				
				break;
			
			case 1:
				
				declararVetor();
				
				break;
				
			case 2:
				
				acessarVetor();
				
				break;
				
			case 3:
				
				atribuirVetor();
				
				break;
			
			case 4:
				
				mediaVetor();
				
				break;
			
			
			}
			
			
		}while(opcao != 0);	//vai ficar no laço até o zero ser selecionado
	
	}

	public static void declararVetor() { //dentro dos () argumentos seriam os parametros
		
		byte idades[]; // primeiro criar a variavel que é um vetor de algum tipo

		idades = new byte[15]; // segundo definir o tamanho

		System.out.println("O tamanho é " + idades.length); // depois usar ou atualizar. O lenght é usado para mostrar o
															// tamaho total dele, no caso 15. 0-14

		float notas[] = {1 ,3.5f ,8}; // 1 criei a variavel e 2 defini o tamaho dos valores respectivamente
		//				 [0] [1]  [2]  

		System.out.println("Quantas notas tem na lista? " + notas.length);

	}

	public static void acessarVetor() {
		
		
		byte idades[]; // primeiro criar a variavel que é um vetor de algum tipo

		idades = new byte[15]; // segundo definir o tamanho

		System.out.println("O tamanho é " + idades.length); // depois usar ou atualizar. O lenght é usado para mostrar o
															// tamaho total dele, no caso 15. 0-14
		
		idades[0] = 21;
		idades[1] = 13;
		idades[2] = 42;
		
		//como acessar cada posição e ver o que tem cada
		
		System.out.println("O que tem no indice [1]? " + idades[1]);
		System.out.println("O que tem na última posição de notas? " + idades[2]);
		//System.out.println("Consigo acessar o indíce 10 de notas? " + idades[10]);
		//Não é possível acessar um índice que não existe, CUIDADO
		
	}

	public static void atribuirVetor() {
		
		float notas[] = {1 ,3.5f ,8}; // 1 criei a variavel e 2 defini o tamaho dos valores respectivamente
		//				 [0] [1]  [2]  
		
		notas[0] = 33;
		notas[2] = 12;

	}

	public static void mediaVetor() {
		
		Scanner entrada = new Scanner(System.in);
		
		float notas[];
		notas = new float[3];
		
		for(byte contador = 0; contador < notas.length; contador++) {
			
			//System.out.println("Contagem em: " + contador);
			System.out.println("Informe a " + (contador + 1) + "ª nota");
			notas[contador] = entrada.nextFloat();

		}
		System.out.println("A segunda nota foi " + notas[1]);
		float soma = 0;
		for(byte contador = 0; contador < notas.length; contador++) {
			System.out.println(notas[contador]);
			soma = soma + notas[contador];

		}
		
		System.out.println("Soma = "+ soma);
		System.out.println("Média = " + soma / notas.length);
		
	}
	
}	
