package br.com.entra21.operadores.logicos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		/*
		System.out.println("Operadores L�gicos");
		
		System.out.println("E - AND - && - eCommercial - (SHIFT+7) - (ALT+38) = Express�o restritiva");
		
		System.out.println("Entre 2 booleans ao utilizar o &&, para resultar em true, ambos tem que ser true");
		
		System.out.println("Em outras palavras se houver um false em uma compara��o com && resultar� em false");
		
		System.out.println("Tabela verdade do E (&&)");
		System.out.println("T && T = T");
		System.out.println("T && F = F");
		System.out.println("F && T = F");
		System.out.println("F && F = F");
		
		byte idade = 19;
		float altura = 1.75f; 	//n�o esquecer de adicionar o "f" na variavel float
		double dinheiro;
		boolean resultado;
		
		resultado = idade < 18;	
		
		resultado = altura >= 2.0f;
		
		resultado = (idade < 18) && (altura >= 2.0f);  //ambos tem que ser false, o && � restritivo 
		//				(false)			(false)
		//						 false
		
		idade = 15;
		altura = 1.90f;
		resultado = (idade < 18) && (altura >= 2.0f);
		//				(true)	 &&		(false)
		//						false
		
		
		idade = 20;
		altura = 2.10f;
		dinheiro = 20000;
		
		resultado = (idade>=18) && (altura>=2.0f) && (dinheiro >= 50000);
		//			  (false)   &&     (true)	  &&     (false)
		//						(true)	  &&	(false)
		//								(false)
		
		idade = 30;
		altura = 2.15f;
		dinheiro = 100000;
		
		resultado = (idade>=18) && (altura>=2.0f) && (dinheiro >= 50000);
		//			 (true)	 	&&    (true)	  &&    (true)
		//					 (true)    &&	 (true)
		//							 (true)
		
		idade = 40;
		altura = 2.35f;
		dinheiro = 100000;
		
		resultado = (  (idade >= 18)  &&  (idade <= 45) ) && (altura < 2.35f) && (dinheiro >= 50000);
		//          (     (true)      &&     (true)       && (altura < 2.35f) && (dinheiro >= 50000);
		//			                (true)                && (altura < 2.35f) && (dinheiro >= 50000);
		//                          (true)                &&    (false)       && (dinheiro >= 50000);
		//							(true)				  &&    (false)       &&      (true)		
		//								(false)						(true)
		//											(false)
		
		
		//----------------------------------------------
		
		
		System.out.println("OU - OR - || - pipe - (SHIFT+\\) - (ALT+124) = Express�o inclusiva");
		
		System.out.println("Entre 2 booleans ao utilizar o ||, para resultar em true, basta que apenas um seja true");
		
		System.out.println("Em outras palavras, apenas quando ambos forem false com ||, resultar� em false");
		
		System.out.println("Tabela verdade do OU (||)");
		System.out.println("T || T = T");
		System.out.println("T || F = T");
		System.out.println("F || T = T");
		System.out.println("F || F = F");
		
		idade = 17;
		dinheiro = 1000;
		
		resultado = (idade >= 18) || (dinheiro >= 1000); //entrar na rave
		//			   (false)    || (dinheiro >= 1000);
		//			   (false)    ||       (true)
		//						(true)
		
		
		resultado = (idade <=14) || (idade >= 18); //melhor para �poca para os pais?
		//			  (false)    || (idade >= 18);
		//			  (false)    ||     (false)
		//					   (false)
		
		idade = 3;
		
		resultado = (idade <=14) || (idade >= 18);
		//			   (true)    || (idade >= 18);
		//             (true)	 ||     (false)
		//					   (true)
		
		*/
		
		
		float numeroA, numeroB;
		boolean resultado;
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "D� um valor para o primeiro n�mero:")
				);
		
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Qual valor voc� disse mesmo?")
				);
		
		resultado = (numeroA == numeroB);
		
		JOptionPane.showMessageDialog(null, "Vamos programa, diga ao nosso cliente, os n�meros s�o iguais? " + resultado);
		
		numeroA = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Agora digite novamente outro valor:")
				);
	
		numeroB = Float.parseFloat(
				JOptionPane.showInputDialog(null, "E digite mais um, que seja diferente do anterior dessa vez:")
				);
		
		resultado = (numeroA != numeroB);
		
		JOptionPane.showMessageDialog(null, "PROGRAMA! Esses n�meros s�o diferentes n�o �? " + resultado);
		JOptionPane.showMessageDialog(null, "Nossa, voc� s� diz isso mesmo em...");
		
	
		
		
		
		
		
		
		

	}

}
