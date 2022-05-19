package br.com.entra21.exercicio.solo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		byte opcao = 0;
		
		do {

			fazerMenu(opcao);

			switch (opcao) {
			
			case 0:
				
				JOptionPane.showMessageDialog(null, "Saindo...");
			
				break;
				
			case 1:
				
				//cadastrarAluno();
				
				break;
			
			case 2:
				
				//declararNotaAluno();
				
				break;
			
			case 3:
				
				declararNotasTurmas();
				
				break;
				
			default:
				
				
				break;

			}

		} while (opcao != 0);

	}

	public static void fazerMenu(byte opcao) {
		
		String nomeProf;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de notas professor(a)!");
		nomeProf = JOptionPane.showInputDialog(null, "Faça o Login primeiro!" + "\n Qual seu nome?");



			opcao = Byte.parseByte(JOptionPane.showInputDialog(null, "O que você deseja fazer, "
							+ nomeProf + "?"
							+ "\n0 - Sair" 
							+ "\n1 - Cadastrar novo aluno"
							+ "\n2 - Declarar notas no sistema de um aluno"
							+ "\n3 - Declarar notas no sistema de uma turma inteira")
					);
		
	}

	public static void declararNotasTurmas() {
		
		byte alunos[][];
		byte qtdAlunos = 0, qtdNotas = 0;
		
		alunos = new byte[qtdAlunos][qtdNotas];
		
		qtdAlunos = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Quantos alunos têm nessa turma?")
				);
		
		qtdNotas = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Quantas notas são para cada aluno?")
				);
		
		for(byte estudante = 1; estudante <= alunos[qtdAlunos].length; estudante ++	) {
			
			JOptionPane.showMessageDialog(null, "Diga a nota do " + estudante + "º aluno");
			//no novasNotas.length vai um [aluno] dentro pois é o vetor e dentro dele tem um valor 3.
			//assim o contador "aluno" aumenta e passa por todos os vetores
			//dependendo da quantidade de notas que for, ele vai mostrar o total de indicies dentro desse vetor
			//na duvida, debuga que tu vai entender...
			
			for(byte nota = 0; nota < alunos[qtdNotas].length; nota ++) {
				
			alunos = Byte.parseByte(
					JOptionPane.showInputDialog("Diga a " + nota + "ª nota")
					);
			
		}
		
		
		
	}





}
