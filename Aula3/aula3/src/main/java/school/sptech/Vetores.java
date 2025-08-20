package school.sptech;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
    public static void exibeVetor(Integer[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }

    public static void lerVetor(Integer[] vetor) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor do vetor["+ i +"]");
            vetor[i] = leitor.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numero;
        /*
        O vetor em Java é um conceito estático. Uma vez definido o seu tamanho,
        esse tamanho não pode ser alterado durante a execução do programa
         */
        Integer[] vetor = new Integer[9];
        Integer[] vetor2 = {100, 200, 300 ,400, 500, 600, 700};

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i * 10;
        }

        lerVetor(vetor);

        System.out.println("Vetor 1:");
        exibeVetor(vetor);

        System.out.println("\nVetor 2:");
        exibeVetor(vetor2);

        System.out.println(Arrays.toString(vetor));

        Integer tamanho = 10;
        String[] nome = new String[tamanho];
        String[] nome2 = {"Mickey", "Pateta", "Minnie"};

        for (String n : nome2){
            System.out.println(n);
        }
    }
}
