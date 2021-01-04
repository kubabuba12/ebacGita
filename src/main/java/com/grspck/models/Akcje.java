package com.grspck.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Akcja")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Akcje
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_akcji;
//    private int id_grupy;
    private boolean status;
    private String nazwa;
    private String opis;
    private String czas_rozpoczecia;
//    private int id_sektora;
//    private String czas_trwania;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] ozi_explorer;

    public Akcje()
    {

    }

    public int getId_akcji() {
        return id_akcji;
    }

    public void setId_akcji(int id_akcji) {
        this.id_akcji = id_akcji;
    }

//    public int getId_grupy() {
//        return id_grupy;
//    }

//    public void setId_grupy(int id_grupy) {
//        this.id_grupy = id_grupy;
//    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

//    public int getId_sektora() {
//        return id_sektora;
//    }

//    public void setId_sektora(int id_sektora) {
//        this.id_sektora = id_sektora;
//    }

//    public String getCzas_trwania() {
//        return czas_trwania;
//    }

//    public void setCzas_trwania(String czas_trwania) {
//        this.czas_trwania = czas_trwania;
//    }

    public byte[] getOzi_explorer() {
        return ozi_explorer;
    }

    public void setOzi_explorer(byte[] ozi_explorer) {
        this.ozi_explorer = ozi_explorer;
    }

    public void setNazwa(String nazwa){this.nazwa = nazwa;}

    public void setOpis(String opis){this.opis = opis;}

    public String getNazwa(){return this.nazwa;}

    public String getOpis(){return this.opis;}

    public String getCzas_rozpoczecia() {
        return czas_rozpoczecia;
    }

    public void setCzas_rozpoczecia(String czas_rozpoczecia) {
        this.czas_rozpoczecia = czas_rozpoczecia;
    }

}
