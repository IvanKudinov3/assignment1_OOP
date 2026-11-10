import java.awt.*;

public abstract class Car implements Movable{

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private Point position;
    private enum directions {North, East, South, West};
    private String direction;

    public Car(){
        Point position = new Point();
    }

    abstract double speedFactor();

    public void setPosition(Point newPos){
        position = newPos;
    }

    public Point getPosition(){
        return position;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public void setNrDoors(int nrDoors){
        this.nrDoors = nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(double speed){
        currentSpeed = speed;
    }

    public void setEnginePower(double power){
        enginePower = power;
    }

    public void setModelName(String name){
        modelName = name;
    }

    public String getModelName(){
        return modelName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public void setDirection(String newDirection){
        direction = newDirection;
    }

    public void move(){

        position.getX() = position.getX() + currentSpeed;
    }

    public void turnLeft(){

    }

    public void turnRight() {

    }

    public void incrementSpeed(double amount) {
        currentSpeed = currentSpeed + speedFactor() * amount;
    }

    public void decrementSpeed(double amount) {
        currentSpeed = currentSpeed - speedFactor() * amount;
    }

    // TODO fix this method according to assignment pm
    public void gas(double amount) {
        incrementSpeed(amount);
    }

    // TODO fix this method according to assignment pm
    public void brake(double amount) {

        decrementSpeed(amount);
    }

}
