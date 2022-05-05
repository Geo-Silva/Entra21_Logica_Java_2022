package br.com.entra21.exercicio.curriculo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//dados pessoais
		//experiencia profissional
		//cursos/historico escolar/informação academica
		//contato
		//criar o seu ou ver um
		//ao fim adicionar uma opção para ver os próprios dados.
		
		String nome1, resposta1;
		
		nome1 = JOptionPane.showInputDialog(null, "Olá! Bem vindo ao cúrriculo online!"
				+ "\n Como você se chama?");
		
		resposta1 = JOptionPane.showInputDialog(null, "Prazer " + nome1 + "!"
				+ "\n Vamos criar seu currículo?"
				+ "\n 1 = Sim."
				+ "\n 2 = Não."
				+ "\n 3 = Sair.");
		
		switch (resposta1) {
		
		case "1":
			JOptionPane.showConfirmDialog(null, "Ótimo, " + nome1 + ". Vamos começar?");
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
			
			JOptionPane.showMessageDialog(null, "Vamos lá então! Te guiarei pelo processo e darei mais detalhes"
					+ "quando necessário");
			
			nome = JOptionPane.showInputDialog(null, "Qual seu nome completo?");
			ano = JOptionPane.showInputDialog(null, "Qual sua data de nascimento? (somente números e barra.)");
			endereco = JOptionPane.showInputDialog(null, "Qual seu endereço? Rua, número, cidade, estado.");
			contato = JOptionPane.showInputDialog(null, "Qual seu principal número de contato?");
			email = JOptionPane.showInputDialog(null, "Qual seu principal email?");
			obj =  JOptionPane.showInputDialog(null, "Qual seu objetivo, o que você almeja?");
			hab1 = JOptionPane.showInputDialog(null, "Quais suas habilidades? Seja breve. Ex: Proativo"
					+ "Habilidade Nº1?");
			hab2 = JOptionPane.showInputDialog(null, "Habilidade Nº2?");
			hab3 = JOptionPane.showInputDialog(null, "Habilidade Nº3?");
			hab4 = JOptionPane.showInputDialog(null, "Habilidade Nº4?");
			hab5 = JOptionPane.showInputDialog(null, "Habilidade Nº5?");
			IA1 = JOptionPane.showInputDialog(null, "Cursos, Universidade, Ensino Médio? Coloque aqui"
					+ "informações sobre suas Informações Acadêmicas. Instituição, nome do curso e tempo de duração em meses ou anos"
					+ "\n Informação Acadêmica Nº1");
			IA2 = JOptionPane.showInputDialog(null, "Informação Acadêmica Nº2");
			IA3 = JOptionPane.showInputDialog(null, "Informação Acadêmica Nº3");
			exp1 = JOptionPane.showInputDialog(null, "Sua experiência. Coloque o nome da empresa e o tempo de estadia em anos ou meses"
					+ "\nExperiência Nº1");
			exp2 = JOptionPane.showInputDialog(null, "Experiência Nº2");
			exp2 = JOptionPane.showInputDialog(null, "Experiência Nº3");
			
		

		}
		
		
		
	}

