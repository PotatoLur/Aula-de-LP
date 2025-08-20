package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // Fila tem início e fim. Só pode sair o primeiro e o próximo a entrar, entra por último.
        // Lista, é um vetor que pode tirar e colocar em qualquer lugar.
        // Pilha. Um em cima do outro. O último a entrar é o primeiro a sair.

        /* Cria um vetor com tamanho 10, assim que é adicionado o 11° elemento, vai criar um
        outro vetor de tamanho 20 e por assim vai.
         */
        List<String> lista = new ArrayList<>();
        lista.add("Mickey");
        lista.add("Pateta");
        lista.add("Minnie");
        System.out.println("Tamanho da lista: " + lista.size());

        System.out.println("\nUsando for enhanced");
        for (String nome : lista){
            System.out.println(nome);
        }

        System.out.println("\nUsando for normal");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)); // O índice precisa ser tipo int. Não pode ser Integer.
        }

        System.out.println("\nSem usar for");
        System.out.println(lista);

        lista.add(0, "Disney"); // Adiciona no início da lista.
        System.out.println(lista);

        System.out.println("\nRemovendo da lista");
        lista.remove("Mickey");
        lista.remove(0);
        System.out.println(lista);

        lista.set(1, "Mickey");
        System.out.println(lista);

        List<Integer> listaNumero = new ArrayList<>();
        listaNumero.add(3);
        listaNumero.add(2);
        listaNumero.add(0);

        System.out.println(listaNumero);
        listaNumero.remove(2); // Remove pelo índice. Para remover pelo valor, criar um Integer com o valor.
        System.out.println(listaNumero);

        System.out.println("Pateta está na lista? " +
                lista.contains("Pateta"));
        System.out.println("Lista está vazia? " +
                lista.isEmpty());
        System.out.println("Índice da Minnie: " + lista.indexOf("Minnie"));

        List listaLoka = new ArrayList();
        //Adicionando valores na listaLoka
        listaLoka.add(100);
        listaLoka.add("Sptech");
        listaLoka.add(200.5);
        listaLoka.add(false);
        System.out.println(listaLoka);
    }
}
