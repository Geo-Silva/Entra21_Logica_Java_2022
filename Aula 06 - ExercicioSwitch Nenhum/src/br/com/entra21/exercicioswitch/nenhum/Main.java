package br.com.entra21.exercicioswitch.nenhum;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String resposta;
		
		resposta = JOptionPane.showInputDialog(null, "Qual plataforma voc� assiste filmes e s�ries? \n Netflix \n Amazon Prime \n Paramount \n Disney+ \n HBO Max \n Tente digitar igual eu coloquei aqui, por favor.");
		
		switch (resposta) {
		
		case "Netflix":
			JOptionPane.showMessageDialog(null, "Essa � famosa, voc� est� dentro dos 80% das pessoas...talvez.");
			break;
			
		case "Amazon Prime":
			JOptionPane.showMessageDialog(null, "A concorrente em mesma escala da famosa Netflix, voc� escolheu seu lado...");
			break;
			
		case "Paramount":
			JOptionPane.showMessageDialog(null, "N�o sei muito sobre ela...mas parece ser boa.");
			break;
			
		case "Disney+":
			JOptionPane.showMessageDialog(null, "F� da Disney �? Vai l� com as tuas princesinhas :P");
			break;
			
		case "HBO Max":
			JOptionPane.showMessageDialog(null, "Isso existe?");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Olha amigo(a): \n Ou tu escreveu uma op��o errado (refa�a);"
					+ "\n Ou tu disse outra que eu n�o falei na lista (parab�ns por ser underground);"
					+ "\n Ou tu disse algo que n�o tem nada a ver com a pergunta (analfabeto);"
					+ "\n Ou tu teve um derrame no teclado (t� tudo bem?);");
			break;
		}
		
		

	}

}
