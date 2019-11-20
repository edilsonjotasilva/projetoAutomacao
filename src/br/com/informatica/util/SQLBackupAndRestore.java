/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.util;

import br.com.informatica.dal.Conexao;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author edilson
 */
public class SQLBackupAndRestore extends javax.swing.JFrame {
  Connection conexao = null;
    static PreparedStatement pst = null;
    static ResultSet rs = null;
    public SQLBackupAndRestore() {
        initComponents();
        conexao = Conexao.conector;
        

    }
    String path = null;
    String filename;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButtonBackup = new javax.swing.JButton();
        jLabelBackup = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButtonRestore = new javax.swing.JButton();
        jLabelRestore = new javax.swing.JLabel();
        jButtonLocalBackup = new javax.swing.JButton();
        jButtonLocalRestore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.setEditable(false);

        jButtonBackup.setText("Backup");
        jButtonBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackupActionPerformed(evt);
            }
        });

        jLabelBackup.setText("Local");

        jTextField2.setEditable(false);

        jButtonRestore.setText("Restore");
        jButtonRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestoreActionPerformed(evt);
            }
        });

        jButtonLocalBackup.setText("Local");
        jButtonLocalBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocalBackupActionPerformed(evt);
            }
        });

        jButtonLocalRestore.setText("Local");
        jButtonLocalRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocalRestoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRestore)
                        .addGap(29, 29, 29)
                        .addComponent(jLabelRestore, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonBackup)
                            .addGap(33, 33, 33)
                            .addComponent(jLabelBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextField1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLocalBackup)
                    .addComponent(jButtonLocalRestore))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLocalBackup))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBackup)
                    .addComponent(jLabelBackup))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLocalRestore))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRestore)
                    .addComponent(jLabelRestore))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLocalBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocalBackupActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        try {
            File f = fc.getSelectedFile();
            path = f.getAbsolutePath();
            path = path.replace('\\', '/');
            path = path + "_" + date + ".sql";
            jTextField1.setText(path);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonLocalBackupActionPerformed

    private void jButtonBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackupActionPerformed
         Process p=null;
        try {
            Runtime runtime = Runtime.getRuntime();
            p=runtime.exec("C:/Program Files/MySQL/MySQL Server 8.0/bin/mysqldump.exe -uroot -padmin123 --add-drop-database -B imobiliaria -r"+path);
            
            int processComplete = p.waitFor();
            if (processComplete==0) {
                jLabelBackup.setText("Backup Criado com Sucesso");
            }else{
                jLabelBackup.setText("Backup não foi Criado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonBackupActionPerformed

    private void jButtonLocalRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocalRestoreActionPerformed
      JFileChooser fc = new JFileChooser();
      fc.showOpenDialog(this);
        try {
            File f = fc.getSelectedFile();
            path = f.getAbsolutePath();
            path = path.replace("\\", "/");
            jTextField2.setText(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonLocalRestoreActionPerformed

    private void jButtonRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestoreActionPerformed
        JOptionPane.showMessageDialog(null, "Clique em OK e aguarde a confirmação ");
       // exibeRestore();
        String dbUserName = "root";// username
        String dbPassword = "admin123";//Password
        
        String[] restoreCmd = new String[]{"C:/Program Files/MySQL/MySQL Server 8.0/bin/mysql.exe ", "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source " + path};
        Process runtimProcess;
        try {
            runtimProcess = Runtime.getRuntime().exec(restoreCmd);
            int proceCom = runtimProcess.waitFor();
            
            if (proceCom==0) {
                jLabelRestore.setText("Restauração realizada com Sucesso");
            }else{
                jLabelRestore.setText("A Restauração não pode ser Realizada");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonRestoreActionPerformed

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
            java.util.logging.Logger.getLogger(SQLBackupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SQLBackupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SQLBackupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SQLBackupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SQLBackupAndRestore().setVisible(true);
            }
        });
    }
 public  void exibeRestore(){
     jLabelRestore.setText("Restauração do backup em andamento");
       new Thread() {
            public void run() {
                int x = 100;
                int y = jLabelRestore.getLocation().y;
               
                //   int y = jLSetaBloqueio.getLocation().y;
                while (true) {
                    x--;
                    if (x < -200) {
                        x = getWidth();

                    }
                    jLabelRestore.setLocation(x, 300);
                    try {
                        sleep(10);
                    } catch (Exception e) {

                    }
                }
            }
        }.start();
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackup;
    private javax.swing.JButton jButtonLocalBackup;
    private javax.swing.JButton jButtonLocalRestore;
    private javax.swing.JButton jButtonRestore;
    private javax.swing.JLabel jLabelBackup;
    private javax.swing.JLabel jLabelRestore;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
