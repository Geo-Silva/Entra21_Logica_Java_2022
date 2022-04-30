package br.com.entra21.elseIf;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Aprendendo sobre else if (ou seja, renovando o if antes do else");

		float altura = 1.5f;
		double dinheiro = 3000;
		
		if (altura < 1.5f) {  //� baixinho?
			
			System.out.println("� bem baixinho");
			
		}else if (altura <= 1.9f) { //� alto?
			
			System.out.println("� alto");
			
		}else {
			// mesmo que eu n�o queira fazer nada aqui, � uma boa pr�tica ter o else
		}
		
		//se at� 1200 , at� 1800 , at� 2000 , qualquer valor acima
		if (dinheiro <= 1200) {
			
			System.out.println("Sal�rio m�nimo");
			
		}else if (dinheiro <= 1800) {
			
			System.out.println("T� ficando rico");
			
		}else if (dinheiro <= 2000) {
				
			System.out.println("Me empresta :) ");
			
		}else {
			
			System.out.println("Me contrata vai");
			
		}
		
		
		
	}

}
