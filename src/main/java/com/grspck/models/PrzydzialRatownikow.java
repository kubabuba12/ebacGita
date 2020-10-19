package com.grspck.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "PrzydzialRatownikow")
public class PrzydzialRatownikow
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrzydzialuRatownikow;
    private int idGrupy;
    private int idRatownika;

    @OneToOne
    @JoinColumn(name = "idGrupy", referencedColumnName = "idGrupy")
    private Grupa grupy;

    @OneToMany
    @JoinColumn(name = "idRatownika", referencedColumnName = "idRatownika")
    private List<Ratownicy> ratownicy;

    public PrzydzialRatownikow()
    {

    }

    public Grupa getGrupy() {
        return grupy;
    }

    public void setGrupy(Grupa grupy) {
        this.grupy = grupy;
    }

    public List<Ratownicy> getRatownicy() {
        return ratownicy;
    }

    public void setRatownicy(List<Ratownicy> ratownicy) {
        this.ratownicy = ratownicy;
    }

    public int getIdPrzydzialuRatownikow() {
        return idPrzydzialuRatownikow;
    }

    public void setIdPrzydzialuRatownikow(int idPrzydzialuRatownikow) {
        this.idPrzydzialuRatownikow = idPrzydzialuRatownikow;
    }

    public int getIdGrupy() {
        return idGrupy;
    }

    public void setIdGrupy(int idGrupy) {
        this.idGrupy = idGrupy;
    }

    public int getIdRatownika() {
        return idRatownika;
    }

    public void setIdRatownika(int idRatownika) {
        this.idRatownika = idRatownika;
    }
}
