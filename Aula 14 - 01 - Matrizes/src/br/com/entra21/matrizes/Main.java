package br.com.entra21.matrizes;

import java.util.Scanner;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	// definindo a variavel entrada do tipo Scanner acess�vel em toda a classe main
	// como o metodo main � static, tanto metodos ou variaveis devem ser static para
	// se relacionarem com o m�todo main

	public static void main(String[] args) {

		byte opcao;

		do {

			System.out.println(escreverMenuMatrizes());
			opcao = entrada.nextByte();

			switch (opcao) {

			case 0:

				System.out.println("Saindo...");

				break;

			case 1:

				aprenderMatrizesSimples();

				break;

			case 2:

				aprenderMatrizesInicializadas();

				break;

			default:

				System.out.println("Poxa...s�o s� duas op��es");
				
				break;

			}

		} while (opcao != 0);
		
		System.out.println("Fim da aula sobre matrizes.");

	}

	public static String escreverMenuMatrizes() {

		String conteudoMenu = "Escolha uma op��o para aprender:\n";

		conteudoMenu += "\t0 - Sair\n";
		conteudoMenu += "\t1 - Inicializando matrizes com tamanhos definidos\n";
		conteudoMenu += "\t2 - Inicializando matrizes com valores predeterminados";

		return conteudoMenu;

	}

	public static void aprenderMatrizesSimples() {

		System.out.println("Aprendendo sobre matrizes simples");

		System.out.println("Armazenar as 3 notas de todos os 10 alunos");

		float notas[][];
		notas = new float[10][3]; // Aqui eu quem defini diretamente no c�digo o tamanho da matriz
		// primeiro indice � a quantidade de vetores (� a quantidade de linhas em uma
		// tabela)
		// e o segundo indice � a capacidade de cada vetor (� a quantidade de colunas em
		// uma tabela)
		// apenas no indice da cria��o pela sintaxe ficam os valores

		byte quantidadeAlunos, quantidadeNotas;

		System.out.println("Informe a quantidade de alunos");
		quantidadeAlunos = entrada.nextByte();

		System.out.println("Informe a quantidade de notas para cada aluno");
		quantidadeNotas = entrada.nextByte();
		
		// desse jeito o usu�rio quem define o tamanho da matriz

		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];

		for(byte aluno = 0; aluno < novasNotas.length; aluno ++	) {
			
			System.out.println("Nessa posi��o [" + aluno + "] temos " + novasNotas[aluno].length + " notas");
			//no novasNotas.length vai um [aluno] dentro pois � o vetor e dentro dele tem um valor 3.
			//assim o contador "aluno" aumenta e passa por todos os vetores
			//dependendo da quantidade de notas que for, ele vai mostrar o total de indicies dentro desse vetor
			//na duvida, debuga que tu vai entender...
			
			for(byte nota = 0; nota < novasNotas[aluno].length; nota ++) {
				
				System.out.println("\t Valor da nota [" + nota + "] ===> " + novasNotas[aluno][nota]);
				
			}
			
		}
		
	}

	public static void aprenderMatrizesInicializadas() {

		System.out.println("Aprendendo sobre matrizes inicializadas e irregulares");
		
					  //[item][detalhe] nesse caso abaixo seria [3][3]
		double salarioAlunos[][] = { 		//vetor de vetores
				{1000, 1250.50f, 2500.35f}, //vetor
				{2700, 3500, 4500}, 		//com um total
				{50000, 150000, 2000000}	//de 3 vetores com 3 indices com valores dentro ==> [3][3]
		};
		
		byte matrizIrregular[/*vetores*/][/*valores_em_cada_vetor*/] = {
				{1, 2, 3, 4, 5, 6, 7}, //comprimento 7
				{4, 3 , 2, 1},		//comprimento 4
				{10, 12},		//comprimento 2
				{-127, 0, 127}	//comprimento 3
		};	// ao todo s�o 4 vetores com indices com tamanhos diferentes (irregular)
		
		String ementa[][] = {
			{"Metodologias �geis", "Introdu��o", "Metodologias", "Git"},
			{"L�gica com Java", "Variaveis", "Constantes", "Coment�rios", "Desvios Condicionais", "La�os de Repeti��o"},
			{"POO", "Classes", "Objetos", "Heran�a", "Poliformismo", "Encapsulamento", "Conceitos"},
			
		};
		
	}
}
