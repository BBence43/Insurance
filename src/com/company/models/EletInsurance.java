package com.company.models;

import java.util.ArrayList;

public class EletInsurance extends Model {
    public EletInsurance(Integer id) {
        super(id);
    }
    public static ArrayList<EletInsurance> lista = new ArrayList<>();
    private boolean fogyatekos;
    private Integer eletkor;
    private boolean kronikus;
    private boolean halalos;
    private boolean ecs;

    public EletInsurance(Integer id, boolean fogyatekos, Integer eletkor, boolean kronikus, boolean halalos, boolean ecs) {
        super(id);
        this.fogyatekos = fogyatekos;
        this.eletkor = eletkor;
        this.kronikus = kronikus;
        this.halalos = halalos;
        this.ecs = ecs;
    }

    public boolean isFogyatekos() {
        return fogyatekos;
    }

    public void setFogyatekos(boolean fogyatekos) {
        this.fogyatekos = fogyatekos;
    }

    public Integer getEletkor() {
        return eletkor;
    }

    public void setEletkor(Integer eletkor) {
        this.eletkor = eletkor;
    }

    public boolean isKronikus() {
        return kronikus;
    }

    public void setKronikus(boolean kronikus) {
        this.kronikus = kronikus;
    }

    public boolean isHalalos() {
        return halalos;
    }

    public void setHalalos(boolean halalos) {
        this.halalos = halalos;
    }

    public boolean isEcs() {
        return ecs;
    }

    public void setEcs(boolean ecs) {
        this.ecs = ecs;
    }
}
