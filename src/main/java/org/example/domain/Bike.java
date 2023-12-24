package org.example.domain;

import java.util.Map;

public class Bike extends GeneralVehicle {

    private String brand;

    public Bike(Map<String, Object> attributesVehicle, String brand) {
        super(attributesVehicle);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
