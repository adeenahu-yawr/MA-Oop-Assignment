class Employee2 {
    String name = "Employee";
    double basicSalary = 30000;

    void showSalary() {
        System.out.println(name + "'s basic salary: " + basicSalary);
    }
}

class Manager extends Employee2 {
    double bonus = 15000;

    Manager() {
        name = "Manager";
    }

    double totalSalary() {
        return basicSalary + bonus;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.showSalary();  // inherited method
        System.out.println("Manager's total salary: " + m.totalSalary());
    }
}
