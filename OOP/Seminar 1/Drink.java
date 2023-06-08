public class Drink extends Product {

    double volume;
    DrinkType type;

    public enum DrinkType {

        JUICE,
        MINERALWATER,
        SODA,
        WATER,
        COLDTEA,
        MILK

    }

    public Drink(String name, double cost, double volume, DrinkType type) {
        super(name, cost);
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", volume: %f, type: %s", this.volume, this.type);
    }
}
