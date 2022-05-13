package br.com.entra21.exerciofor.contador;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		byte contador;
		String opcao;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao Contador Versão 1.0"
				+ "\n Não tem um próposito útil, mas dá uma checada vai ;)");
		
		opcao = JOptionPane.showInputDialog(null, "Qual dessas opções você gostaria de testar?"
				+ "\n1 = Contar até número X (cuidado em)"
				+ "\n2 = Contar de um número X até o número Z (cuidado também)"
				+ "\n3 = Contagem regressiva até zero apartir do número X"
				+ "\n4 = Tabuada do número escolhido (ainda tais no fundamental?)"
				+ "\n5 = Tabuda do 1 até a tabuda do número X (muita coisa)");
		
		switch (opcao) {
		
		case "1":
			
			contadorX();
			
			break;

		case "2":
			
			contadordoXaoZ();
			
			break;
			
		case "3":
			
			contagemRegressiva();
			
			break;
			
		case "4":
			
			tabuadaX();
			
			break;
			
		case "5":
			
			tabuada1aoX();
			
			break;
			
		default:
			
			JOptionPane.showMessageDialog(null, "Escolha o número correspondente!!!");
			main(args);
			
			break;
			
		}

	}

	public static void contadorX() {
		
		byte numeroA;
		
		numeroA = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Escolha até que número a contagem deve ir!"
						+ "\nNovamente eu digo, cuidado!"
						+ "\n(Para sua segurança estás limitado a 127, o que ainda é uma péssima escolha mas ok)")
				); 
		
		for (int contador = 1; contador <= numeroA; contador ++) {
			
			JOptionPane.showMessageDialog(null, "Essa mensagem está repetindo pela " + contador + "ª vez.");
			
		}
		
		JOptionPane.showMessageDialog(null, "Espero que você não tenha escolhido um valor grande. Mas ufa!");
		
		main(null);

	}

	public static void contadordoXaoZ() {
		
		byte numeroA, numeroB;
		
		numeroA = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Escolha o primeiro valor, onde a contagem começará"
						+ "\n(Para sua segurança você está limitado a 127, o que ainda é muito mas ok)")
				);
		
		numeroB = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Agora escolha o segundo valor."
						+ "\n(O limite de 127 ainda está de pé em!)")
				);
		
		for (int contador = numeroA; contador <= numeroB; contador ++) {
			
			JOptionPane.showMessageDialog(null, "Estamos agora no número de valor: " + contador);
			
		}
		
		JOptionPane.showMessageDialog(null, "Essa foi fácil!");
		main(null);	

	}

	public static void contagemRegressiva() {
		
		byte numeroA;
		
		numeroA = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Escolha um número, a contagem regressiva então começará!"
						+ "\nEscolhe algum valor pequeno por favor :(")		
				); 

		for(int contador = numeroA; contador >= 0; contador --) {
			
			JOptionPane.showMessageDialog(null, "Estamos agora no número: " + contador);
			
		}
		
		JOptionPane.showMessageDialog(null, "Moleza! Da próxima vez escolha do 2 ao 0 para acabar mais rápido :P");
		main(null);

	}

	public static void tabuadaX() {
		
		byte numeroA;
		
		numeroA = Byte.parseByte(
				JOptionPane.showInputDialog(null, "À escola voltamos! Escolha de qual número deve ser a tabuada!")
				);
		
		for (int contador = 1; contador <= 10; contador ++) {
			
			JOptionPane.showMessageDialog(null, contador + " x " + numeroA + " = " + (contador * numeroA));

		}
		
		JOptionPane.showMessageDialog(null, "Agora você pode usar isso para colar na prova!");
		main(null);
	
	}

	public static void tabuada1aoX() {
		
		byte numeroA, numeroB;
		
		JOptionPane.showMessageDialog(null, "Você verá agora todas as tabuadas! Do 1 ao 10!");
			
		
			
		for (int contador = 1; contador <= 10; contador ++) {
			
			JOptionPane.showMessageDialog(null, contador + " x " + numeroB + " = " + (contador * numeroB));
				
		}for (int contador = 1; contador <= 10; contador ++) 
		}
		
		
		
	}

