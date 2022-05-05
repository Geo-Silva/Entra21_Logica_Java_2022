package br.com.entra21.exercicio.swtich.estação;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		byte resposta;
		
		resposta = Byte.parseByte(JOptionPane.showInputDialog(null, "Qual a sua estação do ano favorita?"
				+ "\n 1 = Primavera"
				+ "\n 2 = Outono"
				+ "\n 3 = Inverno"
				+ "\n 4 = Verão")
				);
		
		// resposta = resposta.toLowerCase();
		// resposta = resposta.toUpperCase();
		//esses são métodos de forçar o que foi digitado a ficar em maiusculo ou minusculo 
		
		switch (resposta) {
		
		case 1:
			JOptionPane.showMessageDialog(null, "Finalmente o frio está indo embora...né?");
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "Gosta de quando começa a esfriar pelo jeito.");
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "Já viu neve também?");
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "Bora para praia juntos?");
			break;
		
		default:
			JOptionPane.showMessageDialog(null, "Em que mundo você vive então?");
			break;
		}

	}

}
