package com.grspck.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Zwierzeta")
public class Zwierzeta
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZwierzecia;
    private String nazwa;

    public Zwierzeta()
    {

    }

    public int getIdZwierzecia() {
        return idZwierzecia;
    }

    public void setIdZwierzecia(int idZwierzecia) {
        this.idZwierzecia = idZwierzecia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
