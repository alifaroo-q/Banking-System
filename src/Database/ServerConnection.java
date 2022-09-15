package Database;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServerConnection {

    static private Connection connection;

    public static Connection createConnection() {

        // change the variables accordingly

        String USER = "root";
        String PASS = "+++++";

        String HOST = "localhost";
        String PORT = "3306";
        String DATABASE = "bank";

        String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;

        // loading the driver

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return connection;

    }
}
