package br.com.entra21.area.e.perimetro;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		//criar variaveis
		float  base, altura, area, perimetro; //boas praticas de nomenclatura
		
		Scanner entrada = new Scanner(System.in);
		
		//definir valores �s variaveis
		
		System.out.println("Informe a base do ret�ngulo");
		base = entrada.nextFloat();

		System.out.println("Informe a altura do ret�ngulo");
		altura = entrada.nextFloat();
		
		//momento de processamentos...
		area = base *  altura;
		
		perimetro = base * 2 + altura * 2;
		
		System.out.println("�rea � " + base +" x " + altura);
		System.out.println("Per�metro � " + base + " + " + base + " + " + altura + " + " + altura);
		System.out.println("A �rea do ret�ngulo �: " + area+ ", e o per�metro �: " + perimetro + ".");
		
		
		
		
		
		
		
		
		
		
		}

}
