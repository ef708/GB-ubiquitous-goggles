public class Worker extends Employee {

    private int workDayPerMonth;

    public Worker(String name, String surname, double salaryPerDay, int workDayPerMonth) {
        super(name, surname, salaryPerDay);
        this.workDayPerMonth = workDayPerMonth;

    }

    @Override
    public double calculateAvgMonthlySalary() {
        return salary * workDayPerMonth;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, calculateAvgMonthlySalary());
    }
}