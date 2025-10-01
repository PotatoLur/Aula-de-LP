package school.sptech;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TesteBanco {
    public static void main(String[] args) {
        Connection connection = new Connection();

        JdbcTemplate con = new JdbcTemplate(connection.getDataSource());

        con.execute("CREATE TABLE IF NOT EXISTS Time (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "nome VARCHAR(100)," +
                "qtdJogadores INT" +
                ");");

        con.execute("INSERT INTO Time (nome, qtdJogadores) VALUES" +
                "('Vasco da Gama', 20)," +
                "('Santos', 40)," +
                "('Paysandu', 100);");

        String sqlInsert = "INSERT INTO Time (nome, qtdjogadores) VALUES (?, ?);";
        con.update(sqlInsert, "Corinthians", 4);
        
        List times = con.queryForList("SELECT * FROM Time;");
        System.out.println("Exibindo o resultado do Select de times:");
        System.out.println(times);

        List<Time> listaTimes = con.query("SELECT * FROM Time;",
                new BeanPropertyRowMapper(Time.class));

        System.out.println("Exibindo objetos de Times:");
        for (int i = 0; i < listaTimes.size(); i++) {
            System.out.println(listaTimes.get(i));
        }
    }
}
