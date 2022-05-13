package br.com.entra21.laçofor;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Aprendendo sobre o For");
		
		String opcao;
		Scanner entrada = new Scanner(System.in);
		opcao = JOptionPane.showInputDialog("Sobre o for, escolha uma opção para aprender mais e olhe o console."
				+ "\n1 - For Simples"
				+ "\n2 - For dentro de For");
		
		opcao.toLowerCase();

		
		switch(opcao) {
		
		case "1","for simples":
			//função aula for simples 
			aulaForSimples(); //função do tipo procedimento nao tem argumento nem retorno
			
			break;
		
		case "2": //olha! veio por número
		case "for dentro de for":
			//função aula complexa
			aulaFordentroDeFor(); //função de procedimento também
			
			break;
		}
		

		
		
		
	}
	
	public static void aulaFordentroDeFor() {
		
		JOptionPane.showMessageDialog(null, "Aprendendo sobre For da maneira mais complexa");
		
		byte nivelMaior = 9, nivelDetalhe = 10;
		
		for(int contador = 1; contador <= nivelMaior; contador ++) {
			
			JOptionPane.showMessageDialog(null, "Para o nível maior repetendindo pela " + contador + "ª vez");
			
			// o for termina completamente e depois segue para o proximo
			
			for(int contadorInterno = 1; contadorInterno <= nivelDetalhe; contadorInterno++) {
				// vai ter que clicar muito hehe
				JOptionPane.showMessageDialog(null, "Para o nível detalhe, repetindo pela " + contadorInterno +"ª vez");
				
			}
			
			
		}
		
		
	}

	public static void aulaForSimples() {
		
		System.out.println("Aprendendo sobre for da maneira simples");
		System.out.println("Repetição simples de forma linear de 1 em 1.");
		for(int contador1 = 1; contador1 <= 10; contador1 = contador1 + 1) { //variaveis criadas aqui morrem aqui
															//variaveis criadas no main podem ser usadas tbm
			System.out.println("Repetindo o contador1 pela " + contador1 + "ª vez.");
		}
		
		System.out.println("======================================");
		
		
		System.out.println("O incremento ou decremento não precisa ser de 1 em 1");
		for (int contador2 = 1; contador2 <= 10 ; contador2 +=2) {
			
			System.out.println("Repetindo de 2 em 2, agora está em: " + contador2);
			//System.out.println(contador1);
			// não é possivel usar a variavel "contador1" pois ela só existe dentro do for anterior, no escopo dele.
			
		}
		
		System.out.println("==================================");
		
		for (int contador3 = 4; contador3 <= 10; contador3 += 2) {
			
			System.out.println("Repetindo de 4 em 4, está em: " + contador3);
			
		}
		
		System.out.println("============================");
		
		System.out.println("Também é possível fazer de forma regressiva, decremento.");
		for (int contador4 = 10; contador4 > 1; contador4 = contador4 - 1) {
			
			System.out.println("Contagem regressiva = " + contador4);
			
			
		}
		
		int numero = 3;
		int contador;
		
		
		for (contador = 1; contador <= 10; contador ++) {
			
			System.out.println("Tabuada " + contador + " x " + numero + " = " + (contador * numero));
			
		}
		
		System.out.println("Olha como o contador ficou: " + contador);
		
	}
	

}
