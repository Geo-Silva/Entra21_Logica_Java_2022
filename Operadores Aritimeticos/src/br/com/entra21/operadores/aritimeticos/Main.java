package br.com.entra21.operadores.aritimeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Operadores aritm�ticos"); //System.out � output, sa�da de dados
		
		System.out.println("Realizando uma soma "+ (1+7));
		System.out.println(4+10);
		
		float numeroA, numeroB;
		float calculoSoma;
		float resto;
		
		//Objeto entrada da classe Scanner precisa utilizar o System.in para ter acesso ao teclado
		Scanner entrada = new Scanner(System.in); //Systen.in observa o que est� sendo digitado, somente quando o programa para. Entrada de dados.
		//new Scanner significa: construa um objeto da classe Scanner e atribua uma variavel entrada
		
		System.out.println("Informe o n�mero A");
		numeroA = entrada.nextFloat();
		
		System.out.println("Informe o n�mero B");
		numeroB = entrada.nextFloat();
		
		System.out.println("A soma entre esses dois n�meros �: "+ (numeroA+numeroB));
		calculoSoma = numeroA + numeroB;
		
		System.out.println("Outra forma de exibir essa soma � "+ calculoSoma);
		
		System.out.println(" A subtra��o entre esses dois n�meros �: "+ (numeroA-numeroB));
		
		System.out.println("Multiplica��o " + numeroA * numeroB);
		
		System.out.println("Divis�o " + numeroA / numeroB);
		
		resto = numeroA % numeroB;
		
		System.out.println("O resto da divis�o " + resto);
		
		boolean ehDivisivel = numeroA % numeroB == 0;
		
		System.out.println("� divis�vel entre si? " + ehDivisivel);
		
	}
	
}
