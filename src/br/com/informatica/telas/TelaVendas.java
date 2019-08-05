/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.telas;

import br.com.informatica.dal.Conexao;
import br.com.informatica.util.Formatador;
import com.mysql.jdbc.jmx.LoadBalanceConnectionGroupManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author edilson
 */
public class TelaVendas extends javax.swing.JInternalFrame {

    PreparedStatement pst = null;
    Connection conexao = null;
    ResultSet rs = null;

    public TelaVendas() {
        initComponents();
        //  Locale.setDefault(Locale.US);
        //  txtTotalVenda.setText(new DecimalFormat("#.00").format(somaTotal));
        conexao = Conexao.conector;

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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodVenda = new javax.swing.JTextField();
        txtQntPrestacaoVenda = new javax.swing.JTextField();
        txtValorPrestacaoVenda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        pnlMenuVendas = new javax.swing.JPanel();
        btnCadastrarVenda = new javax.swing.JButton();
        btnAlterarVenda = new javax.swing.JButton();
        btnExcluirVenda = new javax.swing.JButton();
        btnImprimeVenda = new javax.swing.JButton();
        btnLimparVenda = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtValorComissaoVenda = new javax.swing.JTextField();
        cboComissaoVenda = new javax.swing.JComboBox<>();
        txtTotalVenda = new javax.swing.JTextField();
        txtValorEntrada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPesquisarVenda = new javax.swing.JTextField();
        txtCodCorretor = new javax.swing.JTextField();
        btnInseriCodCorretor = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        btnInseriCodCliente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtCodImovel = new javax.swing.JTextField();
        btnInseriCodImovel = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Tela de Vendas");
        setPreferredSize(new java.awt.Dimension(851, 610));

        pnlPrincipalVendas.setBackground(new java.awt.Color(204, 240, 240));
        pnlPrincipalVendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("COD VEND");

        jLabel2.setText("Entrada");

        jLabel3.setText("Qant Prest");

        jLabel4.setText("Valor Prest");

        jLabel5.setText("Corretor");

        jLabel6.setText("Perc. %");

        txtCodVenda.setEnabled(false);

        txtValorPrestacaoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorPrestacaoVendaActionPerformed(evt);
            }
        });

        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Venda", "Valor Venda", "Valor Prest", "Qant Prest", "Corretor", "Comissão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVendas);

        pnlMenuVendas.setLayout(new java.awt.GridLayout(1, 0));

        btnCadastrarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/create.png"))); // NOI18N
        btnCadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVendaActionPerformed(evt);
            }
        });
        pnlMenuVendas.add(btnCadastrarVenda);

        btnAlterarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/alterar_registro.png"))); // NOI18N
        btnAlterarVenda.setPreferredSize(new java.awt.Dimension(97, 73));
        btnAlterarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVendaActionPerformed(evt);
            }
        });
        pnlMenuVendas.add(btnAlterarVenda);

        btnExcluirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/delete.png"))); // NOI18N
        btnExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVendaActionPerformed(evt);
            }
        });
        pnlMenuVendas.add(btnExcluirVenda);

        btnImprimeVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/impressora2.png"))); // NOI18N
        pnlMenuVendas.add(btnImprimeVenda);

        btnLimparVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/clear.png"))); // NOI18N
        pnlMenuVendas.add(btnLimparVenda);

        jLabel7.setText("Total Vendas");

        jLabel8.setText(" Comissão");

        txtValorComissaoVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorComissaoVendaFocusGained(evt);
            }
        });
        txtValorComissaoVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtValorComissaoVendaMouseClicked(evt);
            }
        });

        cboComissaoVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10\t", "12", "15", "18" }));

        txtTotalVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalVendaFocusGained(evt);
            }
        });
        txtTotalVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalVendaMouseClicked(evt);
            }
        });

        jLabel9.setText("Pesquisar");

        txtPesquisarVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarVendaKeyReleased(evt);
            }
        });

        btnInseriCodCorretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/search_client.png"))); // NOI18N
        btnInseriCodCorretor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setText("Cliente");

        btnInseriCodCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/search_client.png"))); // NOI18N
        btnInseriCodCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setText("Imóvel");

        btnInseriCodImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/search_client.png"))); // NOI18N
        btnInseriCodImovel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlPrincipalVendasLayout = new javax.swing.GroupLayout(pnlPrincipalVendas);
        pnlPrincipalVendas.setLayout(pnlPrincipalVendasLayout);
        pnlPrincipalVendasLayout.setHorizontalGroup(
            pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalVendasLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalVendasLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(614, 614, 614))
                    .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalVendasLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlMenuVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                                        .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalVendasLayout.createSequentialGroup()
                                                .addComponent(txtCodCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnInseriCodCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalVendasLayout.createSequentialGroup()
                                                .addComponent(txtCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                                                .addComponent(txtValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtValorPrestacaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnInseriCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtQntPrestacaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCodImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnInseriCodImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboComissaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorComissaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlPrincipalVendasLayout.setVerticalGroup(
            pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorPrestacaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtQntPrestacaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(txtValorComissaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboComissaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCodCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnInseriCodCorretor))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalVendasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInseriCodCliente)
                            .addComponent(btnInseriCodImovel)
                            .addGroup(pnlPrincipalVendasLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(txtCodImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(pnlPrincipalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPesquisarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(pnlMenuVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        setBounds(0, 0, 1008, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVendaActionPerformed

        calcularComissaoVenda();
        calcularValorTotal();
        cadastrarVenda();
        cboComissaoVenda.setSelectedItem("5");
    }//GEN-LAST:event_btnCadastrarVendaActionPerformed

    private void txtValorPrestacaoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorPrestacaoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorPrestacaoVendaActionPerformed

    private void txtTotalVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalVendaMouseClicked
        calcularValorTotal();
    }//GEN-LAST:event_txtTotalVendaMouseClicked

    private void txtValorComissaoVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorComissaoVendaMouseClicked
        calcularComissaoVenda();
    }//GEN-LAST:event_txtValorComissaoVendaMouseClicked

    private void txtTotalVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalVendaFocusGained
        calcularValorTotal();
    }//GEN-LAST:event_txtTotalVendaFocusGained

    private void txtValorComissaoVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorComissaoVendaFocusGained
        calcularComissaoVenda();
    }//GEN-LAST:event_txtValorComissaoVendaFocusGained

    private void txtPesquisarVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarVendaKeyReleased
        pesquisarVenda();
    }//GEN-LAST:event_txtPesquisarVendaKeyReleased

    private void btnAlterarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVendaActionPerformed
        calcularValorTotal();
        calcularComissaoVenda();
        alterarVenda();
    }//GEN-LAST:event_btnAlterarVendaActionPerformed

    private void tblVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendasMouseClicked
        btnCadastrarVenda.setEnabled(false);
        btnAlterarVenda.setEnabled(true);
        btnExcluirVenda.setEnabled(true);
        setarCampoVenda();
    }//GEN-LAST:event_tblVendasMouseClicked

    private void btnExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVendaActionPerformed
        ExcluirVenda();
    }//GEN-LAST:event_btnExcluirVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnAlterarVenda;
    protected javax.swing.JButton btnCadastrarVenda;
    protected javax.swing.JButton btnExcluirVenda;
    protected javax.swing.JButton btnImprimeVenda;
    private javax.swing.JButton btnInseriCodCliente;
    private javax.swing.JButton btnInseriCodCorretor;
    private javax.swing.JButton btnInseriCodImovel;
    protected javax.swing.JButton btnLimparVenda;
    private javax.swing.JComboBox<String> cboComissaoVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlMenuVendas;
    private javax.swing.JPanel pnlPrincipalVendas;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodCorretor;
    private javax.swing.JTextField txtCodImovel;
    private javax.swing.JTextField txtCodVenda;
    private javax.swing.JTextField txtPesquisarVenda;
    private javax.swing.JTextField txtQntPrestacaoVenda;
    private javax.swing.JTextField txtTotalVenda;
    private javax.swing.JTextField txtValorComissaoVenda;
    private javax.swing.JTextField txtValorEntrada;
    private javax.swing.JTextField txtValorPrestacaoVenda;
    // End of variables declaration//GEN-END:variables

    private void cadastrarVenda() {
        Formatador formatador = new Formatador();
        String sql = "INSERT INTO venda (valorEntrada,valorPrestacao,quantPrestacao,totalVenda,comissao,valorComissao,corretor_codCorretor,cliente_codCliente,imovel_codImovel"
                + " ) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
        try {   //31450,00
            pst = conexao.prepareStatement(sql);

            String totalVenda = txtTotalVenda.getText();//22.456,90

//            String milhar = valorEntrada.substring(0, 2);
//            String inteiro = valorEntrada.substring(3, 6);
//            String decimal = valorEntrada.substring(7);
            // String decimalPonto = decimal.replace(",", ".");
            // String valoEntradaCompleto = milhar+inteiro+decimal;
            Double valorTotalF = formatador.convertVirgulaParaPonto(txtTotalVenda.getText());
            Double valorComissaoF = formatador.convertVirgulaParaPonto(txtValorComissaoVenda.getText());
            pst.setString(1, txtValorEntrada.getText());
            pst.setString(2, txtValorPrestacaoVenda.getText());
            pst.setString(3, txtQntPrestacaoVenda.getText());
            pst.setString(4, valorTotalF.toString());
            pst.setString(5, cboComissaoVenda.getSelectedItem().toString());
            pst.setString(6, valorComissaoF.toString());
            pst.setString(7, txtCodCorretor.getText());
            pst.setString(8, txtCodCliente.getText());
            pst.setString(9, txtCodImovel.getText());
            if (txtValorEntrada.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Valor Entrada é Obrigatório!");
            } else if (txtValorPrestacaoVenda.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Valor Prestacao é Obrigatório!");
            } else if (txtQntPrestacaoVenda.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Quantidade prestação é Obrigatório!");

            } else if (txtCodCorretor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Cod Corretor é Obrigatório!");

            } else if (txtCodCliente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Cod Cliente é Obrigatório!");

            } else if (txtCodImovel.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Cod Imovel é Obrigatório!");

            } else {
                int rowsAfected = pst.executeUpdate();
                if (rowsAfected > 0) {
                    JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!", "Cadastro", 1);
                    txtValorEntrada.setText("");
                    txtValorPrestacaoVenda.setText("");
                    txtQntPrestacaoVenda.setText("");
                    txtTotalVenda.setText("");
                    txtValorComissaoVenda.setText("");
                    txtCodCorretor.setText("");
                    txtCodCliente.setText("");
                    txtCodImovel.setText("");

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void calcularValorTotal() {
        Double valorEntrada = Double.parseDouble(txtValorEntrada.getText());
        Double somaTotal = (Double.parseDouble(txtValorEntrada.getText()) + (Integer.parseInt(txtQntPrestacaoVenda.getText()) * Double.parseDouble(txtValorPrestacaoVenda.getText())));
        //txtTotalVenda.setText(new DecimalFormat("#,##0.00").format(somaTotal));
        txtTotalVenda.setText(new DecimalFormat("#.00").format(somaTotal));

    }

    private void calcularComissaoVenda() {
        Formatador formatador = new Formatador();
        Double percetualComissao = Double.parseDouble(cboComissaoVenda.getSelectedItem().toString());
        // Double valorComissao = Double.parseDouble(txtTotalVenda.getText());
        Double valorTotalVenda = formatador.convertVirgulaParaPonto(txtTotalVenda.getText());
        Double totalComissao = valorTotalVenda * (percetualComissao / 100);
        //txtTotalVenda.setText(new DecimalFormat("#,##0.00").format(somaTotal));
        txtValorComissaoVenda.setText(new DecimalFormat("#.00").format(totalComissao));
    }

    private void pesquisarVenda() {
        String sql = "select * from venda";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            tblVendas.setModel(DbUtils.resultSetToTableModel(rs));
            tblVendas.isValid();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void ExcluirVenda() {
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a remoção da Venda? " + txtCodVenda.getText(), "Atenção", JOptionPane.YES_NO_OPTION, 0);
        //se confirmar for = YES_OPTION, o comando sql será executado, se txtUsuNom.getText(),
        //for Empty significa que não ha usuario com esse ID
        if (confirma == JOptionPane.YES_OPTION) {

            String sql = "DELETE FROM venda WHERE codVenda = ?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtCodVenda.getText());
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Venda Removida com Sucesso!");
                    txtCodVenda.setText("");
                    txtValorEntrada.setText("");
                    txtValorPrestacaoVenda.setText("");
                    txtQntPrestacaoVenda.setText("");
                    cboComissaoVenda.setSelectedItem("5");
                    txtValorComissaoVenda.setText("");
                    txtCodCorretor.setText("");
                    txtCodCliente.setText("");
                    txtCodImovel.setText("");
                    txtValorEntrada.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void setarCampoVenda() {
        int setar = tblVendas.getSelectedRow();
        txtCodVenda.setText(tblVendas.getModel().getValueAt(setar, 0).toString());
        txtValorEntrada.setText(tblVendas.getModel().getValueAt(setar, 1).toString());
        txtValorPrestacaoVenda.setText(tblVendas.getModel().getValueAt(setar, 2).toString());
        txtQntPrestacaoVenda.setText(tblVendas.getModel().getValueAt(setar, 3).toString());
        txtTotalVenda.setText(tblVendas.getModel().getValueAt(setar, 4).toString());
        cboComissaoVenda.setSelectedItem(tblVendas.getModel().getValueAt(setar, 5).toString());
        txtValorComissaoVenda.setText(tblVendas.getModel().getValueAt(setar, 6).toString());
        txtCodCorretor.setText(tblVendas.getModel().getValueAt(setar, 7).toString());
        txtCodCliente.setText(tblVendas.getModel().getValueAt(setar, 8).toString());
        txtCodImovel.setText(tblVendas.getModel().getValueAt(setar, 9).toString());

        txtPesquisarVenda.requestFocus();
    }

    private void alterarVenda() {
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a Alteracao de Vendas? " + txtCodVenda.getText(), "Atenção", JOptionPane.YES_NO_OPTION, 0);
        //se confirmar for = YES_OPTION, o comando sql será executado, se txtUsuNom.getText(),
        //for Empty significa que não ha usuario com esse ID
        if (confirma == JOptionPane.YES_OPTION) {
//            Date anoCorrente = new Date();
//            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
//            String dataFormatada = sdf.format(anoCorrente);
            String sql = "update venda set valorEntrada=?,valorPrestacao=?,quantPrestacao=?,totalVenda=?,comissao=?,valorComissao=?,corretor_codCorreto=?,cliente_codCliente=?,imovel_codImovel=?"
                    + ",corretor=? where codVenda = ?";
            Formatador formatador = new Formatador();
            Double valorTotalF = formatador.convertVirgulaParaPonto(txtTotalVenda.getText());
            Double valorComissaoF = formatador.convertVirgulaParaPonto(txtValorComissaoVenda.getText());
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtValorEntrada.getText());
                pst.setString(2, txtValorPrestacaoVenda.getText());
                pst.setString(3, txtQntPrestacaoVenda.getText());
                pst.setString(4, valorTotalF.toString());
                pst.setString(5, cboComissaoVenda.getSelectedItem().toString());
                pst.setString(6, valorComissaoF.toString());
                pst.setString(7, txtCodCorretor.getText().toUpperCase());
                pst.setString(8, txtCodCliente.getText().toUpperCase());
                pst.setString(9, txtCodImovel.getText().toUpperCase());
                pst.setString(10, txtCodVenda.getText());

                // validaçao dos campos obrigatórios
                if (txtValorEntrada.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Entrada é Obrigatório!");
                } else if (txtValorPrestacaoVenda.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Valor Prestacao é Obrigatório!");
                } else if (txtQntPrestacaoVenda.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Qantidade de Prestação é Obrigatório!");
                } else {
                    int rowsAfected = pst.executeUpdate();

                    if (rowsAfected > 0) {
                        JOptionPane.showMessageDialog(null, "Venda Alterada com Sucesso!");
                        btnCadastrarVenda.setEnabled(true);
                        btnAlterarVenda.setEnabled(false);
                        btnExcluirVenda.setEnabled(false);
                        // O SELECT abaixoa seta a tabela com valores vazios
                        String sql2 = "select * from cliente where nomeCliente = 'XXXX' ";
                        try {
                            pst = conexao.prepareStatement(sql2);
                            rs = pst.executeQuery();
                            tblVendas.setModel(DbUtils.resultSetToTableModel(rs));
                            tblVendas.isValid();

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }

                        txtValorEntrada.setText("");
                        txtValorPrestacaoVenda.setText("");
                        txtQntPrestacaoVenda.setText("");
                        txtTotalVenda.setText("");
                        cboComissaoVenda.setSelectedItem("5");
                        txtValorComissaoVenda.setText("");
                        txtCodCorretor.setText("");
                        txtCodCliente.setText("");
                        txtCodImovel.setText("");
                        txtValorEntrada.requestFocus();

                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }
}
