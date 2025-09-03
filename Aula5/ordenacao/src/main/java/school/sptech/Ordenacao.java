package school.sptech;

import java.util.Arrays;

public class Ordenacao {
     static void selectionSort(int[] v) {
         Integer aux;
         int comparacao = 0;
         int troca = 0;
         int indiceMenor;
         for (int i = 0; i < v.length - 1; i++) {
             indiceMenor = i;
             for (int j = i + 1; j < v.length; j++) {
                 comparacao++;
                 if (v[j] < v[indiceMenor]) {
                     indiceMenor = j;
                 }
             }
             aux = v[i];
             v[i] = v[indiceMenor];
             v[indiceMenor] = aux;
             troca++;
         }
         System.out.println(Arrays.toString(v));
         System.out.println("Comparações: " + comparacao);
         System.out.println("Trocas: " + troca);
     }

    static void bubbleSort(int[] v) {
        int aux;
        int comparacao = 0;
        int troca = 0;
        for (int i = 0; i < v.length; i++) {
            comparacao++;
            for (int j = 1; j < v.length - i; j++) {
                if (v[j - 1] > v[j]) {
                    aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                    troca++;
                }
            }
        }
        System.out.println(Arrays.toString(v));
        System.out.println("Comparações: " + comparacao);
        System.out.println("Trocas: " + troca);
    }

    public static void main(String[] args) {
        int[] vetor1 = {100, 20, 12, 8, 3, 4, 5};
        System.out.println("Selection Sorting:");
        selectionSort(vetor1);

        int[] vetor2 = {100, 20, 12, 8, 3, 4, 5};
        System.out.println("\nBubble Sorting: ");
        bubbleSort(vetor2);
    }

    static int pesqBin (int x, int[] v) {
        // Só funciona se o vetor estiver ordenado.
        int inicio = 0;
        int fim = v.length - 1;
        while (inicio > fim) {
            int meio = (inicio + fim) / 2;
            if (x == v[meio]) {
                return meio;
            } else if (x > v[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}