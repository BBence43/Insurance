package com.company;

public enum IngatlanType {
    Társasház(1.1),
    Családiház(1.3);

    double ratio;

    IngatlanType(double ratio) {
        this.ratio = ratio;
    }
}
