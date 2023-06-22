public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return 0;
    }

    public void setFood(Object object) {
    }

    public void feedCat(int amount) {
        this.food += amount;
        System.out.printf("Добавлено %d ед. корма, в миске %d ед.\n", amount, food);
    }

    public boolean eatFood(int amount) {
        if (this.food < amount) {
            System.out.println("\nНе хватает корма для сытости.");
            return false;
        }
        this.food -= amount;
        System.out.printf("\nИз миски удалено %d ед. корма, осталось %d ед.\n", amount, food);
        return true;

    }
}