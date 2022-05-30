package com.company;

public class EletInsurance extends Abstract {
    public EletInsurance(Integer id) {
        super(id);
    }

    private boolean g1mesy;
    private Integer eletkor;
    private boolean kronikus;
    private boolean halalos;
    private boolean ecs;

    public EletInsurance(Integer id, boolean g1mesy, Integer eletkor, boolean kronikus, boolean halalos, boolean ecs) {
        super(id);
        this.g1mesy = g1mesy;
        this.eletkor = eletkor;
        this.kronikus = kronikus;
        this.halalos = halalos;
        this.ecs = ecs;
    }

    public boolean isG1mesy() {
        return g1mesy;
    }

    public void setG1mesy(boolean g1mesy) {
        this.g1mesy = g1mesy;
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
