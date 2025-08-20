package school.sptech;

public class Metodos {
    // Função = Métodos (Java e C#)
    // Métodos main por exemplo
    public static void exibeAsteriscos() { // void significa que não retorna valor.
        System.out.println("********************");
    }

    public static void exibeQuadroAsteriscos() {
        exibeAsteriscos();
        System.out.println("***              ***");
        exibeAsteriscos();
    }

    public static void exibeQuadroAsteriscos(String msg) { // É possível ter métodos iguais, contanto que tenham assinaturas diferentes.
        exibeAsteriscos();
        System.out.println("***    " + msg + "    ***");
        exibeAsteriscos();
        return; // Pode ser utilizado o 'return' como se fosse um break. Porém utilizando o métodoo void, não se pode retornar nenhum parâmetro
    }

    public Double media (Double n1, Double n2){ // Se o métodoo tem um tipo, então é necessário ter o return.
        return (n1 + n2) / 2;
    }

    public static Double media (Double n1, Double n2, Double n3){ // Se o métodoo tem um tipo, então é necessário ter o return.
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        exibeAsteriscos();
        System.out.println();
        exibeQuadroAsteriscos();
        System.out.println();
        exibeQuadroAsteriscos("Batata");
        System.out.println();

        System.out.println();
        Double media3 = media(6.0, 7.0, 8.0);
        System.out.println("Média: " + media3);

        // Criar um objeto da classe Métodos quando não tem o static
        Metodos m = new Metodos();
        System.out.println((new Metodos()).media(8.0, 9.0));
        Double media2 = m.media(6.0, 7.0);
        System.out.println("Média: " + media2);

    }
}
