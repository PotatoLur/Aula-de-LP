package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoComercial {
    private String estadoLocalizacao;
    private List<VendedorComissao> listaVendedores;

    public DepartamentoComercial(String estadoLocalizacao) {
        this.estadoLocalizacao = estadoLocalizacao;
        this.listaVendedores = new ArrayList<>();
    }

    public void adicionaVendedor(VendedorComissao v) {
        listaVendedores.add(v);
    }

    public void exibeTodos() {
        System.out.println("--- Vendedores do Departamento Comercial em " + estadoLocalizacao + " ---");
        for (VendedorComissao v : listaVendedores) {
            System.out.println(v.toString());
        }
    }

    public void exibeVendedorComissaoMaisFixo() {
        System.out.println("--- Vendedores com Salário Fixo (Comissão Mais Fixo) ---");
        for (VendedorComissao v : listaVendedores) {
            if (v instanceof VendedorComissaoMaisFixo) {
                System.out.println(v.toString());
            }
        }
    }

    public void exibeTotalSalario() {
        double totalSalarios = 0.0;
        for (VendedorComissao v : listaVendedores) {
            totalSalarios += v.calcularSalario();
        }
        System.out.println("--- Total de Salários a Pagar no Departamento (" + estadoLocalizacao + ") ---");
        System.out.println("Total: R$ " + String.format("%.2f", totalSalarios));
    }
}