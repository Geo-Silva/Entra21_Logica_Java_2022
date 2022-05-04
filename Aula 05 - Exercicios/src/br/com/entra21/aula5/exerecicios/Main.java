package br.com.entra21.aula5.exerecicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Capturar 2 números e informar qual é o maior");

		Scanner entrada = new Scanner(System.in);
		float numeroA, numeroB;

		System.out.println("Informe o valor do número A");
		numeroA = entrada.nextFloat();

		System.out.println("Informe o valor do número B");
		numeroB = entrada.nextFloat();

		if (numeroA > numeroB) {

			System.out.println("Numero A é maior");

		} else if (numeroA == numeroB) {

			System.out.println("São iguais");

		} else {

			System.out.println("Numero B é maior");

		}

		System.out.println("========================");

		System.out.println("Capturar ano de nascimento e informar se já tem idade para votar");

		short anoNascimento;
		short calculo;

		System.out.println("Informe o seu ano de nascimento");
		anoNascimento = entrada.nextShort();

		calculo = (short) (2022 - anoNascimento);

		if (calculo > 15) {

			System.out.println("Tem idade para votar");

		} else {

			System.out.println("Tá cedo ainda para brincar");

		}

		System.out.println(calculo >= 16 ? "Já pode votar" : "Não pode votar");
		
	}

}
