package br.com.entra21.exercicio.operador.igualdade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		float numeroA, numeroB;
		boolean resultado;
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "D� um valor para o primeiro n�mero:")
				);
		
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual valor voc� disse mesmo?")
				);
		
		resultado = (numeroA == numeroB);
		
		JOptionPane.showMessageDialog(null, "Vamos programa, diga ao nosso cliente, os n�meros s�o iguais? " + resultado);
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Agora digite novamente outro valor:")
				);
	
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "E digite mais um, que seja diferente do anterior dessa vez:")
				);
		
		resultado = (numeroA != numeroB);
		
		JOptionPane.showMessageDialog(null, "PROGRAMA! Esses n�meros s�o diferentes n�o �? " + resultado);
		JOptionPane.showMessageDialog(null, "Nossa, voc� s� diz isso mesmo em...");

	}

}
