package br.com.itworkssolutions.cinema.views;

import br.com.itworkssolutions.cinema.dao.ConexaoBancoDados;
import br.com.itworkssolutions.cinema.views.diretor.DialogDiretorCadastro;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author geral
 */
public class FormMenuPrincipal extends javax.swing.JFrame {

    public FormMenuPrincipal() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Erro Nimbus!");
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemMenuCadastroDiretor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        itemMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal ITWorksCinema");
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setName("formMenuPrincipal"); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesITWorks/cadastro.png"))); // NOI18N
        jMenu1.setText("Cadastros");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        itemMenuCadastroDiretor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemMenuCadastroDiretor.setText("Diretor");
        itemMenuCadastroDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastroDiretorActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuCadastroDiretor);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesITWorks/pesquisar.png"))); // NOI18N
        jMenu2.setText("Consultas");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesITWorks/relatorios.png"))); // NOI18N
        jMenu3.setText("Relatórios");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesITWorks/sobre.png"))); // NOI18N
        jMenu4.setText("Sobre");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu4);

        itemMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesITWorks/imnSair.png"))); // NOI18N
        itemMenuSair.setText("Sair");
        itemMenuSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                itemMenuSairMousePressed(evt);
            }
        });
        jMenuBar1.add(itemMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuCadastroDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastroDiretorActionPerformed
        try {
            ConexaoBancoDados cbd = new ConexaoBancoDados();
            if (cbd.TestaConexao()) {
                DialogDiretorCadastro ddc = new DialogDiretorCadastro(this, rootPaneCheckingEnabled);
                ddc.setVisible(true);
            }
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(rootPane, "Não foi possível estabelecer conexão com o banco de dados! O sistema será finalizado!" + ex.getMessage(), "Erro conexão com o banco!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemMenuCadastroDiretorActionPerformed

    private void itemMenuSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuSairMousePressed
        int res = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair?", "Saída", JOptionPane.YES_NO_CANCEL_OPTION);

        if (res == 0) {
            System.exit(0);
        } else if (res == 1 || res == 2) {
        }
    }//GEN-LAST:event_itemMenuSairMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FormMenuPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMenuCadastroDiretor;
    private javax.swing.JMenu itemMenuSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
