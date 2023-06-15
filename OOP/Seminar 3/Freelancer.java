public class Freelancer extends Employee {

    private double workHour;

    public Freelancer(String name, String surname, double salaryPerHour, double workHour) {
        super(name, surname, salaryPerHour);
        this.workHour = workHour;
    }

    @Override
    public double calculateAvgMonthlySalary() {
        return salary * workHour;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата : %.2f (руб.)", surname, name,
                calculateAvgMonthlySalary());
    }
}
