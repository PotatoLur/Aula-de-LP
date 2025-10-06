package school.sptech;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class TesteLivraria {
    public static void main(String[] args) {
        Connection connection = new Connection();

        JdbcTemplate con = new JdbcTemplate(connection.getDataSource());

        Scanner leitor = new Scanner(System.in);

        con.execute("CREATE TABLE IF NOT EXISTS Livraria (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "nome VARCHAR(100)," +
                "preco DECIMAL(6,2)" +
                ");");

        Boolean continua = true;
        while(continua){
            System.out.println("\nEscolha uma das opções:");
            System.out.println("1) Cadastrar livro");
            System.out.println("2) Exibir livros");
            System.out.println("3) Atualizar livro");
            System.out.println("4) Remover livro");
            System.out.println("5) Buscar por nome");
            System.out.println("6) Sair\n");

            Integer opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1){
                System.out.println("Inserir nome do livro: ");
                String nome = leitor.nextLine();
                System.out.println("Inserir preço do livro: ");
                Double preco = leitor.nextDouble();

                String sqlInsert = "INSERT INTO Livraria (nome, preco) VALUES (?, ?);";
                con.update(sqlInsert, nome, preco);
            } else if (opcao == 2){
                List<Livraria> listaLivraria = con.query("SELECT * FROM Livraria;",
                        new BeanPropertyRowMapper(Livraria.class));

                System.out.println("Exibindo objetos de Livraria:");
                for (int i = 0; i < listaLivraria.size(); i++) {
                    System.out.println(listaLivraria.get(i));
                }
            } else if (opcao == 3){
                System.out.println("Inserir id do livro: ");
                Integer id = leitor.nextInt();
                leitor.nextLine();
                System.out.println("Inserir novo nome do livro: ");
                String nome = leitor.nextLine();
                System.out.println("Inserir novo preço do livro: ");
                Double preco = leitor.nextDouble();

                String sqlUpdate = "UPDATE Livraria SET nome = ?, preco = ? WHERE id = ?";
                con.update(sqlUpdate, nome, preco, id);
            } else if (opcao == 4){
                System.out.println("Inserir id do livro: ");
                Integer id = leitor.nextInt();

                String sqlDelete = "DELETE FROM Livraria WHERE id = ?";
                con.update(sqlDelete, id);
            } else if (opcao == 5){
                System.out.println("Inserir novo nome do livro: ");
                String nome = leitor.nextLine();

                String sqlSelect = "SELECT * FROM Livraria WHERE nome LIKE ?";
                String qualquerNome = "%" + nome + "%";

                List<Livraria> listaLivros = con.query("SELECT * FROM Livraria WHERE nome LIKE ?",
                        new BeanPropertyRowMapper(Livraria.class), qualquerNome);

                System.out.println("Exibindo livros:");
                for (int i = 0; i < listaLivros.size(); i++) {
                    System.out.println(listaLivros.get(i));
                }
            } else if (opcao == 6) {
                continua = false;
            } else {
                System.out.println("Inserir um valor válido.");
            }
        }
        System.out.println("Saindo...");
    }
}
