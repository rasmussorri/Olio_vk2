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

    public void carAccelerate(int number) {
        speed += number;;
    }

    public void carBrake(int number) {
        speed -= number;
        if (speed < 0) {
            speed = 0;
        }
    }
}