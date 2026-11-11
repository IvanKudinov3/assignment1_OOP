import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;
    private double currentSpeed;
    public Volvo240() {
        super.setColor(Color.black);
        super.setNrDoors(4);
        super.setModelName("Volvo240");
        super.setEnginePower(100);

        stopEngine();
    }

    @Override
    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }




}
