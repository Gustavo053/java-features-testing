package org.example.domain;

public sealed class Truck implements Vehicle permits Semitrailer {

    private double value;

    @Override
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
