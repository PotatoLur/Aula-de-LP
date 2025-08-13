package org.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Aleatorio {
    public static void main(String[] args) {
        // Número máximo = 9
        Integer numeroAleatorio = (int)(Math.random() * 10);
        System.out.println("Número sorteado: " + numeroAleatorio);

        // Com piso (número mínimo = 2)
        Integer numeroMin = 2 + (int)(Math.random() * 10);
        System.out.println("Número sorteado (mínimo): " + numeroMin);

        Integer numeroEntre = 2 + (int)(Math.random() * 9);
        System.out.println("Número sorteado (entre 2 a 10): " + numeroEntre);

        Random numAleatorio = new Random();
        Integer i = numAleatorio.nextInt(10);
        System.out.println("Aleatório nextInt(): " + i);

        Integer thread = ThreadLocalRandom.current().nextInt(0, 50);
        System.out.println("Aleatório Thread: " + thread);

        Double threadDouble = ThreadLocalRandom.current().nextDouble(0, 10);
        System.out.println("Aleatório Double Thread: " + threadDouble);
        System.out.printf("Aleatório Double Thread: %.3f", threadDouble);
    }
}
