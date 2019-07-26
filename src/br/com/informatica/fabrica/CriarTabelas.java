/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.fabrica;

//import static br.com.informatica.dal.Conexao.conectarDataBase;
import br.com.informatica.dal.Conexao;
import static br.com.informatica.dal.Conexao.conexao;
import br.com.informatica.telas.TelaLogin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CriarTabelas {

    static String driver = "com.mysql.jdbc.Driver";
    static String host, porta, user, senha;

    // esse metodo é chamado dentro do metodo conexaoServidor da classe Conexao
    //esse metodo cria o banco de dados imobiliaria
    static public boolean criarBanco() {
        boolean foiCriado = false;
        PreparedStatement pst = null;
        String sql = "create DATABASE IF NOT EXISTS imobiliaria";
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            foiCriado = true;
            String linha;
            //busca o arquivo conexao.ini no caminho especifico e guarda na variavel ArquivoConfiguracao
            String ArquivoConfiguracao = "C:/controle/conexao.ini";
            int cont = 0;
            //cria o arquivo arq e atribui a ele o arquivo conexao.ini que está armazenado em ArquivoConfiguracao
            File arq = new File(ArquivoConfiguracao);
            // se o arquivo exite é porque o arquivo foi criado no cominho determindo
            if (arq.exists()) {
                // se o arquivo exite ele será lido e guardado na variavel (reader)
                FileReader reader = new FileReader(ArquivoConfiguracao);

                //agora ele sera colocado em uma variavel do tip buffer
                BufferedReader leitor = new BufferedReader(reader);

                while (true) {
                    // o metodo readLine(), busca sempre a proxima linha a cada volta do laço while
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
              
            } else {
                JOptionPane.showMessageDialog(null, "Arquivos de configuraçao nao encontrado", "Atencao", 0);
            }
            //essa linha é apenas para mostrar ao programador os dados de conexao, o usuario não vê essa saida
            System.out.println("Dados: " + host + " " + porta + " " + user + " " + senha + " ");

        } catch (Exception erro) {

        }
        if (foiCriado) {
            //    chama o metodo conectarDataBase passndo os parametros que foram extraidos do arquivo conexao.ini atraves do laço de repetição while
            conectarDataBase(host, porta, user, senha);
        }
        return foiCriado;
    }
//metodo conectarDabaBase recebe os parametros que foram passados pelo metodo acima, se esses parametros estiverem de acordo
    // com os parametrod de criação do servidor, então a conexão será feita
    static public boolean conectarDataBase(String Servidor, String Porta, String usuario, String Senha) {
        boolean conectado = false;
        String SERVIDOR = Servidor;
        String PORTA_CONEXAO = Porta;
        String USUARIO = usuario;
        String SENHA = Senha;
        PreparedStatement pst = null;
        try {// o driver contem o driver de conexão proprio para MYSQL
            Class.forName(driver);
            // a conexao preparada será guradada na variavel conexao, e podera ser chamado de qualquer classe que queira fazer 
            //conexao com o servidor de banco
            conexao = DriverManager.getConnection("jdbc:mysql://" + SERVIDOR + ":" + PORTA_CONEXAO
                    + "/imobiliaria", USUARIO, SENHA);
            conectado = true;
        } catch (ClassNotFoundException Fonte) {
            JOptionPane.showMessageDialog(null, "Driver nao localizado");
        } catch (Exception e) {
        }
        //o if abaixo chama os metdos de criaçao das tabelas e trigges, alguns metodos são chamados dentro dos metodos que estão sendo chamados abaixo
        if (conectado) {
            
            CriarTabelas criarTabelas = new CriarTabelas();
            criarTabelas.tabelaCategoria();
            criarTabelas.tabelaEntrada();
            criarTabelas.tabelaSaida();
            criarTabelas.tabelaUsuario();
            criarTabelas.tabelaCaixa();
            criarTabelas.tabelaAgendaCompromisso();
            criarTabelas.tabelaVerificaAgenda();
            criarTabelas.verificarTriggers();

            //if tiver conectado chama a TelaLogin
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            
        }
        return conectado;
    }
//esse método foi chamado pelo metodo conectarDataBase() e depois de executado ele chamará o metdo verificaCategoria
    public boolean tabelaCategoria() {
        boolean foiCriado = false;
        PreparedStatement pst = null;
        //criar a table categoria caso ela não exista
        String sql = "CREATE TABLE IF NOT EXISTS categoria ("
                + " codCategoria int(11) NOT NULL , "
                + " descricao varchar(60) NOT NULL , "
                + " operacao varchar(45) DEFAULT NULL , "
                + " PRIMARY KEY (codCategoria) "
                + " ) ENGINE=InnoDB";

        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            foiCriado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
        }
        if (foiCriado) {
            //chama a tabela verificaCategoria()
            verificaCategoria();
        }
        return foiCriado;

    }
         //verifica a tabela verificaCategoria para ver se tem alguma linha inserida, se não tiver irá chamar o metodo inserirCategoria
     // para inserir dados na tabela
    public void verificaCategoria() {
        boolean verificado = false;
        PreparedStatement pst = null;
        ResultSet result = null;
        String sql = "SELECT * FROM categoria";
        try {
            pst = conexao.prepareStatement(sql);
            result = pst.executeQuery();
            //se não encontrou registros chama o metodo inserirCategoria()
            if (!result.next()) {
                inserirCategoria();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Conferi", 1);
        }
    }
//esse metdo inseri dados na tabela categoria
    public void inserirCategoria() {
        PreparedStatement pst = null;
        String sql = "insert into categoria(codCategoria, descricao, operacao)"
                + " VALUES('10', 'Entrada', 'ENTRADA')"
                + ",('100', 'Pagto Agua', 'SAIDA') "
                + ",('200', 'Pagto Energia', 'SAIDA') "
                + ",('300', 'Pagto Internet/Telefone', 'SAIDA') "
                + ", ('400', 'Pagto Aluguel', 'SAIDA')"
                + ", ('500', 'Supermercado', 'SAIDA')"
                + ", ('600', 'Gastos Extras', 'SAIDA')"
                + ", ('700', 'Sangria', 'SAIDA')";
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            //  atualizarAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }

    }
     private boolean tabelaAgendaCompromisso() {
         boolean foiCriado = false;
        PreparedStatement pst = null;
       String sql = "CREATE TABLE IF NOT EXISTS agendaCompromisso ("
               +" codAgenda INT NOT NULL AUTO_INCREMENT,"
               +"descAgenda VARCHAR(50) NOT NULL ,"
               +" valorAgenda DECIMAL(10,2) NULL ,"
               +" dataAgenda DATE NOT NULL,"
               +" situacaoAgenda VARCHAR(50) NOT NULL,"
               +" PRIMARY KEY (codAgenda)"
               + ")COLLATE='utf8mb4_0900_ai_ci'";
         try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            foiCriado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
        }
//        if (foiCriado) {
//            verificaCategoria();
//        }
        return foiCriado;
        }
     ////////////////////////////////////////////////////////////////////////

    //criar a tabelaEntrada caso ela não exista
    //esse metdo foi chamado pelo conectarDataBase()
        static public boolean tabelaEntrada() {
        boolean foiCriado = false;
        PreparedStatement pst = null;
        String sql = "CREATE TABLE IF NOT EXISTS entrada ("
                + " idEntrada int(11) NOT NULL AUTO_INCREMENT , "
                + " dataEntrada date NOT NULL , "
                + " descEntrada varchar(45) NOT NULL , "
                + " valorEntrada int(11) NOT NULL ,"
                + " categoria_codCategoria int(11) NOT NULL , "
                + " PRIMARY KEY (idEntrada) , "
                + " KEY fk_entrada_categoria_idx (categoria_codCategoria) , "
                + " CONSTRAINT `fk_entrada_categoria` FOREIGN KEY (categoria_codCategoria) REFERENCES categoria (codCategoria) "
                + " ) ENGINE=InnoDB";

        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            foiCriado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
        }

        return foiCriado;
    }
         //criar a tabelaSaida caso ela não exista
    //esse metdo foi chamado pelo conectarDataBase()
           static public boolean tabelaSaida() {
        boolean foiCriado = false;
        PreparedStatement pst = null;
        String sql = "  CREATE TABLE IF NOT EXISTS saida ("
                + " idSaida int(11) NOT NULL AUTO_INCREMENT, "
                + " dataSaida date DEFAULT NULL, "
                + " descSaida varchar(45) DEFAULT NULL, "
                + " valorSaida decimal(10,2) NOT NULL, "
                + "  categoria_codCategoria int(11) NOT NULL, "
                + " PRIMARY KEY (idSaida), "
                + " KEY fk_saida_categoria1_idx (categoria_codCategoria), "
                + " CONSTRAINT fk_saida_categoria1 FOREIGN KEY (categoria_codCategoria) REFERENCES categoria (codCategoria) "
                + " ) ENGINE=InnoDB";
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            foiCriado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
        }
        return foiCriado;
    }
             //criar a tabelaUsuario caso ela não exista
    //esse metdo foi chamado pelo conectarDataBase()
           //esse metodo chama o metodo verificaUsuario para ver se tem registro na table usuario
              static public boolean tabelaUsuario() {
        boolean foiCriado = false;
        PreparedStatement pst = null;
        String sql = "CREATE TABLE  IF NOT EXISTS usuarios ("
                + " idUsuario INT( 11 ) NOT NULL AUTO_INCREMENT , "
                + " nomeUsu VARCHAR( 50 ) NOT NULL , "
                + " telefone VARCHAR( 50 ) NOT NULL , "
                + " login VARCHAR( 12 ) NOT NULL , "
                + " senha VARCHAR( 12 ) NOT NULL , "
                + " perfil VARCHAR( 15 ) NOT NULL , "
                + " PRIMARY KEY ( idUsuario ) "
                + " )ENGINE=InnoDB";
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            foiCriado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
        }
        if (foiCriado) {
            //chama o metodo verificaUsuario 
           verificaUsuario();
         
        }
        return foiCriado;
    }

    //verifica a tabela usuario para ver se existe algum usuario inserido, se não tiver, chama o metodo inserirAdmin, 
              //apos inserir volta para o metodo conectarDataBase() para chamar outros metodos
    static public void verificaUsuario() {
        boolean verificado = false;
        PreparedStatement pst = null;
        ResultSet result = null;
        String sql = "SELECT * FROM usuarios";
        try {
            pst = conexao.prepareStatement(sql);
            result = pst.executeQuery();
            if (!result.next()) {
                inserirAdmin();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Conferi", 1);
        }

    }

    ////////////////////////////////////////////////////////////
    static public void inserirAdmin() {
        PreparedStatement pst = null;
        String sql = "insert into `usuarios`(`nomeUsu`,`telefone`,`login`,`senha`,`perfil`)VALUES('Administrador',99999999,'admin','admin','Admin')";
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            //  atualizarAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }
      private void tabelaCaixa() {
        PreparedStatement pst = null;
        boolean foiCriado = false;
        String sql = " CREATE TABLE IF NOT EXISTS caixa ("
                + "  idCaixa int(11) NOT NULL AUTO_INCREMENT, "
                + "  totalEntrada decimal(10,2) DEFAULT NULL, "
                + "  totalSaida decimal(10,2) DEFAULT NULL, "
                + "  saldo decimal(10,2) DEFAULT NULL, "
                + "  PRIMARY KEY (idCaixa) "
                + ") ENGINE=InnoDB";
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            foiCriado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
        }
        if (foiCriado) {
            verificaCaixa();
        }
    }

    public void verificaCaixa() {
        PreparedStatement pst = null;
        ResultSet result = null;
        String sql = "select * from caixa";
        try {
            pst = conexao.prepareStatement(sql);
            result = pst.executeQuery();
            if (!result.next()) {
                inserirCaixa();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Conferi", 1);
        }
    }

    public void inserirCaixa() {
        PreparedStatement pst = null;
        String sql = "insert into caixa(totalEntrada,totalSaida,saldo)VALUES('0','0','0')";
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            //  atualizarAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }
     ////////////////////////////////////////////////////////////////////////
        public void tabelaVerificaAgenda(){
            PreparedStatement pst = null;
            String sql = "CREATE TABLE IF NOT EXISTS verifica_agenda (" +
"  codVerificaAgenda int(11) NOT NULL," +
"  statusVerificaAgenda varchar(5) NOT NULL," +
"  PRIMARY KEY (codVerificaAgenda)" +
") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci";
             try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
        }
             inserirDadosTabelaVerificaAgenda();
        }        
        public void inserirDadosTabelaVerificaAgenda(){
            PreparedStatement pst = null;
            //o IGNORE permite que os dados seja inseridos somente se não existirem
            String sql = "INSERT IGNORE INTO `verifica_agenda` (`codVerificaAgenda`, `statusVerificaAgenda`) VALUES(1, 'SIM')";
            try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
        }
        }

    public void verificarTriggers() {

        PreparedStatement pst = null;
        ResultSet result = null;
        String sql = "SHOW triggers";
        try {
            pst = conexao.prepareStatement(sql);
            result = pst.executeQuery();
            if (!result.next()) {
                criarTriggersEntradaInsert();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }

    public void criarTriggersEntradaInsert() {
        boolean foiCriado = false;
        PreparedStatement pst = null;
        String sql = "CREATE TRIGGER `atualizaCxEntradaInsert` BEFORE INSERT ON `entrada` FOR EACH ROW BEGIN\n"
                + "update caixa set totalEntrada = totalEntrada + new.valorEntrada;\n"
                + "update caixa set saldo = totalEntrada - totalSaida;\n"
                + "END";
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            //  atualizarAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
        foiCriado = true;
        if (foiCriado) {
            criarTriggersEntradaUpdate();
        }

    }

    private void criarTriggersEntradaUpdate() {
        boolean foiCriado = false;
        PreparedStatement pst = null;
        String sql = "CREATE TRIGGER `atualizaCxEntradaUpdate` AFTER UPDATE ON `entrada` FOR EACH ROW BEGIN\n"
                + "if new.valorEntrada <> old.valorEntrada then \n"
                + "update caixa set totalEntrada = totalEntrada + (new.valorEntrada - old.valorEntrada);\n"
                + "update caixa set saldo = totalEntrada - totalSaida;\n"
                + "end if;\n"
                + "END";
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            //  atualizarAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
        foiCriado = true;
        if (foiCriado) {
            criarTriggersSaidaInsert();
        }

    }

    public void criarTriggersSaidaInsert() {
        boolean foiCriado = false;
        PreparedStatement pst = null;
        String sql = "CREATE TRIGGER `atualizaCxSaidaInsert` BEFORE INSERT ON `saida` FOR EACH ROW BEGIN\n"
                + "update caixa set totalSaida = totalSaida + new.valorSaida;\n"
                + "update caixa set saldo = totalEntrada - totalSaida;\n"
                + "END";
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            //  atualizarAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
        foiCriado = true;
        if (foiCriado) {
            criarTriggersSaidaUpdate();
        }
    }

    public void criarTriggersSaidaUpdate() {

        PreparedStatement pst = null;
        String sql = "CREATE TRIGGER `atualizaCxSaidaUpdate` BEFORE UPDATE ON `saida` FOR EACH ROW BEGIN\n"
                + "if new.valorSaida <> old.valorSaida then \n"
                + "update caixa set totalSaida = totalSaida + (new.valorSaida - old.valorSaida);\n"
                + "update caixa set saldo = totalEntrada - totalSaida;\n"
                + "end if;\n"
                + "END";
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            //  atualizarAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }

    }

   
}
