package br.com.entra21.exercicio.preco.e.custo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Faça um programa que solicite o nome e preço"
				+ " de custo de um produto qualquer, após, processe um aumento de 65% e informe qual"
				+ " será o preço de venda.");
		
		//Eu fiz usando o JOptionPane, com a idea de que fosse interativo com
		//quem está "comprando" esse produto.
		
		String nomeProduto;
		float custo;
		float aumento;
		
		nomeProduto = JOptionPane.showInputDialog(null, "Qual o produto você deseja?");
		custo = Float.parseFloat(
				JOptionPane.showInputDialog(null, "E qual o valor dele?")
				);
		
		aumento = custo * 65 / 100 + custo;
		
		JOptionPane.showMessageDialog(null, "Este produto está com um aumento de 65%, o preço final de sua compra é: " + aumento + " reais.");

	}

}
