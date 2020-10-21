package com.grspck.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity(name = "sektory")
public class Sektory
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sektora;
    private String nazwa;

    public Sektory()
    {

    }

    public int getId_sektora() {
        return id_sektora;
    }

    public void setId_sektora(int id_sektora) {
        this.id_sektora = id_sektora;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
