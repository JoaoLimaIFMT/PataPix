package br.com.patapix.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Doacao;

    private Long ID_Doador;
    private Long ID_ONG;

    private BigDecimal Valor;

    private String Banco;
    private LocalDate DT_Doacao;
    private LocalTime Hora;

    private String N_CartaoD;
    private String N_CartaoC;

    // Getters e Setters

    public Long getID_Doacao() {
        return ID_Doacao;
    }
    public void setID_Doacao(Long ID_Doacao) {
        this.ID_Doacao = ID_Doacao;
    }

    public Long getID_Doador() {
        return ID_Doador;
    }
    public void setID_Doador(Long ID_Doador) {
        this.ID_Doador = ID_Doador;
    }

    public Long getID_ONG() {
        return ID_ONG;
    }
    public void setID_ONG(Long ID_ONG) {
        this.ID_ONG = ID_ONG;
    }

    public BigDecimal getValor() {
        return Valor;
    }
    public void setValor(BigDecimal Valor) {
        this.Valor = Valor;
    }

    public String getBanco() {
        return Banco;
    }
    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public LocalDate getDT_Doacao() {
        return DT_Doacao;
    }
    public void setDT_Doacao(LocalDate DT_Doacao) {
        this.DT_Doacao = DT_Doacao;
    }

    public LocalTime getHora() {
        return Hora;
    }
    public void setHora(LocalTime Hora) {
        this.Hora = Hora;
    }

    public String getN_CartaoD() {
        return N_CartaoD;
    }
    public void setN_CartaoD(String N_CartaoD) {
        this.N_CartaoD = N_CartaoD;
    }

    public String getN_CartaoC() {
        return N_CartaoC;
    }
    public void setN_CartaoC(String N_CartaoC) {
        this.N_CartaoC = N_CartaoC;
    }
}
