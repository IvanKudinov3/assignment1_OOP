public class Main {

    void main() {
        Volvo240 volvo = new Volvo240();

        volvo.startEngine();
        volvo.gas(0.5);
        IO.println("Volvo after gas: " + volvo.getCurrentSpeed());

        volvo.brake(0.5);
        IO.println("Volvo after brake: " + volvo.getCurrentSpeed());

        volvo.stopEngine();
        IO.println("Volvo after stop: " + volvo.getCurrentSpeed());

        Saab95 saab = new Saab95();

        saab.startEngine();
        saab.gas(0.5);
        IO.println("Saab turbo OFF: " + saab.getCurrentSpeed());

        saab.stopEngine();
        saab.startEngine();
        saab.setTurboOn();
        saab.gas(0.5);
        IO.println("Saab turbo ON: " + saab.getCurrentSpeed());
    }
}