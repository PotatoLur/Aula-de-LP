package school.sptech;

public abstract class Produto implements Vendavel {

    protected int codigo;
    protected double precoCusto;

    public Produto(int codigo, double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                ", Preço de Custo: R$" + String.format("%.2f", precoCusto) +
                ", Preço de Venda: R$" + String.format("%.2f", getValorVenda());
    }
}