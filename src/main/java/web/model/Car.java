package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private int id;
    private String model;
    private String country;
    private int maxSpeed;

    public Car() {
    }

    public Car(int id, String model, String country, int maxSpeed) {
        this.id = id;
        this.model = model;
        this.country = country;
        this.maxSpeed = maxSpeed;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
