package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

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

        int[] avaliacoes = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            avaliacoes[i] = (int) (lista.get(i).getAvaliacao() * 10);
        }

        int[] quantidadesAssistidas = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            quantidadesAssistidas[i] = lista.get(i).getQuantidadeAssistida();
        }

        Ordenacao.selectionSort(avaliacoes);
        Ordenacao.bubbleSort(quantidadesAssistidas);

        int valorParaBuscar = 1300;
        int indiceEncontrado = Ordenacao.pesqBin(valorParaBuscar, quantidadesAssistidas);

        if (indiceEncontrado != -1) {
            System.out.printf("Valor %d encontrado na posição %d.%n", valorParaBuscar, indiceEncontrado);
        } else {
            System.out.printf("Valor %d não encontrado.%n", valorParaBuscar);
        }
    }
}