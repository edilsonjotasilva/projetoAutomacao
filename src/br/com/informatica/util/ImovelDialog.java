/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.util;


import br.com.informatica.dal.Conexao;
import br.com.informatica.telas.TelaImovel;
import br.com.informatica.telas.TelaImovel;
import br.com.informatica.telas.TelaLoteamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author edilson
 */
public class ImovelDialog extends javax.swing.JDialog {

    public static TelaImovel imovel;
    String codigo;
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public ImovelDialog(TelaImovel parent, boolean modal) {
        // super(parent, modal);
        this.imovel = parent;
        this.setModal(modal);
        initComponents();
        conexao = Conexao.conector;
    }

    public String getCodigo() {
        return codigo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jBnFechar = new javax.swing.JButton();
        jBnInserir = new javax.swing.JButton();
        txtPesquisarImovel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblImovel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa Imovel");
        setPreferredSize(new java.awt.Dimension(970, 610));

        jPanel1.setBackground(new java.awt.Color(204, 240, 240));
        jPanel1.setAlignmentX(5.0F);
        jPanel1.setAlignmentY(50.0F);
        jPanel1.setAutoscrolls(true);
        jPanel1.setName("Pesquisa Loteamento"); // NOI18N

        jLabel9.setText("Pesquisar");

        jBnFechar.setBackground(new java.awt.Color(204, 240, 240));
        jBnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/fechar2.png"))); // NOI18N
        jBnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnFecharActionPerformed(evt);
            }
        });

        jBnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/inserir.png"))); // NOI18N
        jBnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnInserirActionPerformed(evt);
            }
        });

        txtPesquisarImovel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarImovelKeyReleased(evt);
            }
        });

        tblImovel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Imovel", "Quadra", "Lote", "Num", "Rua", "CEP", "Tipo", "Metrag", "Situacao", "Cod Loteament"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblImovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblImovelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblImovel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(txtPesquisarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jBnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(72, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(825, 825, 825)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(394, 394, 394)
                    .addComponent(jLabel9)
                    .addContainerGap(85, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(8, 50, 975, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void jBnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBnFecharActionPerformed

    private void jBnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnInserirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBnInserirActionPerformed

    private void txtPesquisarImovelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarImovelKeyReleased
        pesquisarImovel();
    }//GEN-LAST:event_txtPesquisarImovelKeyReleased

    private void tblImovelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblImovelMouseClicked
        //        btnCadastrarVenda.setEnabled(false);
        //        btnAlterarVenda.setEnabled(true);
        //        btnExcluirVenda.setEnabled(true);
        //        setarCampoVenda();
        int setar = tblImovel.getSelectedRow();
        if ((tblImovel.getModel().getValueAt(setar, 8).toString()).equals("VENDIDO")) {
            JOptionPane.showMessageDialog(null, "Este Lote já foi Vendido! ", "Atencão", 0);
        } else {
            codigo = (tblImovel.getModel().getValueAt(setar, 0).toString());
        }
    }//GEN-LAST:event_tblImovelMouseClicked

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
            java.util.logging.Logger.getLogger(ImovelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImovelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImovelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImovelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ImovelDialog dialogimovel = new ImovelDialog(imovel, true);
                dialogimovel.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialogimovel.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnFechar;
    private javax.swing.JButton jBnInserir;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblImovel;
    private javax.swing.JTextField txtPesquisarImovel;
    // End of variables declaration//GEN-END:variables

    private void pesquisarImovel() {
        String sql = "select * from imovel where codImovel LIKE ? ORDER BY codImovel";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + txtPesquisarImovel.getText() + "%");
            rs = pst.executeQuery();
            tblImovel.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}