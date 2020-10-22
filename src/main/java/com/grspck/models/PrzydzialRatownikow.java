package com.grspck.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "przydzial_ratownikow")
public class PrzydzialRatownikow
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_przydzialu_ratownikow;
    private int id_grupy;
    private int id_ratownika;

    public PrzydzialRatownikow()
    {

    }

    public int getId_przydzialu_ratownikow() {
        return id_przydzialu_ratownikow;
    }

    public void setId_przydzialu_ratownikow(int id_przydzialu_ratownikow) {
        this.id_przydzialu_ratownikow = id_przydzialu_ratownikow;
    }

    public int getId_grupy() {
        return id_grupy;
    }

    public void setId_grupy(int id_grupy) {
        this.id_grupy = id_grupy;
    }

    public int getId_ratownika() {
        return id_ratownika;
    }

    public void setId_ratownika(int id_ratownika) {
        this.id_ratownika = id_ratownika;
    }
}
