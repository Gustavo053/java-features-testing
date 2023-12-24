package org.example.domain;

public sealed interface Vehicle permits Car, Truck, GeneralVehicle {

    double getValue();
}
