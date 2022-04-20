package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{

    private boolean isOn;

    public TemperatureSensor() {
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if (!this.isOn) {
            throw new IllegalStateException("Ops");
        }
        return (new Random().nextInt(60) - 30);
    }
}
