package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class My_Connection {

    //MySql connection informations for database connection url
    private String username = "root";
    private String password = "2637";
    private String db_name;
    private String host = "localhost";
    private int port = 3306;

    //Creates a connection with a specific database
    private Connection con;

    public My_Connection(String dbname) {
        //Access to the relevant table will be provided based on dbname parameter
        this.db_name = dbname;

        //Database connection url
        //jdbc:mysql://host_name:portname/database_name
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_name;
        try {
            //JDBC interface lets Java access a database
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Throws an exception if Driver is not found
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver could not found!");

        }

        try {
            //Connects the relevant database
            con = DriverManager.getConnection(url, username, password);

            //Throws an exception if connection is fail
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection failed");
        }
    }

    //Returns con variable to use SQL queries
    public Connection getcon() {
        return con;
    }
}
