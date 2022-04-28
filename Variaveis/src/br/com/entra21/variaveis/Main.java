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
		 * System.out.println("Minha idade é " + (idade + outraIdade));
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
		 * System.out.println("Meu peso é " + peso);
		 * System.out.println("Minha altura é " + altura);
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
		  
		  
		 System.out.println("Bem vindo " + nome + " agora consigo interagir com humanos e sei que sua idade é " + minhaIdade + ".");
		 */

		/*
		 Scanner input; input = new Scanner(System.in);
		
		 float altura, salario;
		 
		 System.out.println("Por favor, informe sua altura"); altura =
		 input.nextFloat();
		  
		 System.out.println("Agora diga o seu salário");
		 salario = input.nextFloat();
		  
		 System.out.println("Me parece que sua altura é " + altura + "cm e seu salário é " + salario + ".");
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
				JOptionPane.showInputDialog(null, "Informe seu salário.")
				);
		
		JOptionPane.showMessageDialog(null, "Além de um nome bonito, é jovem com esses " + idade + " anos de idade, e pobre com esse salário de " +salario);
		*/
		

		String nome;
		byte idade;
		float altura, peso;
		
		JOptionPane.showMessageDialog(null, "Olá! Vamos ver a relação entre o seu peso e altura");
		nome = JOptionPane.showInputDialog(null, "Vamos lá, qual seu nome?");
		idade = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Informe sua idade aqui.")  //o "null" serve para não atribuir nenhum valor, já que não citamos nenhuma variável
				);
		altura = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Agora vamos para a sua altura, quanto é?")
				);
		peso = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Para finalizar, quanto é seu peso?")
				);
		JOptionPane.showMessageDialog(null, "Esta é a relação entre o seu peso e altura, " + nome + (": ") + peso / (+ altura * altura));

		
		
		
			
				
	}

}
