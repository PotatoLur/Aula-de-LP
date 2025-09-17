package school.sptech;

import javax.naming.PartialResultException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploThrows {
    public static int divide (int a, int b) throws ArithmeticException {
        return a/b;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número: ");
            int num1 = leitor.nextInt();
            System.out.println("Digite o segundo número: ");
            int num2 = leitor.nextInt();
            System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
        } catch (ArithmeticException erro) {
            System.out.println("Divisão por zero");
            erro.printStackTrace();
        } catch (InputMismatchException erro){
            System.out.println("Digite apenas números");
            erro.printStackTrace();
        }
    }
}
