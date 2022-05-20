package br.com.entra21.exercicio.solo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		byte opcao;
		String nomeProf;

		JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de notas professor(a)!");
		nomeProf = JOptionPane.showInputDialog(null, "Faça o Login primeiro!" + "\n Qual seu nome?");

		do {

			opcao = Byte.parseByte
					(JOptionPane.showInputDialog(null, "O que você deseja fazer, " + nomeProf + "?"
					+ "\n0 - Sair" 
					+ "\n1 - Cadastrar novo aluno" + "\n2 - Declarar notas no sistema de um aluno"
					+ "\n3 - Declarar notas no sistema de uma turma inteira" 
					+ "\n4 - Fazer a média de notas.")
					);

			switch (opcao) {

			case 0:

				JOptionPane.showMessageDialog(null, "Saindo...");

				break;

			case 1:

				cadastrarAluno();

				break;

			case 2:

				declararNotaAluno();

				break;

			case 3:

				declararNotasTurmas();

				break;

			case 4:

				fazerMedia();

				break;

			default:
				
				JOptionPane.showMessageDialog(null, "Opcão inválida! Tente novamente.");

				break;

			}
			
		} while (opcao != 0);

	}

	public static void cadastrarAluno() {
		
		String nomeAluno;
		
		nomeAluno = JOptionPane.showInputDialog(null, "Qual o nome do novo aluno a ser inserido no sistema?");
		
		JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
		
	}
	
	public static void declararNotaAluno() {

		String aluno;
		byte qtdMaterias;

		aluno = JOptionPane.showInputDialog(null, "Qual o nome do aluno?");

		qtdMaterias = Byte.parseByte(JOptionPane.showInputDialog(null, "Quantas materias serão?"));

		float[] materias = new float[qtdMaterias];

		for (byte nota = 0; nota < materias.length; nota++) {

			materias[nota] = Float.parseFloat(
					JOptionPane.showInputDialog(null, "Defina a nota para a " + (nota + 1) + "ª matéria de " + aluno));

		}

		JOptionPane.showMessageDialog(null, "Notas inseridas no sistema com sucesso!");

	}

	public static void declararNotasTurmas() {

		byte qtdAlunos, qtdNotas;
		float definirNotas[][];
		String nomeAluno;

		qtdAlunos = Byte.parseByte(JOptionPane.showInputDialog(null, "Qual a quantidade de alunos?"));

		qtdNotas = Byte.parseByte(JOptionPane.showInputDialog(null, "Qual a quantidade de notas por aluno?"));

		definirNotas = new float[qtdAlunos][qtdNotas];

		for (byte aluno = 0; aluno < definirNotas.length; aluno++) {

			nomeAluno = JOptionPane.showInputDialog("Qual o nome do " + (aluno + 1) + "º aluno?");

			for (byte nota = 0; nota < definirNotas[aluno].length; nota++) {

				definirNotas[aluno][nota] = Float.parseFloat(
						JOptionPane.showInputDialog(null, "Qual a " + (nota + 1) + "ª nota de " + nomeAluno));

			}
		}

		JOptionPane.showMessageDialog(null, "Todas as notas foram inseridas no sistema com sucesso!");

	}

	public static void fazerMedia() {
		
		float totalNotas;
		
		totalNotas = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Quantas notas serão ao todo?")
				);
		
		
	}
}
