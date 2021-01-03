package com.grspck.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "przydzial_grupy_do_akcji")
public class PrzydzialGrupyDoAkcji
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_przydzialu_grupy_do_akcji;
    private int id_akcji;
    private int id_grupy;

    public PrzydzialGrupyDoAkcji()
    {

    }

    public int getId_przydzialu_grupy_do_akcji() {
        return id_przydzialu_grupy_do_akcji;
    }

    public void setId_przydzialu_grupy_do_akcji(int id_przydzialu_grupy_do_akcji) {
        this.id_przydzialu_grupy_do_akcji = id_przydzialu_grupy_do_akcji;
    }

    public int getId_grupy() {
        return id_grupy;
    }

    public void setId_grupy(int id_grupy) {
        this.id_grupy = id_grupy;
    }

    public int getId_akcji() {
        return id_akcji;
    }

    public void setId_akcji(int id_akcji) {
        this.id_akcji = id_akcji;
    }
}
