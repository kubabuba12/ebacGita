package com.grspck.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "ratownicy")
public class Ratownicy
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ratownika;
    private String nazwisko;
    private String imie;
    private boolean dowodca;
    private String nr_tel;
    private String prefix;

    public Ratownicy()
    {

    }

    @ManyToMany(mappedBy = "ratownicy")
    private List<Grupa> grupy;

    public int getId_ratownika() {
        return id_ratownika;
    }

    public void setId_ratownika(int id_ratownika) {
        this.id_ratownika = id_ratownika;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public boolean isDowodca() {
        return dowodca;
    }

    public void setDowodca(boolean dowodca) {
        this.dowodca = dowodca;
    }

    public String getNr_tel() {
        return nr_tel;
    }

    public void setNr_tel(String nr_tel) {
        this.nr_tel = nr_tel;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }

}
