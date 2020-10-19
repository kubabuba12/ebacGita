package com.grspck.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Akcja")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Akcje
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAkcji;
    private int idGrupy;
    private boolean status;
    private int idSektora;
    private String czasTrwania;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] oziExplorer;

    @OneToMany
    @JoinColumn(name = "idGrupy", referencedColumnName = "idGrupy")
    private List<Grupa> grupy;

    @OneToMany
    @JoinColumn(name = "idSektora", referencedColumnName = "idSektora")
    private List<Sektory> sektory;

    public Akcje()
    {

    }

    public List<Grupa> getGrupy() {
        return grupy;
    }

    public void setGrupy(List<Grupa> grupy) {
        this.grupy = grupy;
    }

    public List<Sektory> getSektory() {
        return sektory;
    }

    public void setSektory(List<Sektory> sektory) {
        this.sektory = sektory;
    }

    public int getIdAkcji() {
        return idAkcji;
    }

    public void setIdAkcji(int idAkcji) {
        this.idAkcji = idAkcji;
    }

    public int getIdGrupy()
    {
        return idGrupy;
    }

    public void setIdGrupy(int idGrupy)
    {
        this.idGrupy = idGrupy;
    }

    public boolean getStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public int getIdSektora()
    {
        return idSektora;
    }

    public void setIdSektora(int idSektora)
    {
        this.idSektora = idSektora;
    }

    public String getCzasTrwania()
    {
        return czasTrwania;
    }

    public void setCzasTrwania(String czasTrwania)
    {
        this.czasTrwania = czasTrwania;
    }

    public byte[] getOziExplorer()
    {
        return oziExplorer;
    }

    public void setOziExplorer(byte[] oziExplorer)
    {
        this.oziExplorer = oziExplorer;
    }
}
