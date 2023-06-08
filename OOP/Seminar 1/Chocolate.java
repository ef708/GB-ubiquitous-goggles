public class Chocolate extends Product {

    int cocoaContent;

    public Chocolate(String name, double cost, int cocoaContent) {
        super(name, cost);
        this.cocoaContent = cocoaContent;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", percentageOfCocoa: %s", this.cocoaContent);
    }
}