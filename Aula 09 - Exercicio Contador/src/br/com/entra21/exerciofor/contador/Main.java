package br.com.entra21.exerciofor.contador;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		byte contador;
		String opcao;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao Contador Vers�o 1.0"
				+ "\n N�o tem um pr�posito �til, mas d� uma checada vai ;)");
		
		opcao = JOptionPane.showInputDialog(null, "Qual dessas op��es voc� gostaria de testar?"
				+ "\n1 = Contar at� n�mero X (cuidado em)"
				+ "\n2 = Contar de um n�mero X at� o n�mero Z (cuidado tamb�m)"
				+ "\n3 = Contagem regressiva at� zero apartir do n�mero X"
				+ "\n4 = Tabuada do n�mero escolhido (ainda tais no fundamental?)"
				+ "\n5 = Tabuda do 1 at� a tabuda do n�mero X (muita coisa)");
		
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
			
			JOptionPane.showMessageDialog(null, "Escolha o n�mero correspondente!!!");
			main(args);
			
			break;
			
		}

	}

	public static void contadorX() {
		
		byte numeroA;
		
		numeroA = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Escolha at� que n�mero a contagem deve ir!"
						+ "\nNovamente eu digo, cuidado!"
						+ "\n(Para sua seguran�a est�s limitado a 127, o que ainda � uma p�ssima escolha mas ok)")
				); 
		
		for (int contador = 1; contador <= numeroA; contador ++) {
			
			JOptionPane.showMessageDialog(null, "Essa mensagem est� repetindo pela " + contador + "� vez.");
			
		}
		
		JOptionPane.showMessageDialog(null, "Espero que voc� n�o tenha escolhido um valor grande. Mas ufa!");
		
		main(null);

	}

	public static void contadordoXaoZ() {
		
		byte numeroA, numeroB;
		
		numeroA = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Escolha o primeiro valor, onde a contagem come�ar�"
						+ "\n(Para sua seguran�a voc� est� limitado a 127, o que ainda � muito mas ok)")
				);
		
		numeroB = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Agora escolha o segundo valor."
						+ "\n(O limite de 127 ainda est� de p� em!)")
				);
		
		for (int contador = numeroA; contador <= numeroB; contador ++) {
			
			JOptionPane.showMessageDialog(null, "Estamos agora no n�mero de valor: " + contador);
			
		}
		
		JOptionPane.showMessageDialog(null, "Essa foi f�cil!");
		main(null);	

	}

	public static void contagemRegressiva() {
		
		byte numeroA;
		
		numeroA = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Escolha um n�mero, a contagem regressiva ent�o come�ar�!"
						+ "\nEscolhe algum valor pequeno por favor :(")		
				); 

		for(int contador = numeroA; contador >= 0; contador --) {
			
			JOptionPane.showMessageDialog(null, "Estamos agora no n�mero: " + contador);
			
		}
		
		JOptionPane.showMessageDialog(null, "Moleza! Da pr�xima vez escolha do 2 ao 0 para acabar mais r�pido :P");
		main(null);

	}

	public static void tabuadaX() {
		
		byte numeroA;
		
		numeroA = Byte.parseByte(
				JOptionPane.showInputDialog(null, "� escola voltamos! Escolha de qual n�mero deve ser a tabuada!")
				);
		
		for (int contador = 1; contador <= 10; contador ++) {
			
			JOptionPane.showMessageDialog(null, contador + " x " + numeroA + " = " + (contador * numeroA));

		}
		
		JOptionPane.showMessageDialog(null, "Agora voc� pode usar isso para colar na prova!");
		main(null);
	
	}

	public static void tabuada1aoX() {
		
		byte numeroA, numeroB;
		
		JOptionPane.showMessageDialog(null, "Voc� ver� agora todas as tabuadas! Do 1 ao 10!");
			
		
			
		for (int contador = 1; contador <= 10; contador ++) {
			
			JOptionPane.showMessageDialog(null, contador + " x " + numeroB + " = " + (contador * numeroB));
				
		}for (int contador = 1; contador <= 10; contador ++) 
		}
		
		
		
	}

