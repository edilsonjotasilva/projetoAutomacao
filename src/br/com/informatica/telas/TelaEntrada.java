/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.telas;

//import br.com.informatica.dal.ConexaoBanco;
import br.com.informatica.dal.Conexao;
import static br.com.informatica.telas.TelaEntrada.pst;
import static br.com.informatica.telas.TelaEntrada.pst;
import static br.com.informatica.telas.TelaEntrada.pst;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
//import static br.com.informatica.dal.ConexaoBanco.conector;

/**
 *
 * @author edilson
 */
public class TelaEntrada extends javax.swing.JInternalFrame {

    static PreparedStatement pst = null;
    static ResultSet rs = null;
    Connection conexao = null;

    public TelaEntrada() {
//         try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        initComponents();
       // conexao = ConexaoBanco.conector;
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

        pnlAlteraEntrada = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisaEntrada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEntrada = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdEntrada = new javax.swing.JTextField();
        txtValorEntrada = new javax.swing.JTextField();
        txtDataEntrada = new javax.swing.JTextField();
        txtDescEntrada = new javax.swing.JTextField();
        txtCodigoEntrada = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnImprimeEntrada = new javax.swing.JButton();
        btnDeletaEntrada = new javax.swing.JButton();
        btnLimparEntrada = new javax.swing.JButton();
        btnAlterarEntrada = new javax.swing.JButton();
        btnAdicionaEntrada = new javax.swing.JButton();
        lblFormatoData = new javax.swing.JLabel();
        pnlCadastroEntrada = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCategoria_Entrada = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPesqDescEntrada = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Entradas");
        setPreferredSize(new java.awt.Dimension(851, 610));

        pnlAlteraEntrada.setBackground(new java.awt.Color(204, 240, 240));
        pnlAlteraEntrada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAlteraEntrada.setPreferredSize(new java.awt.Dimension(639, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel1.setText("Alteração de Cadastros de Entradas");

        jLabel2.setText("Pesquisar Entradas");

        txtPesquisaEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaEntradaKeyReleased(evt);
            }
        });

        tblEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEntradaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEntrada);

        javax.swing.GroupLayout pnlAlteraEntradaLayout = new javax.swing.GroupLayout(pnlAlteraEntrada);
        pnlAlteraEntrada.setLayout(pnlAlteraEntradaLayout);
        pnlAlteraEntradaLayout.setHorizontalGroup(
            pnlAlteraEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlteraEntradaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlAlteraEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAlteraEntradaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addGroup(pnlAlteraEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesquisaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlAlteraEntradaLayout.setVerticalGroup(
            pnlAlteraEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlteraEntradaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pnlAlteraEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel3.setText("Id Entrada");

        jLabel4.setText("Data Entrada");

        jLabel5.setText("Descrição Entrada");

        jLabel6.setText("Valor  Entrada");

        jLabel7.setText("Codigo Entrada");

        txtIdEntrada.setEnabled(false);

        btnImprimeEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/impressora.png"))); // NOI18N
        btnImprimeEntrada.setToolTipText("Imprimir");

        btnDeletaEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/delete.png"))); // NOI18N
        btnDeletaEntrada.setToolTipText("Deletar");
        btnDeletaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletaEntradaActionPerformed(evt);
            }
        });

        btnLimparEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/clear.png"))); // NOI18N
        btnLimparEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparEntradaActionPerformed(evt);
            }
        });

        btnAlterarEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/update.png"))); // NOI18N
        btnAlterarEntrada.setToolTipText("Alterar");
        btnAlterarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarEntradaActionPerformed(evt);
            }
        });

        btnAdicionaEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/create.png"))); // NOI18N
        btnAdicionaEntrada.setToolTipText("Adicionar");
        btnAdicionaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnImprimeEntrada)
                .addGap(0, 0, 0)
                .addComponent(btnDeletaEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarEntrada)
                .addGap(0, 0, 0)
                .addComponent(btnAdicionaEntrada))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimeEntrada)
                    .addComponent(btnDeletaEntrada)
                    .addComponent(btnLimparEntrada)
                    .addComponent(btnAlterarEntrada)
                    .addComponent(btnAdicionaEntrada))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblFormatoData.setForeground(new java.awt.Color(255, 0, 51));

        pnlCadastroEntrada.setBackground(new java.awt.Color(204, 240, 240));
        pnlCadastroEntrada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblCategoria_Entrada.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCategoria_Entrada.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblCategoria_Entrada.setEnabled(false);
        jScrollPane2.setViewportView(tblCategoria_Entrada);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel8.setText("Cadastro de Entradas");

        jLabel9.setText("Pesquisa Categia");

        txtPesqDescEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesqDescEntradaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroEntradaLayout = new javax.swing.GroupLayout(pnlCadastroEntrada);
        pnlCadastroEntrada.setLayout(pnlCadastroEntradaLayout);
        pnlCadastroEntradaLayout.setHorizontalGroup(
            pnlCadastroEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroEntradaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesqDescEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(pnlCadastroEntradaLayout.createSequentialGroup()
                .addGroup(pnlCadastroEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroEntradaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8))
                    .addGroup(pnlCadastroEntradaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCadastroEntradaLayout.setVerticalGroup(
            pnlCadastroEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroEntradaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addGroup(pnlCadastroEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPesqDescEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastroEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAlteraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFormatoData, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 374, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAlteraEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(pnlCadastroEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFormatoData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        setBounds(0, 0, 970, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaEntradaKeyReleased
        Color selecionado = new Color(200, 90, 40);
        pnlAlteraEntrada.setBackground(selecionado);
        Color naoSelecionado = new Color(204, 240, 240);
        pnlCadastroEntrada.setBackground (naoSelecionado);
        btnAdicionaEntrada.setEnabled(false);
        btnAlterarEntrada.setEnabled(true);
        btnDeletaEntrada.setEnabled(true);
        limparTabelaCategoria();
        pesquisarEntrada();
    }//GEN-LAST:event_txtPesquisaEntradaKeyReleased

    private void tblEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEntradaMouseClicked
        lblFormatoData.setText("<html><font color=orange ><b>Formato Data: Ano-Mes-Dia: Ex. 2019-01-01");
        btnAdicionaEntrada.setEnabled(false);
        btnAlterarEntrada.setEnabled(true);
      
        setarCamposEntrada();
    }//GEN-LAST:event_tblEntradaMouseClicked

    private void btnAlterarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarEntradaActionPerformed
        alterarEntrada();

    }//GEN-LAST:event_btnAlterarEntradaActionPerformed

    private void txtPesqDescEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqDescEntradaKeyReleased
        Color selecionado = new Color(200, 90, 40);
        pnlCadastroEntrada.setBackground(selecionado);
        Color naoSelecionado = new Color(204, 240, 240);
        pnlAlteraEntrada.setBackground (naoSelecionado);
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        btnAdicionaEntrada.setEnabled(true);
        btnAlterarEntrada.setEnabled(false);
        btnDeletaEntrada.setEnabled(false);
        txtIdEntrada.setText(null);
        limparTabelaEntrada();
        Date data = new Date();
        String dataAtual = sdf.format(data);
        txtDataEntrada.setText(dataAtual);
        lblFormatoData.setText("Formato Data: Ex.: 01042019");
        txtDescEntrada.setText("Entrada");
        txtCodigoEntrada.setText("10");
        pesquisarCategoria();
    }//GEN-LAST:event_txtPesqDescEntradaKeyReleased

    private void btnAdicionaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaEntradaActionPerformed
        Integer valor = Integer.parseInt(txtValorEntrada.getText());
        if (txtValorEntrada.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "O Valor da Entrada não pode ser  igual a ZERO");
           
        }else if(valor == 0){
            JOptionPane.showMessageDialog(null, "O Valor da Entrada não pode ser Nulo ");
        }else{
            adicionarEntrada();
        
        }
    }//GEN-LAST:event_btnAdicionaEntradaActionPerformed

    private void btnDeletaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletaEntradaActionPerformed
        deletarEntrada();
    }//GEN-LAST:event_btnDeletaEntradaActionPerformed

    private void btnLimparEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparEntradaActionPerformed
        Color naoSelecionado = new Color(204, 240, 240);
        pnlCadastroEntrada.setBackground (naoSelecionado);
        pnlAlteraEntrada.setBackground (naoSelecionado);
        Date data = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
       String dataAtual = sdf.format(data);
        btnAdicionaEntrada.setEnabled(true);
        btnAlterarEntrada.setEnabled(false);
        btnDeletaEntrada.setEnabled(false);
        txtValorEntrada.setText("0.00");
        txtDataEntrada.setText(dataAtual);
        txtCodigoEntrada.setText(null);
        lblFormatoData.setText("Formato Data: Ex.:01042019");
       
    }//GEN-LAST:event_btnLimparEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionaEntrada;
    protected javax.swing.JButton btnAlterarEntrada;
    protected javax.swing.JButton btnDeletaEntrada;
    private javax.swing.JButton btnImprimeEntrada;
    private javax.swing.JButton btnLimparEntrada;
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
    protected javax.swing.JPanel pnlAlteraEntrada;
    private javax.swing.JPanel pnlCadastroEntrada;
    protected javax.swing.JTable tblCategoria_Entrada;
    protected javax.swing.JTable tblEntrada;
    private javax.swing.JTextField txtCodigoEntrada;
    private javax.swing.JTextField txtDataEntrada;
    private javax.swing.JTextField txtDescEntrada;
    private javax.swing.JTextField txtIdEntrada;
    private javax.swing.JTextField txtPesqDescEntrada;
    public javax.swing.JTextField txtPesquisaEntrada;
    private javax.swing.JTextField txtValorEntrada;
    // End of variables declaration//GEN-END:variables

    private void pesquisarEntrada() {
        String sql = "select * from entrada where descEntrada LIKE ? order by idEntrada desc";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + txtPesquisaEntrada.getText() + "%");
            rs = pst.executeQuery();
            tblEntrada.setModel(DbUtils.resultSetToTableModel(rs));
            tblEntrada.isValid();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void setarCamposEntrada() {
        int setar = tblEntrada.getSelectedRow();
        txtIdEntrada.setText(tblEntrada.getModel().getValueAt(setar, 0).toString());
        txtDataEntrada.setText(tblEntrada.getModel().getValueAt(setar, 1).toString());
        txtDescEntrada.setText(tblEntrada.getModel().getValueAt(setar, 2).toString());
        txtValorEntrada.setText(tblEntrada.getModel().getValueAt(setar, 3).toString());
        txtCodigoEntrada.setText(tblEntrada.getModel().getValueAt(setar, 4).toString());
        txtPesquisaEntrada.requestFocus();
    }

    private void alterarEntrada() {
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a Alteracao da Entrada? " + txtValorEntrada.getText(), "Atenção", JOptionPane.YES_NO_OPTION);
        //se confirmar for = YES_OPTION, o comando sql será executado, se txtUsuNom.getText(),
        //for Empty significa que não ha usuario com esse ID
        if (confirma == JOptionPane.YES_OPTION) {
            Date anoCorrente = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            String dataFormatada = sdf.format(anoCorrente);
            String sql = "update Entrada set dataEntrada=?,descEntrada=?,valorEntrada=?,categoria_codCategoria=? where idEntrada=?";
            try {
                pst = conexao.prepareStatement(sql);//---- 13091968
                pst.setString(1, txtDataEntrada.getText());
                pst.setString(2, txtDescEntrada.getText());
                pst.setString(3, txtValorEntrada.getText());
                pst.setString(4, txtCodigoEntrada.getText());
                pst.setString(5, txtIdEntrada.getText());

                // validaçao dos campos obrigatórios
                if (txtDescEntrada.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Descrição é Obrigatório!");
                } else if (txtValorEntrada.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Valor Entrada é Obrigatório!");
                } else if (txtCodigoEntrada.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Cagegoria  é Obrigatório!");
                } else {
                    int rowsAfected = pst.executeUpdate();

                    if (rowsAfected > 0) {
                        JOptionPane.showMessageDialog(null, "Entrada Alterado com sucesso!", "Entrada", 1);
                        txtIdEntrada.setText(null);
                        txtDataEntrada.setText(null);
                        txtDescEntrada.setText(null);
                        txtValorEntrada.setText(null);
                        txtCodigoEntrada.setText(null);

                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

 

    private void limparTabelaEntrada() {
        String sql = "select * from entrada where descEntrada = 'xx'";
        try {
            pst = conexao.prepareStatement(sql);
            //    pst.setString(1, "%" + txtPesquisaentrada.getText() + "%");
            rs = pst.executeQuery();
            tblEntrada.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void pesquisarCategoria() {
        // String sql = "select * from categoria where descricao LIKE ? order by descricao";
        String sql = "select * from categoria where codCategoria = 10";
        try {
            pst = conexao.prepareStatement(sql);
            //    pst.setString(1, "%" + txtPesqDescEntrada.getText() + "%");
            rs = pst.executeQuery();
            tblCategoria_Entrada.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      private void setarCamposCategoria() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         int setar = tblCategoria_Entrada.getSelectedRow();
      
        txtCodigoEntrada.setText(tblCategoria_Entrada.getModel().getValueAt(setar, 0).toString());
        txtDescEntrada.setText(tblCategoria_Entrada.getModel().getValueAt(setar, 1).toString());
       
      //  txtPesquisaEntrada.requestFocus();
        
    }

    private void limparTabelaCategoria() {
        String sql = "select * from entrada where descEntrada = 'xx'";
        try {
            pst = conexao.prepareStatement(sql);
            //    pst.setString(1, "%" + txtPesquisaEntrada.getText() + "%");
            rs = pst.executeQuery();
            tblCategoria_Entrada.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void adicionarEntrada() {
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a Adição da Entrada? " + txtValorEntrada.getText(), "Atenção", JOptionPane.YES_NO_OPTION);
        //se confirmar for = YES_OPTION, o comando sql será executado, se txtUsuNom.getText(),
        //for Empty significa que não ha usuario com esse ID
        if (confirma == JOptionPane.YES_OPTION) {
        try {
            Date anoCorrente = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            String dataFormatada = sdf.format(anoCorrente);
            String sql = "INSERT INTO Entrada (dataEntrada,descEntrada,valorEntrada,categoria_codCategoria) VALUES (?, ?, ?, ?)";

            pst = conexao.prepareStatement(sql);//---- 13091968
            String dia = txtDataEntrada.getText().substring(0, 2);
            String diaAtual = dataFormatada.substring(0, 2);
            String mes = txtDataEntrada.getText().substring(2, 4);
            String mesAtual = dataFormatada.substring(2, 4);
            String ano = txtDataEntrada.getText().substring(4);
            String anoAtual = dataFormatada.substring(4);
            if (Integer.parseInt(ano) != Integer.parseInt(anoAtual) || Integer.parseInt(mes) != Integer.parseInt(mesAtual)) {
                int confirmaData = JOptionPane.showConfirmDialog(null, "Ano/Mes digitado DIFERE do Ano/Mes Atual, deseja inserir assim mesmo ? ", "Atenção", JOptionPane.YES_NO_OPTION);
                if (confirmaData == JOptionPane.YES_OPTION) {
                    String dataMysql = ano + "-" + mes + "-" + dia;
                    pst.setString(1, dataMysql);
                    pst.setString(2, txtDescEntrada.getText());
                    pst.setString(3, txtValorEntrada.getText());
                    pst.setString(4, txtCodigoEntrada.getText());
                    // validaçao dos campos obrigatórios
                    if (txtDescEntrada.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo Descrição é Obrigatório!");
                    } else if (txtValorEntrada.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo Valor Entrada é Obrigatório!");
                    } else if (txtCodigoEntrada.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo Codigo Entrada Valor (10) é Obrigatório!");
                    } else {
                        int rowsAfected = pst.executeUpdate();

                        if (rowsAfected > 0) {
                            JOptionPane.showMessageDialog(null, "Entrada cadastrada com sucesso!", "Produto", 1);
                            txtIdEntrada.setText(null);
                            txtDataEntrada.setText(null);
                            txtDescEntrada.setText(null);
                            txtValorEntrada.setText(null);
                            txtCodigoEntrada.setText(null);

                        }
                    }
                }
            } else {
                String dataMysql = ano + "-" + mes + "-" + dia;
                pst.setString(1, dataMysql);
                pst.setString(2, txtDescEntrada.getText());
                pst.setString(3, txtValorEntrada.getText());
                pst.setString(4, txtCodigoEntrada.getText());
                // validaçao dos campos obrigatórios
                if (txtDescEntrada.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Descrição é Obrigatório!");
                } else if (txtValorEntrada.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Valor Compra é Obrigatório!");
                } else if (txtCodigoEntrada.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Codigo Entrada Valor (10) é Obrigatório!");
                } else {
                    int rowsAfected = pst.executeUpdate();

                    if (rowsAfected > 0) {
                        JOptionPane.showMessageDialog(null, "Entrada cadastrada com sucesso!", "Produto", 1);
                        txtIdEntrada.setText(null);
                        txtDataEntrada.setText(null);
                        txtDescEntrada.setText(null);
                        txtValorEntrada.setText(null);
                        txtCodigoEntrada.setText(null);

                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(TelaEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    private void deletarEntrada() {
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a remoção da Entrada? " + txtValorEntrada.getText(), "Atenção", JOptionPane.YES_NO_OPTION);
        //se confirmar for = YES_OPTION, o comando sql será executado, se txtUsuNom.getText(),
        //for Empty significa que não ha usuario com esse ID
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from entrada where idEntrada = ?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtIdEntrada.getText());
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Entrada Excluida com Sucesso!");
                    txtIdEntrada.setText(null);
                    txtDataEntrada.setText(null);
                    txtDescEntrada.setText(null);
                    txtValorEntrada.setText(null);
                    txtCodigoEntrada.setText(null);
                    btnAdicionaEntrada.setEnabled(true);
                    txtPesquisaEntrada.requestFocus();
                }
            } catch (Exception e) {
            }
        }

    }
}
