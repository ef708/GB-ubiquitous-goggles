package GB.Architecture.pt3.DIP;

public class Car {
    int maxSpeed;
    String model;

    public Car(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;

        IEngine engine = new Petrol();
        engine.start();
    }

}
