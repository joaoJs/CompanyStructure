public class Employee {
    private String name;
    private double baseSalary;
    private static int id = 0;
    private Employee manager;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        id++;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public String getName() {
        return this.name;
    }

    public int getEmployeeID() {
        return this.id;
    }

    public Employee getManager() {
        return this.manager;
    }

    public boolean equals(Employee other) {
        return this.id == other.id;
    }

    public String toString() {
        return this.id + " " + name;
    }

    public String employeeStatus() {
        return "Employee";
    }
}
