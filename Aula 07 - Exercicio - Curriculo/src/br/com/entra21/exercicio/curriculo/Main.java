package br.com.entra21.exercicio.curriculo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//dados pessoais
		//experiencia profissional
		//cursos/historico escolar/informa��o academica
		//contato
		//criar o seu ou ver um
		//ao fim adicionar uma op��o para ver os pr�prios dados.
		
		String nome1, resposta1;
		
		nome1 = JOptionPane.showInputDialog(null, "Ol�! Bem vindo ao c�rriculo online!"
				+ "\n Como voc� se chama?");
		
		resposta1 = JOptionPane.showInputDialog(null, "Prazer " + nome1 + "!"
				+ "\n Vamos criar seu curr�culo?"
				+ "\n 1 = Sim."
				+ "\n 2 = N�o."
				+ "\n 3 = Sair.");
		
		switch (resposta1) {
		
		case "1":
			JOptionPane.showConfirmDialog(null, "�timo, " + nome1 + ". Vamos come�ar?");
			criarCV();
			break;
			
		case "2":
			
			break;
			
		case "3":
			
			break;
			
		default:
			
			break;
		}
		
			

	}

	public static void criarCV() {
			
			String nome, ano, endereco, contato, email, obj, hab1,
			hab2, hab3, hab4, hab5, IA1, IA2, IA3, exp1, exp2, exp3;
			
			JOptionPane.showMessageDialog(null, "Vamos l� ent�o! Te guiarei pelo processo e darei mais detalhes"
					+ "quando necess�rio");
			
			nome = JOptionPane.showInputDialog(null, "Qual seu nome completo?");
			ano = JOptionPane.showInputDialog(null, "Qual sua data de nascimento? (somente n�meros e barra.)");
			endereco = JOptionPane.showInputDialog(null, "Qual seu endere�o? Rua, n�mero, cidade, estado.");
			contato = JOptionPane.showInputDialog(null, "Qual seu principal n�mero de contato?");
			email = JOptionPane.showInputDialog(null, "Qual seu principal email?");
			obj =  JOptionPane.showInputDialog(null, "Qual seu objetivo, o que voc� almeja?");
			hab1 = JOptionPane.showInputDialog(null, "Quais suas habilidades? Seja breve. Ex: Proativo"
					+ "Habilidade N�1?");
			hab2 = JOptionPane.showInputDialog(null, "Habilidade N�2?");
			hab3 = JOptionPane.showInputDialog(null, "Habilidade N�3?");
			hab4 = JOptionPane.showInputDialog(null, "Habilidade N�4?");
			hab5 = JOptionPane.showInputDialog(null, "Habilidade N�5?");
			IA1 = JOptionPane.showInputDialog(null, "Cursos, Universidade, Ensino M�dio? Coloque aqui"
					+ "informa��es sobre suas Informa��es Acad�micas. Institui��o, nome do curso e tempo de dura��o em meses ou anos"
					+ "\n Informa��o Acad�mica N�1");
			IA2 = JOptionPane.showInputDialog(null, "Informa��o Acad�mica N�2");
			IA3 = JOptionPane.showInputDialog(null, "Informa��o Acad�mica N�3");
			exp1 = JOptionPane.showInputDialog(null, "Sua experi�ncia. Coloque o nome da empresa e o tempo de estadia em anos ou meses"
					+ "\nExperi�ncia N�1");
			exp2 = JOptionPane.showInputDialog(null, "Experi�ncia N�2");
			exp2 = JOptionPane.showInputDialog(null, "Experi�ncia N�3");
			
		

		}
		
		
		
	}

