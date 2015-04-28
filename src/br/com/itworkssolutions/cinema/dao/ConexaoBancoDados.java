package br.com.itworkssolutions.cinema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author ITWorksSolutions
 *
 */
public class ConexaoBancoDados {

    private static final String URL = "jdbc:mysql://localhost:3306/cinema";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public Connection Conecta() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar conectar com o banco de dados!\n\n" + ex.getMessage());
            throw new SQLException(ex.getMessage());
        }
    }

    public boolean TestaConexao() throws ClassNotFoundException, UnsupportedLookAndFeelException {
        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?user=root&password=");
            return true;
        } catch (SQLException erro) {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            }
            JOptionPane.showMessageDialog(null, "Informe ao setor de TI o erro abaixo:\nO programa será finalizado!\n" + erro + "", "Erro de conexão com o banco de dados!", JOptionPane.OK_OPTION);
            return false;
        }
    }

}
