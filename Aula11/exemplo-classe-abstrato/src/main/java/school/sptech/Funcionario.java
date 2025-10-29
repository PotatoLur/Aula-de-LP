package school.sptech;

public abstract class Funcionario {
    private String cpf;
    private String nome;

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public abstract Double calcSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", salario='" + String.format("R$ % .2f", calcSalario()) + '\'' +
                '}';
    }
}
