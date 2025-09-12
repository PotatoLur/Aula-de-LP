package school.sptech;

public class Filme {
    private Integer id;
    private String nome;
    private String genero;
    private String diretor;
    private Double avaliacao;
    private Integer quantidadeAssistida;

    public Filme(Integer id, String nome, String genero, String diretor, Double avaliacao, Integer quantidadeAssistida) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.diretor = diretor;
        this.avaliacao = avaliacao;
        this.quantidadeAssistida = quantidadeAssistida;
    }

    @Override
    public String toString() {
        return "FILME -> " +
                "ID=" + id +
                ", Nome: " + nome +
                ", Gênero: " + genero +
                ", Diretor: " + diretor +
                ", Avaliacao: " + avaliacao +
                ", Quantidade Assistida: " + quantidadeAssistida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getQuantidadeAssistida() {
        return quantidadeAssistida;
    }

    public void setQuantidadeAssistida(Integer quantidadeAssistida) {
        this.quantidadeAssistida = quantidadeAssistida;
    }
}
