/*
essa classe provê um objeto do tipo boleto para auxiliar na atualização dos calculos dos valores dos boletos
 */
package br.com.informatica.util;

public class ListaBoleto {
   private String codBoleto, dataVencimentoBoleto,dataAtualBoleto;
   private Double valorParcela,taxaJurosBoleto;

    public String getCodBoleto() {
        return codBoleto;
    }

    public void setCodBoleto(String codBoleto) {
        this.codBoleto = codBoleto;
    }

    public String getDataVencimentoBoleto() {
        return dataVencimentoBoleto;
    }

    public void setDataVencimentoBoleto(String dataVencimentoBoleto) {
        this.dataVencimentoBoleto = dataVencimentoBoleto;
    }

    public String getDataAtualBoleto() {
        return dataAtualBoleto;
    }

    public void setDataAtualBoleto(String dataAtualBoleto) {
        this.dataAtualBoleto = dataAtualBoleto;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public Double getTaxaJurosBoleto() {
        return taxaJurosBoleto;
    }

    public void setTaxaJurosBoleto(Double taxaJurosBoleto) {
        this.taxaJurosBoleto = taxaJurosBoleto;
    }
    

    public ListaBoleto() {
        
    }

    @Override
    public String toString() {
        return "ListaBoleto{" + "codBoleto=" + codBoleto + ", dataVencimentoBoleto=" + dataVencimentoBoleto + ", dataAtualBoleto=" + dataAtualBoleto + ", valorParcela=" + valorParcela + ", taxaJurosBoleto=" + taxaJurosBoleto + '}';
    }

    
    
}
