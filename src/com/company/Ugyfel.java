package com.company;

import java.util.ArrayList;

public class Ugyfel extends  Abstract{

    private int counter = 0;
    public static ArrayList<Ugyfel> lista = new ArrayList<>();
    private String nev;
    private String lakcim;
    private String anyja_neve;
    private String email;
    private String szuldat;
    public static ArrayList<Integer> idk = new ArrayList<>();


    public Ugyfel(){
        counter++;
        this.setId(counter);
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

    public void increaseCounter(){
        counter++;
    }

    public int getCounter(){ return counter;};


}
