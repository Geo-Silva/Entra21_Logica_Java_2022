package br.com.entra21.prova01.calculadora;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		byte opcao;

		opcao = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Bem vindo � Calculadora 1.0"
				+ "\nQual opera��o voc� deseja fazer?"
				+ "\n 0 = Sair"
				+ "\n 1 = Somar;"
				+ "\n 2 = Subtrair;"
				+ "\n 3 = Multiplicar;"
				+ "\n 4 = Dividir")
				);	
				
		switch (opcao) {

		case 1:

			calcularSoma();
			
			break;

		case 2:

			calcularSub();
			
			break;
			
		case 3:
			
			calcularMult();
			
			break;
			
		case 4:

			calcularDiv();
			
			break;
			
		default:
			
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

		main(null);
		
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
		
			main(null);
		
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
			
			main(null);
			
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

			main(null);
		
	}

}
		