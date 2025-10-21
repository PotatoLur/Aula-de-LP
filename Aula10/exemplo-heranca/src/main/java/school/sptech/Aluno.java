package school.sptech;

public class Aluno {
    private Integer ra;
    protected String nome; // Usando protected, as classes filhas podem usar os atributos.

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public void exibeDados(){
        System.out.println("\nAluno:" +
                            "\nRA = " + ra +
                            "\nNome = " + nome);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                "}";
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
