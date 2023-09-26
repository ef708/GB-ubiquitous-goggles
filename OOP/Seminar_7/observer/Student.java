
import java.util.Random;

public class Student extends Employee implements Observer {

    private static Random random = new Random();

    public Student(String name, Profession profession) {
        super(name, profession);
        minSalary = 20000 + random.nextDouble() * 10000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Profession vacancyProfession) {
        super.receiveOffer(nameCompany, salary, vacancyProfession);
    }
}
