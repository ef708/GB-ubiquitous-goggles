public class Itr extends Employee {

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    public Itr(String name, String surname, double salaryPerMonth) {
        super(name, surname, salaryPerMonth);
    }

    @Override
    public double calculateAvgMonthlySalary() {
        return salary;
    }

    public String toString() {
        return String.format("%s %s; ИТР; Среднемесячная заработная плата : %.2f (руб.)", surname, name,
                calculateAvgMonthlySalary());
    }
}