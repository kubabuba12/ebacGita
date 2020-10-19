package com.grspck.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Sprzet")
public class Sprzet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSprzetu;
    private String nazwa;

    public Sprzet()
    {

    }

    public int getIdSprzetu() {
        return idSprzetu;
    }

    public void setIdSprzetu(int idSprzetu) {
        this.idSprzetu = idSprzetu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
