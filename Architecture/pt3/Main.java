package GB.Architecture.pt3;

import GB.Architecture.pt3.OCP.*;

public class Main {
    public static void main(String[] args) {

    }

    public static void mainOcp() {
        Vehicle car = new Car(111);
        car.calculateAllowedSpeed();
        Vehicle bus = new Bus(11);
        bus.calculateAllowedSpeed();

    }
}
