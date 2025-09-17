package school.sptech;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class ExemploThrow {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Digite a primeira nota (de 0 a 10):");
            Double nota1 = leitor.nextDouble();
            if (nota1 < 0 || nota1 > 10){
                throw  new LimiteUltrapassadoException("Nota 1 inválida!");
            }
            System.out.println("Digite a segunda nota (de 0 a 10):");
            Double nota2 = leitor.nextDouble();
            if (nota2 < 0 || nota2 > 10){
                throw new LimiteUltrapassadoException("Nota 2 inválida!");
            }
            System.out.println("Méida = " + (nota1 + nota2) / 2);
        } catch(LimiteUltrapassadoException erro) {
            System.out.println(erro + " - " + erro.dataHora);
            erro.printStackTrace();
        }
    }
}
