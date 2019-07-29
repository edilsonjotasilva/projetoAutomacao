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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author edilson
 */
public class TelaRelatorioSaida extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String emp4dig = "0002", txtErro = "";
    Date dateIni, dateFim;

    public TelaRelatorioSaida() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        pnlRelatorioPeriodo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRelatorioGerar = new javax.swing.JButton();
        txtRelatorioDataInicial = new javax.swing.JFormattedTextField();
        txtRelatorioDataFinal = new javax.swing.JFormattedTextField();
        pnlRelatorioTotal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRelatorioTotalInicial = new javax.swing.JTextField();
        txtRelatorioTotalFinal = new javax.swing.JTextField();
        btnRelatorioTotalGerar = new javax.swing.JButton();
        btnSairRelatorioSaida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatorio de Saidas");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel1.setText("Relatório de Saidas");

        pnlRelatorioPeriodo.setBackground(new java.awt.Color(204, 255, 255));
        pnlRelatorioPeriodo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel2.setText("Relatórios Por Período");

        jLabel3.setText("Data Inicial");

        jLabel4.setText("Data Final");

        btnRelatorioGerar.setText("Gerar");
        btnRelatorioGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioGerarActionPerformed(evt);
            }
        });

        try {
            txtRelatorioDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRelatorioDataInicial.setText("  / /   ");

        try {
            txtRelatorioDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlRelatorioPeriodoLayout = new javax.swing.GroupLayout(pnlRelatorioPeriodo);
        pnlRelatorioPeriodo.setLayout(pnlRelatorioPeriodoLayout);
        pnlRelatorioPeriodoLayout.setHorizontalGroup(
            pnlRelatorioPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioPeriodoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlRelatorioPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRelatorioPeriodoLayout.createSequentialGroup()
                        .addGroup(pnlRelatorioPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRelatorioPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRelatorioGerar)
                            .addComponent(txtRelatorioDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(txtRelatorioDataFinal))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnlRelatorioPeriodoLayout.setVerticalGroup(
            pnlRelatorioPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioPeriodoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(pnlRelatorioPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRelatorioDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlRelatorioPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRelatorioDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnRelatorioGerar)
                .addGap(22, 22, 22))
        );

        pnlRelatorioTotal.setBackground(new java.awt.Color(204, 255, 255));
        pnlRelatorioTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel5.setText("Relatório Total");

        jLabel6.setText("Data Inicial");

        jLabel7.setText("Data Final");

        txtRelatorioTotalInicial.setText("01/01/2000");
        txtRelatorioTotalInicial.setEnabled(false);

        txtRelatorioTotalFinal.setText("Dia Atual");
        txtRelatorioTotalFinal.setEnabled(false);

        btnRelatorioTotalGerar.setText("Gerar");
        btnRelatorioTotalGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioTotalGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRelatorioTotalLayout = new javax.swing.GroupLayout(pnlRelatorioTotal);
        pnlRelatorioTotal.setLayout(pnlRelatorioTotalLayout);
        pnlRelatorioTotalLayout.setHorizontalGroup(
            pnlRelatorioTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioTotalLayout.createSequentialGroup()
                .addGroup(pnlRelatorioTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRelatorioTotalLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRelatorioTotalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlRelatorioTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(pnlRelatorioTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRelatorioTotalInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtRelatorioTotalFinal)
                            .addComponent(btnRelatorioTotalGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlRelatorioTotalLayout.setVerticalGroup(
            pnlRelatorioTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioTotalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(pnlRelatorioTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRelatorioTotalInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRelatorioTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRelatorioTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRelatorioTotalGerar)
                .addGap(21, 21, 21))
        );

        btnSairRelatorioSaida.setText("Sair");
        btnSairRelatorioSaida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSairRelatorioSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairRelatorioSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSairRelatorioSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRelatorioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlRelatorioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlRelatorioPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRelatorioTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnSairRelatorioSaida)
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatorioGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioGerarActionPerformed
        if (evt.getSource() == btnRelatorioGerar) {
            System.out.println("Pressionou OK . . .");
            //if (checkFields()){
            if (checkDatas(txtRelatorioDataInicial, txtRelatorioDataFinal)) {
                geraRelatorioPeriodo();
            } else {
                JOptionPane.showMessageDialog(null, "Erros Encontrados: \n" + txtErro);
            }
        }
    }//GEN-LAST:event_btnRelatorioGerarActionPerformed

    private void btnRelatorioTotalGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioTotalGerarActionPerformed
        gerarRelatorioSaidaTotal();
    }//GEN-LAST:event_btnRelatorioTotalGerarActionPerformed

    private void btnSairRelatorioSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairRelatorioSaidaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairRelatorioSaidaActionPerformed
    private boolean checkDatas(JTextField data1, JTextField data2) {
        if (data1.getText().equals("") || data2.getText().equals("")) {
            //JOptionPane.showMessageDialog(null, "As Datas Inicial e Final de "+tipo+" devem ser informadas!");
            txtErro = txtErro + "\n" + "As Datas Inicial e Final devem ser informadas!";
            return false;
        } else {
            String datastr = "";
            if (data1.getText().indexOf("/") == -1 && data1.getText().length() == 8) {
                datastr = data1.getText();
                data1.setText(datastr.substring(0, 2) + "/" + datastr.substring(2, 4) + "/" + datastr.substring(4, 8));
                datastr = "";
            }
            if (data2.getText().indexOf("/") == -1 && data2.getText().length() == 8) {
                datastr = data2.getText();
                data2.setText(datastr.substring(0, 2) + "/" + datastr.substring(2, 4) + "/" + datastr.substring(4, 8));
                datastr = "";
            }
            Date dataTst1 = null, dataTst2 = null;
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            try {
                dataTst1 = f.parse(data1.getText());
                dataTst2 = f.parse(data2.getText());
                if (dataTst2.before(dataTst1)) {
                    //JOptionPane.showMessageDialog(null, "Data Final de "+tipo+" não pode ser Menor que Data Inicial!");
                    txtErro = txtErro + "\n" + "Data Final não pode ser Menor que Data Inicial!";
                    return false;
                } else {
                    return true;
                }
            } catch (ParseException ex) {
                //JOptionPane.showMessageDialog(null, "Data de "+tipo+" no formato invalido!");
                txtErro = txtErro + "\n" + "Data de no formato invalido!";
                return false;
            }
        }
    }

    private boolean checkFields() {
        if (txtRelatorioDataInicial.getText().equals("") || txtRelatorioDataFinal.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " As Datas Inicial e Final devem ser informadas!");
            return false;
        } else {
            String datastr = "";
            Date dataTst1 = null, dataTst2 = null;
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            try {
                dataTst1 = f.parse(txtRelatorioDataInicial.getText());
                dataTst2 = f.parse(txtRelatorioDataFinal.getText());
                if (dataTst2.before(dataTst1)) {
                    JOptionPane.showMessageDialog(null, "Data Final não pode ser Menor que Data Inicial!");
                    return false;
                } else {
                    return true;
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Data no formato inválido!");
                return false;
            }
        }
    }

    private void geraRelatorioPeriodo() {
        try {
            HashMap parameterMap = new HashMap();
            //String report_dir = drive+fsep+"dados"+fsep+"empr"+emp4dig+fsep+"relatorio"+fsep;
            //  String report_dir = System.getProperty("user.dir")+fsep+"Relatorios"+fsep;
            String arquivo = "C:\\imobiliaria\\relatorios\\relatoriodesaida.jasper";
            //     String arquivo = report_dir+"areceber.jasper"; 
//JOptionPane.showMessageDialog(null, "Arquivo Jasper: "+arquivo);
            boolean retorno = true;
            if (!convertData(txtRelatorioDataInicial.getText(), 1)) {
                JOptionPane.showMessageDialog(null, "Data inválida! Data: " + txtRelatorioDataInicial.getText() + " - Formato: dd/mm/aaaa");
                retorno = false;
            }
            if (!convertData(txtRelatorioDataFinal.getText(), 2)) {
                JOptionPane.showMessageDialog(null, "Data inválida! Data: " + txtRelatorioDataFinal.getText() + " - Formato: dd/mm/aaaa");
                retorno = false;
            }
            if (retorno) {
                parameterMap.put("dataInicial", dateIni);
                parameterMap.put("dataFina", dateFim);

//                parameterMap.put("SUBREPORT_DIR", report_dir);
                //JOptionPane.showMessageDialog(null, "Data ini: "+tf_dataini.getText()+" - Data Fim: "+tf_datafim.getText()+" - Pasta: "+report_dir+" - Empresa: "+razaoEmp);
                JasperPrint jp = JasperFillManager.fillReport(arquivo, parameterMap, conexao);
                //JOptionPane.showMessageDialog(null, "Executou JasperPrint . . . ");

                //exibe o relatório com viewReport
                JasperViewer.viewReport(jp, false);
//JOptionPane.showMessageDialog(null, "Executou ViewReport . . . ");
            }
        } catch (JRException ejr) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar imprimir o relatorio.jasper. Erro(2): " + ejr);
            ejr.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Atenção!!! Não há Movimento Nesse Dia", "Atenção", 1);
        }
    }

    private boolean convertData(String data, int seq) {
        boolean retorno = true;
        int[] tabdia = new int[13];
        tabdia[1] = 31;
        tabdia[2] = 28;
        tabdia[3] = 31;
        tabdia[4] = 30;
        tabdia[5] = 31;
        tabdia[6] = 30;
        tabdia[7] = 31;
        tabdia[8] = 31;
        tabdia[9] = 30;
        tabdia[10] = 31;
        tabdia[11] = 30;
        tabdia[12] = 31;
        try {
            if (data == null || data.length() < 10) {
                retorno = false;
            } else {
                int dia = Integer.parseInt(data.substring(0, 2));
                int mes = Integer.parseInt(data.substring(3, 5));
                int ano = Integer.parseInt(data.substring(6, 10));
                if (ano < 1990 || ano > 2030) {
                    retorno = false;
                } else {
                    if (mes < 1 || mes > 12) {
                        retorno = false;
                    } else {
                        if (mes == 2 && ano % 4 == 0 && ano % 100 != 0) {
                            tabdia[2] = 29;
                        }
                        if (dia < 1 || dia > tabdia[mes]) {
                            retorno = false;
                        } else {
                            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                            if (seq == 1) {
                                dateIni = (Date) formatter.parse(data);
                            } else {
                                dateFim = (Date) formatter.parse(data);
                            }
                        }
                    }
                }
            }
        } catch (ParseException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao tentar imprimir o relatorio.jasper. Erro(1): "+ ex);
            retorno = false;
        }
        return retorno;
    }

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
            java.util.logging.Logger.getLogger(TelaRelatorioSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioSaida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelatorioGerar;
    private javax.swing.JButton btnRelatorioTotalGerar;
    private javax.swing.JButton btnSairRelatorioSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pnlRelatorioPeriodo;
    private javax.swing.JPanel pnlRelatorioTotal;
    public javax.swing.JFormattedTextField txtRelatorioDataFinal;
    public javax.swing.JFormattedTextField txtRelatorioDataInicial;
    private javax.swing.JTextField txtRelatorioTotalFinal;
    private javax.swing.JTextField txtRelatorioTotalInicial;
    // End of variables declaration//GEN-END:variables

    private void gerarRelatorioSaidaTotal() {

        //imprimindo o relatorio com o framework JasperReport
        try {
            //Usando a classe JasperPrint para preparar a impressao de um relatorio, o caminho pode ser usado '/' ou '\\'
            JasperPrint print = JasperFillManager.fillReport("C:\\imobiliaria\\relatorios\\relatorioSaidaTotal.jasper", null, conexao);
            //a linha abaixo exibe o relatorio através da classe JasperViewer
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
