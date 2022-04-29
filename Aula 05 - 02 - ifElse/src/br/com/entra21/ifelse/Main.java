package br.com.entra21.ifelse;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Apredendo a usar o if com else");
		
		if (true) {
			
			System.out.println("Vai passar por aqui quando a condição resultar em true");
		}else {
			
			System.out.println("Vai passar por aqui quando a condição resultar em false");
		}

		byte idade = 19;
		
		if(idade > 17) { //é maior de idade?
			
			System.out.println("É de maior");
			
		}else {
			
			System.out.println("Não é permitido menores aqui!!!");
		}
		
	}

}
