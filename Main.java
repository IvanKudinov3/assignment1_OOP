public class Main {

    void main() {
        Volvo240 volvo = new Volvo240();

        IO.println("Start: " + volvo.getX() + ", " + volvo.getY());
        IO.println("Direction: " + volvo.getDirection());

        volvo.move(); // speed is zero: position should stay (0, 0)
        IO.println("Stopped move: " + volvo.getX() + ", " + volvo.getY());

        volvo.startEngine();
        volvo.gas(0.5); // Volvo speed is 0.725
        volvo.move();   // NORTH: y increases by 0.725
        IO.println("After NORTH move: " + volvo.getX() + ", " + volvo.getY());

        volvo.turnRight(); // EAST
        IO.println("Direction after right turn: " + volvo.getDirection());
        volvo.move(); // EAST: x increases by 0.725
        IO.println("After EAST move: " + volvo.getX() + ", " + volvo.getY());

        Saab95 saab = new Saab95();
        saab.startEngine();
        saab.move(); // NORTH: y increases by 0.1
        IO.println("Saab position: " + saab.getX() + ", " + saab.getY());
    }
}