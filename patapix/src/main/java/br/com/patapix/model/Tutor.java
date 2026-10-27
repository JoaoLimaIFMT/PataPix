
package br.com.patapix.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Tutor")
public class Tutor extends Usuario {

    // Atributos específicos de Tutor
    @Column(name = "N_Cartao")
    private String nCartao;

    @Column(name = "Chave_pix")
    private String chavePix;

    @Column(name = "Telefone")
    private String telefone;

    // Getters e Setters

    public String getN_Cartao() {
        return nCartao;
    }

    public void setN_Cartao(String nCartao) {
        this.nCartao = nCartao;
    }

    public String getChave_pix() {
        return chavePix;
    }

    public void setChave_pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
