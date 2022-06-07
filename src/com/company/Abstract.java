package com.company;

abstract class Abstract {
    private Integer id;

    Abstract(){}

    public Abstract(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
