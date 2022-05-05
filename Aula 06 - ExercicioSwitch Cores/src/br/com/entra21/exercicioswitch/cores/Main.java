package br.com.entra21.exercicioswitch.cores;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String resposta;
		
		resposta = JOptionPane.showInputDialog(null, "Digite quais dessas cores é sua favorita \n Verde \n Azul \n Amarelo \n Vermelho");

		// resposta = resposta.toLowerCase();
		// resposta = resposta.toUpperCase();
		//esses são métodos de forçar o que foi digitado a ficar em maiusculo ou minusculo 
		
		switch (resposta) {
		
		case "Verde":
		case "verde":
		case "VERDE":	
			JOptionPane.showMessageDialog(null, "Verde? Que cor chata... \n ...digo \n Bonito igual a natureza!");
			break;
		
		case "Azul":
		case "AZUL":	
		case "azul":
			JOptionPane.showMessageDialog(null, "Azul era belle, De Jour era a bela da tarde...");
			JOptionPane.showMessageDialog(null, "...seus olhos azuis numa tarde, na tarde de um domingo azul...");
			JOptionPane.showMessageDialog(null, "La Belle De Jour!");
			break;
			
		case "Amarelo":		
		case "amarelo":
		case "AMARELO":	
			JOptionPane.showMessageDialog(null, "Amarelo! Poderoso igual ao Sol. Adorei.");
			break;
			
		case "VERMELHO":	
		case "Vermelho":
		case "vermelho":
			JOptionPane.showMessageDialog(null, "Vermelho? Nem sei o que dizer sobre esse...bela cor...\n ...eu acho.");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Acho que eu deveria ter adicionado outras opções...");
			break;
		}
	}

}
