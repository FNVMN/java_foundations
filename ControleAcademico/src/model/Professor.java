package model;

public class Professor {
    private String nome;
    private String endereco;
    private int idade;
    private int matricula;
    private String cpf;
    private String atuacao;
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getAtuacao() {
        return atuacao;
    }
    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    public void visualizar(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + matricula);
        System.out.println("CPF: " + cpf);
        System.out.println("Atuação: " + atuacao);
    }

   
}
