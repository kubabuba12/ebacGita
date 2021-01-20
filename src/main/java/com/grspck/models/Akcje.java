package com.grspck.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity(name = "akcja")
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

    public String get_nazwa() {
        return nazwa;
    }

    public void set_nazwa(String nazwa) {
        this.nazwa= nazwa;
    }

    public String get_opis() {
        return opis;
    }

    public void set_opis(String opis) {
        this.opis= opis;
    }

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

    public byte[] getOzi_explorer() {
        return ozi_explorer;
    }

    public void setOzi_explorer(byte[] ozi_explorer) {
        this.ozi_explorer = ozi_explorer;
    }
}
