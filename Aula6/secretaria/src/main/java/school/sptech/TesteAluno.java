package school.sptech;

public class TesteAluno {
    public static void main(String[] args) {
        Secretaria secretaria = new Secretaria();
        Aluno aluno1 = new Aluno(123456789, "Guilherme", 5.0, 7.0);
        Aluno aluno2 = new Aluno(12341234, "Jonas", 10.0, 8.0);
        Aluno aluno3 = new Aluno(43214321, "João", 2.0, 3.0);

        secretaria.registraPagamento(aluno1);
        System.out.println();
        secretaria.registraAtrasoPag(aluno2);
        System.out.println();
        secretaria.registraCancelamento(aluno3);
        System.out.println();
        secretaria.verificaAprovacaoAluno(aluno1);
        secretaria.verificaAprovacaoAluno(aluno2);
        secretaria.verificaAprovacaoAluno(aluno3);
        secretaria.exibirRelatorio(secretaria);
    }
}
