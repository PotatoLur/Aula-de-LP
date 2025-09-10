package school.sptech;

public class Pedido {
    private Integer codigo;
    private String produto;
    private Integer quantidade;
    private Double valorUnitario;
    private Double valorComDesconto;
    private Boolean itemPromocional;
    private Boolean cancelado;

    public Pedido(Integer codigo, String produto, Integer quantidade, Double valorUnitario) {
        this.codigo = codigo;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorComDesconto = valorUnitario;
        this.itemPromocional = false;
        this.cancelado = false;
    }

    public Double calcularValorTotal(Pedido pedido){
        return pedido.getValorUnitario() * pedido.getQuantidade();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorComDesconto() {
        return valorComDesconto;
    }

    public void setValorComDesconto(Double valorComDesconto) {
        this.valorComDesconto = valorComDesconto;
    }

    public Boolean getItemPromocional() {
        return itemPromocional;
    }

    public void setItemPromocional(Boolean itemPromocional) {
        this.itemPromocional = itemPromocional;
    }

    public Boolean getCancelado() {
        return cancelado;
    }

    public void setCancelado(Boolean cancelado) {
        this.cancelado = cancelado;
    }
}
