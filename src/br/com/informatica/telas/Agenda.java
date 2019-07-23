/*
Esta tela foi criada para que se possa criar uma lista do tipo Agenda na classe TelaAgenda
a lista do tipo Agenda irá armazenar os resultados do select na tabela agendacompromisso do banco
de dados
 */
package br.com.informatica.telas;

import java.util.Date;

public class Agenda {
    int codAgenda = 0;
    String descAgenda, situacaoAgenda = null;
    Double valorAgenda = null;
    Date dataAgenda = null;

    public int getCodAgenda() {
        return codAgenda;
    }

    public void setCodAgenda(int codAgenda) {
        this.codAgenda = codAgenda;
    }

    public String getDescAgenda() {
        return descAgenda;
    }

    public void setDescAgenda(String descAgenda) {
        this.descAgenda = descAgenda;
    }

    public String getSituacaoAgenda() {
        return situacaoAgenda;
    }

    public void setSituacaoAgenda(String situacaoAgenda) {
        this.situacaoAgenda = situacaoAgenda;
    }

    public Double getValorAgenda() {
        return valorAgenda;
    }

    public void setValorAgenda(Double valorAgenda) {
        this.valorAgenda = valorAgenda;
    }

    public Date getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(Date dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

    @Override
    public String toString() {
        return "Agenda{" + "codAgenda=" + codAgenda + ", descAgenda=" + descAgenda + ", situacaoAgenda=" + situacaoAgenda + ", valorAgenda=" + valorAgenda + ", dataAgenda=" + dataAgenda + '}';
    }
    
    
}
