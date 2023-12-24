package org.example.domain;

import java.util.Map;

public non-sealed class GeneralVehicle implements Vehicle {

    private double value;
    private Map<String, Object> attributesVehicle;

    public GeneralVehicle(Map<String, Object> attributesVehicle) {
        this.attributesVehicle = attributesVehicle;
    }

    @Override
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Map<String, Object> getAttributesVehicle() {
        return attributesVehicle;
    }

    public void setAttributesVehicle(Map<String, Object> attributesVehicle) {
        this.attributesVehicle = attributesVehicle;
    }
}
