package com.company;

public class AutoInsurance extends Abstract{
    public AutoInsurance(Integer id) {
        super(id);
    }
    private boolean tonna;
    private String rendszam;
    private String gyartasiev;
    private Integer teljesitmeny;



    public AutoInsurance(Integer id, boolean tonna, String rendszam, String gyartasiev, Integer teljesitmeny) {
        super(id);
        this.tonna = tonna;
        this.rendszam = rendszam;
        this.gyartasiev = gyartasiev;
        this.teljesitmeny = teljesitmeny;
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
}
