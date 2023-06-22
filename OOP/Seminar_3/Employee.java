public abstract class Employee {

    protected String name;
    protected String surname;
    protected double salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public abstract double calculateAvgMonthlySalary();
}
