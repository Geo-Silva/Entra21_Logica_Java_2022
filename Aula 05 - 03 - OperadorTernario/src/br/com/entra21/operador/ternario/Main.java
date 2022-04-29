package br.com.entra21.operador.ternario;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Aprendendo sobre Operador Ternário");
		
		String nome;
		boolean condicao = true;
		
		nome = (true) ?"Nome" : "Sobrenome";
		
		// ? é para caso seja true e : é para caso seja false
		// é um if diferenciado
		
		System.out.println("Então você é " + (condicao ? "de maior" : "de menor") );
		
		
		byte idade = 30;
		
		if(idade > 17) {
			
			System.out.println("Você é de maior");
		
		}else {
			
			System.out.println("Você é de menor");
			
		}
		
		System.out.println("Você é de " + (idade > 17? " de maior" : " de menor"));
		
		condicao = (idade == 30 ? true : false);
		
		
	}

}
