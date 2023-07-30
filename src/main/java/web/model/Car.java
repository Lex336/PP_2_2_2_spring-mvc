package web.model;

public class Car {
    private String model;
    private int speed;
    private int power;

    public Car(String model, int speed, int power) {
        this.model = model;
        this.speed = speed;
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

}