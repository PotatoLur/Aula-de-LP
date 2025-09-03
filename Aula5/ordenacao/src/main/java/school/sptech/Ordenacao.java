package school.sptech;

import java.util.Arrays;

public class Ordenacao {
     static void selectionSort(int[] v){
        Integer aux;
         int comparacao = 0;
         int troca = 0;
         int indiceMenor;
        for (int i = 0; i < v.length - 1; i++) {
            indiceMenor = i;
            for (int j = i + 1; j < v.length; j++) {
                comparacao++;
                if (v[j] < v[indiceMenor]){
                    indiceMenor = j;
                }
                aux = v[i];
                v[i] = v[indiceMenor];
                v[indiceMenor] = aux;
                troca++;
            }
        }
        System.out.println(Arrays.toString(v));
         System.out.println("Comparações: " + comparacao);
         System.out.println("Trocas: " + troca);
    }

    public static void main(String[] args) {
        int[] vetor = {120, 20, 10, 8, 3, 4, 5};
        selectionSort(vetor);
    }
}
