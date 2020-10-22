package com.grspck.models;

import javax.persistence.*;

@Entity(name = "zwierzeta")
public class Zwierzeta
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_zwierzecia;
    private String imie;

    public Zwierzeta()
    {

    }

    public int getId_zwierzecia() {
        return id_zwierzecia;
    }

    public void setId_zwierzecia(int id_zwierzecia) {
        this.id_zwierzecia = id_zwierzecia;
    }

    public String getNazwa() {
        return imie;
    }

    public void setNazwa(String imie) {
        this.imie = imie;
    }
}
