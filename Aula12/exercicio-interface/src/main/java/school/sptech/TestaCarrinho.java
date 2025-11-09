package school.sptech;

import java.util.Scanner;

public class TestaCarrinho {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        boolean fim = false;

        while (!fim) {
            System.out.println("1. Adicionar livro");
            System.out.println("2. Adicionar DVD");
            System.out.println("3. Adicionar Serviço");
            System.out.println("4. Exibir itens do carrinho");
            System.out.println("5. Exibir total de venda");
            System.out.println("6. Fim");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codigoLivro = leitor.nextInt();
                    System.out.print("Preço de Custo: ");
                    double precoCustoLivro = leitor.nextDouble();
                    leitor.nextLine();
                    System.out.print("Nome: ");
                    String nomeLivro = leitor.nextLine();
                    System.out.print("Autor: ");
                    String autorLivro = leitor.nextLine();
                    System.out.print("ISBN: ");
                    String isbnLivro = leitor.nextLine();

                    Livro novoLivro = new Livro(codigoLivro, precoCustoLivro, nomeLivro, autorLivro, isbnLivro);
                    carrinho.adicionaVendavel(novoLivro);
                    break;

                case 2:
                    System.out.print("Código: ");
                    int codigoDVD = leitor.nextInt();
                    System.out.print("Preço de Custo: ");
                    double precoCustoDVD = leitor.nextDouble();
                    leitor.nextLine();
                    System.out.print("Nome: ");
                    String nomeDVD = leitor.nextLine();
                    System.out.print("Gravadora: ");
                    String gravadoraDVD = leitor.nextLine();

                    DVD novoDVD = new DVD(codigoDVD, precoCustoDVD, nomeDVD, gravadoraDVD);
                    carrinho.adicionaVendavel(novoDVD);
                    break;

                case 3:
                    System.out.print("Código: ");
                    int codigoServico = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Descrição: ");
                    String descricaoServico = leitor.nextLine();
                    System.out.print("Quantidade de Horas: ");
                    int quantHoras = leitor.nextInt();
                    System.out.print("Valor da Hora: ");
                    double valorHora = leitor.nextDouble();
                    leitor.nextLine();

                    Servico novoServico = new Servico(descricaoServico, codigoServico, quantHoras, valorHora);
                    carrinho.adicionaVendavel(novoServico);
                    break;

                case 4:
                    carrinho.exibeltensCarrinho();
                    break;

                case 5:
                    double totalVenda = carrinho.calculaTotalVenda();
                    System.out.println("\nTotal de vendas = R$" + String.format("%.2f", totalVenda));
                    break;

                case 6:
                    fim = true;
                    System.out.println("\nFim.");
                    break;

                default:
                    System.out.println("Inválido.");
            }
        }

        leitor.close();
    }
}