package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class LakasInsurance extends Abstract {
    private String bizt_address;
    public static ArrayList<LakasInsurance> lista = new ArrayList<>();
    private IngatlanType ingatlantype;
    private Integer mellek_buildings;
    boolean lakott_area;

    public LakasInsurance(Integer id, String bizt_address, IngatlanType ingatlantype, Integer mellek_buildings, boolean lakott_area) {
        super(id);
        this.bizt_address = bizt_address;
        this.ingatlantype = ingatlantype;
        this.mellek_buildings = mellek_buildings;
        this.lakott_area = lakott_area;
        LakasInsurance.lista.add(this);
    }

    public LakasInsurance(Integer id) {
        super(id);
    }

    public String getBizt_address() {
        return bizt_address;
    }

    public void setBizt_address(String bizt_address) {
        this.bizt_address = bizt_address;
    }

    public IngatlanType getIngatlantype() {
        return ingatlantype;
    }

    public void setIngatlantype(IngatlanType ingatlantype) {
        this.ingatlantype = ingatlantype;}
    public void setIngatlantype() {
        System.out.println("Kérem válasszon az alábbiak közül a helyes szám megnyomásával:");
        System.out.println("1. Társasház\t 2. Családi ház");
        Scanner be = new Scanner(System.in);
        switch (be.nextInt()){
            case 1: this.ingatlantype = IngatlanType.Társasház; break;
            case 2: this.ingatlantype = IngatlanType.Családiház;break;


        }
    }

    public Integer getMellek_buildings() {
        return mellek_buildings;
    }

    public void setMellek_buildings(Integer mellek_buildings) {
        this.mellek_buildings = mellek_buildings;
    }

    public boolean isLakott_area() {
        return lakott_area;
    }

    public void setLakott_area(boolean lakott_area) {
        this.lakott_area = lakott_area;
    }
}
