package school.sptech;

public class AlunoGraduacao extends Aluno {
    private Double notaContinuada;
    private Double notaProjetoIndividual;

    public AlunoGraduacao(Integer ra, String nome, Double notaContinuada, Double notaProjetoIndividual) {
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaProjetoIndividual = notaProjetoIndividual;
    }

    @Override
    public void exibeDados() {
        System.out.println("\nAluno Graduação:" +
                            "\nRA = " + getRa() +
                            "\nNome = " + nome +
                            "\nNota Continuada = " + notaContinuada +
                            "\nNota Projeto Individual = " + notaProjetoIndividual);
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{" +
                "notaContinuada=" + notaContinuada +
                ", notaProjetoIndividual=" + notaProjetoIndividual +
                "} " + super.toString();
    }
}
