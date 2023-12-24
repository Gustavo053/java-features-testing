package org.example.domain;

public final class Car implements Vehicle {

    private String category;
    private double value;

    public Car(String category, double value) {
        this.category = category;
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
