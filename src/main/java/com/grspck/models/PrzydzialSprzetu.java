package com.grspck.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "PrzydzialSprzetu")
public class PrzydzialSprzetu
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrzydzialuSprzetu;
    private int idGrupy;
    private int idSprzetu;

    @OneToOne
    @JoinColumn(name = "idGrupy", referencedColumnName = "idGrupy")
    private Grupa grupy;

    @OneToMany
    @JoinColumn(name = "idSprzetu", referencedColumnName = "idSprzetu")
    private List<Sprzet> sprzet;

    public PrzydzialSprzetu()
    {

    }

    public Grupa getGrupy() {
        return grupy;
    }

    public void setGrupy(Grupa grupy) {
        this.grupy = grupy;
    }

    public List<Sprzet> getSprzet() {
        return sprzet;
    }

    public void setSprzet(List<Sprzet> sprzet) {
        this.sprzet = sprzet;
    }

    public int getIdPrzydzialuSprzetu() {
        return idPrzydzialuSprzetu;
    }

    public void setIdPrzydzialuSprzetu(int idPrzydzialuSprzetu) {
        this.idPrzydzialuSprzetu = idPrzydzialuSprzetu;
    }

    public int getIdGrupy() {
        return idGrupy;
    }

    public void setIdGrupy(int idGrupy) {
        this.idGrupy = idGrupy;
    }

    public int getIdSprzetu() {
        return idSprzetu;
    }

    public void setIdSprzetu(int idSprzetu) {
        this.idSprzetu = idSprzetu;
    }
}
