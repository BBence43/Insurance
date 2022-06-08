package com.company;

import java.util.ArrayList;

public class AutoInsurance extends Abstract{
    public AutoInsurance(Integer id) {
        super(id);
    }
    public static ArrayList<AutoInsurance> lista = new ArrayList<>();
    private boolean tonna;
    private String rendszam;
    private String gyartasiev;
    private Integer teljesitmeny;
    private Marka marka;



    public AutoInsurance(Integer id, boolean tonna, String rendszam, String gyartasiev, Integer teljesitmeny, String marka) {
        super(id);
        this.tonna = tonna;
        this.rendszam = rendszam;
        this.gyartasiev = gyartasiev;
        this.teljesitmeny = teljesitmeny;
        setMarka(marka);
    }

    public boolean isTonna() {
        return tonna;
    }

    public void setTonna(boolean tonna) {
        this.tonna = tonna;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getGyartasiev() {
        return gyartasiev;
    }

    public void setGyartasiev(String gyartasiev) {
        this.gyartasiev = gyartasiev;
    }

    public Integer getTeljesitmeny() {
        return teljesitmeny;
    }

    public void setTeljesitmeny(Integer teljesitmeny) {
        this.teljesitmeny = teljesitmeny;
    }
    public void setMarka(String marka){
        switch (marka.toUpperCase()){
            case "AUDI": this.marka = Marka.Audi;
            case "BMW": this.marka = Marka.BMW;
            case "MERCEDES": this.marka = Marka.Mercedes;
            case "MAZDA": this.marka = Marka.Mazda;
            case "OPEL": this.marka = Marka.Opel;
            case "MAN": this.marka = Marka.MAN;
            case "VOLVO": this.marka = Marka.Volvo;
            case "PEUGEOT": this.marka = Marka.Peugeot;
            case "SUZUKI": this.marka = Marka.Suzuki;
            case "SCANIA": this.marka = Marka.Scania;
        }


    }
    public String getmarka(){
        return this.marka.toString();
    }
}
