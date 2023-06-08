public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Барсик 1", 20),
            new Cat("Барсик 2", 15),
            new Cat("Барсик 3", 12),
            new Cat("Барсик 4", 12),
            new Cat("Барсик 5", 18),
        };
        
        Plate plate = new Plate(0);
        plate.info();
        plate.feedCat(40);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.printf("Кот %s - сытость %s.\n", cat.getName(), cat.isFull());
            }
        }
    
    }
