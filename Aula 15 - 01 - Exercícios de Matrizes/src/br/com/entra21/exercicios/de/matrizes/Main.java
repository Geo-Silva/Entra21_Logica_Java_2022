package br.com.entra21.exercicios.de.matrizes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		byte opcao = 0;
		
		do {
			
			System.out.println(escreverMenu());
			opcao = entrada.nextByte();
			
			switch(opcao) {
				
				case 0:
					
					System.out.println("Saindo...");
					
					break;
				
				case 1:
					
					criarMatrizesDoisNiveis();
					
					break;
				
				case 2:
					
					matrizInicializadaDoisNiveis();
					
					break;
					
				case 3:
					
					criarMatrizCincosPosicoes();
					
					break;
					
				case 4:
					
					solicitarTamanhoMatrizParaPreencher();
					
					break;
					
				case 5:
					
					percorrerInicioAoFimViceVersa();
					
					break;
					
				case 6:
					
					atribuirAleatoriamenteValoresDetalhesVetores();
					
					break;
					
				default:
					
					System.out.println("Escolha uma opcão válida!");
					
					break;
				
			}
			
		}while(opcao != 0);
		
	}

	public static String escreverMenu() {
		
		Scanner entrada = new Scanner(System.in);
		
		String menu = "Escolha uma das opções abaixo\n";
		
		menu += "\t0 - Sair\n";
		menu += "\t1 - Criar matriz de dois níveis\n";
		menu += "\t2 - Criar matrizes de 2 níveis inicializados\n";
		menu += "\t3 - Criar 1 matriz de 5 posições com 3 itens de "
				+ "capacidade, para que o usuário alimente esses valores\n";
		menu += "\t4 - Criar uma matriz com o tamanho  e capacidade informada pelo "
				+ "usuário e depois solicitar que o usuário informe os respectivos valores\n";
		menu += "\t5 - Criar matriz inicilizada de inteiros para percorrer do inicio ao fim e do fim ao inicio\n";
		menu += "\t6 - Preencher aleatoriamente valores na matriz";
		return menu;
		
		
	}

	public static void criarMatrizesDoisNiveis() {
		
		char matrizChars[][] = new char[2][3]; // dois vetores onde cada um consegue armazenar 3 letras
		boolean matrizBooleans[][];
		matrizBooleans = new boolean[2][4]; //dois vetores onde cada um pode armazenar 4 valores logicos
		byte matrizBytes[][] = new byte[4][3];
		short matrizShorts[][] = new short[2][3];
		int matrizInts[][] = new int[3][2];
		long matrizLongs[][] = new long[3][5];
		float matrizFloats[][] = new float[3][4];
		double matrizDoubles[][] = new double[5][3];
		
		System.out.println("matrizChars tamanho = " + matrizChars.length + " e cada vetor tem " + matrizChars[0].length);
		System.out.println("matrizBooleans tamanho = " + matrizBooleans.length + " e cada vetor tem " + matrizBooleans[0].length);
		System.out.println("matrizBytes tamanho = " + matrizBytes.length + " e cada vetor tem " + matrizBytes[0].length);
		System.out.println("matrizShorts tamanho = " + matrizShorts.length + " e cada vetor tem " + matrizShorts[0].length);
		System.out.println("matrizInts tamanho = " + matrizInts.length + " e cada vetor tem " + matrizInts[0].length);
		System.out.println("matrizLongs tamanho = " + matrizLongs.length + " e cada vetor tem " + matrizLongs[0].length);
		System.out.println("matrizFloats tamanho = " + matrizFloats.length + " e cada vetor tem " + matrizFloats[0].length);
		System.out.println("matrizDoubles tamanho = " + matrizDoubles.length + " e cada vetor tem " + matrizDoubles[0].length);
		
	}

	public static void matrizInicializadaDoisNiveis() {
		
		char matrizChars[][] = { // é irregular, quem define o tamanho de cada vetor é a inicialização
				{'G', 'S', 'B'}, //[0][3]
				{'R', 'D', 'O'}, //[1][3]
				{'F', 'F', 'C', 'A'}, //[2][4] <== possui quatro indices
				
		};
		
		boolean matrizBooleans[][] = {       // esse é regular, pois todos tem o mesmo tamanho de indice [3][4]
				{true, false, true, false}, //[0][4]
				{true, false, true, false}, //[1][4]
				{true, false, true, false}, //[2][4]

		};
		
		byte matrizBytes[][] = {
				{1, 2, 3, 4, 5},
				{1, 2, 3},
				{1, 2},
				{1},
					
		};
		
		short matrizShorts[][] = {
				{300, 400, 1000},
				{500, 600, 100},
				{1000, 4000, 5000},
						
		};
		
		int matrizInts[][] = { //nesse caso é um vetor de 3 basicamente mas ok...
				{10000,},
				{34000,},
				{16400,},
				
		};
		
		long matrizLongs[][] = {
				{300, 400, 700},
				{10000, 600000, 1242000},
				{2241, 643124, 643, 83216, 12451}, // irregular também.
				
		};
		
		float matrizFloats[][] = {
				{10.5f, 152,123f},
				{12.632f, 88.6321f, 24312.01f}, // dois vetores, com matrizes irregulares

		};
		
		double matrizDoubles[][] = {
				{93781.31d},
				{512.123d, 13451},
				{17234.13d, 12, 65132.31d}, // suuper irregular. 4 vetores com matrizes de tamanhos aleatorios
				{64},
		};
		/*
		for (byte vetor = 0; vetor < matrizChars.length; vetor ++) {
			
			
			for(byte detalhe = 0; detalhe < matrizChars[vetor].length; detalhe ++) {
				
				matrizChars[vetor][detalhe] = 'X';
				
				
				
			}
			
		}
		*/
		
	}

	public static void criarMatrizCincosPosicoes() {
		
		Scanner entrada = new Scanner(System.in);
		
		byte matrizBytes[][] = new byte[5][3];
		
		System.out.println("Para o primeiro vetor, informe o primeiro valor");
		matrizBytes[0][0] = entrada.nextByte();
		
		System.out.println("Para o primeiro vetor, informe o segundo valor");
		matrizBytes[0][1] = entrada.nextByte();
		
		System.out.println("Para o primeiro vetor, informe o terceiro valor");
		matrizBytes[0][0] = entrada.nextByte();
		
		//---------------------------------------------
		
		System.out.println("Para o segundo vetor, informe o primeiro valor");
		matrizBytes[1][0] = entrada.nextByte();
		
		System.out.println("Para o segundo vetor, informe o segundo valor");
		matrizBytes[1][1] = entrada.nextByte();
		
		System.out.println("Para o segundo vetor, informe o terceiro valor");
		matrizBytes[1][0] = entrada.nextByte();
		
		//--------------------------------------------
		
		//nesse for de baixo o usuario pode definir os valores de cada um dos indices dos vetores
		//no primeiro for ele vai passar pelos vetores e no segundo será para os indices, as matrizes.
		
		for(byte vetor = 2; vetor < matrizBytes.length; vetor ++) { //[0][1] e agora o [2] será em um 'for'
			
			
			for(byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe ++) {
				
				System.out.println("Para o " + (vetor + 1) + "º vetor, informe o " + (detalhe + 1) + "º valor");
				matrizBytes[vetor][detalhe] = entrada.nextByte(); 
						// Byte.parseByte(
					//	JOptionPane.showInputDialog(null, "Para o " + (vetor + 1) + "º vetor, informe o " + (detalhe + 1) + "º valor")
						//);
			}
		}
		
		
	}
	
	public static void solicitarTamanhoMatrizParaPreencher() {
		
		Scanner entrada = new Scanner(System.in);
		
		byte tamanhoVetor, tamanhoDetalhe;
		byte matrizBytes[][];
		
		System.out.println("Quantos vetores você quer na sua matriz?");
		tamanhoVetor = entrada.nextByte();
		
		System.out.println("Quantos itens você quer em cada vetor?");
		tamanhoDetalhe = entrada.nextByte();
		
		matrizBytes = new byte[tamanhoVetor][tamanhoDetalhe];
		
		for(byte vetor = 0; vetor < matrizBytes.length; vetor ++) {
			
			for(byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe ++) {
				
				System.out.println("Para o vetor (ou indice) [" + vetor + "], indice (ou detalhe) [" + detalhe + "]");
				matrizBytes[vetor][detalhe] = entrada.nextByte();
				
			}
			
		}
		
		for(byte vetor = 0; vetor < matrizBytes.length; vetor ++) {
			
			for(byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe ++) {
				
				System.out.println("Para o vetor (ou indice) [" + vetor + "], indice (ou detalhe) [" + detalhe + "]"
						+ "==> " + matrizBytes[vetor][detalhe]);
		
			}
		}
		
	}	

	public static void percorrerInicioAoFimViceVersa() {
		
		byte vetorBytes[][] = {
				{41, 13, 21, 16},	
				{12, 61, 23, 91},
				{1, 87, 77, 63},
		};
		
		for (byte vetor = 0; vetor < vetorBytes.length; vetor ++) {
			
			for (byte detalhe = 0; detalhe < vetorBytes[vetor].length; detalhe ++) {
				
				System.out.println("Para o vetor [" + vetor + "], detalhe [" + detalhe + "] temos"
						+ " o valor: " + vetorBytes[vetor][detalhe]);
			}
				
		}
		
		System.out.println("--------------------");
		System.out.println("Agora, do contrário");
		System.out.println("--------------------");

		for (byte vetor = (byte) (vetorBytes.length - 1); vetor >= 0; vetor --) {
			
			for (byte detalhe = (byte) (vetorBytes[vetor].length - 1); detalhe >= 0; detalhe --) {
				
				System.out.println("Para o vetor [" + vetor + "], detalhe [" + detalhe + "] temos"
						+ " o valor: " + vetorBytes[vetor][detalhe]);
				
			}
			
		}
		
	}
	
	public static void atribuirAleatoriamenteValoresDetalhesVetores() {
		
		Scanner entrada = new Scanner(System.in);
		byte matrizBytes[][] = new byte[30][10];
		String resposta;
		byte vetor = 0, detalhe = 0;
		
		do {
			
			System.out.println("Para o vetor [" + vetor + "] e detalhe [" + detalhe + "], informe o valor");
			matrizBytes[vetor][detalhe] = entrada.nextByte();
			
			System.out.println("Gostaria de inicializar outro valor?");
			resposta = entrada.next();
			
			if (resposta.equalsIgnoreCase("Sim")){
				
				System.out.println("Qual vetor você quer acessar?");
				vetor = entrada.nextByte();
				
				System.out.println("Qual detalhe desse vetor você quer atualizar o valor?");
				detalhe = entrada.nextByte();
				
				
				
			}
			
		}while(resposta.equalsIgnoreCase("Sim"));
		
		
		
		
		
		
	}





}

