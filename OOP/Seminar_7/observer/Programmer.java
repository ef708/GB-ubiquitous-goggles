import java.util.Random;

public class Programmer extends Employee implements Observer {

    private static Random random = new Random();

    public Programmer(String name, Profession profession) {
        super(name, profession);
        minSalary = 80000 + random.nextDouble() * 250000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Profession vacancyProfession) {
        super.receiveOffer(nameCompany, salary, vacancyProfession);
    }
}