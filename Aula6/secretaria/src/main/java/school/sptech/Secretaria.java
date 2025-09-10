package school.sptech;

import java.sql.SQLOutput;

public class Secretaria {
    private Integer totalInadimplentes;
    private Integer totalCancelamentos;
    private Integer totalPagamentos;

    public Secretaria() {
        this.totalInadimplentes = 0;
        this.totalCancelamentos = 0;
        this.totalPagamentos = 0;
    }

    public void registraPagamento(Aluno aluno) {
        aluno.setInadimplente(false);
        totalPagamentos += 1;
        System.out.printf("o aluno %s de ra %d está em dia com o pagamento.",
                        aluno.getNome(),
                        aluno.getRa()
        );
    }

    public void registraAtrasoPag(Aluno aluno) {
        aluno.setInadimplente(true);
        totalInadimplentes += 1;
        totalCancelamentos += 1;
        System.out.printf("o aluno %s de ra %d está inadimplente.",
                aluno.getNome(),
                aluno.getRa()
        );
    }

    public void registraCancelamento(Aluno aluno) {
        aluno.setAtivo(false);
        totalCancelamentos += 1;
        System.out.printf("o aluno %s de ra %d cancelou a matrícula.",
                aluno.getNome(),
                aluno.getRa()
        );
    }

    public void verificaAprovacaoAluno(Aluno aluno) {
        String atividade = "";
        String status = "";
        String inadimplente = "";

        if (aluno.getAtivo()){
            atividade = "ATIVO";
        } else {
            atividade = "NÃO ATIVO";
        }

        if (aluno.calcularMedia(aluno) >= 6.0) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }

        if (aluno.getInadimplente()) {
            inadimplente = "SIM";
        } else {
            inadimplente = "NÃO";
        }

        System.out.println("SITUAÇÃO DO ALUNO -> " + atividade +
                            "\nRA: " + aluno.getRa() +
                            "\nNome: " + aluno.getNome() +
                "\nNota1: " + aluno.getNota1() +
                "\nNota2: " + aluno.getNota2() +
                "\nMédia: " + aluno.calcularMedia(aluno) +
                "\nStatus: " + status +
                "\nInadimplente: " + inadimplente);
    }

    public void exibirRelatorio(Secretaria secretaria){
        System.out.println("---------- RELATÓRIO ----------");
        System.out.println("Pagamentos realizados: " + totalPagamentos +
                "\nInadimplentes: " + totalInadimplentes +
                "\nEvasões: " + totalCancelamentos);
    }

    public Integer getTotalInadimplentes() {
        return totalInadimplentes;
    }

    public void setTotalInadimplentes(Integer totalInadimplentes) {
        this.totalInadimplentes = totalInadimplentes;
    }

    public Integer getTotalCancelamentos() {
        return totalCancelamentos;
    }

    public void setTotalCancelamentos(Integer totalCancelamentos) {
        this.totalCancelamentos = totalCancelamentos;
    }

    public Integer getTotalPagamentos() {
        return totalPagamentos;
    }

    public void setTotalPagamentos(Integer totalPagamentos) {
        this.totalPagamentos = totalPagamentos;
    }
}
