/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.informatica.fabrica;

//import static br.com.informatica.dal.Conexao.conectarDataBase;
//import br.com.informatica.dal.ConexaoBanco;
import br.com.informatica.dal.Conexao;
import static br.com.informatica.dal.Conexao.conector;
import br.com.informatica.telas.TelaLogin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import static br.com.informatica.dal.ConexaoBanco.conexao;

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
            pst = conector.prepareStatement(sql);
            pst.execute();
            foiCriado = true;
            String linha;
            //busca o arquivo conexao.ini no caminho especifico e guarda na variavel ArquivoConfiguracao
            //  String ArquivoConfiguracao = "C:/imobSys/conexao.ini";
            String ArquivoConfiguracao = "C:/windows/SABD/conector.ini";
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
       //       JOptionPane.showMessageDialog(null, "Banco Imobiliaria criado com sucesso!");
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
            conector = DriverManager.getConnection("jdbc:mysql://" + SERVIDOR + ":" + PORTA_CONEXAO
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
            
            criarTabelas.tabelaCorretor();
            
            criarTabelas.tablelaCliente();
            criarTabelas.tabelaLoteamento();
            criarTabelas.tablelaImovel();
           criarTabelas.tablelaVenda();
         
            criarTabelas.tabelaVerificaAgenda();
            criarTabelas.verificarTriggers();
            criarTabelas.lbsy();
            criarTabelas.boleto();
            criarTabelas.feriados();
           

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
                + " ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";

        try {
            pst = conector.prepareStatement(sql);
            pst.execute();
            foiCriado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
        }
        if (foiCriado) {
      //        JOptionPane.showMessageDialog(null, "Tabela Categoria criada com sucesso criado com sucesso!");
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
            pst = conector.prepareStatement(sql);
            result = pst.executeQuery();
            //se não encontrou registros chama o metodo inserirCategoria()
            if (!result.next()) {
         //         JOptionPane.showMessageDialog(null, "Tabela categoria verificada!");
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
     //     JOptionPane.showMessageDialog(null, "Categoria de Pagamentos inseridas com sucesso");
   
        try {
            pst = conector.prepareStatement(sql);
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
                + " codAgenda INT NOT NULL AUTO_INCREMENT,"
                + "descAgenda VARCHAR(50) NOT NULL ,"
                + " valorAgenda DECIMAL(10,2) NULL ,"
                + " dataAgenda DATE NOT NULL,"
                + " situacaoAgenda VARCHAR(50) NOT NULL,"
                + " PRIMARY KEY (codAgenda)"
               //  + ")ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
      //    JOptionPane.showMessageDialog(null, "Agenda de compromisso criado com sucesso!");
        try {
            pst = conector.prepareStatement(sql);
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


    public static void tabelaCorretor() {
        PreparedStatement pst = null;
        String sql = "CREATE TABLE IF NOT EXISTS `imobiliaria`.`corretor` (\n"
                + "  `codCorretor` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `nomeCorretor` VARCHAR(50) NOT NULL,\n"
                + "  `telefoneCorretor` VARCHAR(15) NULL,\n"
                + "  `celularCorretor` VARCHAR(15) NULL,\n"
                + "  `cpfCorretor` VARCHAR(15) NOT NULL,\n"
                + "  `rgCorretor` VARCHAR(11) NOT NULL,\n"
                + "  `emailCorretor` VARCHAR(60) NULL,\n"
                + "  `contatoCorretor` VARCHAR(50) NULL,\n"
                + "  `rua` VARCHAR(60) NOT NULL,\n"
                + "  `quadra` INT NOT NULL,\n"
                + "  `lote` INT NOT NULL,\n"
                + "  `numero` CHAR(3) NULL,\n"
                + "  `bairro` VARCHAR(45) NOT NULL,\n"
                + "  `complemento` VARCHAR(60) NULL,\n"
                + "  `cep` VARCHAR(10) NOT NULL,\n"
                + "  `cidade` VARCHAR(45) NOT NULL,\n"
                + "  `uf` CHAR(2) NOT NULL,\n"
                + "  PRIMARY KEY (`codCorretor`))\n"
                + "ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;";
        try {
            pst = conector.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }

    public static void tablelaCliente() {
        PreparedStatement pst = null;
        String sql = "CREATE TABLE IF NOT EXISTS `imobiliaria`.`Cliente` (\n"
                + "  `codCliente` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `nomeCliente` VARCHAR(45) NOT NULL,\n"
                + "  `telefoneCliente` VARCHAR(15) NULL,\n"
                + "  `celularCliente` VARCHAR(15) NULL,\n"
                + "  `cpfCliente` VARCHAR(15) NOT NULL,\n"
                + "  `rgCliente` VARCHAR(11) NOT NULL,\n"
                + "  `emailCliente` VARCHAR(60) NULL,\n"
                + "  `contatoCliente` VARCHAR(50) NULL,\n"
                + "  `rua` VARCHAR(60) NOT NULL,\n"
                + "  `quadra` INT NOT NULL,\n"
                + "  `lote` INT NOT NULL,\n"
                + "  `numero` CHAR(3) NULL,\n"
                + "  `bairro` VARCHAR(45) NOT NULL,\n"
                + "  `complemento` VARCHAR(60) NULL,\n"
                + "  `cep` VARCHAR(10) NOT NULL,\n"
                + "  `cidade` VARCHAR(45) NOT NULL,\n"
                + "  `uf` CHAR(2) NOT NULL,\n"
                + "  PRIMARY KEY (`codCliente`))\n"
                + "ENGINE = InnoDB DEFAULT CHARSET=utf8mb4";
        try {
            pst = conector.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }

    public void tablelaVenda() {
        PreparedStatement pst = null;
        String sql2 = "CREATE TABLE IF NOT EXISTS `imobiliaria`.`venda` (\n"
                + "  `codVenda` varchar(30) NOT NULL,\n"
                + "  `valorEntrada` decimal(9,2) NOT NULL,\n"
                + "  `valorPrestacao` decimal(9,2) NOT NULL,\n"
                + "  `quantPrestacao` int(11) NOT NULL,\n"
                + "  `totalVenda` decimal(9,2) DEFAULT NULL,\n"
                + "  `comissao` decimal(9,2) DEFAULT NULL,\n"
                + "  `valorComissao` decimal(9,2) DEFAULT NULL,\n"
                + "  `corretor_codCorretor` int(11) NOT NULL,\n"
                + "  `Cliente_codCliente` int(11) NOT NULL,\n"
                + "  `imovel_codImovel` varchar(30) NOT NULL,\n"
                + "  `dataVenda` date NOT NULL,\n"
                + "  PRIMARY KEY (`codVenda`),\n"
                + "  KEY `fk_venda_corretor_idx` (`corretor_codCorretor`),\n"
                + "  KEY `fk_venda_Cliente_idx` (`Cliente_codCliente`),\n"
                + "  KEY `fk_venda_imovel_idx` (`imovel_codImovel`),\n"
//                + "  KEY `fk_venda_corretor1_idx` (`corretor_codCorretor`),\n"
//                + "  KEY `fk_venda_Cliente1_idx` (`Cliente_codCliente`),\n"
//                + "  KEY `fk_venda_imovel1_idx` (`imovel_codImovel`),\n"
                + "  CONSTRAINT `fk_venda_Cliente` FOREIGN KEY (`Cliente_codCliente`) REFERENCES `cliente` (`codCliente`),\n"
                + "  CONSTRAINT `fk_venda_corretor` FOREIGN KEY (`corretor_codCorretor`) REFERENCES `corretor` (`codCorretor`),\n"
                + "  CONSTRAINT `fk_venda_imovel` FOREIGN KEY (`imovel_codImovel`) REFERENCES `imovel` (`codImovel`)\n"
//                + "  CONSTRAINT `fk_venda_Cliente1` FOREIGN KEY (`Cliente_codCliente`) REFERENCES `cliente` (`codCliente`),\n"
//                + "  CONSTRAINT `fk_venda_corretor1` FOREIGN KEY (`corretor_codCorretor`) REFERENCES `corretor` (`codCorretor`),\n"
//                + "  CONSTRAINT `fk_venda_imovel1` FOREIGN KEY (`imovel_codImovel`) REFERENCES `imovel` (`codImovel`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
              //  ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
        try {
            pst = conector.prepareStatement(sql2);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }

    public void tabelaLoteamento() {
        PreparedStatement pst = null;
        String sql = "CREATE TABLE IF NOT EXISTS `imobiliaria`.`loteamento` (\n"
                + "  `codLoteamento` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `nomeLoteamento` VARCHAR(45) NOT NULL,\n"
                + "  `setorLoteamento` VARCHAR(60) NULL,\n"
                + "  `cidadeLoteamento` VARCHAR(50) NOT NULL,\n"
                + "  `estadoLoteamento` VARCHAR(45) NOT NULL,\n"
                + "  `ufLoteamento` CHAR(2) NOT NULL,\n"
                + "  PRIMARY KEY (`codLoteamento`))\n"
                + "ENGINE = InnoDB DEFAULT CHARSET=utf8mb4";
        try {
            pst = conector.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }

    public void tablelaImovel() {
        PreparedStatement pst = null;
        String sql = "CREATE TABLE IF NOT EXISTS `imovel` (\n"
                + "  `codImovel` varchar(30) NOT NULL,\n"
                + "  `ruaImovel` varchar(60) NOT NULL,\n"
                + "  `quadraImovel` int(11) NOT NULL,\n"
                + "  `loteImovel` int(11) NOT NULL,\n"
                + "  `numeroImovel` varchar(10) DEFAULT NULL,\n"
                + "  `cepImovel` varchar(10) NOT NULL,\n"
                + "  `tipoImovel` varchar(45) NOT NULL,\n"
                + "  `metragemImovel` int(11) DEFAULT NULL,\n"
                + "  `situacaoImovel` varchar(12) NOT NULL,\n"
                + "  `loteamento_codLoteamento` int(11) NOT NULL,\n"
                + "  PRIMARY KEY (`codImovel`),\n"
                + "  KEY `fk_imovel_loteamento1_idx` (`loteamento_codLoteamento`),\n"
                + "  CONSTRAINT `fk_imovel_loteamento1` FOREIGN KEY (`loteamento_codLoteamento`) REFERENCES `loteamento` (`codLoteamento`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
               // ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci";
        try {
            pst = conector.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }

    public void tabelaItemDeVenda() {
        PreparedStatement pst = null;
        String sql = "CREATE TABLE IF NOT EXISTS `imobiliaria`.`itemVenda` (\n"
                + "  `codItemVenda` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `dataVenda` DATE NOT NULL,\n"
                + "  `venda_codVenda` INT NOT NULL,\n"
                + "  `corretor_codCorretor` INT NOT NULL,\n"
                + "  `Cliente_codCliente` INT NOT NULL,\n"
                + "  `imovel_codImovel` INT NOT NULL,\n"
                + "  PRIMARY KEY (`codItemVenda`),\n"
                + "  INDEX `fk_item_venda_venda1_idx` (`venda_codVenda` ASC) VISIBLE,\n"
                + "  INDEX `fk_item_venda_corretor1_idx` (`corretor_codCorretor` ASC) VISIBLE,\n"
                + "  INDEX `fk_item_venda_Cliente1_idx` (`Cliente_codCliente` ASC) VISIBLE,\n"
                + "  INDEX `fk_item_venda_imovel1_idx` (`imovel_codImovel` ASC) VISIBLE,\n"
                + "  CONSTRAINT `fk_item_venda_venda1`\n"
                + "    FOREIGN KEY (`venda_codVenda`)\n"
                + "    REFERENCES `imobiliaria`.`venda` (`codVenda`)\n"
                + "    ON DELETE NO ACTION\n"
                + "    ON UPDATE NO ACTION,\n"
                + "  CONSTRAINT `fk_item_venda_corretor1`\n"
                + "    FOREIGN KEY (`corretor_codCorretor`)\n"
                + "    REFERENCES `imobiliaria`.`corretor` (`codCorretor`)\n"
                + "    ON DELETE NO ACTION\n"
                + "    ON UPDATE NO ACTION,\n"
                + "  CONSTRAINT `fk_item_venda_Cliente1`\n"
                + "    FOREIGN KEY (`Cliente_codCliente`)\n"
                + "    REFERENCES `imobiliaria`.`Cliente` (`codCliente`)\n"
                + "    ON DELETE NO ACTION\n"
                + "    ON UPDATE NO ACTION,\n"
                + "  CONSTRAINT `fk_item_venda_imovel1`\n"
                + "    FOREIGN KEY (`imovel_codImovel`)\n"
                + "    REFERENCES `imobiliaria`.`imovel` (`codImovel`)\n"
                + "    ON DELETE NO ACTION\n"
                + "    ON UPDATE NO ACTION)\n"
                + "ENGINE = InnoDB DEFAULT CHARSET=utf8mb4";
        try {
            pst = conector.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
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
                + " valorEntrada decimal(10,2) NOT NULL ,"
                + " categoria_codCategoria int(11) NOT NULL , "
                + " PRIMARY KEY (idEntrada) , "
                + " KEY fk_entrada_categoria_idx (categoria_codCategoria) , "
                + " CONSTRAINT `fk_entrada_categoria` FOREIGN KEY (categoria_codCategoria) REFERENCES categoria (codCategoria) "
                + " ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";

        try {
            pst = conector.prepareStatement(sql);
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
                + " ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
        try {
            pst = conector.prepareStatement(sql);
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
                + " perfil VARCHAR( 5 ) NOT NULL , "
                + " PRIMARY KEY ( idUsuario ) "
                + " )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
        try {
            pst = conector.prepareStatement(sql);
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
            pst = conector.prepareStatement(sql);
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
        String sql = "insert into `usuarios`(`nomeUsu`,`telefone`,`login`,`senha`,`perfil`)VALUES('Administrador',99999999,'admin','admin','Admin'),('Super Usuario',99999999,'super','super','Super')";
        try {
            pst = conector.prepareStatement(sql);
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
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
        try {
            pst = conector.prepareStatement(sql);
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
            pst = conector.prepareStatement(sql);
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
            pst = conector.prepareStatement(sql);
            pst.execute();
            //  atualizarAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }
    ////////////////////////////////////////////////////////////////////////

    public void tabelaVerificaAgenda() {
        PreparedStatement pst = null;
        String sql = "CREATE TABLE IF NOT EXISTS verifica_agenda ("
                + "  codVerificaAgenda int(11) NOT NULL,"
                + "  statusVerificaAgenda varchar(5) NOT NULL,"
                + "  PRIMARY KEY (codVerificaAgenda)"
                                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
               // + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci";
        try {
            pst = conector.prepareStatement(sql);
            pst.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
        }
        inserirDadosTabelaVerificaAgenda();
    }

    public void inserirDadosTabelaVerificaAgenda() {
        PreparedStatement pst = null;
        //o IGNORE permite que os dados seja inseridos somente se não existirem
        String sql = "INSERT IGNORE INTO `verifica_agenda` (`codVerificaAgenda`, `statusVerificaAgenda`) VALUES(1, 'SIM')";
        try {
            pst = conector.prepareStatement(sql);
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
            pst = conector.prepareStatement(sql);
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
            pst = conector.prepareStatement(sql);
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
            pst = conector.prepareStatement(sql);
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
            pst = conector.prepareStatement(sql);
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
            pst = conector.prepareStatement(sql);
            pst.execute();
            //  atualizarAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }

    }

    private void lbsy() {
        PreparedStatement pst = null;
        String sql = "CREATE TABLE IF NOT EXISTS `imobiliaria`.`lbsy` (\n"
                + "  `id` INT NOT NULL,\n"
                + "  `dataFinal` DATE NULL,\n"
                + "  `cfrsnh` VARCHAR(14) NULL,\n"
                + "  PRIMARY KEY (`id`))\n"
                + "ENGINE = InnoDB DEFAULT CHARSET=utf8mb4";
        try {
            pst = conector.prepareStatement(sql);
            pst.execute();
            verificaLbsy();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }

    private void verificaLbsy() {
        PreparedStatement pst = null;
        ResultSet result = null;
        String sql = "select * from lbsy";
        try {
            pst = conector.prepareStatement(sql);
            result = pst.executeQuery();
            if (!result.next()) {
                inserirLbsy();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Conferi", 1);
        }
    }

    private void inserirLbsy() {
        String dataValidadeCompletaStr = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date dataAtual = new Date();
        String dataVencStr = sdf.format(dataAtual);
        String ano = dataVencStr.substring(0, 4);
        String mes = dataVencStr.substring(4, 6);
        String dia = dataVencStr.substring(6);
        int anoInt = Integer.parseInt(ano);
        int mesInt = Integer.parseInt(mes);
        int diaInt = Integer.parseInt(dia);
        if (mesInt > 0 && mesInt < 11 && (mesInt == 7) && diaInt < 31) {
//            JOptionPane.showMessageDialog(null, "Entrou na Primeira opção");
            mesInt = mesInt + 2;
            String anoStr = String.valueOf(anoInt);
            String mesStr = String.valueOf(mesInt);
            String diaStr = String.valueOf(diaInt);
            dataValidadeCompletaStr = anoStr + "-" + mesStr + "-" + diaStr;
        } else if (mesInt > 0 && mesInt < 11 && (mesInt == 7) && diaInt == 31) {
//             JOptionPane.showMessageDialog(null, "Entrou na segunda opção");
            mesInt = mesInt + 2;
            diaInt = 30;
            String anoStr = String.valueOf(anoInt);
            String mesStr = String.valueOf(mesInt);
            String diaStr = String.valueOf(diaInt);
            dataValidadeCompletaStr = anoStr + "-" + mesStr + "-" + diaStr;
        } else if (mesInt > 0 && mesInt < 11 && (mesInt != 7) && diaInt > 30) {
//             JOptionPane.showMessageDialog(null, "Entrou na terceira opção");
            mesInt = mesInt + 2;
            diaInt = 30;
            String anoStr = String.valueOf(anoInt);
            String mesStr = String.valueOf(mesInt);
            String diaStr = String.valueOf(diaInt);
            dataValidadeCompletaStr = anoStr + "-" + mesStr + "-" + diaStr;
        } else if (mesInt > 0 && mesInt < 11 && (mesInt != 7) && diaInt <=30) {
//             JOptionPane.showMessageDialog(null, "Entrou na quarta opção");
            mesInt = mesInt + 2;
            String anoStr = String.valueOf(anoInt);
            String mesStr = String.valueOf(mesInt);
            String diaStr = String.valueOf(diaInt);
            dataValidadeCompletaStr = anoStr + "-" + mesStr + "-" + diaStr;
        }else if (mesInt == 11) {
//             JOptionPane.showMessageDialog(null, "Entrou na Quinta opção");
            mesInt = 01;
            anoInt = anoInt + 1;
            String anoStr = String.valueOf(anoInt);
            String mesStr = String.valueOf(mesInt);
            String diaStr = String.valueOf(diaInt);
            dataValidadeCompletaStr = anoStr + "-" + mesStr + "-" + diaStr;
        } else if (mesInt == 12 && diaInt > 28) {
//             JOptionPane.showMessageDialog(null, "Entrou na Sexta opção");
            mesInt = 2;
            diaInt = 28;
            anoInt = anoInt + 1;
            String anoStr = String.valueOf(anoInt);
            String mesStr = String.valueOf(mesInt);
            String diaStr = String.valueOf(diaInt);
            dataValidadeCompletaStr = anoStr + "-" + mesStr + "-" + diaStr;
        } else if (mesInt == 12 && diaInt <= 28) {
//             JOptionPane.showMessageDialog(null, "Entrou na Setima opção");
            mesInt = 02;
            anoInt = anoInt + 1;
            String anoStr = String.valueOf(anoInt);
            String mesStr = String.valueOf(mesInt);
            String diaStr = String.valueOf(diaInt);
            dataValidadeCompletaStr = anoStr + "-" + mesStr + "-" + diaStr;
        }

        PreparedStatement pst = null;
        ResultSet result = null;
        String sql = "INSERT INTO `lbsy` (`id`, `dataFinal`, `cfrsnh`) VALUES\n"
                + "	(13091068, ?, 'Numsey')";
        try {
            pst = conector.prepareStatement(sql);
            pst.setString(1, dataValidadeCompletaStr);
            pst.execute();
            //  atualizarAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);

        }

    }

    private void boleto() {
        PreparedStatement pst = null;
        String sql = "CREATE TABLE IF NOT EXISTS `boleto` (\n"
                + "  `codBoleto` varchar(40) NOT NULL,\n"
                + "  `status` varchar(15) NOT NULL,\n"
                + "  `CN` smallint(6) NOT NULL,\n"
                + "  `quantPrest` smallint(6) NOT NULL,\n"
                + "  `pagador` varchar(60) NOT NULL,\n"
                + "  `cpf` varchar(18) NOT NULL,\n"
                + "  `telefCliente` varchar(15) DEFAULT NULL,\n"
                + "  `rua` varchar(70) DEFAULT NULL,\n"
                + "  `quadra` varchar(10) NOT NULL,\n"
                + "  `lote` varchar(10) NOT NULL,\n"
                + "  `loteamento` varchar(60) NOT NULL,\n"
                + "  `cidade` varchar(60) DEFAULT NULL,\n"
                + "  `valorIntegral` decimal(9,2) NOT NULL,\n"
                + "  `txJuro` decimal(9,2) DEFAULT NULL,\n"
                + "  `multa` decimal(9,2) DEFAULT NULL,\n"
                + "  `vlTotal` decimal(9,2) DEFAULT NULL,\n"
                + "  `dataVenc` date NOT NULL,\n"
                + "  `dataAtual` date NOT NULL,\n"
                + "  `dataPag` date NOT NULL,\n"
                + "  PRIMARY KEY (`codBoleto`),\n"
                + "  KEY `codBoleto` (`codBoleto`)\n"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
             //   ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
        try {
            pst = conector.prepareStatement(sql);
            pst.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }

    private void feriados() {
        PreparedStatement pst = null;
        String sql = "CREATE TABLE IF NOT EXISTS `imobiliaria`.`feriados` (\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `dataFeriado` DATE NOT NULL,\n"
                + "  `descricaoFeriado` VARCHAR(60) NOT NULL,\n"
                + "  `anoFeriado` INT NOT NULL,\n"
                + "  PRIMARY KEY (`id`))\n"
                + "ENGINE = InnoDB DEFAULT CHARSET=utf8mb4";
        try {
            pst = conector.prepareStatement(sql);
            pst.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }

}
