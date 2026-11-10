import java.awt.Color;

public abstract class Car implements Movable {

    private int nrDoors;
    private double enginePower;
    private double currentSpeed;
    private Color color;
    private String modelName;
    private double x;
    private double y;
    private Direction direction;


    // Constructor
    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        currentSpeed = 0;
        x = 0;
        y = 0;
        direction = Direction.NORTH;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    // However each car has its own speed factor
    public abstract double speedFactor();

    public void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    // TODO fix this method according to task 4
    public void gas(double amount) {
        incrementSpeed(amount);
    }

    // TODO fix this method according to task 4
    public void brake(double amount) {
        decrementSpeed(amount);
    }

    @Override
    public void move() {
        if (direction == Direction.NORTH) {
            y += currentSpeed;
        }  else if (direction == Direction.EAST) {
            x += currentSpeed;
        }  else if (direction == Direction.SOUTH) {
            y -= currentSpeed;
        }  else if (direction == Direction.WEST) {
            x -= currentSpeed;
        }
    }

    @Override
    public void turnLeft() {
        if (direction == Direction.NORTH) {
            direction = Direction.WEST;
        }   else if (direction == Direction.WEST)  {
            direction = Direction.SOUTH;
        }   else if (direction == Direction.SOUTH) {
            direction = Direction.EAST;
        }   else if (direction == Direction.EAST) {
            direction = Direction.NORTH;
        }
    }


    @Override
    public void turnRight() {
        if (direction == Direction.NORTH) {
            direction = Direction.EAST;
        }   else if (direction == Direction.EAST)  {
            direction = Direction.SOUTH;
        }   else if (direction == Direction.SOUTH) {
            direction = Direction.WEST;
        }   else if (direction == Direction.WEST) {
            direction = Direction.NORTH;
        }
    }
}