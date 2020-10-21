package com.grspck.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "przydzial_zwierzecia")
public class PrzydzialZwierzecia
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Przydzialu_zwierzecia;
    private int id_grupy;
    private int id_zwierzecia;

    public PrzydzialZwierzecia()
    {

    }

    public int getId_Przydzialu_zwierzecia() {
        return id_Przydzialu_zwierzecia;
    }

    public void setId_Przydzialu_zwierzecia(int id_Przydzialu_zwierzecia) {
        this.id_Przydzialu_zwierzecia = id_Przydzialu_zwierzecia;
    }

    public int getId_grupy() {
        return id_grupy;
    }

    public void setId_grupy(int id_grupy) {
        this.id_grupy = id_grupy;
    }

    public int getId_zwierzecia() {
        return id_zwierzecia;
    }

    public void setId_zwierzecia(int id_zwierzecia) {
        this.id_zwierzecia = id_zwierzecia;
    }
}
