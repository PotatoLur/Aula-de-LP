package school.sptech;

public class Main {
    public static void main(String[] args) {
        Engenheiro mickey = new Engenheiro("11111", "Mickey", 5000.00);
        Horista ok = new Horista("1234", "ok", 50, 300.00);
        Vendedor wow = new Vendedor("3333", "Wow", 10000.0, 0.1);

        Empresa disney = new Empresa();
        disney.adicionarFunc(mickey);
        disney.adicionarFunc(ok);
        disney.adicionarFunc(wow);

        disney.exibeTodos();
        disney.exibeTotalSalario();
        disney.exibeHoristas();
    }
}
