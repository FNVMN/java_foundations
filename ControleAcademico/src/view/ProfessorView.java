package view;

import javax.swing.JOptionPane;

import model.Professor;
import repository.ProfessorRepository;

public class ProfessorView {
    public static void executar()throws Exception{
        String nome = JOptionPane.showInputDialog("Digite o nome do professor");
        String endereco = JOptionPane.showInputDialog("Digite  o endereço do professor");
        String idadeString = JOptionPane.showInputDialog("Digite a idade do professor");
        int idade = Integer.parseInt(idadeString);;
        String cpf = JOptionPane.showInputDialog("Digite o cpf do professor");
        String atuacao = JOptionPane.showInputDialog("Digite a atuação do professor");

        Professor professor = new Professor (nome, endereco, idade, idade, cpf, atuacao);
        professor.visualizar();

        ProfessorRepository.salvar(professor);
    }
    
}
