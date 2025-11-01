class Employee {
    double calculateSalary() {
        return 0;
    }
}

class Manager extends Employee {
    double baseSalary = 50000;
    double bonus = 10000;

    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Programmer extends Employee {
    double baseSalary = 40000;
    double overtimePay = 5000;

    double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager m = new Manager();
        Programmer p = new Programmer();

        System.out.println("Manager Salary: " + m.calculateSalary());
        System.out.println("Programmer Salary: " + p.calculateSalary());
    }
}