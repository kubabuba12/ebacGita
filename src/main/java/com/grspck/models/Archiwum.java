package com.grspck.models;

import org.hibernate.annotations.Type;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity(name = "archiwum")
@CrossOrigin(origins = "http://localhost:4200")
public class Archiwum
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_archiwum;
    private boolean czy_znaleziono;
    private String wspolrzedne;
    private String tytul;
    private String opis;
    private String uwagi;

    public Archiwum()
    {

    }

    public int getId_archiwum() {
        return id_archiwum;
    }

    public void setId_archiwum(int id_archiwum) {
        this.id_archiwum = id_archiwum;
    }

    public boolean getCzy_znaleziono() {
        return czy_znaleziono;
    }

    public void setCzy_znaleziono(boolean czy_znaleziono) {
        this.czy_znaleziono = czy_znaleziono;
    }

    public String getWspolrzedne() {
        return wspolrzedne;
    }

    public void setWspolrzedne(String wspolrzedne) {
        this.wspolrzedne = wspolrzedne;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getUwagi()
    {
        return uwagi;
    }

    public void setUwagi(String uwagi)
    {
        this.uwagi = uwagi;
    }
}
