/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.dal;

import br.com.informatica.fabrica.CriarTabelas;
import br.com.informatica.telas.TelaLogin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author edilson
 */
public class Conexao {
        int cont =0;

    public static void main(String[] args) {

        leArquivoConfiguracao();
       
        

     }
    public Conexao(){
        if (cont == 0) {
           TelaLogin login = new TelaLogin();
         if (conector != null) {
            
               login.lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jsinformatica/telas/dbconnect.png")));
            } else {
                login.lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jsinformatica/telas/dberror.png")));
            } 
        }
       
        
         
    }
    

    static String host, porta, user, senha;
    static private String driver = "com.mysql.jdbc.Driver";
    static public Connection conector;
//    private boolean verificacao = false;
//    static boolean leitura = false;

    static public void leArquivoConfiguracao() {
        try {
            String linha;
            //guarda o caminho nessa variavel(ArquivoConfiguracao)
          //  String ArquivoConfiguracao = "C:/imobSys/conexao.ini";
            String ArquivoConfiguracao = "C:/windows/SABD/conexao.ini";
            int cont = 0;
            //cria o arquivo conexao.ini no caminiho apontado pela variavel (ArquivoConfiguracao)
            File arq = new File(ArquivoConfiguracao);
            // se o arquivo exite é porque o arquivo foi criado no cominho determindo
            if (arq.exists()) {
                // se o arquivo exite ele será lido e guardado na variavel (reader)
                FileReader reader = new FileReader(ArquivoConfiguracao);

                //agora ele sera colocado em uma variavel do tip buffer
                BufferedReader leitor = new BufferedReader(reader);

                while (true) {
                    // o metodo readLine(), busca sempre a proxima linha
                    linha = leitor.readLine();
                    if (cont == 0) {
                        host = (linha);

                    }
                    if (cont == 1) {
                        porta = (linha);

                    }
                    if (cont == 2) {
                        user = (linha);

                    }
                    if (cont >= 3) {
                        senha = (linha);

                        break;
                    }
                    System.out.println(linha + "\n");
                    cont++;
                }
                conexaoServidor(host, porta, user, senha);
            } else {
                JOptionPane.showMessageDialog(null, "Arquivos de configuraçao nao encontrado", "Atencao", 0);
            }
            //essa linha é apenas para mostrar ao programador os dados de conexao, o usuario não vê essa saida
            System.out.println("Dados: " + host + " " + porta + " " + user + " " + senha + " ");

        } catch (Exception erro) {

        }

    }

    static protected boolean conexaoServidor(String Servidor, String Porta, String usuario, String Senha) {

        // int cont = 0;
        boolean conectar = false;
        String SERVIDOR = Servidor;
        String PORTA_CONEXAO = Porta;
        String USUARIO = usuario;
        String SENHA = Senha;

        //  compara as variaveis acima com as variaveis que estão dentro do mysql descrito no caminho abaixo
        try {
            Class.forName(driver);
            conector = DriverManager.getConnection("jdbc:mysql://" + SERVIDOR + ":" + PORTA_CONEXAO + "",
                    USUARIO, SENHA);
            conectar = true;
        } catch (ClassNotFoundException Fonte) {
            JOptionPane.showMessageDialog(null, "Driver nao localizado");
        } catch (SQLException e) {
            // JOptionPane.showMessageDialog(null, e);
        }
        if (conectar) {
        //  verificaStatus();
            System.out.println("conexao bem sucedida");
          

            CriarTabelas criarTabelas = new CriarTabelas();
            criarTabelas.criarBanco();

            //  conectarDataBase();
        } else {
            System.out.println("conexao MAL suceddida");
            JOptionPane.showMessageDialog(null, "Não Houve Conexao com o Banco", "Erro", 0);
            JOptionPane.showMessageDialog(null, "1-Verifique usuario e senha, \n2-Verifique se o Servidor Mysql está ligado \n3-Verifique a Conexao de rede", "Mensagem", 1);
            new TelaLogin().setVisible(true);
        }
        return conectar;

    }
     private void verificaStatus(){
       
        
    }

    static public void fechaConexao() {
        try {
            conector.close();
        } catch (SQLException fech) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexao com o banco de dados" + fech);
        }
    }
    
}
