/*
 * Name of program: Car
 * Name of file: Car.java
 * Maker: Rasmus Sorri
 * This class makes and operates a car object.
 * Last modified: 2025-01-18
 * Written with Visual Studio Code
 */

package main;

public class Car {
    String brand;
    String model;
    Integer speed = 0;
    public Object setBrand;


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void accelerate(int number) {
        speed += number;;
    }

    public void deaccelerate(int number) {
        speed -= number;
        if (speed < 0) {
            speed = 0;
        }
    }

    public void status() {
        System.out.println("Auto: " + brand + " " + model + ", Nopeus: " + speed + " km/h");
    }
}