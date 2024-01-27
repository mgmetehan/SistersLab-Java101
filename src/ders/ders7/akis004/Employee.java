package src.ders.ders7.akis004;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public double tax() {
        if (salary < 15000) {
            return 0;
        } else {
            return salary * 0.10;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 150;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int result = 2024 - hireYear;
        if (result < 1) {
            return 0;
        } else if (result > 1 && result < 3) {
            return salary * 0.10;
        } else {
            return salary * 0.25;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}


