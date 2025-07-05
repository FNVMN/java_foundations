package model;

import java.util.Random;

public class Disciplina {
    private String nome;
    private int cargahoraria;
    private int id;
    private String categoria;
    
    
    public Disciplina(String nome, int cargahoraria, String categoria) {
        this.nome = nome;
        this.cargahoraria = cargahoraria;
        this.categoria = categoria;
        this.id = this.gerarId();
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

    public int gerarId(){
        Random rand = new Random();
        int id = rand.nextInt(9999) + 1; //1 até 9999
        return id; 
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void visualizar(){
        System.out.println(
            "identificação: " + id + "\n" +
                "Disciplina: " + nome + "\n" +
                "Carga Horaria: " + cargahoraria + " Horas" + "\n" +
                "Categoria: " + categoria);
    }



}
