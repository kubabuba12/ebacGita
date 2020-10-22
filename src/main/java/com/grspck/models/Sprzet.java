package com.grspck.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sprzet")
public class Sprzet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sprzetu;
    private String nazwa;

    public Sprzet()
    {

    }

    public int getId_sprzetu() {
        return id_sprzetu;
    }

    public void setId_sprzetu(int id_sprzetu) {
        this.id_sprzetu = id_sprzetu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
