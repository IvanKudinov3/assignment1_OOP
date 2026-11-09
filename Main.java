public class Main {

    void main() {
        Volvo240 volvo = new Volvo240();

        volvo.startEngine();
        volvo.gas(0.5);
        IO.println(volvo.getCurrentSpeed());

        volvo.brake(0.5);
        IO.println(volvo.getCurrentSpeed());

        volvo.stopEngine();
        IO.println(volvo.getCurrentSpeed());
    }
}