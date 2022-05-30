package com.company;

public class Ugyfel extends  Abstract{
    private String nev;
    private String lakcim;
    private String anyja_neve;
    private String email;
    private String szuldat;
    private boolean[] biztositas = new boolean[3];

    public Ugyfel(Integer id) {
        super(id);
    }



    //biztosítás vizsgálat helye

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getLakcim() {
        return lakcim;
    }

    public void setLakcim(String lakcim) {
        this.lakcim = lakcim;
    }

    public String getAnyja_neve() {
        return anyja_neve;
    }

    public void setAnyja_neve(String anyja_neve) {
        this.anyja_neve = anyja_neve;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSzuldat() {
        return szuldat;
    }

    public void setSzuldat(String szuldat) {
        this.szuldat = szuldat;
    }

    public boolean[] getBiztositas() {
        return biztositas;
    }

    public void setBiztositas(boolean[] biztositas) {
        this.biztositas = biztositas;
    }
}
