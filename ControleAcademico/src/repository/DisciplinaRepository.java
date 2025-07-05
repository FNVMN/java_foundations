package repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import model.Disciplina;

public class DisciplinaRepository {
    private static final String ARQUIVO_TXT = "disciplina.txt";

    public static void salvar(Disciplina disciplina){
        try(PrintWriter out = new PrintWriter(new FileWriter(ARQUIVO_TXT,true))) {
            if(new File(ARQUIVO_TXT).length() == 0){
                out.println("nome,cargahoraria,id,categoria");
            }
            out.printf(
                "%s,%d,%d,%s%n",
                disciplina.getNome(),
                disciplina.getCargahoraria(),
                disciplina.getId(),
                disciplina.getCategoria()
            );    
        }catch(IOException e){
            System.err.println("Erro ao salvar em TXT" + e.getMessage());
        }
    }
}
