package br.com.entra21.area.e.perimetro;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		//criar variaveis
		float  base, altura, area, perimetro; //boas praticas de nomenclatura
		
		Scanner entrada = new Scanner(System.in);
		
		//definir valores às variaveis
		
		System.out.println("Informe a base do retângulo");
		base = entrada.nextFloat();

		System.out.println("Informe a altura do retângulo");
		altura = entrada.nextFloat();
		
		//momento de processamentos...
		area = base *  altura;
		
		perimetro = base * 2 + altura * 2;
		
		System.out.println("Área é " + base +" x " + altura);
		System.out.println("Perímetro é " + base + " + " + base + " + " + altura + " + " + altura);
		System.out.println("A área do retângulo é: " + area+ ", e o perímetro é: " + perimetro + ".");
		
		
		
		
		
		
		
		
		
		
		}

}
