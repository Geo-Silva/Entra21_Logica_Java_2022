package br.com.entra21.exercicio.operadores.logicos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String nome;
		byte idade;
		float altura;
		boolean resultado;
		
		nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
		
		idade = Byte.parseByte(
				JOptionPane.showInputDialog(null, "E quantos anos você tem?")
				);
		
		altura = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual sua altura em metros? (Use um ponto para separar metro dos centímetros)")
				);
		
		resultado = (idade >= 18) && (altura >= 1.70f);
		
		JOptionPane.showMessageDialog(null, "Vejamos, esse ser é menor de idade?");
		JOptionPane.showMessageDialog(null, resultado);
		
		
				
	}

}
