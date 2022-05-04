package br.com.entra21.exercicioswitch.nenhum;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String resposta;
		
		resposta = JOptionPane.showInputDialog(null, "Qual plataforma você assiste filmes e séries? \n Netflix \n Amazon Prime \n Paramount \n Disney+ \n HBO Max \n Tente digitar igual eu coloquei aqui, por favor.");
		
		switch (resposta) {
		
		case "Netflix":
			JOptionPane.showMessageDialog(null, "Essa é famosa, você está dentro dos 80% das pessoas...talvez.");
			break;
			
		case "Amazon Prime":
			JOptionPane.showMessageDialog(null, "A concorrente em mesma escala da famosa Netflix, você escolheu seu lado...");
			break;
			
		case "Paramount":
			JOptionPane.showMessageDialog(null, "Não sei muito sobre ela...mas parece ser boa.");
			break;
			
		case "Disney+":
			JOptionPane.showMessageDialog(null, "Fã da Disney é? Vai lá com as tuas princesinhas :P");
			break;
			
		case "HBO Max":
			JOptionPane.showMessageDialog(null, "Isso existe?");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Olha amigo(a): \n Ou tu escreveu uma opção errado (refaça);"
					+ "\n Ou tu disse outra que eu não falei na lista (parabéns por ser underground);"
					+ "\n Ou tu disse algo que não tem nada a ver com a pergunta (analfabeto);"
					+ "\n Ou tu teve um derrame no teclado (tá tudo bem?);");
			break;
		}
		
		

	}

}
