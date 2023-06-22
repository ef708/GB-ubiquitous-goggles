public abstract class Fruit {

    private final double WEIGHT;
    private String NAME;

    public Fruit(double weight, String name) {
        this.WEIGHT = weight;
        this.NAME = name;
    }

    public double getWEIGHT() {
        return WEIGHT;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "WEIGHT=" + WEIGHT +
                ", NAME=" + NAME +
                '}';
    }
}