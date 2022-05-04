package br.com.entra21.aulaswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // ponto de partida no código

		System.out.println("Condicionais - Switch");

		System.out.println("Serve para escolher entre opções pré definidas");

		System.out.println("Geralmente quando há muitos if - else ifs baseados em igualdades"); // "==" por exemplo

		float altura = 1.5f;

		if (altura == 1.0) {

			System.out.println("É baixinho.");

		} else if (altura == 1.2) {

			System.out.println("Continua baixinho.");

		} else if (altura == 1.5) {

			System.out.println("Baixinho mas nem tanto.");

		} else {

			System.out.println("Já não é considerado mais baixinho.");

		}

		// O Switch vai direto para uma das opções selecionadas (por exemplo).

		System.out.println("1 = Intervalo");
		System.out.println("2 = Exercicio");
		System.out.println("3 = Prova");

		Scanner entrada = new Scanner(System.in);
		byte opcao = 1;

		System.out.println("Escolha uma das três opções");

		opcao = entrada.nextByte();

		switch (opcao) {
		case 1:
			System.out.println("Vamos para o intervalo ");
			break;

		case 2:
			System.out.println("Daqui a pouco tem exercicio");
			break;

		case 3:
			System.out.println("Era 5 dias mas podemos fazer hoje");
			break;
		}

		String resposta;
		System.out.println("Queremos Intervalo?");

		resposta = entrada.next();

		switch (resposta) {

		case "Sim":
			System.out.println("Já estava na hora");
			break;

		case "Não":
			System.out.println("Esperar mais um pouco");
			break;

		default:
			System.out.println("Era uma pergunta tão simples...");
			break;
			
		}
		
		System.out.println("Escolha um número");
		System.out.println("1 = Azul");
		System.out.println("2 = Vermelho");
		System.out.println("Nenhuma = Nenhuma");
		
		resposta = entrada.next();
		
		switch (resposta) {
		
		case "1":
			System.out.println("Azul era belle, De Jour era a bela da tarde...");
			break;
			
		case "2":
			System.out.println("Vermelho? Sério? Eca.");
			break;
			
		case "Nenhuma":
			System.out.println("ESCOLHE UMA ******!");
			break;

		default:
			System.out.println("Acho que deveria ter mais opções então...");

		}
	}

}
