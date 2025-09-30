package sptech.school;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("books.json");
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo nao encontrado");
            System.exit(1);
        }

        LivroMapper livroMapper = new LivroMapper();
        List<Livro> listaLivros = new ArrayList<>();
        try {
            listaLivros = livroMapper.mapearLivros(inputStream);
        } catch (IOException erro) {
            System.out.println("Erro ao mapear o json.");
            erro.printStackTrace();
        } finally {
            try {
                inputStream.close();
            }  catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo json.");
            }
        }

        if (listaLivros != null && !listaLivros.isEmpty()) {
            paraCsv("books.csv", listaLivros);
            for (Livro livro : listaLivros) {
                System.out.println(livro);
            }
        } else {
            System.out.println("CSV não foi gerado.");
        }
    }

    public static void paraCsv(String nomeArquivo, List<Livro> livros) {
        String atributo = "\"id\",\"nome\",\"autor\",\"data_publicacao\",\"editora\",\"preco\",\"preco_desconto\",\"nota\"";

        try (FileWriter fileWriter = new FileWriter(nomeArquivo)) {
            fileWriter.write(atributo + "\n");
            for (Livro livro : livros) {
                fileWriter.write(livro.toCsvRow() + "\n");
            }
        } catch (IOException erro) {
            System.out.println("Erro ao escrever o arquivo CSV.");
            erro.printStackTrace();
        }
    }
}