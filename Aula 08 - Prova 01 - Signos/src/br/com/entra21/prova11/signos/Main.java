package br.com.entra21.prova11.signos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		final byte ultDiaJ = 31, ultDiaF = 28, ultDiaM1 = 31, ultDiaA1 = 30, ultM2 = 31, 
		ultDiaJn = 30, ultDiaJl = 31, ultDiaA2 = 30, ultDiaS  = 31, ultDiaO = 30, ultDiaN = 31, ultDiaD = 30;  
		
		byte dia, mes;
		String nome; 
		
		
		nome = JOptionPane.showInputDialog(null, "Vamos ver qual o seu signo? Primeiro, qual � o seu nome?");
		dia = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Qual seu dia de nascimento?")
				);
		
		if (dia > 31) {
			
			JOptionPane.showMessageDialog(null, "Esse dia � inv�lido!"
					+ "\nJaneiro = 31"
					+ "\nFevereiro = 28"
					+ "\nMar�o = 31"
					+ "\nAbril = 30"
					+ "\nMaio = 31"
					+ "\nJunho = 30"
					+ "\nJulho = 31"
					+ "\nAgosto = 31"
					+ "\nSetembro = 30"
					+ "\nOutubro = 31"
					+ "\nNovembro = 30"
					+ "\nDezembro = 31");
			
			main(args);

		}else if (dia < 1){
			
			JOptionPane.showMessageDialog(null, "Esse dia � inv�lido!");
			main(args);
		
		}else {
			
		}
		
		mes = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Qual m�s voc� nasceu? Apenas o n�mero correspondente")
				);
		
		switch(mes) {
		
		case 1:
			
			jan(dia);
			
			break;
			
		case 2:
			
			fev(dia);
		
			break;
			
		case 3:
			
			mar(dia);
			
			break;
			
		case 4:
			
			abr(dia);
			
			break;
			
		case 5:
			
			mai(dia);
			
			break;
			
		case 6:
			
			jun(dia);
			
			break;
		
		case 7:
			
			jul(dia);
			
			break;
			
		case 8:
			
			ago(dia);
			
			break;
			
		case 9:
			
			set(dia);
			
			break;	
			
		case 10:
			
			out(dia);
			
			break;
			
		case 11:
			
			nov(dia);
			
			break;
			
		case 12:
			
			dez(dia);
			
			break;
			
		}

		}

	public static void jan(byte dia) {
		
		if (dia <= 19) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Capric�rnio.");
			main(null);
		
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Aqu�rio.");
			main(null);
			
		}
		
	}
	
	public static void fev(byte dia) {
		
		if(dia > 28) {
			
			JOptionPane.showMessageDialog(null, "Esse dia n�o existe nesse m�s.");
			main(null);
			
		}else if(dia <= 18) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Aqu�rio.");
			main(null);
		
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Peixes.");
			main(null);
		
		}
		
	}
	
	public static void mar(byte dia) {
		
		if (dia <= 20) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Peixes.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � �ries.");
			main(null);
		}
		
	}

	public static void abr(byte dia) {
		
		if (dia == 31) {
			
			JOptionPane.showMessageDialog(null, "Esse dia n�o existe nesse m�s.");
			main(null);
			
		}else if (dia <= 19) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � �ries.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Touro.");
			main(null);
			
		}
	}

	public static void mai(byte dia) {
		
		if(dia <= 20) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Touro.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � G�meos.");
			main(null);
			
		}
	}

	public static void jun(byte dia) {
		
		if (dia == 31) {
			
			JOptionPane.showMessageDialog(null, "Esse dia n�o existe nesse m�s.");
			main(null);
			
		}else if (dia <= 20) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � G�meos.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � C�ncer.");
			main(null);
			
		}
	}

	public static void jul(byte dia) {
		
		if (dia <= 22) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � C�ncer.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Le�o.");
			main(null);
			
		}
	}

	public static void ago(byte dia) {
		
		if (dia <= 22) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Le�o.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Virgem.");
			main(null);
			
		}
		
	}

	public static void set(byte dia) {
		
		if (dia == 31) {
			
			JOptionPane.showMessageDialog(null, "Esse dia n�o existe nesse m�s.");
			main(null);
			
		}else if (dia <= 22) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Virgem.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Libra.");
			main(null);
		}
		
	}

	public static void out(byte dia) {
		
		if (dia <= 22) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Libra.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Escorpi�o.");
			main(null);
			
		}
		
	}

	public static void nov(byte dia) {
		
		if (dia == 31) {
			
			JOptionPane.showMessageDialog(null, "Esse dia n�o existe nesse m�s.");
			main(null);
			
		}else if (dia <= 21) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Escorpi�o.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Sagit�rio.");
			main(null);
			
		}
		
	}

	public static void dez(byte dia) {
		
		if (dia <= 21) {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Sagit�rio.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo � Capric�rnio.");
			main(null);
			
		}
		
	}
	
}


