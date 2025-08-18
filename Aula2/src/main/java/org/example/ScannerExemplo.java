package org.example;

import java.util.Scanner;

public class ScannerExemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in); // Leitor para .nextLine

//        System.out.print("Digite a sua idade: ");
//        Integer idade = leitor.nextInt();
//
//        System.out.print("Digite o seu nome: ");
//        String nome = leitor2.nextLine();
//
//        System.out.print("Digite a sua altura: ");
//        Double altura = leitor.nextDouble();

        System.out.println("Digite 3 números (separados por espaço).");
        Integer num1 = leitor.nextInt();
        Integer num2 = leitor.nextInt();
        Integer num3 = leitor.nextInt();
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("Número 3: " + num3);
    }
}
