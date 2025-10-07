package school.sptech;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private String ra;
    private List<Double> notas;

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(Double nota){
        this.notas.add(nota);
    }

    public Double calcularMedia() {
        if (notas.isEmpty()){
            return 0.0;
        }

        double media = 0.0;
        for (Double nota : notas){
            media += nota;
        }

        media = media / notas.size();
        return media;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public List<Double> getNotas() {
        return notas;
    }
}
