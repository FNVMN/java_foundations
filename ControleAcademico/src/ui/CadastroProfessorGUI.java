package ui;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

import model.Professor;

public class CadastroProfessorGUI {
    public static void executar()throws Exception{
        String nome = JOptionPane.showInputDialog("Digite o nome do professor");
         String endereco = JOptionPane.showInputDialog("Digite  o endereço do professor");
        String idadeString = JOptionPane.showInputDialog("Digite a idade do professor");
        int idade = Integer.parseInt(idadeString);
        String matriculaString = JOptionPane.showInputDialog("Digite a matricula do professor"); 
        int matricula = Integer.parseInt(matriculaString);
        String cpf = JOptionPane.showInputDialog("Digite o cpf do professor");
        String atuacao = JOptionPane.showInputDialog("Digite a atuação do professor");

        Professor professor = new Professor (nome, endereco, idade, matricula, cpf, atuacao);
        professor.visualizar();

        PrintWriter saida = new PrintWriter("professor.txt");
        saida.println("nome, endereco, idade, matricula, cpf, atuacao");
        saida.println(
            professor.getNome() + ", " + 
            professor.getEndereco() + ", " + 
            professor.getIdade() + ", " + 
            professor.getMatricula()
        );
        saida.close();
    }
    
}
