package br.com.entra21.prova11.signos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		final byte ultDiaJ = 31, ultDiaF = 28, ultDiaM1 = 31, ultDiaA1 = 30, ultM2 = 31, 
		ultDiaJn = 30, ultDiaJl = 31, ultDiaA2 = 30, ultDiaS  = 31, ultDiaO = 30, ultDiaN = 31, ultDiaD = 30;  
		
		byte dia, mes;
		String nome; 
		
		
		nome = JOptionPane.showInputDialog(null, "Vamos ver qual o seu signo? Primeiro, qual é o seu nome?");
		dia = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Qual seu dia de nascimento?")
				);
		
		if (dia > 31) {
			
			JOptionPane.showMessageDialog(null, "Esse dia é inválido!"
					+ "\nJaneiro = 31"
					+ "\nFevereiro = 28"
					+ "\nMarço = 31"
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
			
			JOptionPane.showMessageDialog(null, "Esse dia é inválido!");
			main(args);
		
		}else {
			
		}
		
		mes = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Qual mês você nasceu? Apenas o número correspondente")
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
			
			JOptionPane.showMessageDialog(null, "Seu signo é Capricórnio.");
			main(null);
		
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Aquário.");
			main(null);
			
		}
		
	}
	
	public static void fev(byte dia) {
		
		if(dia > 28) {
			
			JOptionPane.showMessageDialog(null, "Esse dia não existe nesse mês.");
			main(null);
			
		}else if(dia <= 18) {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Aquário.");
			main(null);
		
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Peixes.");
			main(null);
		
		}
		
	}
	
	public static void mar(byte dia) {
		
		if (dia <= 20) {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Peixes.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Áries.");
			main(null);
		}
		
	}

	public static void abr(byte dia) {
		
		if (dia == 31) {
			
			JOptionPane.showMessageDialog(null, "Esse dia não existe nesse mês.");
			main(null);
			
		}else if (dia <= 19) {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Áries.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Touro.");
			main(null);
			
		}
	}

	public static void mai(byte dia) {
		
		if(dia <= 20) {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Touro.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Gêmeos.");
			main(null);
			
		}
	}

	public static void jun(byte dia) {
		
		if (dia == 31) {
			
			JOptionPane.showMessageDialog(null, "Esse dia não existe nesse mês.");
			main(null);
			
		}else if (dia <= 20) {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Gêmeos.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Câncer.");
			main(null);
			
		}
	}

	public static void jul(byte dia) {
		
		if (dia <= 22) {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Câncer.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Leão.");
			main(null);
			
		}
	}

	public static void ago(byte dia) {
		
		if (dia <= 22) {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Leão.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Virgem.");
			main(null);
			
		}
		
	}

	public static void set(byte dia) {
		
		if (dia == 31) {
			
			JOptionPane.showMessageDialog(null, "Esse dia não existe nesse mês.");
			main(null);
			
		}else if (dia <= 22) {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Virgem.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Libra.");
			main(null);
		}
		
	}

	public static void out(byte dia) {
		
		if (dia <= 22) {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Libra.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Escorpião.");
			main(null);
			
		}
		
	}

	public static void nov(byte dia) {
		
		if (dia == 31) {
			
			JOptionPane.showMessageDialog(null, "Esse dia não existe nesse mês.");
			main(null);
			
		}else if (dia <= 21) {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Escorpião.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Sagitário.");
			main(null);
			
		}
		
	}

	public static void dez(byte dia) {
		
		if (dia <= 21) {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Sagitário.");
			main(null);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu signo é Capricórnio.");
			main(null);
			
		}
		
	}
	
}


