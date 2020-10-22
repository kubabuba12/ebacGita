package com.grspck.models;

import javax.persistence.*;

@Entity(name = "sektory")
public class Sektory
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_sektora;
    private String nazwa;

    public Sektory()
    {

    }

    public Long getId_sektora() {
        return id_sektora;
    }

    public void setId_sektora(Long id_sektora) {
        this.id_sektora = id_sektora;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
