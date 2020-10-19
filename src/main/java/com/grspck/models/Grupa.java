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
    private int idGrupy;
    private String rodzajGrupy;
    private String sektor;
    private String godzWyj;
    private String godzPowr;
    private String dowodca;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] ikona;

    public Grupa()
    {

    }

    public int getIdGrupy()
    {
        return idGrupy;
    }

    public void setIdGrupy(int idGrupy)
    {
        this.idGrupy = idGrupy;
    }

    public String getRodzajGrupy() {
        return rodzajGrupy;
    }

    public void setRodzajGrupy(String rodzajGrupy) {
        this.rodzajGrupy = rodzajGrupy;
    }

    public String getSektor()
    {
        return sektor;
    }

    public void setSektor(String sektor)
    {
        this.sektor = sektor;
    }

    public String getGodzWyj()
    {
        return godzWyj;
    }

    public void setGodzWyj(String godzWyj)
    {
        this.godzWyj = godzWyj;
    }

    public String getGodzPowr()
    {
        return godzPowr;
    }

    public void setGodzPowr(String godzPowr)
    {
        this.godzPowr = godzPowr;
    }

    public String getDowodca()
    {
        return dowodca;
    }

    public void setDowodca(String dowodca)
    {
        this.dowodca = dowodca;
    }

    public byte[] getIkona()
    {
        return ikona;
    }

    public void setIkona(byte[] ikona)
    {
        this.ikona = ikona;
    }
}
