package br.com.entra21.revis�oifswitch.notas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		final float mtm, ptg, cie, art, edf, ing;
		String nome0, nome1;
		float media;
		
		
		nome0 = JOptionPane.showInputDialog(null, "Bem vindo ao sistema de notas, professor(a)!"
				+ "\n Qual seu nome?"
				);
		
		nome1 = JOptionPane.showInputDialog(null, "Ol� " + nome0 + ", qual aluno voc� deseja colocar"
				+ "as notas no sistema?"
				);
		
		// resposta = resposta.toLowerCase();
		// resposta = resposta.toUpperCase();
		//esses s�o m�todos de for�ar o que foi digitado a ficar em maiusculo ou minusculo 
		
		mtm = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de matem�tica?")
				);
		
		ptg = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de portugu�s?")
				);
		
		cie = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de ci�ncias?")
				);
		
		art = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de artes?")
				);
	
		edf = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de educa��o f�sica?")
				);

		ing = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de ingl�s?")
				);
		
		media = (mtm + ptg + cie + art + edf + ing) / 6;
		
		if (media < 3) {
			
			JOptionPane.showMessageDialog(null, nome1 + " est� reprovado.");
			
		} else if (media < 7) {
			
			JOptionPane.showMessageDialog(null, nome1 + " est� de recupera��o.");
			
		} else if (media == 7) {
			
			JOptionPane.showMessageDialog(null, nome1 + " passou na m�dia.");
			
		} else if (media < 10) {
			
			JOptionPane.showMessageDialog(null, nome1 + " poderia ter ido melhor, mas est� aprovado.");
			
		} else if (media == 10) {
			
			JOptionPane.showMessageDialog(null, nome1 + " passou com nota m�xima.");
			
		} else {
			
		}

	}
	
}	
