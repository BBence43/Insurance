package com.company.models;

public abstract class Model {
    private Integer id;

    Model(){}

    public Model(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
