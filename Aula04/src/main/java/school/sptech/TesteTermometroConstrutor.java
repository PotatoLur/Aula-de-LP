package school.sptech;

public class TesteTermometroConstrutor {
    public static void main(String[] args) {
        TermometroEncapsulado term1 = new TermometroEncapsulado();
        TermometroEncapsulado term2 = new TermometroEncapsulado();

        System.out.println(term1);

        term1.setTemperaturaAtual(10.0);
        term1.setTemperaturaMaxRegistrada(10.0);

        System.out.println("Valores iniciais:\n" +
                "Temperatura atual term1: " + term1.getTemperaturaAtual());
        System.out.println();

        term1.aumentarTemperatura(null);
        term1.aumentarTemperatura(2.0);
        term1.aumentarTemperatura(5.0);

        term1.diminuirTemperatura(5.0);


        term2.setTemperaturaAtual(12.0);
        term2.setTemperaturaMaxRegistrada(15.0);
        System.out.println(term2.getTemperaturaAtual());

        term2.aumentarTemperatura(null);
        term2.aumentarTemperatura(12.0);
        term2.aumentarTemperatura(8.0);

        term2.diminuirTemperatura(9.0);

        System.out.println(term1.converterParaFahrenheit());
        System.out.println(term2.converterParaFahrenheit());

        System.out.println(term1);
        System.out.println(term2);
    }
}
