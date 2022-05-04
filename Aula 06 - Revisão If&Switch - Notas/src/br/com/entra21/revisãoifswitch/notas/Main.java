package br.com.entra21.revisãoifswitch.notas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		final int mtm, ptg, cie, art, edf, ing;
		String nome0, nome1;
		int media;
		
		
		nome0 = JOptionPane.showInputDialog(null, "Bem vindo ao sistema de notas, professor(a)!"
				+ "\n Qual seu nome?"
				);
		
		nome1 = JOptionPane.showInputDialog(null, "Olá " + nome0 + ", qual aluno você deseja colocar"
				+ "as notas no sistema?"
				);
		
		mtm = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de matemática?")
				);
		
		ptg = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de português?")
				);
		
		cie = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de ciências?")
				);
		
		art = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de artes?")
				);
	
		edf = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de educação física?")
				);

		ing = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual foi a nota dele(a) de inglês?")
				);
		
		media = (mtm + ptg + cie + art + edf + ing) / 6;
		
		if (media < 30) {
			
			JOptionPane.showMessageDialog(null, nome1 + " está reprovado.");
			
		} else if (media < 70) {
			
			JOptionPane.showMessageDialog(null, nome1 + " está de recuperação.");
			
		} else if (media == 70) {
			
			JOptionPane.showMessageDialog(null, nome1 + " passou na média.");
			
		} else if (media < 100) {
			
			JOptionPane.showMessageDialog(null, nome1 + " poderia ter ido melhor, mas está aprovado.");
			
		} else if (media == 100) {
			
			JOptionPane.showMessageDialog(null, nome1 + " passou com nota máxima.");
			
		} else {
			
		}

	}
	
}	
