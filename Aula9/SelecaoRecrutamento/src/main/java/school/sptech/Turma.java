package school.sptech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Turma {
    private List<Aluno> alunos;
    private String Disciplina;

    public Turma(String Disciplina) {
        this.Disciplina = Disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Aluno getAlunoPorRa(String ra) {
        for (Aluno aluno : alunos) {
            if (aluno.getRa().equals(ra)) {
                return aluno;
            }
        }
        return null;
    }

    public List<Aluno> getAlunoPorNome(String nome) {
        List<Aluno> alunosBusca = new ArrayList<>();
        String nomeLowerCase = nome.toLowerCase();

        for (Aluno aluno : alunos) {
            if (aluno.getNome().toLowerCase().contains(nomeLowerCase)) {
                alunosBusca.add(aluno);
            }
        }
        return alunosBusca;
    }

    public Aluno getAlunoComMaiorMedia() {
        if (alunos.isEmpty()) {
            return null;
        }

        Aluno alunoMaiorMedia = alunos.get(0);
        double maiorMedia = alunoMaiorMedia.calcularMedia();

        for (int i = 1; i < alunos.size(); i++) {
            Aluno alunoAtual = alunos.get(i);
            double mediaAtual = alunoAtual.calcularMedia();

            if (mediaAtual > maiorMedia) {
                maiorMedia = mediaAtual;
                alunoMaiorMedia = alunoAtual;
            }
        }
        return alunoMaiorMedia;
    }

    public Aluno getAlunoComMenorMedia() {
        if (alunos.isEmpty()) {
            return null;
        }

        Aluno alunoMenorMedia = alunos.get(0);
        double menorMedia = alunoMenorMedia.calcularMedia();

        for (int i = 1; i < alunos.size(); i++) {
            Aluno alunoAtual = alunos.get(i);
            double mediaAtual = alunoAtual.calcularMedia();

            if (mediaAtual < menorMedia) {
                menorMedia = mediaAtual;
                alunoMenorMedia = alunoAtual;
            }
        }

        return alunoMenorMedia;
    }

    public Double calcularMediaDaTurma() {
        if (alunos.isEmpty()) {
            return 0.0;
        }

        double media = 0.0;
        for (Aluno aluno : alunos) {
            media += aluno.calcularMedia();
        }

        media = media / alunos.size();
        return media;
    }

    public Double getMediaPorRa(String ra) {
        Aluno aluno = getAlunoPorRa(ra);

        if (aluno != null) {
            return aluno.calcularMedia();
        }
        return 0.0;
    }

    public Double getMediana() {
        if (alunos.isEmpty()) {
            return 0.0;
        }

        List<Double> medias = new ArrayList<>();
        for (Aluno aluno : alunos) {
            medias.add(aluno.calcularMedia());
        }

        Collections.sort(medias);

        if (medias.size() % 2 == 1) {
            return medias.get(medias.size() / 2);
        } else {
            int indice1 = medias.size() / 2 - 1;
            int indice2 = medias.size() / 2;
            return (medias.get(indice1) + medias.get(indice2)) / 2.0;
        }
    }
}