package br.com.patapix.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Declaração de Variaveis
    private Long ID_Animal;

    private Date Data_nasc;

    private Float Peso;
    private Float Altura;

    private String Nome;
    private String Especie;
    private String Raca;
    private String Genero;
    private String Porte;
    private String Cor;
    // -->  ID Tutor e Doador

    //Getters e Setters

    public Long getID_Animal() {
        return ID_Animal;
    }
    public void setID_Animal(Long ID_Animal) {
        this.ID_Animal = ID_Animal;
    }

    public Date getData_nasc() {
        return Data_nasc;
    }
    public void setData_nasc(Date Data_nasc) {
        this.Data_nasc = Data_nasc;
    }

    public Float getPeso() {
        return Peso;
    }
    public void setPeso(Float Peso) {
        this.Peso = Peso;
    }

    public Float getAltura() {
        return Altura;
    }
    public void setAltura(Float Altura) {
        this.Altura = Altura;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEspecie(){
        return Especie;
    }
    public void setEspecie(String Especie){
        this.Especie = Especie;
    }

    public String getRaca() {
        return Raca;
    }
    public void setRaca(String Raca) {
        this.Raca = Raca;
    }

    public String getGenero() {
        return Genero;
    }
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getPorte() {
        return Porte;
    }
    public void setPorte(String Porte) {
        this.Porte = Porte;
    }

    public String getCor() {
        return Cor;
    }
    public void setCor(String Cor) {
        this.Cor = Cor;
    }


}
