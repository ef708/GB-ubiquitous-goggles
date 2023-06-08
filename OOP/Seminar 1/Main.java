public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("Картофель", 50));
        vm.addProduct(new Product("Сахар", 33));
        vm.addProduct(new Drink("Сок", 65, 0.83, Drink.DrinkType.JUICE));
        vm.addProduct(new Chocolate("Шоколад, Китай", 50, 10));

        System.out.println(vm);
    }
}
