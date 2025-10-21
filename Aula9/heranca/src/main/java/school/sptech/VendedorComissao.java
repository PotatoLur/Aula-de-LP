package school.sptech;

public class VendedorComissao {
    protected Integer codigo;
    protected String nome;
    protected Double vendas;
    protected Double taxa;

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }

    public Double calcularSalario() {
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return "VendedorComissao [codigo=" + codigo + ", nome=" + nome + ", vendas=" + vendas + ", taxa=" + taxa + ", salario=" + calcularSalario() + "]";
    }

    public Double getVendas() {
        return vendas;
    }

    public String getNome() {
        return nome;
    }
}