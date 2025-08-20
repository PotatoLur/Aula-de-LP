package school.sptech;

public class TesteCarro {
    public static void main(String[] args) {
        // Instanciando a classe Carro
        Carro fusca = new Carro();

        fusca.anoFabricacao = 1976;
        fusca.modelo = "Fusca";
        fusca.cor = "Azul";
        fusca.velocidade = 0.0;

        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        System.out.println("Velocidade atual: " + fusca.velocidade + " km/h");

        fusca.frear();
        fusca.frear();
        System.out.println("Velocidade atual: " + fusca.velocidade + " km/h");

        fusca.colidir();
        System.out.println("Velocidade atual: " + fusca.velocidade + " km/h");

        System.out.println(fusca);

        // Instanciar um novo objeto da classe Carro
        Carro meuSonho = new Carro();
        meuSonho.modelo = "Ferrari";
        meuSonho.velocidade = 0.0;
        meuSonho.anoFabricacao = 2015;
        meuSonho.cor = "Vermelho";

        System.out.println();
        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        meuSonho.acelerar();
        System.out.println("Velocidade atual: " + meuSonho.velocidade + " km/h");

        meuSonho.frear();
        System.out.println("Velocidade atual: " + meuSonho.velocidade + " km/h");

        meuSonho.colidir();
        System.out.println("Velocidade atual: " + meuSonho.velocidade + " km/h");

        System.out.println(meuSonho);

        // Instanciando um novo objeto
        Carro fusca2 = new Carro();

        fusca2.anoFabricacao = 1976;
        fusca2.modelo = "Fusca";
        fusca2.cor = "Azul";
        fusca2.velocidade = 0.0;

        if (fusca == fusca2){
            System.out.println("São iguais!");
        } else {
            System.out.println("São diferentes!");
        }
        
        Carro fusca3 = fusca;
        if (fusca == fusca3){
            System.out.println("São iguais!");
        } else {
            System.out.println("São diferentes!");
        }

    }
}
