

import java.util.Random;

public class Company {

    private static Random random = new Random();
    private String nameCompany;
    private double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public static Profession random() {
        Profession[] vacancyProfession = Profession.values();
        return vacancyProfession[random.nextInt(vacancyProfession.length)];
    }

    public Vacancy createVacancy() {
        double salary = 2500 + random.nextDouble() * (maxSalary - 2500);
        Profession vacancyProfession = random();
        Vacancy vacancy = new Vacancy(nameCompany, salary, vacancyProfession);
        return vacancy;
    }

    public void needEmployee() {
        Vacancy vacancy = createVacancy();
        jobAgency.sendOffer(nameCompany, vacancy.salary, vacancy.vacancyProfession);
    }
}
