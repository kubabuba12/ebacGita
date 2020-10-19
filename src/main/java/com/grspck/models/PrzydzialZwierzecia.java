package com.grspck.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "PrzydzialZwierzecia")
public class PrzydzialZwierzecia
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrzydzialuZwierzecia;
    private int idGrupy;
    private int idZwierzecia;

    @OneToOne
    @JoinColumn(name = "idGrupy", referencedColumnName = "idGrupy")
    private Grupa grupy;

    @OneToOne
    @JoinColumn(name = "idZwierzecia", referencedColumnName = "idZwierzecia")
    private Zwierzeta zwierze;

    public PrzydzialZwierzecia()
    {

    }

    public int getIdPrzydzialuZwierzecia() {
        return idPrzydzialuZwierzecia;
    }

    public void setIdPrzydzialuZwierzecia(int idPrzydzialuZwierzecia) {
        this.idPrzydzialuZwierzecia = idPrzydzialuZwierzecia;
    }

    public int getIdGrupy() {
        return idGrupy;
    }

    public void setIdGrupy(int idGrupy) {
        this.idGrupy = idGrupy;
    }

    public int getIdZwierzecia() {
        return idZwierzecia;
    }

    public void setIdZwierzecia(int idZwierzecia) {
        this.idZwierzecia = idZwierzecia;
    }
}
