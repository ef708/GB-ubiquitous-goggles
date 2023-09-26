
public class Program {
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company company1 = new Company("company1", 70000, jobAgency);
        Company company2 = new Company("company2", 100000, jobAgency);
        Company company3 = new Company("company3", 120000, jobAgency);

        Student sidorov = new Student("Сидоров", Profession.Tester);
        Programmer ivanov = new Programmer("Иванов", Profession.Programmist);
        Programmer petrov = new Programmer("Петров", Profession.Analyst);

        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);

        for (int i = 0; i < 2; i++) {
            company1.needEmployee();
            company2.needEmployee();
            company3.needEmployee();
        }
    }
}
