package school.sptech;

public class VendedorComissaoMaisFixo extends VendedorComissao {
    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salarioFixo) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public String toString() {
        return "VendedorComissaoMaisFixo{" +
                ", codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", vendas=" + vendas +
                ", taxa=" + taxa +
                "salarioFixo=" + salarioFixo +
                "} " + super.toString();
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }
}