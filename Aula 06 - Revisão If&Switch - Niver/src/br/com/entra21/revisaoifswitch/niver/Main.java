package br.com.entra21.revisaoifswitch.niver;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String nome;
		String mes;
		
		nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");

		mes = JOptionPane.showInputDialog(null, "Qual mês você nasceu?"
						+ "\n 1 = Janeiro;"
						+ "\n 2 = Fevereiro;"
						+ "\n 3 = Março;"
						+ "\n 4 = Abril;"
						+ "\n 5 = Maio;"
						+ "\n 6 = Junho;"
						+ "\n 7 = Julho;"
						+ "\n 8 = Agosto;"
						+ "\n 9 = Setembro;"
						+ "\n 10 = Outubro;"
						+ "\n 11 = Novembro;"
						+ "\n 12 = Dezembro;");
		
		// resposta = resposta.toLowerCase();
		// resposta = resposta.toUpperCase();
		//esses são métodos de forçar o que foi digitado a ficar em maiusculo ou minusculo 
		
		switch (mes) {
		
		case "1":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Janeiro.");
			break;
			
		case "2":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Fevereiro.");
			break;
			
		case "3":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Março.");
			break;
			
		case "4":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Abril.");
			break;
			
		case "5":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Maio.");
			break;
			
		case "6":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Junho.");
			break;
			
		case "7":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Julho.");
			break;
			
		case "8":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Agosto.");
			break;
			
		case "9":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Setembro.");
			break;
			
		case "10":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Outubro.");
			break;
			
		case "11":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Novembro.");
			break;
			
			
		case "12":
			JOptionPane.showMessageDialog(null, nome + ", nascido em Dezembro.");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Mês inválido!");
			break;
		
		}
				
	}

}
