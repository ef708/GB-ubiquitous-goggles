import java.util.Random;

public abstract class Employee {
    protected static Random random = new Random();

    protected String name;
    protected double minSalary;
    protected Profession profession;

    public Employee(String name, Profession profession) {
        this.name = name;
        minSalary = 80000 + random.nextDouble() * 20000;
        this.profession = profession;
    }

    public void receiveOffer(String nameCompany, double salary, Profession vacancyProfession) {
        if (vacancyProfession.equals(profession)) {
            if (minSalary <= salary) {
                System.out.printf("%s (%.2f) >>> Работа мне подходит (%s - %f)\n",
                        name, minSalary, nameCompany, salary);
                minSalary = salary;
            } else {
                System.out.printf("%s (%.2f) >>> Работа не подходит (%s - %f)\n",
                        name, minSalary, nameCompany, salary);
            }
        } else {
            System.out.printf("%s не подходит вакансия %s, потому что он - %s\n", name, vacancyProfession.toString(),
                    profession.toString());
        }
    }
}