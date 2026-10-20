package br.com.patapix.model;
import java.util.Date;
import java.time.LocalTime;


public class Doação  extends ONG{

    private Long ID_ONG;
    private Float Valor;

    private String Banco;
    private Date DT_Doacao;
    private LocalTime Hora;
    private Long N_CartaoD;
    private Long N_CartaoC;


    //ID_Doacao (PK);
    //ID_Doador (FK);

}
