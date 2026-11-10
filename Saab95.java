import java.awt.*;

public class Saab95 extends Car {

    private boolean turboOn;
    private double currentSpeed;
    
    public Saab95() {
        super.setColor(Color.red);
        super.setNrDoors(2);
        super.setModelName("Saab95");
        super.setEnginePower(125);
        turboOn = false;
        stopEngine();
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    @Override
    public double speedFactor() {
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }



}
