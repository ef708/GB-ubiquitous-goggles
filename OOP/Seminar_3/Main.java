import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employees.add(generateEmployee());
        }
        Collections.sort(employees, new SortBySurnameName());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Collections.sort(employees, new SortByJobAndMoney());
        System.out.println("");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static Random random = new Random();

    static Employee generateEmployee() {
        int count = random.nextInt(0, 3);
        String[] names = new String[] { "Иван1", "Иван2", "Иван6", "Иван3", "Иван4", "Иван5", "Иван43", "Иван15",
                "Иван89", "Иван77" };
        String[] surnames = new String[] { "Иванов", "Иванов55", "Петров", "Сидоров", "Иванов6", "Иванов2", "Иванов543",
                "Иванов98", "Иванов75", "Иванов99" };
        int salaryPerHour = random.nextInt(100, 5000);
        int salaryPerDay = random.nextInt(3000, 8000);
        int salaryPerMonth = random.nextInt(20000, 80000);
        if (count == 0) {
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                    salaryPerDay, random.nextInt(1, 27));
        } else if (count == 1)
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                    salaryPerHour, random.nextInt(1, 181));
        else {
            return new Itr(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                    salaryPerMonth);

        }
    }
}
