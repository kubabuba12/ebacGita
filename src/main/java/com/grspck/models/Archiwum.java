package com.grspck.models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity(name = "archiwum")
public class Archiwum
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_archiwum;
    private int id_grupy;
    private boolean czy_znaleziono;
    private String wspolrzedne;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] trasa;

    public Archiwum()
    {

    }

    @OneToOne
    private Grupa grupa;

    public int getId_archiwum() {
        return id_archiwum;
    }

    public void setId_archiwum(int id_archiwum) {
        this.id_archiwum = id_archiwum;
    }

    public int getId_grupy() {
        return id_grupy;
    }

    public void setId_grupy(int id_grupy) {
        this.id_grupy = id_grupy;
    }

    public boolean isCzy_znaleziono() {
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

    public byte[] getTrasa() {
        return trasa;
    }

    public void setTrasa(byte[] trasa) {
        this.trasa = trasa;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }
}
