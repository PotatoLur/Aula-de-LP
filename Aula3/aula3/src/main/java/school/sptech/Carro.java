package school.sptech;

import org.w3c.dom.ls.LSOutput;

public class Carro {
    // Atributos - Variáveis que são criadas dentro da classe,
    // mas fora do escopo dos métodos
    // São usados para representar as características do objeto
    // que são relevantes para o projeto
    String modelo;
    Double velocidade;
    String cor;
    Integer anoFabricacao;

    // Métodos - Representam o comportamento do objeto

    // Métodoo acelerar
    public void acelerar(){
        System.out.println("Vruuummmm!");
        velocidade += 20;
    }

    // Métodoo frear
    public void frear() {
        System.out.println("Freando...");
        velocidade -= 20;
    }

     // Métodoo colidir
    public void colidir() {
        System.out.println("CRASHHHHHH!");
        velocidade = 0.0;
    }

    // Sobrescrever o métodoo toString()

    @Override
    public String toString() {
        return "Carro:" +
                "\nModelo='" + modelo + '\'' +
                "\nvelocidade=" + velocidade +
                "\nCor='" + cor + '\'' +
                "\nAno de Fabricacao=" + anoFabricacao;
    }
}
