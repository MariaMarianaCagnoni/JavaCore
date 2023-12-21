package ZZIjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author mariana
 * @Project: javacore
 */
public class ConnectionFactory {


    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conectado com sucesso: " + connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
