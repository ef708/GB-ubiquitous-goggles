import java.util.ArrayList;

public class Box<F extends Fruit> {
    public double sumOfWeigt = 0;
    public int count = 0;
    private String name = "Empty box";
    private ArrayList<F> fruits = new ArrayList<F>();

    public Box() {
    }

    public ArrayList<F> getFruits() {
        return fruits;
    }

    public void addFruitToBox(Fruit fruits) {
        if (name.equals(fruits.getNAME()) || name.equals("Empty box") ||
                fruits.getNAME().equals("Orange") && name.equals("Empty box for Orange") ||
                fruits.getNAME().equals("Apple") && name.equals("Empty box for Apple")) {
            if (this.fruits.size() == 0)
                count = 0;
            this.fruits.add((F) fruits);
            name = fruits.getNAME();
            this.sumOfWeigt = getWeiht();
        } else {
            System.out.println("Недопустимая операция");
            System.out.println(fruits.getNAME() + " " + name);
        }
    }

    public double getWeiht() {
        for (; count < fruits.size(); count++) {
            sumOfWeigt = sumOfWeigt + fruits.get(count).getWEIGHT();
        }
        if (fruits.size() == 0)
            sumOfWeigt = 0;
        return sumOfWeigt;
    }

    public boolean compare(Box<F> box) {
        return getWeiht() == box.getWeiht();
    }

    public void transferFruitsToBox(Box<F> toBox, int countMove) {
        if (countMove > fruits.size() || !name.equals(toBox.name) && !toBox.name.equals("Empty box"))
            return;
        else {
            for (int i = 0; i < countMove; i++) {
                toBox.getFruits().add(fruits.remove(0));
            }
            toBox.name = name;
            this.sumOfWeigt = getWeiht();
            toBox.getWeiht();
            if (fruits.size() == 0)
                name = "Empty box for " + toBox.name;

        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "Box weight=" + sumOfWeigt +
                ", nameOfFruits=" + name +
                ", fruits=" + fruits +
                '}';
    }
}