package org.example;

import org.example.domain.Bike;
import org.example.domain.Car;
import org.example.domain.Semitrailer;
import org.example.domain.Truck;
import org.example.dto.TestRecord;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var bikeAttributes = new HashMap<String, Object>();
        bikeAttributes.put("color", "red");
        var bike = new Bike(bikeAttributes, "BMX");
        bike.setValue(1000);

        System.out.println("---------BIKE INFORMATIONS---------");
        System.out.println("Value: " + bike.getValue());
        System.out.println("Brand: " + bike.getBrand());
        System.out.println("Attributes: " + bike.getAttributesVehicle());


        var semitrailer = new Semitrailer(false);
        semitrailer.setValue(500000);
        System.out.println("---------SEMITRAILER INFORMATIONS---------");
        System.out.println("Value: " + semitrailer.getValue());
        System.out.println("Is semitrailer with rails: " + semitrailer.isSemitrailerWithRails());


        var truck = new Truck();
        truck.setValue(250000);
        System.out.println("---------TRUCK INFORMATIONS---------");
        System.out.println("Value: " + truck.getValue());


        var car = new Car("Exclusive category", 150000);
        System.out.println("---------CAR INFORMATIONS---------");
        System.out.println("Category: " + car.getCategory());
        System.out.println("Value: " + car.getValue());


        var testRecord1 = new TestRecord("Hello world!", "This is my first record");
        System.out.println("---------TEST RECORD 1---------");
        System.out.println("First message: " + testRecord1.messageTest());
        System.out.println("Second message: " + testRecord1.otherMessageTest());


        var testRecord2 = new TestRecord("Hello record!");
        System.out.println("---------TEST RECORD 2---------");
        System.out.println("First message: " + testRecord2.messageTest());
        System.out.println("Second message: " + testRecord2.otherMessageTest());


        System.out.println("---------TEST SWITCH PATTERN MATCHING---------");
        var result = doSwitchObj(semitrailer);
        System.out.println(result);
    }

    private static String doSwitchObj(Object obj) {
        return switch (obj) {
            case Bike b -> String.format("This is a bike. Class: %s", b.getClass());
            case Car c -> String.format("This is a car. Class: %s", c.getClass());
            case Semitrailer s -> String.format("This is a semitrailer. Class: %s", s.getClass());
            case Truck t -> String.format("This is a truck. Class: %s", t.getClass());
            default -> obj.toString();
        };
    }
}