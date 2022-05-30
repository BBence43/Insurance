package com.company;

public class LakasInsurance extends Abstract {
    private String bizt_address;
    private IngatlanType ingatlantype;
    private Integer mellek_buildings;
    boolean lakott_area;


    public LakasInsurance(String nev, String lakcim, String anyja_neve, String email, String szuldat, Integer id) {
        super(nev, lakcim, anyja_neve, email, szuldat, id);
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
        this.ingatlantype = ingatlantype;
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
