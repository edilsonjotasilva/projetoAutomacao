/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.telas;

//import br.com.informatica.dal.ConexaoBanco;
import br.com.informatica.dal.Conexao;
import br.com.informatica.util.Formatador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author edilson
 */
public class TelaLoteamento extends javax.swing.JInternalFrame {

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }
    
    private static TelaPrincipal telaPrincipal;
    private static TelaLoteamento telaLoteamento;
    
    public static TelaLoteamento getInstancia(){
        if (telaLoteamento == null) {
            telaLoteamento = new TelaLoteamento();
        }
        return telaLoteamento;
    }

    public static String passarCod = null;
    PreparedStatement pst = null;
    Connection conexao = null;
    ResultSet rs = null;

    public TelaLoteamento() {
        initComponents();
        cboULoteamento.setSelectedItem("GO");
        //conexao = ConexaoBanco.conector;
        conexao = Conexao.conector;

        btnInserirLoteamento.setVisible(false);
        //  pnlMenuVendas.setVisible(false);
//        btnAlterarLoteamento.setVisible(false);
//        btnCadastrarLoteamento.setVisible(false);
//        btnExcluirLoteamento.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipalVendas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodLoteamento = new javax.swing.JTextField();
        txtCidadeLoteamento = new javax.swing.JTextField();
        txtSetorLoteamento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoteamento = new javax.swing.JTable();
        pnlMenuVendas = new javax.swing.JPanel();
        btnCadastrarLoteamento = new javax.swing.JButton();
        btnAlterarLoteamento = new javax.swing.JButton();
        btnImprimeLoteamento = new javax.swing.JButton();
        btnLimparLoteamento = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboULoteamento = new javax.swing.JComboBox<>();
        txtNomeLoteamento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPesquisarLoteamento = new javax.swing.JTextField();
        txtEstadoLoteamento = new javax.swing.JTextField();
        btnInserirLoteamento = new javax.swing.JButton();
        btnExcluirLoteamento = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Loteamento");

        pnlPrincipalVendas.setBackground(new java.awt.Color(204, 240, 240));
        pnlPrincipalVendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlPrincipalVendas.setName("Tela Loteamento"); // NOI18N

        jLabel1.setText("COD Lote");

        jLabel2.setText("Nome Lot");

        jLabel3.setText("Cidade");

        jLabel4.setText("Setor");

        jLabel6.setText("UF");

        txtCodLoteamento.setEnabled(false);

        txtSetorLoteamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetorLoteamentoActionPerformed(evt);
            }
        });

        tblLoteamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Loteamento", "Nome Loteamento", "Setor Lotea", "Cidade", "Estado", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoteamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoteamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLoteamento);

        pnlMenuVendas.setLayout(new java.awt.GridLayout(1, 0));

        btnCadastrarLoteamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/create.png"))); // NOI18N
        btnCadastrarLoteamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLoteamentoActionPerformed(evt);
            }
        });
        pnlMenuVendas.add(btnCadastrarLoteamento);

        btnAlterarLoteamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/alterar_registro.png"))); // NOI18N
        btnAlterarLoteamento.setPreferredSize(new java.awt.Dimension(97, 73));
        btnAlterarLoteamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarLoteamentoActionPerformed(evt);
            }
        });
        pnlMenuVendas.add(btnAlterarLoteamento);

        btnImprimeLoteamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/impressora2.png"))); // NOI18N
        btnImprimeLoteamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimeLoteamentoActionPerformed(evt);
            }
        });
        pnlMenuVendas.add(btnImprimeLoteamento);

        btnLimparLoteamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/clear.png"))); // NOI18N
        btnLimparLoteamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparLoteamentoActionPerformed(evt);
            }
        });
        pnlMenuVendas.add(btnLimparLoteamento);

        jLabel7.setText("Estado");

        cboULoteamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));

        jLabel9.setText("Pesquisar");

        txtPesquisarLoteamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarLoteamentoActionPerformed(evt);
            }
        });
        txtPesquisarLoteamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarLoteamentoKeyReleased(evt);
            }
        });

        txtEstadoLoteamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoLoteamentoActionPerformed(evt);
            }
        });

        btnInserirLoteamento.setBackground(new java.awt.Color(102, 102, 255));
        btnInserirLoteamento.setText("Inserir");
        btnInserirLoteamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInserirLoteamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirLoteamentoActionPerformed(evt);
            }
        });

        btnExcluirLoteamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/delete.png"))); // NOI18N
        btnExcluirLoteamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLoteamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalVendasLayout = new javax.swing.GroupLayout(pnlPrincipalVendas);
        pnlPrincipalVendas.setLayout(pnlPrincipalVendasLayout);
        pnlPrincipalVendasLayout.setHorizontalGroup(
            pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalVendasLayout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisarLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnInserirLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(485, 485, 485))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalVendasLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                                .addComponent(pnlMenuVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalVendasLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                                        .addComponent(txtCodLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSetorLoteamento))
                                    .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                                        .addComponent(txtCidadeLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstadoLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboULoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(77, 77, 77))))))
        );
        pnlPrincipalVendasLayout.setVerticalGroup(
            pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtCodLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetorLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCidadeLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(cboULoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPesquisarLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserirLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMenuVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirLoteamento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipalVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 970, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarLoteamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarLoteamentoKeyReleased
        pesquisarLoteamento();
    }//GEN-LAST:event_txtPesquisarLoteamentoKeyReleased

    private void btnExcluirLoteamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLoteamentoActionPerformed
        ExcluirLoteamento();
    }//GEN-LAST:event_btnExcluirLoteamentoActionPerformed

    private void btnAlterarLoteamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarLoteamentoActionPerformed
        //        calcularValorTotal();
        //        calcularComissaoVenda();
        alterarLoteamento();
        limparLoteamento();
    }//GEN-LAST:event_btnAlterarLoteamentoActionPerformed

    private void btnCadastrarLoteamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLoteamentoActionPerformed

        cadastrarLoteamento();
        //  cboULoteamento.setSelectedItem("5");
    }//GEN-LAST:event_btnCadastrarLoteamentoActionPerformed

    private void tblLoteamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoteamentoMouseClicked
        btnCadastrarLoteamento.setEnabled(false);
        btnAlterarLoteamento.setEnabled(true);
        btnExcluirLoteamento.setEnabled(true);
        setarCamposLoteamento();
    }//GEN-LAST:event_tblLoteamentoMouseClicked

    private void txtSetorLoteamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetorLoteamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetorLoteamentoActionPerformed

    private void txtEstadoLoteamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoLoteamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoLoteamentoActionPerformed

    private void btnLimparLoteamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparLoteamentoActionPerformed
        limparLoteamento();
    }//GEN-LAST:event_btnLimparLoteamentoActionPerformed

    private void btnInserirLoteamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirLoteamentoActionPerformed
         verificarCodLoteamento();
    }//GEN-LAST:event_btnInserirLoteamentoActionPerformed

    private void txtPesquisarLoteamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarLoteamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarLoteamentoActionPerformed

    private void btnImprimeLoteamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimeLoteamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimeLoteamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnAlterarLoteamento;
    protected javax.swing.JButton btnCadastrarLoteamento;
    protected javax.swing.JButton btnExcluirLoteamento;
    protected javax.swing.JButton btnImprimeLoteamento;
    public javax.swing.JButton btnInserirLoteamento;
    protected javax.swing.JButton btnLimparLoteamento;
    private javax.swing.JComboBox<String> cboULoteamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JPanel pnlMenuVendas;
    private javax.swing.JPanel pnlPrincipalVendas;
    private javax.swing.JTable tblLoteamento;
    private javax.swing.JTextField txtCidadeLoteamento;
    private javax.swing.JTextField txtCodLoteamento;
    private javax.swing.JTextField txtEstadoLoteamento;
    private javax.swing.JTextField txtNomeLoteamento;
    private javax.swing.JTextField txtPesquisarLoteamento;
    private javax.swing.JTextField txtSetorLoteamento;
    // End of variables declaration//GEN-END:variables

    private void cadastrarLoteamento() {
        Formatador formatador = new Formatador();
        String sql = "INSERT INTO loteamento (nomeLoteamento,setorLoteamento,cidadeLoteamento,estadoLoteamento,ufLoteamento"
                + " ) VALUES (?, ?, ?, ?, ?)";
        try {   //31450,00
            pst = conexao.prepareStatement(sql);

            pst.setString(1, txtNomeLoteamento.getText().toUpperCase());
            pst.setString(2, txtSetorLoteamento.getText().toUpperCase());
            pst.setString(3, txtCidadeLoteamento.getText().toUpperCase());
            pst.setString(4, txtEstadoLoteamento.getText().toUpperCase());
            pst.setString(5, cboULoteamento.getSelectedItem().toString());
            if (txtNomeLoteamento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Nome Loteamento é Obrigatório!");
            } else if (txtSetorLoteamento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Setor é Obrigatório!");
            } else if (txtCidadeLoteamento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Cidade prestação é Obrigatório!");

            } else if (txtEstadoLoteamento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Estadp prestação é Obrigatório!");

            } else {

                int rowsAfected = pst.executeUpdate();
                if (rowsAfected > 0) {
                    JOptionPane.showMessageDialog(null, "Loteamento cadastrada com sucesso!", "Cadastro", 1);
                    txtNomeLoteamento.setText("");
                    txtSetorLoteamento.setText("");
                    txtCidadeLoteamento.setText("");
                    txtEstadoLoteamento.setText("");
                    cboULoteamento.setSelectedItem("AC");
                    txtNomeLoteamento.requestFocus();

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void pesquisarLoteamento() {
        String sql = "select * from loteamento where nomeLoteamento LIKE ? ORDER BY nomeLoteamento";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + txtPesquisarLoteamento.getText() + "%");
            rs = pst.executeQuery();
            tblLoteamento.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void setarCamposLoteamento() {
        int setar = tblLoteamento.getSelectedRow();
        txtCodLoteamento.setText(tblLoteamento.getModel().getValueAt(setar, 0).toString());
        txtNomeLoteamento.setText(tblLoteamento.getModel().getValueAt(setar, 1).toString());
        txtSetorLoteamento.setText(tblLoteamento.getModel().getValueAt(setar, 2).toString());
        txtCidadeLoteamento.setText(tblLoteamento.getModel().getValueAt(setar, 3).toString());
        txtEstadoLoteamento.setText(tblLoteamento.getModel().getValueAt(setar, 4).toString());
        cboULoteamento.setSelectedItem(tblLoteamento.getModel().getValueAt(setar, 5).toString());

        txtPesquisarLoteamento.requestFocus();
    }

    private void alterarLoteamento() {
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a Alteracao de Loteamento? " + txtNomeLoteamento.getText(), "Atenção", JOptionPane.YES_NO_OPTION, 0);
        //se confirmar for = YES_OPTION, o comando sql será executado, se txtUsuNom.getText(),
        //for Empty significa que não ha usuario com esse ID
        if (confirma == JOptionPane.YES_OPTION) {
//            Date anoCorrente = new Date();
//            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
//            String dataFormatada = sdf.format(anoCorrente);
            String sql = "update loteamento set nomeLoteamento=?,setorLoteamento=?,cidadeLoteamento=?,estadoLoteamento=?,ufLoteamento=?"
                    + " where codLoteamento = ?";

            try {
                pst = conexao.prepareStatement(sql);

                pst.setString(1, txtNomeLoteamento.getText().toUpperCase());
                pst.setString(2, txtSetorLoteamento.getText().toUpperCase());
                pst.setString(3, txtCidadeLoteamento.getText().toUpperCase());
                pst.setString(4, txtEstadoLoteamento.getText().toUpperCase());
                pst.setString(5, cboULoteamento.getSelectedItem().toString());
                pst.setString(6, txtCodLoteamento.getText().toUpperCase());

                // validaçao dos campos obrigatórios
                if (txtNomeLoteamento.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Nome  é Obrigatório!");
                } else if (txtSetorLoteamento.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Setor Prestacao é Obrigatório!");
                } else if (txtCidadeLoteamento.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Cidade de Prestação é Obrigatório!");
                } else if (txtEstadoLoteamento.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Estado de Prestação é Obrigatório!");
                } else {
                    int rowsAfected = pst.executeUpdate();

                    if (rowsAfected > 0) {
                        JOptionPane.showMessageDialog(null, "Loteamento Alterada com Sucesso!");
                        btnCadastrarLoteamento.setEnabled(true);
                        btnAlterarLoteamento.setEnabled(false);
                        btnExcluirLoteamento.setEnabled(false);
                        // O SELECT abaixoa seta a tabela com valores vazios
                        String sql2 = "select * from loteamento where nomeLoteamento = 'XXXX' ";
                        try {
                            pst = conexao.prepareStatement(sql2);
                            rs = pst.executeQuery();
                            tblLoteamento.setModel(DbUtils.resultSetToTableModel(rs));
                            tblLoteamento.isValid();

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }

                        txtNomeLoteamento.setText("");
                        txtSetorLoteamento.setText("");
                        txtCidadeLoteamento.setText("");
                        txtEstadoLoteamento.setText("");
                        cboULoteamento.setSelectedItem("AC");

                        txtNomeLoteamento.requestFocus();

                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void ExcluirLoteamento() {
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a remoção da Loteamento? " + txtNomeLoteamento.getText(), "Atenção", JOptionPane.YES_NO_OPTION, 0);
        //se confirmar for = YES_OPTION, o comando sql será executado, se txtUsuNom.getText(),
        //for Empty significa que não ha usuario com esse ID
        if (confirma == JOptionPane.YES_OPTION) {

            String sql = "DELETE FROM loteamento WHERE codLoteamento = ?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtCodLoteamento.getText());
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Loteamento Removido com Sucesso!");
                    txtCodLoteamento.setText("");
                    txtNomeLoteamento.setText("");
                    txtSetorLoteamento.setText("");
                    txtCidadeLoteamento.setText("");
                    txtEstadoLoteamento.setText("");
                    cboULoteamento.setSelectedItem("AC");
                    txtNomeLoteamento.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void limparLoteamento() {
        btnCadastrarLoteamento.setEnabled(true);
        btnAlterarLoteamento.setEnabled(false);
        btnExcluirLoteamento.setEnabled(false);
        txtCodLoteamento.setText("");
        txtNomeLoteamento.setText("");
        txtSetorLoteamento.setText("");
        txtCidadeLoteamento.setText("");
        txtEstadoLoteamento.setText("");
        cboULoteamento.setSelectedItem("AC");
        txtNomeLoteamento.requestFocus();
        String sql2 = "select * from loteamento where nomeLoteamento = 'XXXX' ";
        try {
            pst = conexao.prepareStatement(sql2);
            rs = pst.executeQuery();
            tblLoteamento.setModel(DbUtils.resultSetToTableModel(rs));
            tblLoteamento.isValid();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void verificarCodLoteamento() {
       
        TelaImovel imovel = new TelaImovel();
        new TelaImovel().getInstancia();
        if (imovel.isVisible()) {
            imovel.toFront();
            imovel.requestFocus();
             telaPrincipal.add(TelaPrincipal.DesktopPrincipal.add(imovel));
        }

        String sql = "select * from loteamento where codLoteamento =?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCodLoteamento.getText());
            rs = pst.executeQuery();

            if (rs.next()) {

                if (rs.getString(1).equals(txtCodLoteamento.getText())) {
                    
                  //  TelaImovel imovel = new TelaImovel();
                    TelaPrincipal.DesktopPrincipal.add(imovel);
                    imovel.setVisible(true);
                    imovel.recebendoCodLoteamento(txtCodLoteamento.getText());

                    //imovel.txtCodLoteamentoImovel.setText(txtCodLoteamento.getText());
                    //    imovel.txtCodLoteamentoImovel.setText(imovel.getAccessibleContext().toString());
                    this.dispose();

//                } else if (txtCodLoteamento.getText().isEmpty()) {
//
//
                }
            } else {
                String sql2 = "INSERT INTO loteamento(nomeLoteamento,setorLoteamento,cidadeLoteamento,estadoLoteamento,"
                        + "ufLoteamento) VALUES (?, ?, ?, ?, ?)";
                try {   //31450,00
                    pst = conexao.prepareStatement(sql2);

                    pst.setString(1, txtNomeLoteamento.getText().toUpperCase());
                    pst.setString(2, txtSetorLoteamento.getText().toUpperCase());
                    pst.setString(3, txtCidadeLoteamento.getText().toUpperCase());
                    pst.setString(4, txtEstadoLoteamento.getText().toUpperCase());
                    pst.setString(5, cboULoteamento.getSelectedItem().toString());
                    if (txtNomeLoteamento.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo Nome Loteamento é Obrigatório!");
                    } else if (txtSetorLoteamento.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo Setor é Obrigatório!");
                    } else if (txtCidadeLoteamento.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo Cidade prestação é Obrigatório!");

                    } else if (txtEstadoLoteamento.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo Estadp prestação é Obrigatório!");

                    } else {

                        int rowsAfected = pst.executeUpdate();
                        // if (rowsAfected > 0) {
                        //  JOptionPane.showMessageDialog(null, "Loteamento cadastrada com sucesso!", "Cadastro", 1);
//                                txtNomeLoteamento.setText("");
//                                txtSetorLoteamento.setText("");
//                                txtCidadeLoteamento.setText("");
//                                txtEstadoLoteamento.setText("");
//                                cboULoteamento.setSelectedItem("AC");
                        // txtNomeLoteamento.requestFocus();

                        //  }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

               String sql3 = "SELECT codLoteamento FROM loteamento ORDER BY codLoteamento DESC limit 1";
        try {
            pst = conexao.prepareStatement(sql3);
            rs = pst.executeQuery();
            if (rs.next()) {
            //    TelaImovel imovel = new TelaImovel();
                TelaPrincipal.DesktopPrincipal.add(imovel);
                imovel.setVisible(true);
                imovel.recebendoCodLoteamento(rs.getString(1));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro : "+ e);
        }
            }

            JOptionPane.showMessageDialog(null, "Loteamento Inserido com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        

        this.dispose();
    }

  
}