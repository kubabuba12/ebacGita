package com.grspck.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "przydzial_sprzetu")
public class PrzydzialSprzetu
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_przydzialu_sprzetu;
    private int id_grupy;
    private int id_sprzetu;

    public PrzydzialSprzetu()
    {

    }

    public int getId_przydzialu_Sprzetu() {
        return id_przydzialu_sprzetu;
    }

    public void setId_przydzialu_Sprzetu(int id_przydzialu_Sprzetu) {
        this.id_przydzialu_sprzetu = id_przydzialu_Sprzetu;
    }

    public int getId_grupy() {
        return id_grupy;
    }

    public void setId_grupy(int id_grupy) {
        this.id_grupy = id_grupy;
    }

    public int getId_sprzetu() {
        return id_sprzetu;
    }

    public void setId_sprzetu(int id_sprzetu) {
        this.id_sprzetu = id_sprzetu;
    }
}
