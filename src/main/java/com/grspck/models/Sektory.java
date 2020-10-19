package com.grspck.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity(name = "Sektory")
public class Sektory
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSektora;
    private String nazwa;

    public Sektory()
    {

    }

    public int getIdSektora() {
        return idSektora;
    }

    public void setIdSektora(int idSektora) {
        this.idSektora = idSektora;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @ManyToMany
    private Collection<Grupa> Grupy;

    public Collection<Grupa> getGrupy() {
        return Grupy;
    }

    public void setGrupy(Collection<Grupa> grupy) {
        Grupy = grupy;
    }
}
