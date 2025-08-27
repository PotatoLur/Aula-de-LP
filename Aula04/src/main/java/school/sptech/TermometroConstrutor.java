package school.sptech;

public class TermometroConstrutor {
    private Double temperaturaAtual;
    private Double temperaturaMinRegistrada;
    private Double temperaturaMaxRegistrada;

    // Construtor:
    // Construtor vazio
    public TermometroConstrutor() {
        System.out.println("Criando um termômetro.");
    }

    public TermometroConstrutor(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    //Construtor cheio - Alt+Insert -> Constructor
    public TermometroConstrutor(Double temperaturaAtual, Double temperaturaMinRegistrada, Double temperaturaMaxRegistrada) {
        this();
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMinRegistrada = temperaturaMinRegistrada;
        this.temperaturaMaxRegistrada = temperaturaMaxRegistrada;
    }

    public void aumentarTemperatura(Double valor) {
        if (valor == null || valor <= 0) {
            System.out.println("Parâmetro inválido.");
        } else {
            temperaturaAtual += valor;
            if (temperaturaAtual >= temperaturaMaxRegistrada){
                temperaturaMaxRegistrada = temperaturaAtual;
            }
            System.out.println("Temperatura atual: " + temperaturaAtual);
        }
    }

    public void diminuirTemperatura(Double valor) {
        temperaturaAtual -= valor;
        if (temperaturaAtual < temperaturaMinRegistrada) {
            temperaturaMinRegistrada = temperaturaAtual;
        }
    }

    public Double converterParaFahrenheit(){
        return temperaturaAtual * 1.8 + 32;
    }

    @Override
    public String toString() {
        return "Termometro{" +
                "temperaturaAtual=" + temperaturaAtual +
                ", temperaturaMinRegistrada=" + temperaturaMinRegistrada +
                ", temperaturaMaxRegistrada=" + temperaturaMaxRegistrada +
                '}';
    }

    // Getters e Setters

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Double getTemperaturaMinRegistrada() {
        return temperaturaMinRegistrada;
    }

    public void setTemperaturaMinRegistrada(Double temperaturaMinRegistrada) {
        this.temperaturaMinRegistrada = temperaturaMinRegistrada;
    }

    public Double getTemperaturaMaxRegistrada() {
        return temperaturaMaxRegistrada;
    }

    public void setTemperaturaMaxRegistrada(Double temperaturaMaxRegistrada) {
        this.temperaturaMaxRegistrada = temperaturaMaxRegistrada;
    }
}
