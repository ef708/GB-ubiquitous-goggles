public class Program {

    public static void main(String[] args) {
        Order order = new Order();
        Input input = new Input();
        SaveTo saveTo = new SaveTo();
        input.inputFromConsole(order);
        saveTo.saveToJson(order);
    }
}
