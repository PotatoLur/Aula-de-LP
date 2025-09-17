package school.sptech;

import javax.swing.*;

public class DivisaoLoop {
    public static void main(String[] args) {
        String sNum1, sNum2;
        Boolean fim = false;

        while (!fim) {
            sNum1 = JOptionPane.showInputDialog("Digite o dividendo: ");
            sNum2 = JOptionPane.showInputDialog("Digite o divisor: ");

            try {
                double num1 = Double.parseDouble(sNum1);
                double num2 = Double.parseDouble(sNum2);

                JOptionPane.showMessageDialog(null, num1 / num2);
                fim = true;
            } catch (ArithmeticException erro) {
                JOptionPane.showMessageDialog(null, "Divisão por zero!\n" + erro,
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas números!\n" + erro,
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        System.exit(0);
    }
}
