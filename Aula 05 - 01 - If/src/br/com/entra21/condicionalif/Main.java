package br.com.entra21.condicionalif;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Aprendendo sobre if");
		
		if (true) {  //se colocar false ou true ali, a linha a seguir ir� ou n�o rodar
			System.out.println("Vai fazer isso quando der true");
			System.out.println("Somente true");
		}
		
		System.out.println("Aqui vai acontecer naturalmente porque o codigo segue sempre em frente");
			
		if (false) {
			//nunca passaria aqui, pois apenas quando resulta em true passa por esse bloco (linha)
		}
		
		byte idade = 17;
		
		if (idade >= 18) { //� maior de idade?
			System.out.println("� maior de idade");
		}
		
		if ( (idade >= 13) && (idade < 18) ) {  // � adolescente (13~17)
			System.out.println("� adolescente");
		}
			
	}

}
