package br.com.entra21.aula5.exerecicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Capturar 2 n�meros e informar qual � o maior");

		Scanner entrada = new Scanner(System.in);
		float numeroA, numeroB;

		System.out.println("Informe o valor do n�mero A");
		numeroA = entrada.nextFloat();

		System.out.println("Informe o valor do n�mero B");
		numeroB = entrada.nextFloat();

		if (numeroA > numeroB) {

			System.out.println("Numero A � maior");

		} else if (numeroA == numeroB) {

			System.out.println("S�o iguais");

		} else {

			System.out.println("Numero B � maior");

		}

		System.out.println("========================");

		System.out.println("Capturar ano de nascimento e informar se j� tem idade para votar");

		short anoNascimento;
		short calculo;

		System.out.println("Informe o seu ano de nascimento");
		anoNascimento = entrada.nextShort();

		calculo = (short) (2022 - anoNascimento);

		if (calculo > 15) {

			System.out.println("Tem idade para votar");

		} else {

			System.out.println("T� cedo ainda para brincar");

		}

		System.out.println(calculo >= 16 ? "J� pode votar" : "N�o pode votar");
		
	}

}
