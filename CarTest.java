
class CarTest {
    private static void reportResult(String testName, boolean success) {
        IO.println((success ? "SUCCESS: " : "FAILURE: ") + testName);
    }

    /** Tests whether a Saab95 with turbo enabled
     *  gains more speed than one without.
     */
    private static void testTurbo() {
        Saab95 slowSaab = new Saab95();
        Saab95 fastSaab = new Saab95();
        fastSaab.setTurboOn();
        slowSaab.setTurboOff();
        fastSaab.gas(0.5);
        slowSaab.gas(0.5);
        boolean result = slowSaab.getCurrentSpeed() < fastSaab.getCurrentSpeed();
        reportResult("Turbo yields more speed", result);
    }

    // Test StartEngine
    private static void testStartEngine() {
        Volvo240 volvo240 = new Volvo240();

        volvo240.startEngine();

        boolean result = volvo240.getCurrentSpeed() == 0.1;
        reportResult("Start engine sets speed to 0.1", result);
    }

    // Test StopEngine
    private static void testStopEngine() {
        Volvo240 volvo240 = new Volvo240();

        volvo240.startEngine();
        volvo240.stopEngine();

        boolean result = volvo240.getCurrentSpeed() == 0.0;
        reportResult("Stop engine sets speed to 0.0", result);
    }

    // Test Movement
    private static void testMovement() {
        Volvo240 volvo240 = new Volvo240();

        volvo240.startEngine();
        volvo240.move();

        boolean result1 = volvo240.getX() == 0.0;
        boolean result2 = volvo240.getY() == 0.1;
        boolean result3 = volvo240.getDirection() == Direction.NORTH;

        reportResult("Volvo240 is moving", result1&&result2&&result3);
    }

    // Test turnRight
    private static void testTurnRight() {
        Volvo240 volvo240 = new Volvo240();

        volvo240.turnRight();

        boolean result1 = volvo240.getX() == 0.0;
        boolean result2 = volvo240.getY() == 0.0;
        boolean result3 = volvo240.getDirection() == Direction.EAST;

        reportResult("While facing north, turning right, you will be facing", result1&&result2&&result3);
    }

    // Test turnLeft
    private static void testTurnLeft() {
        Volvo240 volvo240 = new Volvo240();

        volvo240.turnLeft();

        boolean result1 = volvo240.getX() == 0.0;
        boolean result2 = volvo240.getY() == 0.0;
        boolean result3 = volvo240.getDirection() == Direction.WEST;

        reportResult( "While facing north, turning left, you will be facing", result1&&result2&&result3);

    }
    static void main() {
        testTurbo();
        testStartEngine();
        testStopEngine();
        testMovement();
        testTurnRight();
        testTurnLeft();
    }

}