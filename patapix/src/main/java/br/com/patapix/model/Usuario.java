package br.com.patapix.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Declaração de Variaveis

    private Long ID_Usuario;

    private String Nome;
    private String Email;

    private String Senha;
    private String Sexo;

    private String CPF;
    private String CEP;

    private Date DT_Nascimento;


    //Getters e Setters

    //ID
    public Long getID_USUARIO() {
        return ID_Usuario;
    }
    public void setID_USUARIO(Long ID_USUARIO) {
        this.ID_Usuario = ID_USUARIO;
    }

    //Nome
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    //Email
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }

    //Senha
    public String getSenha() {
        return Senha;
    }
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    //Sexo
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    //CPF
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    //CEP
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String CEP){
        this.CEP = CEP;
    }
}
