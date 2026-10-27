
package br.com.patapix.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Doador")
public class Doador extends Usuario {

    @Column(name = "Telefone")
    private String telefone;

    @Column(name = "Quant_doacoes")
    private Integer quant_doacoes;

    @Column(name = "Total_doacao")
    private BigDecimal total_doacao;

    // Getters e Setters

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getQuant_doacoes() {
        return quant_doacoes;
    }

    public void setQuant_doacoes(Integer quant_doacoes) {
        this.quant_doacoes = quant_doacoes;
    }

    public BigDecimal getTotal_doacao() {
        return total_doacao;
    }

    public void setTotal_doacao(BigDecimal total_doacao) {
        this.total_doacao = total_doacao;
    }
}
