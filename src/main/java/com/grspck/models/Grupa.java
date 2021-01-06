package com.grspck.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Grupy")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Grupa
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_grupy;
    private String rodzaj_grupy;
    private String sektor;
    private String godz_wyj;
    private String godz_powr;
    private String dowodca;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] ikona;

    @ManyToMany
    @JoinTable(
            name = "przydzial_ratownikow",
            joinColumns = @JoinColumn(name = "id_grupy"),
            inverseJoinColumns = @JoinColumn(name = "id_ratownika")
    )
    private List<Ratownicy> ratownicy;

    @ManyToMany
    @JoinTable(
            name = "przydzial_sprzetu",
            joinColumns = @JoinColumn(name = "id_grupy"),
            inverseJoinColumns = @JoinColumn(name = "id_sprzetu")
    )
    private List<Sprzet> sprzet;

    @OneToOne
    @JoinTable(
            name = "przydzial_zwierzecia",
            joinColumns = @JoinColumn(name = "id_grupy"),
            inverseJoinColumns = @JoinColumn(name = "id_zwierzecia")
    )
    private Zwierzeta zwierze;

    public Grupa()
    {

    }

    public int getId_grupy() {
        return id_grupy;
    }

    public void setId_grupy(int id_grupy) {
        this.id_grupy = id_grupy;
    }

    public String getRodzaj_grupy() {
        return rodzaj_grupy;
    }

    public void setRodzaj_grupy(String rodzaj_grupy) {
        this.rodzaj_grupy = rodzaj_grupy;
    }

    public String getSektor() {
        return sektor;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;
    }

    public String getGodz_wyj() {
        return godz_wyj;
    }

    public void setGodz_wyj(String godz_wyj) {
        this.godz_wyj = godz_wyj;
    }

    public String getGodz_powr() {
        return godz_powr;
    }

    public void setGodz_powr(String godz_powr) {
        this.godz_powr = godz_powr;
    }

    public String getDowodca() {
        return dowodca;
    }

    public void setDowodca(String dowodca) {
        this.dowodca = dowodca;
    }

    public byte[] getIkona() {
        return ikona;
    }

    public void setIkona(byte[] ikona) {
        this.ikona = ikona;
    }

    public List<Ratownicy> getRatownicy() {
        return ratownicy;
    }

    public void setRatownicy(List<Ratownicy> ratownicy) {
        this.ratownicy = ratownicy;
    }

    public List<Sprzet> getSprzet() {
        return sprzet;
    }

    public void setSprzet(List<Sprzet> sprzet) {
        this.sprzet = sprzet;
    }

    public Zwierzeta getZwierze() {
        return zwierze;
    }

    public void setZwierze(Zwierzeta zwierze) {
        this.zwierze = zwierze;
    }
}
