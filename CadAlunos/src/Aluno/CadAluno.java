package Aluno;

public class CadAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno.setNome("Francisco");
        aluno2.setNome("Matheus");

        System.out.println(aluno.getNome());
        aluno2.mostrarAluno();
    }

}
