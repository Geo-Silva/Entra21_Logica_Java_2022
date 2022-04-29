package br.com.entra21.incremento.decremento;

public class Main {

	public static void main(String[] args) {
		
		int idade = 19;
		
		System.out.println("Minha idade com pre incremento " + (++idade)); //com o ++ no começo ela soma por 1
		
		//aniversário
		idade = idade + 1; //20
		System.out.println(idade);
		
		//ano 29/2 em 4 em 4 anos
		
		idade = idade + 4; 
		System.out.println(idade);
		
		idade++;			//soma por 1
		System.out.println(idade);
		
		idade+=2;			//soma por 2
		System.out.println(idade);
		
		idade = idade + 2;
		System.out.println(idade);
		
		idade*=2;				//multiplica por 2
		System.out.println(idade);
		idade = idade * 2;
		System.out.println(idade);
		
		idade/=2; 				//divide por 2
		System.out.println(idade);
		
		idade = idade / 2;
		System.out.println(idade);
		
		idade--; 			//reduz em 1
		System.out.println(idade);
		
		idade-=10;
		System.out.println(idade);
		
		idade = idade - 10;
		System.out.println(idade);
		
		
		
		

	}

}
