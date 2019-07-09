/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.telas;

import br.com.informatica.dal.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author edilson
 */
public class TelaUsuarios extends javax.swing.JInternalFrame {

    PreparedStatement pst = null;
    Connection conexao = null;
    ResultSet rs = null;

    public TelaUsuarios() {
        initComponents();
        conexao = Conexao.conexao;
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
        txtPesquisaUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cboPerfil = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnAdicionarUsuario = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        btnLimparUsuario = new javax.swing.JButton();
        btnApagarUsuario = new javax.swing.JButton();
        btnUsuarioImprimir = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Usuario");
        setPreferredSize(new java.awt.Dimension(851, 610));

        jLabel1.setText("* Campos Obrigatórios");

        jLabel2.setText("Nome ");

        txtPesquisaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaUsuarioKeyReleased(evt);
            }
        });

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Usuario", "Nome Usuario", "Telefone", "Login", "Senha", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuario);
        if (tblUsuario.getColumnModel().getColumnCount() > 0) {
            tblUsuario.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblUsuario.getColumnModel().getColumn(1).setMinWidth(200);
            tblUsuario.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblUsuario.getColumnModel().getColumn(2).setMinWidth(20);
            tblUsuario.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblUsuario.getColumnModel().getColumn(3).setMinWidth(15);
            tblUsuario.getColumnModel().getColumn(3).setPreferredWidth(15);
            tblUsuario.getColumnModel().getColumn(4).setMinWidth(15);
            tblUsuario.getColumnModel().getColumn(4).setPreferredWidth(15);
            tblUsuario.getColumnModel().getColumn(5).setMinWidth(10);
            tblUsuario.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        jLabel3.setText("I Usuario");

        jLabel4.setText("* Nome Usuario");

        jLabel5.setText("Telefone");

        jLabel6.setText("*Senha");

        jLabel7.setText("*Login");

        jLabel8.setText("Perfil");

        txtIdUsuario.setEnabled(false);

        jLabel9.setText("* Nome Usuario");

        cboPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin\t", " ", " " }));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        btnAdicionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/create.png"))); // NOI18N
        btnAdicionarUsuario.setToolTipText("Adiciona Usuario");
        btnAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdicionarUsuario);

        btnAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/update.png"))); // NOI18N
        btnAlterarUsuario.setToolTipText("Altera Usuario");
        jPanel1.add(btnAlterarUsuario);

        btnLimparUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/clear.png"))); // NOI18N
        btnLimparUsuario.setToolTipText("Liimpa Usuario");
        jPanel1.add(btnLimparUsuario);

        btnApagarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/delete.png"))); // NOI18N
        btnApagarUsuario.setToolTipText("Deleta Usuario");
        jPanel1.add(btnApagarUsuario);

        btnUsuarioImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/impressora.png"))); // NOI18N
        btnUsuarioImprimir.setToolTipText("Relatorio Usuario");
        jPanel1.add(btnUsuarioImprimir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addGap(337, 337, 337))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNomeUsuario)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(213, 213, 213)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cboPerfil, 0, 182, Short.MAX_VALUE)
                                                .addComponent(txtLogin))))))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setBounds(0, 0, 851, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarUsuarioActionPerformed
        adcionarUsuario();
    }//GEN-LAST:event_btnAdicionarUsuarioActionPerformed

    private void txtPesquisaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaUsuarioKeyReleased
        pesquisarUsuario();
    }//GEN-LAST:event_txtPesquisaUsuarioKeyReleased

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
       setarCampos();
    }//GEN-LAST:event_tblUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarUsuario;
    private javax.swing.JButton btnAlterarUsuario;
    private javax.swing.JButton btnApagarUsuario;
    private javax.swing.JButton btnLimparUsuario;
    private javax.swing.JButton btnUsuarioImprimir;
    private javax.swing.JComboBox<String> cboPerfil;
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
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPesquisaUsuario;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void adcionarUsuario() {
         //  Connection conexao = null;
        PreparedStatement pst = null;
        String sql = "INSERT INTO usuarios (nomeUsu,telefone,login,senha,perfil) VALUES (?, ?, ?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNomeUsuario.getText());
            pst.setString(2, txtTelefone.getText());
            pst.setString(3, txtLogin.getText());
            pst.setString(4, String.valueOf(txtPassword.getPassword()));
            pst.setString(5, cboPerfil.getSelectedItem().toString());
            // validaçao dos campos obrigatórios
            if (txtNomeUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Usuario é Obrigatório!");
            } else if (txtLogin.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Login é Obrigatório!");
            } else if (txtPassword.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Senha é Obrigatório!");
            } else {
                int rowsAfected = pst.executeUpdate();

                if (rowsAfected > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Cadastro", 1);

                    txtIdUsuario.setText("");
                    txtNomeUsuario.setText("");
                    txtTelefone.setText("");
                    txtLogin.setText("");
                    txtPassword.setText("");
                    cboPerfil.setSelectedIndex(1);
                    txtIdUsuario.requestFocus();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void pesquisarUsuario() {
        String sql = "select * from usuarios where nomeUsu LIKE ? order by nomeUsu";
        try {
            //podemos colocar o Conexao.conexao aqui dentro do metodo ou dentro do construtor
            //para que o codigo seja usado por toda a classe
            pst = conexao.prepareStatement(sql);
            pst.setString(1, "%" + txtPesquisaUsuario.getText() + "%");
            rs = pst.executeQuery();
            tblUsuario.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void setarCampos() {
        int setar = tblUsuario.getSelectedRow();
        txtIdUsuario.setText(tblUsuario.getModel().getValueAt(setar, 0).toString());
        txtNomeUsuario.setText(tblUsuario.getModel().getValueAt(setar, 1).toString());
        txtTelefone.setText(tblUsuario.getModel().getValueAt(setar, 2).toString());
        txtLogin.setText(tblUsuario.getModel().getValueAt(setar, 3).toString());
        txtPassword.setText(tblUsuario.getModel().getValueAt(setar, 4).toString());
        cboPerfil.setSelectedItem(tblUsuario.getModel().getValueAt(setar, 5).toString());
//        cboInserirTipoProd.setSelectedIndex((int) tblProdutos.getModel().getValueAt(setar, 2));

        btnAdicionarUsuario.setEnabled(false);
        txtPesquisaUsuario.requestFocus();
        //  txtLucro.setText(String.valueOf(lucro));
    }
}
