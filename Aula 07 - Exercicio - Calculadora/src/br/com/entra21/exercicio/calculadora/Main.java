package br.com.entra21.exercicio.calculadora;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String opcao;

		opcao = JOptionPane.showInputDialog(null, "Bem vindo � Calculadora 1.0"
				+ "\nQual opera��o voc� deseja fazer?");
		opcao.toLowerCase();

		switch (opcao) {

		case "multiplica��o":
		case "multiplicacao":
		case "multiplica�ao":
		case "multiplicar":	
		case "vezes":
		case "*":
		case "x":	
			calcularMult();
			break;

		case "soma":
		case "somar":
		case "adicionar":	
		case "mais":
		case "adi�ao":
		case "adi��o":
		case "adicao":
		case "aumentar":	
		case "+":
			calcularSoma();
			break;
			
		case "subtracao":
		case "subtra��o":
		case "menos":
		case "subtrair":
		case "reduzir":
		case "diminuir":
		case "remover":
		case "-":
			calcularSub();
			break;
			
		case "dividir":
		case "divisao":
		case "/":
			calcularDiv();
			break;
			
		default:
			
			JOptionPane.showMessageDialog(null, "Ops! Algo deu errado! Confira se voc� digitou uma op��o v�lida.");
			break;
			
		}

	}

	public static void calcularMult() {
		
		float numeroA, numeroB, calculoMult;
		
		numeroA = Float.parseFloat(
			JOptionPane.showInputDialog(null, "Digite o primeiro valor.")
			);
		
		numeroB = Float.parseFloat(
			JOptionPane.showInputDialog(null, "Digite o segundo valor.")
			);
		
		calculoMult = numeroA * numeroB;
		
		JOptionPane.showMessageDialog(null, "O resultado �: " + calculoMult);

	}

	public static void calcularSoma() {
		
		float numeroA, numeroB, calculoSoma;
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite o primeiro valor.")
				);
			
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite o segundo valor.")
				);
			
			calculoSoma = numeroA + numeroB;
			
			JOptionPane.showMessageDialog(null, "O resultado �: " + calculoSoma);
		
		
	}

	public static void calcularDiv() {
		
		float numeroA, numeroB, calculoDiv;
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite o primeiro valor.")
				);
			
			numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite o segundo valor.")
				);
			
			calculoDiv = numeroA / numeroB;
			
			JOptionPane.showMessageDialog(null, "O resultado �: " + calculoDiv);
	}

	public static void calcularSub() {
		
		float numeroA, numeroB, calculoSub;
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite o primeiro valor.")
				);
			
			numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite o segundo valor.")
				);
			
			calculoSub = numeroA - numeroB;
			
			JOptionPane.showMessageDialog(null, "O resultado �: " + calculoSub);
	}
}
