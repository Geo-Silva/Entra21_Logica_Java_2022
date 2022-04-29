package br.com.entra21.exercicio.operador.relacional;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		float numeroA, numeroB;
		boolean resultado;
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite um número.")
				);
		
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite outro número.")
				);
		
		resultado = (numeroA > numeroB);
		
		JOptionPane.showMessageDialog(null, "Programa! Diga se o primeiro valor é maior que o segundo. " + resultado);
		JOptionPane.showMessageDialog(null, "Mandou bem!");
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Agora cite outro número.")
				);
		
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Diga mais um! Vamos.")
				);
		
		resultado = (numeroA >= numeroB);
		
		JOptionPane.showMessageDialog(null, "Agora meu programa, diga se o primeiro valor é maior ou igual ao segundo! " + resultado);
		JOptionPane.showMessageDialog(null, "As coisas estão complicando hehe.");
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Ok, por favor diga outro valor.")
				);
		JOptionPane.showMessageDialog(null, "Esse é o espírito! Não pare.");
		
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "E o segundo número seria?")
				);
		
		resultado = (numeroA < numeroB);
		
		JOptionPane.showMessageDialog(null, "Certo programa, agora diga se o primeiro valor é MENOR que o segundo! " + resultado);
		JOptionPane.showMessageDialog(null, "Eita! Não lembro de ter te ensinado essa...");
		
		JOptionPane.showConfirmDialog(null, "Vamos continuar brincando? Vamos! Essa é a última parte!");
		JOptionPane.showMessageDialog(null, "Sabia que você iria continuar! :D");
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Digite o primeiro valor!")
				);
		JOptionPane.showMessageDialog(null, "Essa é uma boa escolha...eu acho");
		
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "E o segundo valor seria?")
				);
		JOptionPane.showMessageDialog(null, "Essa sim é uma boa escolha!");
		
		resultado = (numeroA <= numeroB);
		
		JOptionPane.showMessageDialog(null, "Programa! Para finalizar, diga-nos, o primeiro número é menor ou igual ao segundo valor? " + resultado);
		JOptionPane.showMessageDialog(null, "É isto! Obrigado por testar meu programa :D. Sentirei saudades, volte no próximo programa ok?");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				

	}

}
