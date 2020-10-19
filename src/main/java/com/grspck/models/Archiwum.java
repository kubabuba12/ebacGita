package com.grspck.models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Archiwum")
public class Archiwum
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArchiwum;
    private int idGrupy;
    private boolean czyZnaleziono;
    private String wspolrzedne;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] trasa;

    @OneToOne
    @JoinColumn(name = "idGrupy", referencedColumnName = "idGrupy")
    private Grupa grupy;

    @OneToOne
    @JoinColumn(name = "idAkcji", referencedColumnName = "idAkcji")
    private Akcje akcja;

    public Archiwum()
    {

    }

    public Akcje getAkcja() {
        return akcja;
    }

    public void setAkcja(Akcje akcja) {
        this.akcja = akcja;
    }

    public Grupa getGrupy() {
        return grupy;
    }

    public void setGrupy(Grupa grupy) {
        this.grupy = grupy;
    }

    public int getIdArchiwum() {
        return idArchiwum;
    }

    public void setIdArchiwum(int idArchiwum) {
        this.idArchiwum = idArchiwum;
    }

    public int getIdGrupy()
    {
        return idGrupy;
    }

    public void setIdGrupy(int idGrupy)
    {
        this.idGrupy = idGrupy;
    }

    public boolean isCzyZnaleziono()
    {
        return czyZnaleziono;
    }

    public void setCzyZnaleziono(boolean czyZnaleziono)
    {
        this.czyZnaleziono = czyZnaleziono;
    }

    public String getWspolrzedne()
    {
        return wspolrzedne;
    }

    public void setWspolrzedne(String wspolrzedne)
    {
        this.wspolrzedne = wspolrzedne;
    }

    public byte[] getTrasa()
    {
        return trasa;
    }

    public void setTrasa(byte[] trasa)
    {
        this.trasa = trasa;
    }
}
