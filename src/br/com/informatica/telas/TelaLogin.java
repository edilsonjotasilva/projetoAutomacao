/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.telas;

//import br.com.informatica.dal.ConexaoBanco;
import br.com.informatica.dal.Conexao;
import static br.com.informatica.dal.Conexao.conector;
import static br.com.informatica.fabrica.CriarTabelas.inserirAdmin;
import br.com.informatica.telas.TelaPrincipal;
import static br.com.informatica.telas.TelaSaida.pst;

import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
//import static br.com.informatica.dal.ConexaoBanco.conector;

/**
 *
 * @author edilson
 */
public class TelaLogin extends javax.swing.JFrame {

    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection conexao = null;

    public TelaLogin() {

        initComponents();
        //esse codigo deve ser colocado dentro do construtor depois do initComponentes para fazer o butão login funcionar com enter
        getRootPane().setDefaultButton(btnLoginLogar);
        //conexao = ConexaoBanco.conector;
        conexao = Conexao.conector;
           if (conector != (null)) {
            
               lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/dbconnect.png")));
            } else {
                lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/dberror.png")));
            }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnLoginLogar = new javax.swing.JButton();
        txtLoginUsuario = new javax.swing.JTextField();
        txtLoginSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Senha");

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/dbConnect.png"))); // NOI18N

        btnLoginLogar.setText("Logar");
        btnLoginLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginLogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoginLogar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStatus))
                    .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLoginLogar))
                    .addComponent(lblStatus))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginLogarActionPerformed
        verificaRotinasDeAgendamento();
        
        logar();


    }//GEN-LAST:event_btnLoginLogarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lblStatus;
    private javax.swing.JPasswordField txtLoginSenha;
    private javax.swing.JTextField txtLoginUsuario;
    // End of variables declaration//GEN-END:variables
public void logar() {
     System.out.println("Conexao status3: " + conexao);
        String sql = "select * from usuarios where login=? and senha=?";
        try {
            //as linhas abaixo preparam a consulta ao banco 
            pst = Conexao.conector.prepareStatement(sql);
            pst.setString(1, txtLoginUsuario.getText());
            pst.setString(2, txtLoginSenha.getText());
            // a linha abaixo executa a pesquisa(query)
            rs = pst.executeQuery();
            if (rs.next()) {
                //a linha abaixo obtem o conteudo do campo perfil da tabela usuario
                //o numero 6 corresponde a 6° coluna da tabela usuario
                String perfil = rs.getString(6);
                // a estrutura (if,else) abaixo faz o tratamento do perfil do usuario, se o perfil for 'Admin' será exibido a tela principal e o menu relatorio será habilitado; e a label lblUsario mostrará o nome do usuario em vermelho. senão for admin, será exibido a tela principal e a label lblUsario mostrará o nome do usuario na cor preta, o menu relatorio não será habilitado
                if (perfil.equals("Admin")) {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    principal.menuRelatorio.setEnabled(true);
                    principal.menuUsuarios.setEnabled(true);

                    TelaEntrada telaEntrada = new TelaEntrada();
                    telaEntrada.txtPesquisaEntrada.setEditable(true);

//                    telaEntrada.tblEntrada.setEnabled(true);
//                    telaEntrada.panelAlteraEntrada.setEnabled(true);
                    //a linha abaixo obtem o conteudo do campo nome da tabela usuario
                    //o numero 2 corresponde a 2° coluna da tabela usuario
               
                    principal.lblUsuario.setText("<html><font color=red><u>"+rs.getString(2));
                    //linha abaixo fecha a tela de login
                    this.dispose();
                    } else {

                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    principal.lblUsuario.setText("<html><color=blue><u>"+rs.getString(2));
                    this.dispose();

                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou Senha inválido");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "um 'X' vermeho significa que você está sem conexão com o Banco");
        }
        System.out.println("Conexao status5: " + conexao);
    }
   


    private void verificaRotinasDeAgendamento() {

        try {
            String sql = "select * from verifica_agenda where codVerificaAgenda=?";
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, 1);
            rs = pst.executeQuery();
            if (rs.next()) {
           
                String status = rs.getString(2);
                 
                System.out.println("Resultado do RS: " + rs.getString(2));
            }
           
            if (rs.getString(2).equals("SIM")) {
                new TelaNewAgenda().verificaAgenda();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void verificaRotinasNoLogin(String status) {
        String STATUS = status;
        new TelaVerificarRotinasDeAgendamento().cboMudarStatus.setSelectedItem(STATUS);
    }

}
