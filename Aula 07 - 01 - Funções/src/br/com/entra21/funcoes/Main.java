package br.com.entra21.funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String opcao;

		System.out.println("Quero executar o assunto abaixo:");
		System.out.println("1 - Procedimentos");
		System.out.println("2 - Parametros");
		System.out.println("3 - Retornos");
		System.out.println("4 - Completo");
		System.out.println("11 - Exercicio 1");
		System.out.println("12 - Exercicio 2");

		opcao = entrada.nextLine();

		switch (opcao.toLowerCase()) {

		case "1":
		case "procedimentos":
			verProcedimentos();
			break;

		case "2":
		case "parametros": // argumento � o valor que passo para o meu m�todo (aqui)
			verParametros(2); // como argumento passei o valor 2 para o metodo
			verParametros(18);
			verMaisParametros(opcao, "geovani", 10);
			verMaisParametros(opcao, "geovani", 300);

			break;

		case "3":
		case "retornos":
			byte retorno = retornarValorInteiro(); // o retorno para atribuir variaveis
			// usar diretamente em saidas em tela syso
			System.out.println("Esse metodo retornou: " + retornarValorInteiro());
			if (retornarValorInteiro() < 20) { // usar o retorno para logica booleana
				System.out.println("Retornou menor que 20");

			} else {
				System.out.println("Retornou maior ou igual a 20");

			}

			break;

		case "4":
		case "completo":
			calcularDivisao(4, 2); // o retorno ta ai, pega quem quiser. Nesse caso ninguem nessa linha

			float entradaA, entradaB;
			//System.out.println("Informe o primeiro float");
			//entradaA = entrada.nextFloat();
			//System.out.println("Informe o segundo float");
			//entradaB = entrada.nextFloat();
			//float calculo = operacoesCalculadora(10, 2);
			//System.out.println("Resultou em " + calculo);

			break;

		default:
			System.out.println("N�o tem essa op��o no menu");
			break;
		}

	}

	// declara��o de fun��o
	// as regras de uso e como ser� executado
	// O "void" � sem retorno, s� executa coisas
	// "public" porque qualquer um pode citar/usar ele
	// "static", porque nosso main � static e ele s� pode chamar outros static.

	public static void capturarFrase() {

		System.out.println("Escreva uma frase...");
		System.out.println("--------------------------------------");
		System.out.println("       ENTER PARA SALVAR              ");
		System.out.println("--------------------------------------");

	}

	public static void verProcedimentos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("1 - Procedimentos");

		String frase;

		capturarFrase();
		frase = entrada.nextLine();

		System.out.println("Voc� disse: " + frase + ".");

		capturarFrase();
		frase = entrada.nextLine();

		System.out.println("Voc� disse: " + frase + ".");

		capturarFrase();
		frase = entrada.nextLine();

		System.out.println("Voc� disse: " + frase + ".");

	}

	// parametro � uma variavel tempor�ria
	// o valor colocado no "main", ser� passado para ela
	//
	public static void verParametros(int numero) {

		System.out.println("Voc� me passou por parametro o numero: " + numero);

		if (numero % 2 == 0) {

			System.out.println("Que legal! E esse n�mero � par...");
		}
	}

	// Se l� tem duas strings, seguidos de um n�mero
	// Aqui deve-se colocar string, string e int
	public static void verMaisParametros(String escolha, String nome, int numero) {

		System.out.println("Recebi isso tudo de voc�:");
		System.out.println(escolha);
		System.out.println(nome);
		System.out.println(numero);

		if (numero < 100) {

			System.out.println("Menor que 100");

		} else {

			System.out.println("Maior que 100");
		}

	}

	// byte porque � uma de retorno, n�o um void
	// usado para devolver um valor (hora atual por exemplo)
	public static byte retornarValorInteiro() {

		byte variavelParaRetorno = 15;
		System.out.println("Aqui sempre retornando 15, porque n�o tem parametros" + "para tornar ele din�mico");
		return variavelParaRetorno;

	}

	public static float calcularDivisao(float numeroA, float numeroB) {

		return numeroA / numeroB;
	}

	//public static String operacoesCalculadora(float numeroA, float numeroB) {
		
		
		//float soma = numeroA + numeroB;
		//float subtracao = numeroA - numeroB;
		//float multiplicacao = numeroA * numeroB;
		//float divisao = numeroA / numeroB;
		
		/*
		return  "Executei tudo:"
				+ "\nSoma = " + soma + "."
				+ "\nSubtracao = " + subtracao + "."
				+ "\nMultiplicacao = " + multiplicacao + "."
				+ "\nDivisao = " + divisao + "."
				*/

	//}
	
	
}
