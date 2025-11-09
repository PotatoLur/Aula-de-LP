package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> cart;

    public Carrinho() {
        this.cart = new ArrayList<>();
    }

    public List<Vendavel> getCart() {
        return cart;
    }

    public void setCart(List<Vendavel> cart) {
        this.cart = cart;
    }

    public void adicionaVendavel(Vendavel v) {
        this.cart.add(v);
    }

    public double calculaTotalVenda() {
        double total = 0.0;
        for (Vendavel item : this.cart) {
            total += item.getValorVenda();
        }
        return total;
    }

    public void exibeltensCarrinho() {
        if (cart.isEmpty()) {
            System.out.println("\nCarrinho vazio.");
            return;
        }

        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i));
        }
        System.out.println();
    }
}