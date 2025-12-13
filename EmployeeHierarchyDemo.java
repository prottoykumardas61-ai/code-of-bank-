class Employee {
    String name;
    int id;
    double basicSalary;
    public Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }
    public void displayInfo() {     
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: $" + basicSalary);     
    }
}
class Manager extends Employee {
    String department;
    public Manager(String name, int id, double basicSalary, String department) {
        super(name, id, basicSalary);
        this.department = department;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);      
    }
}
public class EmployeeHierarchyDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Prottoy Kumar Das", 242002041, 50000.00);
        Manager mgr = new Manager("Mr. Rahim", 201, 80000.00, "Sales");
        System.out.println("Displaying Employee object info:");
        emp.displayInfo();
        System.out.println("\nDisplaying Manager object info:");
        mgr.displayInfo();
    }
}

