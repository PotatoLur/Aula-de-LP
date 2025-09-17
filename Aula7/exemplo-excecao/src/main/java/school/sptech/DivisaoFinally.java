package school.sptech;

import javax.swing.*;

public class DivisaoFinally {
    public static void main(String[] args) {
        String sNum1, sNum2;

        sNum1 = JOptionPane.showInputDialog("Digite o dividendo: ");
        sNum2 = JOptionPane.showInputDialog("Digite o divisor: ");

        try {
            int num1 = Integer.parseInt(sNum1);
            int num2 = Integer.parseInt(sNum2);

            JOptionPane.showMessageDialog(null, num1 / num2);
        } catch (ArithmeticException erro){
            JOptionPane.showMessageDialog(null,"Divisão por zero!\n" + erro,
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"Digite apenas números!\n" + erro,
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null,"Fim do programa");
        }
        
        System.exit(0);
    }
}
