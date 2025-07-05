package view;

import javax.swing.JOptionPane;

import model.Disciplina;
import repository.DisciplinaRepository;

public class DisciplinaView {
    public static void executar() throws Exception {
        String nome = JOptionPane.showInputDialog("Digite o nome do curso");
        String cargahorariaString = JOptionPane.showInputDialog("Digite a cargahoraria do curso");
        int cargahoraria = Integer.parseInt(cargahorariaString);
        String categoria = JOptionPane.showInputDialog("Digite a categoria do seu curso");
    
        Disciplina disciplina = new Disciplina(nome,cargahoraria,categoria);
        DisciplinaRepository.salvar(disciplina);
    }
}
