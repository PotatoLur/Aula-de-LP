package school.sptech;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Cachorro> lista = new ArrayList<>();

        lista.add(new Cachorro(1, "Zeus Berinjela", "Grande", 55.0));
        lista.add(new Cachorro(2, "Cacau", "Grande", 58.0));
        lista.add(new Cachorro(3, "Minnie", "Pequeno", 7.0));
        lista.add(new Cachorro(4, "Maya", "Grande", 62.0));
        lista.add(new Cachorro(5, "Flopy", "Médio", 16.0));
        lista.add(new Cachorro(6, "Ralph", "Médio", 14.0));
        lista.add(new Cachorro(7, "Pérola", "Pequeno", 1.3));
        lista.add(new Cachorro(8, "Akira", "Pequeno", 7.5));

        System.out.println("Lista de cachorros:");
        for (Cachorro c : lista) {
            System.out.println(c);
        }

        gravaArquivoCsv(lista, "dogs");
        System.out.println("Arquivo gravado com sucesso.");

        System.out.println("Lendo e exibindo o arquivo dogs.csv...");
        leExibrArquivoCsv("dogs");

        System.out.println("Lendo arquivo dogs.csv...");
        lerImportaArquivoCsv("dogs");
    }

    public static void gravaArquivoCsv(List<Cachorro> lista, String nomeArq) {
        OutputStreamWriter saida = null;
        Boolean deuRuim = false;
        nomeArq += ".csv";

        try {
            saida = new OutputStreamWriter(new FileOutputStream(nomeArq), StandardCharsets.UTF_8);
        } catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo!");
            System.exit(1);
        }
        try {
            saida.append("ID; NOME; PORTE; PESO\n");
            for (Cachorro dog : lista) {
                saida.write(String.format("%d;%s;%s;%.1f\n", dog.getId(), dog.getNome(), dog.getPorte(), dog.getPeso()));
            }
        } catch (IOException erro) {
            System.out.println("Erro ao gravar no arquivo!");
            erro.printStackTrace();
        } finally {
            try {
                saida.close();
            } catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo!");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibrArquivoCsv(String nomeArq) {
        FileReader arq = null;
        Scanner entrada = null;
        Boolean deuRuim = false;
        nomeArq += ".csv";

        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo inexistente!");
            System.exit(1);
        }

        try {
            Boolean cabecalho = true;
            while (entrada.hasNext()) {
                if (cabecalho) {
                    String titulo1 = entrada.next();
                    String titulo2 = entrada.next();
                    String titulo3 = entrada.next();
                    String titulo4 = entrada.next();
                    System.out.printf("%4s %-19s %-9s %4s\n", titulo1, titulo2, titulo3, titulo4);
                    cabecalho = false;
                } else {
                    Integer id = entrada.nextInt();
                    String nome = entrada.next();
                    String porte = entrada.next();
                    Double peso = entrada.nextDouble();
                    System.out.printf("%4d %-19s %-9s %4.1f\n", id, nome, porte, peso);
                }
            }
        } catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas!");
            erro.printStackTrace();
            deuRuim = true;
        } catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo!");
            erro.printStackTrace();
            deuRuim = true;
        } finally {
            try {
                entrada.close();
                arq.close();
            } catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo!");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void lerImportaArquivoCsv(String nomeArq) {
        Reader arq = null;
        BufferedReader entrada = null;
        nomeArq += ".csv";
        List<Cachorro> listaLida = new ArrayList<>();

        try {
            arq = new InputStreamReader(new FileInputStream(nomeArq), "UTF-8");
            entrada = new BufferedReader(arq);
        } catch (IOException erro) {
            System.out.println("Erro na abertura do arquivo");
            System.exit(1);
        }

        try {
            String[] registro;
            String linha = entrada.readLine();

            registro = linha.split(";");
            System.out.printf("%4s %-19s %-9s %4s\n", registro[0], registro[1], registro[2], registro[3]);

            linha = entrada.readLine();

            while(linha != null){
                registro = linha.split(";");
                Integer id = Integer.valueOf(registro[0]);
                String nome = registro[1];
                String porte = registro[2];
                Double peso = Double.valueOf(registro[3].replace(',', '.'));

                Cachorro dog = new Cachorro(id, nome, porte, peso);
                listaLida.add(dog);
                System.out.printf("%4d %-19s %-9s %4.1f\n", id, nome, porte, peso);

                linha = entrada.readLine();
            }
        } catch (IOException erro) {
            System.out.println("Erro ao ler o arquivo");
            erro.printStackTrace();
        }
        finally {
            try {
                entrada.close();
                arq.close();
            }
            catch (IOException erro){
                System.out.println("Erro ao fechar o arquivo");
            }
        }
        System.out.println("\nLista lida do arquivo: ");
        for(Cachorro dog : listaLida){
            System.out.println(dog);
        }
    }
}