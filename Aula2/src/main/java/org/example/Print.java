package org.example;

public class Print {
    public static void main(String[] args) {
        System.out.println("Olá todo mundo!");
//        System.out.print("Olá!");

        String nome = "Gilberto";
        Integer idade = 22;
        Double altura = 1.78;
        Double nota = 78.0;

        String textoFormatado =
                String.format("Olá %s, você tem %d anos, e mede %.2f m, você " +
                                "acerto %.2f%% da prova.",
                        nome, idade, altura, nota);
        System.out.println(textoFormatado);
        System.out.printf("\nOlá %s, você tem %d anos, e mede %.2f m, você " +
                        "acerto %.2f%% da prova.",
                nome, idade, altura, nota);


    }
}
