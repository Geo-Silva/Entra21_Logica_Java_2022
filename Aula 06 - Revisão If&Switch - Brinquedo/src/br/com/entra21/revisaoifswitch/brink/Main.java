package br.com.entra21.revisaoifswitch.brink;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		final float altura0 = 1.57f;
		float altura1;
		String nome;
		
		nome = JOptionPane.showInputDialog(null, "Bem vindo � Fire Whip!"
				+ "\n Qual o seu nome?");
		
		altura1 = Float.parseFloat(
				JOptionPane.showInputDialog(null, "E qual a sua altura, " + nome + "?")
				);
		
		if (altura1 < altura0) {
			
			JOptionPane.showMessageDialog(null, "Epa " + nome + ", infelizmente voc� n�o possu� a altura m�nima para entrar."
					+ "\n Sua altura �: " + altura1
					+ "\n O m�nimo permitido �: " + altura0
					+ "\n Acesso Negado");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Acesso permitido. Divirta-se, " + nome + "!");
		}
		
	}

}
