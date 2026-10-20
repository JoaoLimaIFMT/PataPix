package br.com.patapix.model;
import jakarta.persistence.*;


@Entity
public class ONG {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Declaração das Variaveis
    private Long ID_ONG;
    private String email;
    private String telefone;
    private String cnpj;

    //Getters e Setters

    //ID_Ong
    public Long getID_ONG() {
        return ID_ONG;
    }
    public void setID_Ong(Long ID_ONG) {
        this.ID_ONG = ID_ONG;
    }

    //Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //Telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //CNPJ
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

