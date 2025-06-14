package main;

import model.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno aluno = new Aluno();
        aluno.setNome("Francisco Mota");
        aluno.setEndereco("Itamaraty");
        aluno.setIdade(16);
        aluno.setMatricula(4);

        aluno.visualizar();
        
        Aluno aluno2 = new Aluno(
        "Peterson Alves",
         "Cohab2",
         30,
         2
         );
         
        aluno2.visualizar(); 
    }
}
