/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.telas;

import br.com.informatica.dal.Conexao;
import com.lowagie.text.pdf.CMYKColor;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import sun.awt.image.PixelConverter;

/**
 *
 * @author edilson
 */
public class TelaSaida extends javax.swing.JInternalFrame {

    static PreparedStatement pst = null;
    static ResultSet rs = null;
    Connection conexao = null;
    private JFormattedTextField.AbstractFormatterFactory aff;

    public TelaSaida() {
        initComponents();
        conexao = Conexao.conector;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDescSaida = new javax.swing.JTextField();
        txtValorSaida = new javax.swing.JTextField();
        txtCodCategoriaSaida = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnAlterarSaida = new javax.swing.JButton();
        btnExcluirSaida = new javax.swing.JButton();
        btnImprimirSaida = new javax.swing.JButton();
        btnAdicionarSaida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdSaida = new javax.swing.JTextField();
        pnlAlteraSaida = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSaida = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtPesquisaSaida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblFormatoData = new javax.swing.JLabel();
        pnlCadastroSaida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategoriaSaida = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPesqDescSaida = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDataSaida = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Saidas");
        setPreferredSize(new java.awt.Dimension(851, 610));

        txtValorSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorSaidaActionPerformed(evt);
            }
        });

        txtCodCategoriaSaida.setEditable(false);

        btnAlterarSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/update.png"))); // NOI18N
        btnAlterarSaida.setToolTipText("Alterar Saida");
        btnAlterarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSaidaActionPerformed(evt);
            }
        });

        btnExcluirSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/delete.png"))); // NOI18N
        btnExcluirSaida.setToolTipText("Deletar Saida");
        btnExcluirSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirSaidaActionPerformed(evt);
            }
        });

        btnImprimirSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/impressora.png"))); // NOI18N
        btnImprimirSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirSaidaActionPerformed(evt);
            }
        });

        btnAdicionarSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/create.png"))); // NOI18N
        btnAdicionarSaida.setToolTipText("Adicionar Saida");
        btnAdicionarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnAdicionarSaida)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarSaida)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirSaida)
                .addGap(27, 27, 27)
                .addComponent(btnImprimirSaida)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarSaida)
                    .addComponent(btnExcluirSaida)
                    .addComponent(btnImprimirSaida)
                    .addComponent(btnAdicionarSaida))
                .addGap(24, 24, 24))
        );

        jLabel2.setText("<html><font color=\"red\">Data Saida</font></html>");

        jLabel3.setText("Descrição de Saida");

        jLabel4.setText("Valor da Saida");

        jLabel5.setText("Cod Categoria");

        jLabel6.setText("Id Saida");

        txtIdSaida.setEditable(false);
        txtIdSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSaidaActionPerformed(evt);
            }
        });

        pnlAlteraSaida.setBackground(new java.awt.Color(204, 240, 240));
        pnlAlteraSaida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Saida", "Data", "Descricao", "Valor", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSaida.setColumnSelectionAllowed(true);
        tblSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSaidaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSaida);
        tblSaida.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblSaida.getColumnModel().getColumnCount() > 0) {
            tblSaida.getColumnModel().getColumn(0).setMinWidth(40);
            tblSaida.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblSaida.getColumnModel().getColumn(0).setMaxWidth(60);
            tblSaida.getColumnModel().getColumn(1).setMinWidth(60);
            tblSaida.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblSaida.getColumnModel().getColumn(1).setMaxWidth(100);
            tblSaida.getColumnModel().getColumn(2).setMinWidth(250);
            tblSaida.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblSaida.getColumnModel().getColumn(2).setMaxWidth(320);
            tblSaida.getColumnModel().getColumn(3).setMinWidth(50);
            tblSaida.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblSaida.getColumnModel().getColumn(3).setMaxWidth(90);
            tblSaida.getColumnModel().getColumn(4).setMinWidth(40);
            tblSaida.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblSaida.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        jLabel7.setText("Pesquisar Saidas");

        txtPesquisaSaida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaSaidaKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel8.setText("Alteração de Cadastros de Saidas");

        javax.swing.GroupLayout pnlAlteraSaidaLayout = new javax.swing.GroupLayout(pnlAlteraSaida);
        pnlAlteraSaida.setLayout(pnlAlteraSaidaLayout);
        pnlAlteraSaidaLayout.setHorizontalGroup(
            pnlAlteraSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlteraSaidaLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlAlteraSaidaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(pnlAlteraSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtPesquisaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAlteraSaidaLayout.setVerticalGroup(
            pnlAlteraSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlteraSaidaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAlteraSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPesquisaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblFormatoData.setForeground(new java.awt.Color(255, 0, 0));

        pnlCadastroSaida.setBackground(new java.awt.Color(204, 240, 240));
        pnlCadastroSaida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblCategoriaSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Categoria", "Descricao", "Operacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategoriaSaida.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblCategoriaSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriaSaidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategoriaSaida);
        if (tblCategoriaSaida.getColumnModel().getColumnCount() > 0) {
            tblCategoriaSaida.getColumnModel().getColumn(0).setResizable(false);
            tblCategoriaSaida.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblCategoriaSaida.getColumnModel().getColumn(1).setResizable(false);
            tblCategoriaSaida.getColumnModel().getColumn(1).setPreferredWidth(70);
            tblCategoriaSaida.getColumnModel().getColumn(2).setResizable(false);
            tblCategoriaSaida.getColumnModel().getColumn(2).setPreferredWidth(15);
        }

        jLabel1.setText("Pesquisar Categoria");

        txtPesqDescSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqDescSaidaActionPerformed(evt);
            }
        });
        txtPesqDescSaida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesqDescSaidaKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel9.setText("Cadastros de Saidas");

        javax.swing.GroupLayout pnlCadastroSaidaLayout = new javax.swing.GroupLayout(pnlCadastroSaida);
        pnlCadastroSaida.setLayout(pnlCadastroSaidaLayout);
        pnlCadastroSaidaLayout.setHorizontalGroup(
            pnlCadastroSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroSaidaLayout.createSequentialGroup()
                .addGroup(pnlCadastroSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroSaidaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCadastroSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCadastroSaidaLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesqDescSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlCadastroSaidaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCadastroSaidaLayout.setVerticalGroup(
            pnlCadastroSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroSaidaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(pnlCadastroSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesqDescSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(39, 39, 39))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtValorSaida, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodCategoriaSaida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                    .addComponent(txtDescSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtIdSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(txtDataSaida))
                                        .addGap(10, 10, 10)
                                        .addComponent(lblFormatoData))))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCadastroSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlAlteraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAlteraSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCadastroSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFormatoData)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodCategoriaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 1008, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void tblCategoriaSaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriaSaidaMouseClicked
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        txtIdSaida.setText(null);
        txtDataSaida.setText(null);              
        btnAdicionarSaida.setEnabled(true);
        btnAlterarSaida.setEnabled(false);
        Date data = new Date();
        String dataAtual = sdf.format(data);
        txtDataSaida.setText(dataAtual);

        lblFormatoData.setText("Data: DDMMAAAA - Ex. 01012019");

        setarCampos();
    }//GEN-LAST:event_tblCategoriaSaidaMouseClicked

    private void btnAdicionarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarSaidaActionPerformed
        adicionarSaida();
    }//GEN-LAST:event_btnAdicionarSaidaActionPerformed

    private void btnExcluirSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirSaidaActionPerformed
        deletarSaida();
    }//GEN-LAST:event_btnExcluirSaidaActionPerformed

    private void btnAlterarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSaidaActionPerformed
        alterarSaida();
    }//GEN-LAST:event_btnAlterarSaidaActionPerformed

    private void tblSaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSaidaMouseClicked
          
        btnAdicionarSaida.setEnabled(false);
        btnAlterarSaida.setEnabled(true);
        
        setarCamposSaida();
    }//GEN-LAST:event_tblSaidaMouseClicked

    private void txtPesqDescSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqDescSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqDescSaidaActionPerformed

    private void txtPesquisaSaidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaSaidaKeyReleased
        Color selecionado = new Color(200, 90, 40);
        pnlAlteraSaida.setBackground(selecionado);
        Color naoSelecionado = new Color(204, 240, 240);
        pnlCadastroSaida.setBackground (naoSelecionado);
        btnAdicionarSaida.setEnabled(false);
        btnAlterarSaida.setEnabled(true);
        btnExcluirSaida.setEnabled(true);
        limparTabelaCategoria();
        pesquisarSaida();
    }//GEN-LAST:event_txtPesquisaSaidaKeyReleased

    private void txtPesqDescSaidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqDescSaidaKeyReleased
        Color selecionado = new Color(200, 90, 40);
        pnlCadastroSaida.setBackground (selecionado);       
        Color naoSelecionado = new Color(204, 240, 240);
         pnlAlteraSaida.setBackground(naoSelecionado);
        
        btnAdicionarSaida.setEnabled(true);
        btnAlterarSaida.setEnabled(false);
        btnExcluirSaida.setEnabled(false);
        txtIdSaida.setText(null);
        limparCampos();
        limparTabelaSaida();

        pesquisarCategoria();
    }//GEN-LAST:event_txtPesqDescSaidaKeyReleased

    private void txtValorSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorSaidaActionPerformed

    private void txtIdSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSaidaActionPerformed

    private void btnImprimirSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirSaidaActionPerformed
        new TelaRelatorioSaida().txtRelatorioDataInicial.setText("01072019");
     
       new TelaRelatorioSaida().txtRelatorioDataFinal.setText("15072019");
        new TelaRelatorioSaida().setVisible(true);
      
    }//GEN-LAST:event_btnImprimirSaidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarSaida;
    private javax.swing.JButton btnAlterarSaida;
    private javax.swing.JButton btnExcluirSaida;
    protected javax.swing.JButton btnImprimirSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblFormatoData;
    private javax.swing.JPanel pnlAlteraSaida;
    private javax.swing.JPanel pnlCadastroSaida;
    private javax.swing.JTable tblCategoriaSaida;
    private javax.swing.JTable tblSaida;
    private javax.swing.JTextField txtCodCategoriaSaida;
    private javax.swing.JTextField txtDataSaida;
    private javax.swing.JTextField txtDescSaida;
    private javax.swing.JTextField txtIdSaida;
    private javax.swing.JTextField txtPesqDescSaida;
    private javax.swing.JTextField txtPesquisaSaida;
    private javax.swing.JTextField txtValorSaida;
    // End of variables declaration//GEN-END:variables

    private void pesquisarCategoria() {

        //  String sql = "select * from categoria where descricao LIKE ? order by descricao";
        String sql = "select * from categoria  where descricao LIKE ? AND codCategoria <> 10";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + txtPesqDescSaida.getText() + "%");
            rs = pst.executeQuery();
            tblCategoriaSaida.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void setarCampos() {
        
        int setar = tblCategoriaSaida.getSelectedRow();
        txtDescSaida.setText(tblCategoriaSaida.getModel().getValueAt(setar, 1).toString());
        txtCodCategoriaSaida.setText(tblCategoriaSaida.getModel().getValueAt(setar, 0).toString());
    }

    private void adicionarSaida() {
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a Adição da Saida? " + txtValorSaida.getText(), "Atenção", JOptionPane.YES_NO_OPTION);
        //se confirmar for = YES_OPTION, o comando sql será executado, se txtUsuNom.getText(),
        //for Empty significa que não ha usuario com esse ID
        if (confirma == JOptionPane.YES_OPTION) {
            try {
                Date anoCorrente = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
                String dataFormatada = sdf.format(anoCorrente);
                String sql = "INSERT INTO saida (dataSaida,descSaida,valorSaida,categoria_codCategoria) VALUES (?, ?, ?, ?)";

                pst = conexao.prepareStatement(sql);//---- 13091968
                //pega o dia que está no campo txtDAtaSaida
                String dia = txtDataSaida.getText().substring(0, 2);
                 //pega o dia atual
                String diaAtual = dataFormatada.substring(0, 2);
                String mes = txtDataSaida.getText().substring(2, 4);
                String mesAtual = dataFormatada.substring(2, 4);
                String ano = txtDataSaida.getText().substring(4);
                String anoAtual = dataFormatada.substring(4);
                if (Integer.parseInt(ano) != Integer.parseInt(anoAtual) || Integer.parseInt(mes) != Integer.parseInt(mesAtual)) {
                    int confirmaData = JOptionPane.showConfirmDialog(null, "Ano/Mes digitado DIFERE do Ano/Mes Atual, deseja inserir assim mesmo ? ", "Atenção", JOptionPane.YES_NO_OPTION);
                    if (confirmaData == JOptionPane.YES_OPTION) {
                        //inseri a data no formato do
                        String dataMysql = ano + mes + dia;
                        pst.setString(1, dataMysql);
                        pst.setString(2, txtDescSaida.getText());
                        pst.setString(3, txtValorSaida.getText());
                        pst.setString(4, txtCodCategoriaSaida.getText());
                        // validaçao dos campos obrigatórios
                        if (txtDescSaida.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Campo Descrição é Obrigatório!");
                        } if (txtDataSaida.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Campo Descrição é Obrigatório!");
                        } else if (txtValorSaida.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Campo Valor Saida é Obrigatório!");
                        } else if (txtCodCategoriaSaida.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Campo Cagegoria  é Obrigatório!");
                        } else {
                            int rowsAfected = pst.executeUpdate();
                               //  palestra de informatica
                            if (rowsAfected > 0) {
                                JOptionPane.showMessageDialog(null, "Saida cadastrada com sucesso!", "Produto", 1);
                                txtIdSaida.setText(null);
                                txtDataSaida.setText(null);
                                txtDescSaida.setText(null);
                                txtValorSaida.setText(null);
                                txtCodCategoriaSaida.setText(null);

                            }
                        }
                    }
                } else {
                    String dataMysql = ano + "-" + mes + "-" + dia;
                    pst.setString(1, dataMysql);
                    pst.setString(2, txtDescSaida.getText());
                    pst.setString(3, txtValorSaida.getText());
                    pst.setString(4, txtCodCategoriaSaida.getText());
                    // validaçao dos campos obrigatórios
                    if (txtDescSaida.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo Descrição é Obrigatório!");
                    } else if (txtValorSaida.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo Valor Compra é Obrigatório!");
                    } else if (txtCodCategoriaSaida.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo Cagegoria  é Obrigatório!");
                    } else {
                        int rowsAfected = pst.executeUpdate();

                        if (rowsAfected > 0) {
                            JOptionPane.showMessageDialog(null, "Saida cadastrada com sucesso!", "Produto", 1);
                            txtIdSaida.setText(null);
                            txtDataSaida.setText(null);
                            txtDescSaida.setText(null);
                            txtValorSaida.setText(null);
                            txtCodCategoriaSaida.setText(null);

                        }
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(TelaSaida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void alterarSaida() {
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a Alteracao da Saida? " + txtValorSaida.getText(), "Atenção", JOptionPane.YES_NO_OPTION);
        //se confirmar for = YES_OPTION, o comando sql será executado, se txtUsuNom.getText(),
        //for Empty significa que não ha usuario com esse ID
        if (confirma == JOptionPane.YES_OPTION) {
            Date anoCorrente = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            String dataFormatada = sdf.format(anoCorrente);
            String sql = "update saida set dataSaida=?,descSaida=?,valorSaida=?,categoria_codCategoria=? where idSaida=?";
            try {
                pst = conexao.prepareStatement(sql);//---- 13091968
                pst.setString(1, txtDataSaida.getText());
                pst.setString(2, txtDescSaida.getText());
                pst.setString(3, txtValorSaida.getText());
                pst.setString(4, txtCodCategoriaSaida.getText());
                pst.setString(5, txtIdSaida.getText());

                // validaçao dos campos obrigatórios
                if (txtDescSaida.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Descrição é Obrigatório!");
                } else if (txtValorSaida.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Valor Saida é Obrigatório!");
                } else if (txtCodCategoriaSaida.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Cagegoria  é Obrigatório!");
                } else {
                    int rowsAfected = pst.executeUpdate();

                    if (rowsAfected > 0) {
                        JOptionPane.showMessageDialog(null, "Saida Alterado com sucesso!", "Saida", 1);
                        txtIdSaida.setText(null);
                        txtDataSaida.setText(null);
                        txtDescSaida.setText(null);
                        txtValorSaida.setText(null);
                        txtCodCategoriaSaida.setText(null);

                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void pesquisarSaida() {
        String sql = "select * from saida where descSaida LIKE ? order by dataSaida desc";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + txtPesquisaSaida.getText() + "%");
            rs = pst.executeQuery();
            tblSaida.setModel(DbUtils.resultSetToTableModel(rs));
            tblSaida.isValid();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void setarCamposSaida() {
        int setar = tblSaida.getSelectedRow();
        txtIdSaida.setText(tblSaida.getModel().getValueAt(setar, 0).toString());
        txtDataSaida.setText(tblSaida.getModel().getValueAt(setar, 1).toString());
        txtDescSaida.setText(tblSaida.getModel().getValueAt(setar, 2).toString());
        txtValorSaida.setText(tblSaida.getModel().getValueAt(setar, 3).toString());
        txtCodCategoriaSaida.setText(tblSaida.getModel().getValueAt(setar, 4).toString());
        txtPesquisaSaida.requestFocus();
        lblFormatoData.setText("Formato Data: Ano-Mes-Dia: Ex."+tblSaida.getModel().getValueAt(setar, 1));
    }

    private void limparTabelaCategoria() {
        String sql = "select * from saida where descSaida = 'xx'";
        try {
            pst = conexao.prepareStatement(sql);
            //    pst.setString(1, "%" + txtPesquisaSaida.getText() + "%");
            rs = pst.executeQuery();
            tblCategoriaSaida.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void limparTabelaSaida() {
        String sql = "select * from saida where descSaida = 'xx'";
        try {
            pst = conexao.prepareStatement(sql);
            //    pst.setString(1, "%" + txtPesquisaSaida.getText() + "%");
            rs = pst.executeQuery();
            tblSaida.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void deletarSaida() {
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a remoção da Saida? " + txtValorSaida.getText(), "Atenção", JOptionPane.YES_NO_OPTION);
        //se confirmar for = YES_OPTION, o comando sql será executado, se txtUsuNom.getText(),
        //for Empty significa que não ha usuario com esse ID
        if (confirma == JOptionPane.YES_OPTION) {

            String sql = "DELETE FROM saida WHERE idSaida = ?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtIdSaida.getText());
                int rowsAffected = pst.executeUpdate();
                 System.out.println("Quantidade de linhas : "+ rowsAffected);
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Saida Removido com Sucesso!");
                    txtIdSaida.setText(null);
                    txtDataSaida.setText(null);
                    txtDescSaida.setText(null);
                    txtValorSaida.setText(null);
                    txtCodCategoriaSaida.setText(null);
                    btnAdicionarSaida.setEnabled(true);
                    txtPesquisaSaida.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void limparCampos() {
        txtIdSaida.setText(null);
        txtDataSaida.setText(null);
        txtDescSaida.setText(null);
        txtValorSaida.setText(null);
        txtCodCategoriaSaida.setText(null);
    }

}
