package br.com.entra21.revisãoifswitch.notas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		final float mtm, ptg, cie, art, edf, ing;
		String nome0, nome1;
		float media;
		
		
		nome0 = JOptionPane.showInputDialog(null, "Bem vindo ao sistema de notas, professor(a)!"
				+ "\n Qual seu nome?"
				);
		
		nome1 = JOptionPane.showInputDialog(null, "Olá " + nome0 + ", qual aluno você deseja colocar"
				+ "as notas no sistema?"
				);
		
		// resposta = resposta.toLowerCase();
		// resposta = resposta.toUpperCase();
		//esses são métodos de forçar o que foi digitado a ficar em maiusculo ou minusculo 
		
		mtm = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de matemática?")
				);
		
		ptg = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de português?")
				);
		
		cie = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de ciências?")
				);
		
		art = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de artes?")
				);
	
		edf = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de educação física?")
				);

		ing = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de inglês?")
				);
		
		media = (mtm + ptg + cie + art + edf + ing) / 6;
		
		if (media < 3) {
			
			JOptionPane.showMessageDialog(null, nome1 + " está reprovado.");
			
		} else if (media < 7) {
			
			JOptionPane.showMessageDialog(null, nome1 + " está de recuperação.");
			
		} else if (media == 7) {
			
			JOptionPane.showMessageDialog(null, nome1 + " passou na média.");
			
		} else if (media < 10) {
			
			JOptionPane.showMessageDialog(null, nome1 + " poderia ter ido melhor, mas está aprovado.");
			
		} else if (media == 10) {
			
			JOptionPane.showMessageDialog(null, nome1 + " passou com nota máxima.");
			
		} else {
			
		}

	}
	
}	
