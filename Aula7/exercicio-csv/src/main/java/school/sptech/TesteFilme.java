package school.sptech;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TesteFilme {

    public static void main(String[] args) {
        List<Filme> lista = new ArrayList<>();
        lista.add(new Filme(1, "Interestelar", "Ficção Científica", "Christopher Nolan", 4.9, 1200));
        lista.add(new Filme(2, "O Poderoso Chefão", "Drama", "Francis Ford Coppola", 4.8, 850));
        lista.add(new Filme(3, "A Origem", "Ficção Científica", "Christopher Nolan", 4.7, 1100));
        lista.add(new Filme(4, "Pulp Fiction", "Crime", "Quentin Tarantino", 4.6, 950));
        lista.add(new Filme(5, "Forrest Gump", "Drama", "Robert Zemeckis", 4.5, 1500));
        lista.add(new Filme(6, "Clube da Luta", "Drama", "David Fincher", 4.7, 1300));
        lista.add(new Filme(7, "Matrix", "Ficção Científica", "Lana Wachowski", 4.6, 1400));
        lista.add(new Filme(8, "Vingadores: Ultimato", "Ação", "Anthony e Joe Russo", 4.3, 2000));
        lista.add(new Filme(9, "O Rei Leão", "Animação", "Roger Allers e Rob Minkoff", 4.4, 1800));

        for(Filme c : lista){
            System.out.println(c);
        }

        gravaArquivoCsv(lista, "filme");
        leExibrArquivoCsv("filme");
    }

    public static void gravaArquivoCsv (List<Filme> lista, String nomeArq) {
        OutputStreamWriter saida = null;
        Boolean deuRuim = false;
        nomeArq += ".csv";

        try {
            saida = new OutputStreamWriter(new FileOutputStream(nomeArq), StandardCharsets.UTF_8);
        }
        catch (IOException erro){
            System.out.println("Erro ao abrir o arquivo!");
            System.exit(1);
        }
        try {
            saida.append("ID; NOME; GÊNERO; DIRETOR; AVALIAÇÃO; QUANTASSISTIDA\n");
            for (Filme film : lista){
                saida.write(String.format("%d;%s;%s;%s;%.1f;%d\n", film.getId(), film.getNome(), film.getGenero(), film.getDiretor(), film.getAvaliacao(), film.getQuantidadeAssistida()));
            }
        }
        catch (IOException erro){
            System.out.println("Erro ao gravar no arquivo!");
            erro.printStackTrace();
        }
        finally {
            try {
                saida.close();
            }
            catch (IOException erro){
                System.out.println("Erro ao fechar o arquivo!");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibrArquivoCsv(String nomeArq){
        FileReader arq = null;
        Scanner entrada = null;
        Boolean deuRuim = false;
        nomeArq += ".csv";

        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException erro){
            System.out.println("Arquivo inexistente!");
            System.exit(1);
        }

        try {
            Boolean cabecalho = true;
            while(entrada.hasNext()) {
                if(cabecalho){
                    String titulo1 = entrada.next();
                    String titulo2 = entrada.next();
                    String titulo3 = entrada.next();
                    String titulo4 = entrada.next();
                    String titulo5 = entrada.next();
                    String titulo6 = entrada.next();
                    System.out.printf("%4s %-22s %-22s %-30s %-15s %4s\n", titulo1, titulo2, titulo3, titulo4, titulo5, titulo6);
                    cabecalho = false;
                }
                else {
                    Integer id = entrada.nextInt();
                    String nome = entrada.next();
                    String genero = entrada.next();
                    String diretor = entrada.next();
                    Double avaliacao = entrada.nextDouble();
                    Integer quantAssistida = entrada.nextInt();
                    System.out.printf("%4d %-22s %-22s %-30s %-15.1f %4d\n", id, nome, genero, diretor, avaliacao, quantAssistida);
                }
            }
        }
        catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas!");
            erro.printStackTrace();
            deuRuim = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo!");
            erro.printStackTrace();
            deuRuim = true;
        }
        finally {
            try {
                entrada.close();
                arq.close();
            }
            catch (IOException erro){
                System.out.println("Erro ao fechar o arquivo!");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }
}