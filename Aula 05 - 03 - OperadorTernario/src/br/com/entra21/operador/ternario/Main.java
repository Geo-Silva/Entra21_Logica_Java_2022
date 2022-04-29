package br.com.entra21.operador.ternario;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Aprendendo sobre Operador Tern�rio");
		
		String nome;
		boolean condicao = true;
		
		nome = (true) ?"Nome" : "Sobrenome";
		
		// ? � para caso seja true e : � para caso seja false
		// � um if diferenciado
		
		System.out.println("Ent�o voc� � " + (condicao ? "de maior" : "de menor") );
		
		
		byte idade = 30;
		
		if(idade > 17) {
			
			System.out.println("Voc� � de maior");
		
		}else {
			
			System.out.println("Voc� � de menor");
			
		}
		
		System.out.println("Voc� � de " + (idade > 17? " de maior" : " de menor"));
		
		condicao = (idade == 30 ? true : false);
		
		
	}

}
