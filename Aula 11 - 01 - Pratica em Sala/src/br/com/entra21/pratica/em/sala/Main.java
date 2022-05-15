package br.com.entra21.pratica.em.sala;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte option;

		do {

			option = Byte.parseByte(JOptionPane.showInputDialog(null,
					"Escolha uma das op��es: " + "\n0 - Sair" + "\n1 - Calculando a Soma" + "\n2 - Repetir 20 Vezes"
							+ "\n3 - Entre 20 pessoas exibir a soma de todas as idades"
							+ "\n4 - Entre 20 pessoas, quais s�o de maior"
							+ "\n5 - Exibir o nome da pessoa mais nova"
							+ "\n6 - Quantos n�meros s�o pares"
							+ "\n7 - Quantos n�meros est�o entre 0 e 100"
							+ "\n8 - Ler sequencia de numeros e parar quando for negativo"
							+ "\n9 - Solicite quantidade de notas e calcule a m�dia "));

			switch (option) {

			case 0:

				JOptionPane.showMessageDialog(null, "Saindo...");

				break;

			case 1:

				calculandoASoma();

				break;

			case 2:

				runRepeat20();

				break;

			case 3:

				somaIdade();

				break;

			case 4:

				maioresDeIdade();

				break;

			case 5:

				exibirMaisNovo();

				break;
				
			case 6:
				
				numerosPares();
				
				break;
				
			case 7:
				
				zeroECem();
				
				break;
				
				
			case 8:
				
				pararNegativo();
				
				break;
				
			case 9:
				
				mediaAlunos();
				
				break;

			default:

				JOptionPane.showMessageDialog(null, "Escolha uma op��o v�lida!");
				main(args);

			}

		} while (option != 0);
		JOptionPane.showMessageDialog(null, "Obrigado por usar a lista de exerc�cios!");

	}

	public static void runRepeat20() {

		for (byte contador = 1; contador <= 20; contador++) {

			System.out.print("Eu gosto de algorit�mos" + (contador % 5 == 0 ? "\n" : " "));

			// ou o de cima, ou o de baixo, os dois d�o no mesmo

			// if(contador %5==0) {

			// System.out.println("\n");

		}

	}

	public static void calculandoASoma() {

		int soma = 0;

		System.out.println("Calculando a Soma");

		for (byte counter = 1; counter <= 15; counter++) {

			System.out.println(
					"Soma = soma + counter, " + soma + " = " + soma + " + " + counter + "==>" + (soma + counter));
			soma = soma + counter;

		}
	}

	public static void maioresDeIdade() {

		byte maiores = 0;
		byte idade, contador;
		Scanner input = new Scanner(System.in);

		System.out.println("Exibir apenas os maiores de idade");

		for (contador = 1; contador <= 5; contador++) {

			System.out.println("Informe a idade da pessoa " + contador);
			idade = input.nextByte();

			if (idade >= 18) {

				maiores++;
				System.out.println("A �ltima pessoa informada era de maior");
			}

		}

		System.out.println("Entre " + (contador - 1) + " pessoas, apenas " + maiores + " s�o maiores de idade");

	}

	public static void somaIdade() {

		int somaIdade = 0;
		byte idade;
		Scanner input = new Scanner(System.in);

		for (byte contador = 1; contador <= 5; contador++) {

			System.out.println("Por favor, insira a idade:");
			idade = input.nextByte();
			System.out.println("No momento a soma est� em: " + somaIdade);
			somaIdade = somaIdade + idade;

		}

		System.out.println("A soma total das idades foi " + somaIdade);

	}

	public static void exibirMaisNovo() {

		Scanner input = new Scanner(System.in);
		String nome, youngerName = "";
		byte idade, ageMinimal = 0;

		for (byte contador = 1; contador <= 10; contador++) {

			System.out.println("Digite seu nome:");
			nome = input.next();
			System.out.println(nome + ", digite sua idade:");
			idade = input.nextByte();

			// no primeiro la�o, sempre a primeira idade ser� a menor
			if (contador == 1) {

				ageMinimal = idade;
				youngerName = nome;
				System.out.println("Sou o primeiro e por isso sou o mais novo: " + nome + " " + idade);

			} else {
				// a partir do segundo la�o, j� tenho como comparar com o ageMinimal

				System.out.println("Estou no la�o " + contador + " e preciso verificar");
				if (idade < ageMinimal) {

					System.out.println("Ainda bem que testei, porque a pessoa mais nova � " + nome + ", com " + idade);
					ageMinimal = idade;
					youngerName = nome;

				}

			}

		}

		System.out.println("Ap�s isso tudo, o mais novo �: " + youngerName + ", com " + ageMinimal);

	}

	public static void mediaAlunos() {
		
		Scanner input = new Scanner(System.in);
		byte quantidade, contador = 0;
		float nota, soma = 0f;
		String resposta;
		
		System.out.println("Insira a quantidade de notas que voc� deseja colocar?");
		quantidade = input.nextByte();
		
		do {
			contador ++;
			System.out.println("Informe o valor da " + contador + "� nota.");
			nota = input.nextFloat();
			
			if (contador >= quantidade) {
				
				System.out.println("Quer capturar mais alguma nota?");
				resposta = input.next();
				if (resposta.equals("Sim")) {
					contador--;
					
				}	
			}
				
				
				soma = soma + nota;
			}while (contador <= quantidade);
			System.out.println("Soma = " + soma);
		
	}

	public static void pararNegativo() {
		
		Scanner input = new Scanner(System.in);
		String nome, resposta;
		int numero, soma = 0;
		
		do {
			
			System.out.println("Que n�mero voc� quer?");
			numero = input.nextInt();
			
			if (numero > 0) { // somente numeros positivos ser�o somados (naturais)
				
				soma = soma + numero;
				
			}

		}while(numero >= 0); //enquanto o n�mero for maior ou igual a zero, repito.
		
		System.out.println("A soma �: " + soma);
		
		
	}

	public static void zeroECem() {
		
		int zeroCem = 0;
		int numero;
		byte contador;
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos n�meros est�o entre 0 e 100");

		for (contador = 1; contador <= 20; contador++) {

			System.out.println("Informe um valor:");
			numero = input.nextInt();

			if (numero >= 0 && numero <= 100) {

				zeroCem++;
				System.out.println("O �ltimo n�mero informado estava entre 0 e 100.");
			}

		}

		System.out.println("Entre " + (contador - 1) + " n�meros, apenas " + zeroCem + " est�o entre 0 e 100");
		
		
	}

	public static void numerosPares() {
		
		int pares = 0, numero;
		byte contador;
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos n�meros s�o pares?");

		for (contador = 1; contador <= 7; contador++) {

			System.out.println("Informe um valor:");
			numero = input.nextInt();

			if (numero %2 == 0) {

				pares++;
				System.out.println("O �ltimo n�mero informado era par.");
			}

		}

		System.out.println("Entre " + (contador - 1) + " n�meros, apenas " + pares + " s�o pares.");
		
		
		
		
	}

}
