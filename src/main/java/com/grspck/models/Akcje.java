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
    private boolean status;
    private String nazwa;
    private String opis;
    private String czas_rozpoczecia;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] ozi_explorer;


    @ManyToMany
    @JoinTable(
            name = "przydzial_grupy_do_akcji",
            joinColumns = @JoinColumn(name = "id_akcji"),
            inverseJoinColumns = @JoinColumn(name = "id_grupy")
    )
    private List<Grupa> grupy;

    public Akcje()
    {

    }

    public int getId_akcji() {
        return id_akcji;
    }

    public void setId_akcji(int id_akcji) {
        this.id_akcji = id_akcji;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public byte[] getOzi_explorer() {
        return ozi_explorer;
    }

    public void setOzi_explorer(byte[] ozi_explorer) {
        this.ozi_explorer = ozi_explorer;
    }

    public List<Grupa> getGrupy() {
        return grupy;
    }

    public void setGrupy(List<Grupa> grupy) {
        this.grupy = grupy;
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
