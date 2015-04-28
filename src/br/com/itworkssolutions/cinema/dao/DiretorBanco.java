package br.com.itworkssolutions.cinema.dao;

import br.com.itworkssolutions.cinema.models.Diretor;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 **@author ITWorksSolutions
 */
public class DiretorBanco {

    Thread tr = new Thread();

    //Metodo que insere o diretor no banco de dados

    /**
     *
     * @param diretor
     */
        public void save(Diretor diretor) {
        try {
            List<Diretor> Diretores = getByName(diretor);
            if (Diretores.size() > 0) {
                JOptionPane.showMessageDialog(null, "Já tem o cadastro deste diretor(a) no banco de dados!");
            } else {
                ConexaoBancoDados cbd;
                Connection connection = null;
                try {
                    cbd = new ConexaoBancoDados();
                    connection = cbd.Conecta();
                    connection.setAutoCommit(false);
                    String SQL = "INSERT INTO diretores (nomediretor) VALUES (?)";
                    PreparedStatement pstmt = connection.prepareStatement(SQL);
                    pstmt.setString(1, diretor.getNomeDiretor().toUpperCase());
                    pstmt.execute();
                    connection.commit();
                    pstmt.close();
                    JOptionPane.showMessageDialog(null, "Diretor(a): " + diretor.getNomeDiretor().toUpperCase() + " cadastrado com sucesso!");
                } catch (SQLException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar realizar o cadastro!\n\n" + e.getMessage());
                    connection.rollback();
                } finally {
                    try {
                        connection.close();
                    } catch (Exception erro) {
                        JOptionPane.showMessageDialog(null, "Erro:\n\n" + erro.getMessage());
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar o cadastro!\n\n" + ex.getMessage());
        }
    }

    /**
     *
     * @param diretor
     */
    public void update(Diretor diretor) {
        try {
            List<Diretor> Diretores = getById(diretor);
            if (Diretores.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não tem o cadastro deste diretor(a) no banco de dados!");
            } else {
                ConexaoBancoDados cbd;
                Connection connection = null;
                try {
                    cbd = new ConexaoBancoDados();
                    connection = cbd.Conecta();
                    connection.setAutoCommit(false);
                    String SQL = "UPDATE diretores SET nomediretor = ? WHERE iddiretor = ?";
                    PreparedStatement pstmt = connection.prepareStatement(SQL);
                    pstmt.setString(1, diretor.getNomeDiretor().toUpperCase());
                    pstmt.setLong(2, diretor.getIddiretor());
                    pstmt.execute();
                    connection.commit();
                    pstmt.close();
                    JOptionPane.showMessageDialog(null, "Diretor atualizado com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao tentar atualizar!\n\n" + e.getMessage());
                    connection.rollback();
                } finally {
                    try {
                        connection.close();
                    } catch (Exception erro) {
                        JOptionPane.showMessageDialog(null, "Erro:\n\n" + erro.getMessage());
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar atualizar!\n\n" + ex.getMessage());
        }
    }

    /**
     *
     * @return
     * @throws Exception
     */
    public List<Diretor> list() throws Exception {
        ConexaoBancoDados cbd;
        Connection connection = null;
        try {
            cbd = new ConexaoBancoDados();
            connection = cbd.Conecta();
            String SQL = "SELECT iddiretor, nomediretor FROM diretores";
            PreparedStatement pstmt = connection.prepareStatement(SQL);
            ResultSet rs = pstmt.executeQuery();
            List<Diretor> Diretores = new ArrayList<>();
            Diretores.clear();
            while (rs.next()) {
                Diretor dir = new Diretor();
                dir.setIddiretor(rs.getInt(1));
                dir.setNomeDiretor(rs.getString(2).toUpperCase());
                Diretores.add(dir);
            }
            rs.close();
            pstmt.close();
            connection.close();
            return Diretores;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar o diretor!\n\n" + ex.getMessage());

        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                throw new Exception(ex.getMessage());
            }
        }
        return null;
    }

    /**
     *
     * @param diretor
     * @return
     * @throws Exception
     */
    public List<Diretor> getById(Diretor diretor) throws Exception {
        ConexaoBancoDados cbd;
        Connection connection = null;
        try {
            cbd = new ConexaoBancoDados();
            connection = cbd.Conecta();
            String SQL = "SELECT iddiretor, nomediretor FROM diretores WHERE iddiretor = ?";
            PreparedStatement pstmt = connection.prepareStatement(SQL);
            pstmt.setLong(1, diretor.getIddiretor());
            ResultSet rs = pstmt.executeQuery();
            List<Diretor> Diretores = new ArrayList<>();
            Diretores.clear();
            while (rs.next()) {
                Diretor dir = new Diretor();
                dir.setIddiretor(rs.getInt(1));
                dir.setNomeDiretor(rs.getString(2).toUpperCase());
                Diretores.add(dir);
            }
            rs.close();
            pstmt.close();
            connection.close();
            return Diretores;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar o diretor!\n\n" + ex.getMessage());

        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                throw new Exception(ex.getMessage());
            }
        }
        return null;
    }

    /**
     *
     * @param diretor
     * @return
     * @throws Exception
     */
    public List<Diretor> getByName(Diretor diretor) throws Exception {
        ConexaoBancoDados cbd;
        Connection connection = null;
        try {
            cbd = new ConexaoBancoDados();
            connection = cbd.Conecta();
            String SQL = "SELECT iddiretor, nomediretor FROM diretores WHERE nomediretor like ?";
            PreparedStatement pstmt = connection.prepareStatement(SQL);
            pstmt.setString(1, "%" + diretor.getNomeDiretor().replaceAll("'", "") + "%");
            ResultSet rs = pstmt.executeQuery();
            List<Diretor> Diretores = new ArrayList<>();
            Diretores.clear();
            while (rs.next()) {
                Diretor dir = new Diretor();
                dir.setIddiretor(rs.getInt(1));
                dir.setNomeDiretor(rs.getString(2).toUpperCase());
                Diretores.add(dir);
            }
            rs.close();
            pstmt.close();
            connection.close();
            return Diretores;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar o diretor!\n\n" + ex.getMessage());

        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                throw new Exception(ex.getMessage());
            }
        }
        return null;
    }
}
