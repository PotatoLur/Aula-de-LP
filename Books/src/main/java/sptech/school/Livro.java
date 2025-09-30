package sptech.school;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Livro {

    // Mapeamento direto
    private Integer id;

    @JsonProperty("name")
    private String nome;

    @JsonProperty("author")
    private String autor;

    // Campos de data para cálculo
    @JsonProperty("month")
    private Integer mes;

    @JsonProperty("day")
    private Integer dia;

    @JsonProperty("year")
    private Integer ano;

    @JsonProperty("publisher")
    private String editora;

    private Double price;

    @JsonProperty("rating")
    private Double nota;

    public Livro() {

    }

    public String getDataFormatada() {
        if (dia != null && mes != null && ano != null) {
            LocalDate data = LocalDate.of(ano, mes, dia);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return data.format(formatter);
        }
        return "";
    }

    public String getPrecoFormatado() {
        if (price != null) {
            return String.format(Locale.US, "%.2f", price);
        }
        return "";
    }

    public String getPrecoDescontoFormatado() {
        if (price != null) {
            double precoComDesconto = price * 0.90;
            return String.format(Locale.US, "%.2f", precoComDesconto);
        }
        return "";
    }

    public String toCsvRow() {
        return "\"" +
                id + "\",\"" +
                nome + "\",\"" +
                getAutor() + "\",\"" +
                getDataFormatada() + "\",\"" +
                getEditora() + "\",\"" +
                getPrecoFormatado() + "\",\"" +
                getPrecoDescontoFormatado() + "\",\"" +
                nota + "\"" ;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public Integer getMes() { return mes; }
    public void setMes(Integer mes) { this.mes = mes; }

    public Integer getDia() { return dia; }
    public void setDia(Integer dia) { this.dia = dia; }

    public Integer getAno() { return ano; }
    public void setAno(Integer ano) { this.ano = ano; }

    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public Double getNota() { return nota; }
    public void setNota(Double nota) { this.nota = nota; }

    @Override
    public String toString() {
        return "Livro{" +
                "id=\"" + id + '\"' +
                ", nome=\"" + nome + '\"' +
                ", autor=\"" + getAutor() + '\"' +
                ", data=\"" + getDataFormatada() + '\"' +
                ", editora=\"" + getEditora() + '\"' +
                ", preco=\"" + getPrecoFormatado() + '\"' +
                ", preco desconto=\"" + getPrecoDescontoFormatado() + '\"' +
                ", nota=\"" + getNota() + '\"' +
                '}';
    }
}