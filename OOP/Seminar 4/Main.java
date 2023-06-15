public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Box<Fruit> boxOfApple = new Box<>();
        boxOfApple.addFruitToBox(apple1);
        boxOfApple.addFruitToBox(apple2);
        boxOfApple.addFruitToBox(apple3);
        boxOfApple.getWeiht();
        System.out.println(boxOfApple);

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Fruit> boxOfOrange = new Box<>();
        boxOfOrange.addFruitToBox(orange1);
        boxOfOrange.addFruitToBox(orange2);
        boxOfOrange.addFruitToBox(orange3);
        boxOfOrange.addFruitToBox(apple1);
        boxOfOrange.getWeiht();
        System.out.println(boxOfOrange);

        Box<Fruit> emptyBox = new Box<>();
        System.out.println("box1 == box2: " + boxOfApple.compare(boxOfOrange));
        System.out.println("box1 == box1: " + boxOfApple.compare(boxOfApple));
        System.out.println("box3 == box3: " + emptyBox.compare(emptyBox));
        System.out.println(emptyBox);
        boxOfApple.transferFruitsToBox(emptyBox, 3);
        boxOfApple.addFruitToBox(orange1);
        boxOfApple.addFruitToBox(apple1);

        System.out.println(boxOfApple + "\n" + emptyBox);
        emptyBox.transferFruitsToBox(boxOfOrange, 2);
        System.out.println(boxOfOrange + "\n" + emptyBox);
    }
}
