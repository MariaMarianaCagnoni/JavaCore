package ZZIjdbc.repository;

import ZZIjdbc.conn.ConnectionFactory;
import ZZIjdbc.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author mariana
 * @Project: javacore
 */
public class ProducerRepository {

    public static void save(Producer producer) {
        String sql = "INSERT INTO anime_store.producer (name) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection()) {
            Statement statement = conn.createStatement();
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
