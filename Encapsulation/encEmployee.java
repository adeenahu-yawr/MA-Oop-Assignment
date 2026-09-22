public class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Ahmed");
        emp.setSalary(55000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
