package school.sptech;

public class VendedorComissaoMaisFixo extends VendedorComissao {
    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salarioFixo) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public Double calcularSalario() {
        return (vendas * taxa) + salarioFixo;
    }

    @Override
    public String toString() {
        return "VendedorComissaoMaisFixo [codigo=" + codigo + ", nome=" + nome + ", vendas=" + vendas + ", taxa=" + taxa + ", salarioFixo=" + salarioFixo + ", salarioTotal=" + calcularSalario() + "]";
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }
}