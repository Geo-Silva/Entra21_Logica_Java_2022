package br.com.entra21.ifelse;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Apredendo a usar o if com else");
		
		if (true) {
			
			System.out.println("Vai passar por aqui quando a condi��o resultar em true");
		}else {
			
			System.out.println("Vai passar por aqui quando a condi��o resultar em false");
		}

		byte idade = 19;
		
		if(idade > 17) { //� maior de idade?
			
			System.out.println("� de maior");
			
		}else {
			
			System.out.println("N�o � permitido menores aqui!!!");
		}
		
	}

}
