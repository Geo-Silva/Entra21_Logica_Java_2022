package br.com.entra21.exercicio.swtich.esta��o;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		byte resposta;
		
		resposta = Byte.parseByte(JOptionPane.showInputDialog(null, "Qual a sua esta��o do ano favorita?"
				+ "\n 1 = Primavera"
				+ "\n 2 = Outono"
				+ "\n 3 = Inverno"
				+ "\n 4 = Ver�o")
				);
		
		// resposta = resposta.toLowerCase();
		// resposta = resposta.toUpperCase();
		//esses s�o m�todos de for�ar o que foi digitado a ficar em maiusculo ou minusculo 
		
		switch (resposta) {
		
		case 1:
			JOptionPane.showMessageDialog(null, "Finalmente o frio est� indo embora...n�?");
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "Gosta de quando come�a a esfriar pelo jeito.");
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "J� viu neve tamb�m?");
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "Bora para praia juntos?");
			break;
		
		default:
			JOptionPane.showMessageDialog(null, "Em que mundo voc� vive ent�o?");
			break;
		}

	}

}
