package com.grspck.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Ratownicy")
public class Ratownicy
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRatownika;
    private String nazwisko;
    private String imie;
    private boolean dowodca;
    private String nrTel;

    public Ratownicy()
    {

    }

    public int getIdRatownika() {
        return idRatownika;
    }

    public void setIdRatownika(int idRatownika) {
        this.idRatownika = idRatownika;
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

    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }
}
