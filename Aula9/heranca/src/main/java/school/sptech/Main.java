package school.sptech;

public class Main {
    public static void main(String[] args) {

        VendedorComissao v1 = new VendedorComissao(101, "Joao Silva", 50000.00, 0.15);
        VendedorComissao v2 = new VendedorComissao(102, "Maria Santos", 30000.00, 0.20);

        VendedorComissaoMaisFixo vf1 = new VendedorComissaoMaisFixo(201, "Pedro Alves", 60000.00, 0.10, 1500.00);
        VendedorComissaoMaisFixo vf2 = new VendedorComissaoMaisFixo(202, "Ana Costa", 45000.00, 0.18, 1000.00);

        System.out.println("--- Teste de calcularSalario e toString ---");
        System.out.println(v1.toString());
        System.out.println(vf1.toString());
        System.out.println("Salario de v2: R$ " + String.format("%.2f", v2.calcularSalario()));
        System.out.println("Salario de vf2: R$ " + String.format("%.2f", vf2.calcularSalario()));
        System.out.println("------------------------------------------\n");


        DepartamentoComercial dpto = new DepartamentoComercial("SP");

        dpto.adicionaVendedor(v1);
        dpto.adicionaVendedor(v2);
        dpto.adicionaVendedor(vf1);
        dpto.adicionaVendedor(vf2);

        dpto.adicionaVendedor(new VendedorComissao(103, "Carlos Oliveira", 20000.00, 0.25));

        dpto.exibeTodos();
        System.out.println("\n");

        dpto.exibeVendedorComissaoMaisFixo();
        System.out.println("\n");

        dpto.exibeTotalSalario();
    }
}