package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {

    public static Connection getConnection() {
        Connection con;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/academus", "postgres", "123");
            return con;
    
        } catch (SQLException e) {
            System.out.println("//Erro ao conectar com o banco " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("//Erro na biblioteca " + ex.getMessage());
        }
        return null;

    }
}
