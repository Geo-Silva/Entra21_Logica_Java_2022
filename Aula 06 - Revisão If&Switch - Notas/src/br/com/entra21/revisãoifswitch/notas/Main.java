package br.com.entra21.revis�oifswitch.notas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		final int mtm, ptg, cie, art, edf, ing;
		String nome0, nome1;
		int media;
		
		
		nome0 = JOptionPane.showInputDialog(null, "Bem vindo ao sistema de notas, professor(a)!"
				+ "\n Qual seu nome?"
				);
		
		nome1 = JOptionPane.showInputDialog(null, "Ol� " + nome0 + ", qual aluno voc� deseja colocar"
				+ "as notas no sistema?"
				);
		
		mtm = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de matem�tica?")
				);
		
		ptg = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de portugu�s?")
				);
		
		cie = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de ci�ncias?")
				);
		
		art = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de artes?")
				);
	
		edf = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de educa��o f�sica?")
				);

		ing = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de ingl�s?")
				);
		
		media = (mtm + ptg + cie + art + edf + ing) / 6;
		
		if (media < 30) {
			
			JOptionPane.showMessageDialog(null, nome1 + " est� reprovado.");
			
		} else if (media < 70) {
			
			JOptionPane.showMessageDialog(null, nome1 + " est� de recupera��o.");
			
		} else if (media == 70) {
			
			JOptionPane.showMessageDialog(null, nome1 + " passou na m�dia.");
			
		} else if (media < 100) {
			
			JOptionPane.showMessageDialog(null, nome1 + " poderia ter ido melhor, mas est� aprovado.");
			
		} else if (media == 100) {
			
			JOptionPane.showMessageDialog(null, nome1 + " passou com nota m�xima.");
			
		} else {
			
		}

	}
	
}	
