package br.com.entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		/*
		 * 
		 * byte idade; idade = 19;
		 * 
		 * byte outraIdade = 20;
		 * 
		 * short ano = 2022;
		 * 
		 * short anoPassado;
		 * 
		 * anoPassado = 2021;
		 * 
		 * System.out.println("Minha idade � " + (idade + outraIdade));
		 * 
		 * System.out.println("Estamos em " + ano + " e ano passado foi " + anoPassado +
		 * ".");
		 * 
		 * int habitantesBrasil = 212600000;
		 * 
		 * System.out.println("No Brasil em " + ano + " temos exatamente " +
		 * habitantesBrasil + " habitantes. ");
		 * 
		 * long habitantesTerra1900; habitantesTerra1900 = 790000000;
		 * 
		 * double habitantesAtualmente = 7900000000.00;
		 * 
		 * float peso = 68.0f, altura = 1.75f;
		 * 
		 * System.out.println("Meu peso � " + peso);
		 * System.out.println("Minha altura � " + altura);
		 * 
		 * char letra = 'R';
		 * 
		 * boolean intervaloAntesdasOito = false; boolean intervaloAgora = true;
		 * 
		 * String nomeCompleto = "";
		 * 
		 */

		 /*
		 String nome;
		 byte minhaIdade;
		 float minhaAltura, salario;
		  
	
		 Scanner entrada; entrada = new Scanner(System.in);
		  
		 System.out.println("Por favor informe seu nome.");
		 nome = entrada.next();
		  
		 System.out.println("Agora digite sua idade.");
		 minhaIdade = entrada.nextByte();
		  
		  
		 System.out.println("Bem vindo " + nome + " agora consigo interagir com humanos e sei que sua idade � " + minhaIdade + ".");
		 */

		/*
		 Scanner input; input = new Scanner(System.in);
		
		 float altura, salario;
		 
		 System.out.println("Por favor, informe sua altura"); altura =
		 input.nextFloat();
		  
		 System.out.println("Agora diga o seu sal�rio");
		 salario = input.nextFloat();
		  
		 System.out.println("Me parece que sua altura � " + altura + "cm e seu sal�rio � " + salario + ".");
		 */	

		/*
		String nome;
		byte idade;
		float salario;

		nome = JOptionPane.showInputDialog(null, "Informe seu nome"); // syso + Scanner ao mesmo tempo
		JOptionPane.showMessageDialog(null, "Que nome bonito, " + nome);
		
		idade = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Informe sua idade.")
				);
		
		salario = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Informe seu sal�rio.")
				);
		
		JOptionPane.showMessageDialog(null, "Al�m de um nome bonito, � jovem com esses " + idade + " anos de idade, e pobre com esse sal�rio de " +salario);
		*/
		

		String nome;
		byte idade;
		float altura, peso;
		
		JOptionPane.showMessageDialog(null, "Ol�! Vamos ver a rela��o entre o seu peso e altura");
		nome = JOptionPane.showInputDialog(null, "Vamos l�, qual seu nome?");
		idade = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Informe sua idade aqui.")  //o "null" serve para n�o atribuir nenhum valor, j� que n�o citamos nenhuma vari�vel
				);
		altura = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Agora vamos para a sua altura, quanto �?")
				);
		peso = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Para finalizar, quanto � seu peso?")
				);
		JOptionPane.showMessageDialog(null, "Esta � a rela��o entre o seu peso e altura, " + nome + (": ") + peso / (+ altura * altura));

		
		
		
			
				
	}

}
