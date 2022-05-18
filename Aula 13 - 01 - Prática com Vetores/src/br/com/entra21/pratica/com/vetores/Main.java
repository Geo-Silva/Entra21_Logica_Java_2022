package br.com.entra21.pratica.com.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		byte resposta;

		do { // utilizando o do-while pois permite entrar no bloco antes de testar a condição
				// de permanencia
			System.out.println(escreverMenu());
			resposta = entrada.nextByte();

			switch (resposta) {

			case 0:

				System.out.println("Obrigado por ter usado!");
				System.out.println("Saindo...");

				break;

			case 1:

				exibirTamanhoVetores();

				break;

			case 2:

				exibirTamanhoVetoresInicializados();

				break;

			case 3:

				vetorComCincoParaInicializar();

				break;

			case 4:

				definirTamanhoVetorParaInicializar();

				break;

			case 5:

				percorrerVetorInicializadoCrescenteDecrescente(); // chamada de método

				break;

			case 6:

				exibirVetorInteirosNaoInicializado();

				break;

			default:

				System.out.println("Opção inválida");
				main(args);

				break;

			} // caso a repetição de permanencia seja true, repita o bloco.

		} while (resposta != 0); // enquanto não for zero, repita

	}

	public static String escreverMenu() {

		String menu = "Bem vindo ao Programa sem nome versão 0.37 alpha\n";
		menu += "0 - Sair\n";
		menu += "1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "3 - Criar 1 vetor de 5 posições, para que o usuário alimente esses valores\n";
		menu += "4 - Criar um vetor com o tamanho informado pelo usuário e depois solicitar que o usuário informe os respectivos valores\n";
		menu += "\"5 - Criar um vetor de inteiros inicializado , para percorrer\\r\\n\"\r\n"
				+ "				+ \"Do inicio ao fim\\r\\n\" + \"Do fim ao inicio\n";
		menu += "6 - Criar um vetor de inteiros não inicializado";
		menu += "------------------------------------------------";

		return menu;

	}

	public static void exibirTamanhoVetores() {

		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInteiro[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetorDoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInteiro tamanho = " + vetorInteiro.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void exibirTamanhoVetoresInicializados() {

		byte vetorBytes[] = { 5, 7, 9, 10 };
		short vetorShorts[] = { 150, 200, 250, 300 };
		int vetorInts[] = { 1600, 1939 };
		long vetorLongs[] = { 100000, 200000, 300000 };
		float vetorFloats[] = { 10000.50f, 20000.2f, 50000.3f };
		double vetorDoubles[] = { 150000.354d, 4000000.12345d };
		char vetorChars[] = { 'a', 'b', 'c', 'd', 'e', };
		boolean vetorBooleans[] = { true, false, false, true };

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void vetorComCincoParaInicializar() {

		Scanner entrada = new Scanner(System.in);

		byte vetorBytes[] = new byte[5];

		for (byte contador = 0; contador <= vetorBytes.length; contador++) {

			System.out.println("Inicializando a posição " + (contador + 1) + " no índice " + contador);
			vetorBytes[contador] = entrada.nextByte();

		}

	}

	public static void definirTamanhoVetorParaInicializar() {

		Scanner entrada = new Scanner(System.in);

		byte tamanho;
		byte vetorBytes[];

		System.out.println("Informe o tamanho do vetor");
		tamanho = entrada.nextByte();

		vetorBytes = new byte[tamanho];

		for (byte contador = 0; contador < vetorBytes.length; contador++) {

			System.out.println("Informe o valor para o item " + (contador + 1) + " no índice [" + contador + "]");
			vetorBytes[contador] = entrada.nextByte();

		}

	}

	public static void percorrerVetorInicializadoCrescenteDecrescente() {

		byte vetorByte[] = { 6, 2, 15, 76, 15 };

		for (byte contador = 0; contador < vetorByte.length; contador++) {

			System.out.println(vetorByte[contador]);

		}

		System.out.println("-----------");
		for (byte contador = (byte) (vetorByte.length - 1); contador >= 0; contador--) {
			// começando com o tamanho -1, porque o indice sempre tem um valor a menos
			// condição de permanencia, enquanto meu contador for maior do que zero, porque
			// comecei com um valor alto e estou diminuindo, parando no zero
			// como uma repetição decrescente, utilizo o decremento no contador

			System.out.println(vetorByte[contador]);

		}

	}

	public static void exibirVetorInteirosNaoInicializado() {

		Scanner entrada = new Scanner(System.in);

		byte vetorBytes[] = new byte[10];
		String resposta;
		byte index = 0;

		do {

			System.out.println("Informe um valor para o índice [" + index + "]");
			vetorBytes[index] = entrada.nextByte();

			System.out.println("Gostaria de inicializar outro índice?");
			resposta = entrada.next();

			if (resposta.equalsIgnoreCase("Sim")) {

				do {

					System.out.println("Informe um índice válido entre 0 e " + (vetorBytes.length - 1));
					index = entrada.nextByte(); // se o usuario digitar um valor válido esse index será usado no meu DO
												// principal, onde a logica se repete

				} while (index < 0 || index >= vetorBytes.length); // a posição escolhida não pode ser menor do que
																	// zero,
																	// nem o tamanho do vetor
				// exemplo: O range válido é de 0 a 9, qualquer número além disso fica preso
				// nesse loop

			}

		} while (resposta.equalsIgnoreCase("Sim"));

		for (byte contador = 0; contador < vetorBytes.length; contador++) {

			System.out.println("vetorBytes[" + contador + "] = " + vetorBytes[contador]);

		}

	}
}
