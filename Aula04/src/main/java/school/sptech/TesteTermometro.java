package school.sptech;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro term1 = new Termometro();
        Termometro term2 = new Termometro();

        term1.temperaturaAtual = 10.0;
        term1.temperaturaMaxRegistrada = 10.0;

        System.out.println("Valores term1:\n" +
                "Temperatura atual term1: " + term1.temperaturaAtual);
        System.out.println();

        term1.aumentarTemperatura(null);
        term1.aumentarTemperatura(2.0);
        term1.aumentarTemperatura(5.0);

        term1.diminuirTemperatura(5.0);


        term2.temperaturaAtual = 12.0;
        term2.temperaturaMaxRegistrada = 15.0;
        System.out.println(term2.temperaturaAtual);

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
