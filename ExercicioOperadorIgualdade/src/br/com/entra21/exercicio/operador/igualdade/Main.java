package br.com.entra21.exercicio.operador.igualdade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		float numeroA, numeroB;
		boolean resultado;
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Dê um valor para o primeiro número:")
				);
		
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual valor você disse mesmo?")
				);
		
		resultado = (numeroA == numeroB);
		
		JOptionPane.showMessageDialog(null, "Vamos programa, diga ao nosso cliente, os números são iguais? " + resultado);
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Agora digite novamente outro valor:")
				);
	
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "E digite mais um, que seja diferente do anterior dessa vez:")
				);
		
		resultado = (numeroA != numeroB);
		
		JOptionPane.showMessageDialog(null, "PROGRAMA! Esses números são diferentes não é? " + resultado);
		JOptionPane.showMessageDialog(null, "Nossa, você só diz isso mesmo em...");

	}

}
