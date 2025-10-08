package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno claudio = new Aluno(50000, "Claudio da Silva");
        Aluno maria = new Aluno(50001, "Maria Teixeira");

        AlunoGraduacao elisa = new AlunoGraduacao(50002, "Elisa Nogueira", 7.0, 8.5);
        AlunoGraduacao fulano = new AlunoGraduacao(50002, "Fulano Barbosa", 8.0, 9.0);

        claudio.exibeDados();
        maria.exibeDados();
        elisa.exibeDados();
        fulano.exibeDados();

        List<Aluno> lista = new ArrayList<>();
        lista.add(claudio);
        lista.add(elisa);
        lista.add(maria);
        lista.add(fulano);

        System.out.println(lista);

        System.out.println("\nLista de alunos que não estão na graduação:");
        for (Aluno a : lista){
            if(!(a instanceof AlunoGraduacao)){
                System.out.println(a);
            }
        }
    }
}
