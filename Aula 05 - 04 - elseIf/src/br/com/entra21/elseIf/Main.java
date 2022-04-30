package br.com.entra21.elseIf;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Aprendendo sobre else if (ou seja, renovando o if antes do else");

		float altura = 1.5f;
		double dinheiro = 3000;
		
		if (altura < 1.5f) {  //é baixinho?
			
			System.out.println("É bem baixinho");
			
		}else if (altura <= 1.9f) { //é alto?
			
			System.out.println("É alto");
			
		}else {
			// mesmo que eu não queira fazer nada aqui, é uma boa prática ter o else
		}
		
		//se até 1200 , até 1800 , até 2000 , qualquer valor acima
		if (dinheiro <= 1200) {
			
			System.out.println("Salário mínimo");
			
		}else if (dinheiro <= 1800) {
			
			System.out.println("Tá ficando rico");
			
		}else if (dinheiro <= 2000) {
				
			System.out.println("Me empresta :) ");
			
		}else {
			
			System.out.println("Me contrata vai");
			
		}
		
		
		
	}

}
