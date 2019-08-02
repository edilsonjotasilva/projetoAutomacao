/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.telas;

import br.com.informatica.dal.SwingApplication;
import com.sun.java.swing.plaf.windows.resources.windows;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author edilson
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;

    // Classe de apoio para o banco de dados
    public TelaPrincipal() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        // o codigo abaixo verifica pagamentos em atraso

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        DesktopPrincipal = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuCaixa = new javax.swing.JMenu();
        menuCaixaEntrada = new javax.swing.JMenuItem();
        menuCaixaSaida = new javax.swing.JMenuItem();
        menuCaixaCategoria = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenuItem();
        menuCorretor = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        menuAgendaAgendamento = new javax.swing.JMenuItem();
        menuAgendaRotinas = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenuItem();
        menuLoteamento = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();
        menuLogoutFechar = new javax.swing.JMenuItem();
        menuLogoutSair = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        DesktopPrincipal.setPreferredSize(new java.awt.Dimension(1008, 610));

        javax.swing.GroupLayout DesktopPrincipalLayout = new javax.swing.GroupLayout(DesktopPrincipal);
        DesktopPrincipal.setLayout(DesktopPrincipalLayout);
        DesktopPrincipalLayout.setHorizontalGroup(
            DesktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        DesktopPrincipalLayout.setVerticalGroup(
            DesktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        lblUsuario.setText("<html><u>Usuario");

        menuInicio.setText("Inicio");
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });

        menuCaixa.setText("Caixa");
        menuCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCaixaActionPerformed(evt);
            }
        });

        menuCaixaEntrada.setText("Entrada");
        menuCaixaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCaixaEntradaActionPerformed(evt);
            }
        });
        menuCaixa.add(menuCaixaEntrada);

        menuCaixaSaida.setText("Saida");
        menuCaixaSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCaixaSaidaActionPerformed(evt);
            }
        });
        menuCaixa.add(menuCaixaSaida);

        menuCaixaCategoria.setText("Categoria");
        menuCaixaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCaixaCategoriaActionPerformed(evt);
            }
        });
        menuCaixa.add(menuCaixaCategoria);

        menuInicio.add(menuCaixa);

        menuUsuarios.setText("Usuarios");
        menuUsuarios.setEnabled(false);
        menuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuariosActionPerformed(evt);
            }
        });
        menuInicio.add(menuUsuarios);

        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuInicio.add(menuCliente);

        menuCorretor.setText("Corretor");
        menuCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCorretorActionPerformed(evt);
            }
        });
        menuInicio.add(menuCorretor);

        menuAgenda.setText("Agenda");

        menuAgendaAgendamento.setText("Verificar Agendamento");
        menuAgendaAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendaAgendamentoActionPerformed(evt);
            }
        });
        menuAgenda.add(menuAgendaAgendamento);

        menuAgendaRotinas.setText("Rotinas de Agendamento");
        menuAgendaRotinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendaRotinasActionPerformed(evt);
            }
        });
        menuAgenda.add(menuAgendaRotinas);

        menuInicio.add(menuAgenda);

        menuVendas.setText("Vendas");
        menuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendasActionPerformed(evt);
            }
        });
        menuInicio.add(menuVendas);

        menuLoteamento.setText("Loteamento");
        menuLoteamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoteamentoActionPerformed(evt);
            }
        });
        menuInicio.add(menuLoteamento);

        jMenuBar1.add(menuInicio);

        menuRelatorio.setText("Relatorio");
        menuRelatorio.setEnabled(false);

        jMenuItem1.setText("Ralatorio de Saida");
        menuRelatorio.add(jMenuItem1);

        jMenuItem2.setText("Relatorio de Entrada");
        menuRelatorio.add(jMenuItem2);

        jMenuBar1.add(menuRelatorio);

        menuSobre.setText("Sobre");
        jMenuBar1.add(menuSobre);

        menuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/informatica/icones/sair.png"))); // NOI18N

        menuLogoutFechar.setText("Fechar");
        menuLogoutFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutFecharActionPerformed(evt);
            }
        });
        menuLogout.add(menuLogoutFechar);

        menuLogoutSair.setText("Sair");
        menuLogoutSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutSairActionPerformed(evt);
            }
        });
        menuLogout.add(menuLogoutSair);

        jMenuBar1.add(menuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DesktopPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1283, 699));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCaixaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCaixaEntradaActionPerformed
        new TelaEntrada().lblFormatoData.setText("Foramato da Data: Ano-Mes-Dia");
        new TelaEntrada().lblFormatoData.setVisible(true);

        cadastrarEntrada();


    }//GEN-LAST:event_menuCaixaEntradaActionPerformed

    private void menuCaixaSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCaixaSaidaActionPerformed
        new TelaSaida().lblFormatoData.setText("Foramato da Data: Ano-Mes-Dia");
        new TelaSaida().lblFormatoData.setVisible(true);

        cadastrarSaida();
    }//GEN-LAST:event_menuCaixaSaidaActionPerformed

    private void menuCaixaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCaixaCategoriaActionPerformed
        new TelaCadastroCategoria().setVisible(true);
        //  this.setVisible(false);
    }//GEN-LAST:event_menuCaixaCategoriaActionPerformed

    private void menuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuariosActionPerformed
        adicionarUsuario();
    }//GEN-LAST:event_menuUsuariosActionPerformed

    private void menuLogoutFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutFecharActionPerformed
        int fechar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Encerrar o Programa?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (fechar == JOptionPane.YES_OPTION) {
            //encerra o sistema
            System.exit(0);
        }
    }//GEN-LAST:event_menuLogoutFecharActionPerformed

    private void menuLogoutSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?",
                "Atenção", JOptionPane.YES_NO_OPTION);

        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();
            TelaLogin login = new TelaLogin();

            login.setVisible(true);
        }
    }//GEN-LAST:event_menuLogoutSairActionPerformed

    private void menuCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCaixaActionPerformed
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);

    }//GEN-LAST:event_menuCaixaActionPerformed

    private void menuAgendaRotinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendaRotinasActionPerformed

        new TelaVerificarRotinasDeAgendamento().setVisible(true);


    }//GEN-LAST:event_menuAgendaRotinasActionPerformed

    private void menuAgendaAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendaAgendamentoActionPerformed
        new TelaNewAgenda().setVisible(true);
    }//GEN-LAST:event_menuAgendaAgendamentoActionPerformed

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuInicioActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        new TelaCliente().setVisible(true);

        cadastrarCliente();
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCorretorActionPerformed
        new TelaCliente().setVisible(true);

        cadastrarCorretor();
    }//GEN-LAST:event_menuCorretorActionPerformed

    private void menuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendasActionPerformed
        new TelaVendas().setVisible(true);
        CadastrarVendas();
    }//GEN-LAST:event_menuVendasActionPerformed

    private void menuLoteamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoteamentoActionPerformed
      new TelaLoteamento().setVisible(true);
      cadastrarLoteamento();
      
    }//GEN-LAST:event_menuLoteamentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>
//   try {
//       for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//           if ("Windows".equals(info.getName())) {
//               javax.swing.UIManager.setLookAndFeel(info.getClassName());
//               break;               
//           }           
//       }
//    } 
//    catch (ClassNotFoundException ex) {
//       java.util.logging.Logger.getLogger(windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//    catch (InstantiationException ex) {
//       java.util.logging.Logger.getLogger(windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//   catch (IllegalAccessException ex) {
//       java.util.logging.Logger.getLogger(windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//       catch (javax.swing.UnsupportedLookAndFeelException ex) {
//       java.util.logging.Logger.getLogger(windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//    
        //new SwingApplication(); //Create and show the GUI.
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPrincipal;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    protected javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenuItem menuAgendaAgendamento;
    private javax.swing.JMenuItem menuAgendaRotinas;
    private javax.swing.JMenu menuCaixa;
    private javax.swing.JMenuItem menuCaixaCategoria;
    private javax.swing.JMenuItem menuCaixaEntrada;
    private javax.swing.JMenuItem menuCaixaSaida;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuCorretor;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenuItem menuLogoutFechar;
    private javax.swing.JMenuItem menuLogoutSair;
    private javax.swing.JMenuItem menuLoteamento;
    public javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSobre;
    public javax.swing.JMenuItem menuUsuarios;
    private javax.swing.JMenuItem menuVendas;
    // End of variables declaration//GEN-END:variables

    private void cadastrarEntrada() {

        TelaEntrada telaEntrada = new TelaEntrada();
        telaEntrada.btnAlterarEntrada.setEnabled(false);
        telaEntrada.btnDeletaEntrada.setEnabled(false);
        telaEntrada.setVisible(true);
        DesktopPrincipal.add(telaEntrada);
    }

    private void cadastrarSaida() {
        TelaSaida telaSaida = new TelaSaida();
        telaSaida.setVisible(true);
        DesktopPrincipal.add(telaSaida);
    }

    private void adicionarUsuario() {
        TelaUsuarios telaUsuario = new TelaUsuarios();
        telaUsuario.setVisible(true);
        DesktopPrincipal.add(telaUsuario);
    }

    private void cadastrarCliente() {

        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setVisible(true);
        DesktopPrincipal.add(telaCliente);
    }

    private void cadastrarCorretor() {
        TelaCorretor telaCorretor = new TelaCorretor();
        telaCorretor.setVisible(true);
        DesktopPrincipal.add(telaCorretor);
    }

    private void CadastrarVendas() {
        TelaVendas telaVendas = new TelaVendas();
        telaVendas.setVisible(true);
        telaVendas.btnAlterarVenda.setEnabled(false);
        telaVendas.btnExcluirVenda.setEnabled(false);
        DesktopPrincipal.add(telaVendas);
    }

    private void cadastrarLoteamento() {
      TelaLoteamento loteamento = new TelaLoteamento();
      loteamento.setVisible(true);
       DesktopPrincipal.add(loteamento);
    }

}
