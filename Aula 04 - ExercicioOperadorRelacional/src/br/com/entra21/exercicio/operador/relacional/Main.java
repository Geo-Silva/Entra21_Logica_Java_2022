package br.com.entra21.exercicio.operador.relacional;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		float numeroA, numeroB;
		boolean resultado;
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite um n�mero.")
				);
		
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite outro n�mero.")
				);
		
		resultado = (numeroA > numeroB);
		
		JOptionPane.showMessageDialog(null, "Programa! Diga se o primeiro valor � maior que o segundo. " + resultado);
		JOptionPane.showMessageDialog(null, "Mandou bem!");
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Agora cite outro n�mero.")
				);
		
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Diga mais um! Vamos.")
				);
		
		resultado = (numeroA >= numeroB);
		
		JOptionPane.showMessageDialog(null, "Agora meu programa, diga se o primeiro valor � maior ou igual ao segundo! " + resultado);
		JOptionPane.showMessageDialog(null, "As coisas est�o complicando hehe.");
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Ok, por favor diga outro valor.")
				);
		JOptionPane.showMessageDialog(null, "Esse � o esp�rito! N�o pare.");
		
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "E o segundo n�mero seria?")
				);
		
		resultado = (numeroA < numeroB);
		
		JOptionPane.showMessageDialog(null, "Certo programa, agora diga se o primeiro valor � MENOR que o segundo! " + resultado);
		JOptionPane.showMessageDialog(null, "Eita! N�o lembro de ter te ensinado essa...");
		
		JOptionPane.showConfirmDialog(null, "Vamos continuar brincando? Vamos! Essa � a �ltima parte!");
		JOptionPane.showMessageDialog(null, "Sabia que voc� iria continuar! :D");
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite o primeiro valor!")
				);
		JOptionPane.showMessageDialog(null, "Essa � uma boa escolha...eu acho");
		
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "E o segundo valor seria?")
				);
		JOptionPane.showMessageDialog(null, "Essa sim � uma boa escolha!");
		
		resultado = (numeroA <= numeroB);
		
		JOptionPane.showMessageDialog(null, "Programa! Para finalizar, diga-nos, o primeiro n�mero � menor ou igual ao segundo valor? " + resultado);
		JOptionPane.showMessageDialog(null, "� isto! Obrigado por testar meu programa :D. Sentirei saudades, volte no pr�ximo programa ok?");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				

	}

}
