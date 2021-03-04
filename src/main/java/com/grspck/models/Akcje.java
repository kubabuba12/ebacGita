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
    private String nazwa;
    private String opis;
    private boolean status;
    private String czas_rozpoczecia;
    private boolean czy_cwiczenia;

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

    public byte[] getOzi_explorer() {
        return ozi_explorer;
    }

    public void setOzi_explorer(byte[] ozi_explorer) {
        this.ozi_explorer = ozi_explorer;
    }

    public void setNazwa(String nazwa){this.nazwa = nazwa;}

    public void setOpis(String opis){this.opis = opis;}

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCzas_rozpoczecia() {
        return czas_rozpoczecia;
    }

    public void setCzas_rozpoczecia(String czas_rozpoczecia) {
        this.czas_rozpoczecia = czas_rozpoczecia;
    }

    public String getNazwa(){return this.nazwa;}

    public String getOpis(){return this.opis;}


    public boolean getCzy_cwiczenia()
    {
        return czy_cwiczenia;
    }

    public void setCzy_cwiczenia(boolean czy_cwiczenia)
    {
        this.czy_cwiczenia = czy_cwiczenia;
    }
}
