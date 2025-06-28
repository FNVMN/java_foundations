package model;

public class Disciplina {
    private String nome;
    private int cargahoraria;
    private int id;
    
    public Disciplina(String nome, int cargahoraria, int id) {
        this.nome = nome;
        this.cargahoraria = cargahoraria;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void visualizar(){
        System.out.println(
            "identificação: " + id + "\n" +
                "Disciplina: " + nome + "\n" +
                "Carga Horaria: " + cargahoraria);
    }

}
