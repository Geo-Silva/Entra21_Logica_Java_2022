package br.com.entra21.exercicio.preco.e.custo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Fa�a um programa que solicite o nome e pre�o"
				+ " de custo de um produto qualquer, ap�s, processe um aumento de 65% e informe qual"
				+ " ser� o pre�o de venda.");
		
		//Eu fiz usando o JOptionPane, com a idea de que fosse interativo com
		//quem est� "comprando" esse produto.
		
		String nomeProduto;
		float custo;
		float aumento;
		
		nomeProduto = JOptionPane.showInputDialog(null, "Qual o produto voc� deseja?");
		custo = Float.parseFloat(
				JOptionPane.showInputDialog(null, "E qual o valor dele?")
				);
		
		aumento = custo * 65 / 100 + custo;
		
		JOptionPane.showMessageDialog(null, "Este produto est� com um aumento de 65%, o pre�o final de sua compra �: " + aumento + " reais.");

	}

}
