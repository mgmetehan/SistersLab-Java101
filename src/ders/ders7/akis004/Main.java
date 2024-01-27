package src.ders.ders7.akis004;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Okkes", 30000, 52, 2022);
        System.out.println("Bonus: " + employee1.bonus());
        System.out.println("Zam: " + employee1.raiseSalary());
        System.out.println("Vergi: " + employee1.tax());
        System.out.println(employee1.toString());
    }
}
