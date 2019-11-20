/*
 essa classe faz a migração dos dados da tabela excel .
 */
package br.com.informatica.excel;

import br.com.informatica.dal.Conexao;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MigrarExcel {

    static String nome;
    static String idade;
    static String profissao;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        MigrarExcel.nome = nome;
    }

    public static String getIdade() {
        return idade;
    }

    public static void setIdade(String idade) {
        MigrarExcel.idade = idade;
    }

    public static String getProfissao() {
        return profissao;
    }

    public static void setProfissao(String profissao) {
        MigrarExcel.profissao = profissao;
    }
    
    public MigrarExcel() {

    }

    public MigrarExcel(File filename) {
        List cellData = new ArrayList();
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet hssFSheet = workbook.getSheetAt(0);
            Iterator rowIterator = hssFSheet.rowIterator();
            while (rowIterator.hasNext()) {
                XSSFRow hssfFRow = (XSSFRow) rowIterator.next();
                Iterator iterator = hssfFRow.cellIterator();
                List cellTemp = new ArrayList();
                while (iterator.hasNext()) {
                    XSSFCell hssfceCell = (XSSFCell) iterator.next();
                    cellTemp.add(hssfceCell);
                }
                cellData.add(cellTemp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        obtener(cellData);
    }

    private void obtener(List cellDataList) {
        MigrarExcel excel = new MigrarExcel();
        
        List<String> pessoa = new ArrayList<>();
        
        for (int i = 0; i < cellDataList.size(); i++) {
            List cellTempList = (List) cellDataList.get(i);
            for (int j = 0; j < cellTempList.size(); j++) {
                XSSFCell hssfcelCell = (XSSFCell) cellTempList.get(j);
                String stringCellValue = hssfcelCell.toString();
                System.out.print(stringCellValue + " ");
               

            }

        }
    }

    public static void main(String[] args) {
        File f = new File("E:/Edilson/Documents/NetBeansProjects/SistemaAutomacao/arquivo.xlsx");
        if (f.exists()) {
            MigrarExcel excel = new MigrarExcel(f);
        }
    }

}
