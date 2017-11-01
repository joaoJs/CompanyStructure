public class Employee {
    private String name;
    private double baseSalary;
    private int uniqueId = 0;
    private static int id = 0;
    private Employee manager;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        id++;
        this.uniqueId = id;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double b) {
        this.baseSalary = b;
    }

    public String getName() {
        return this.name;
    }



    public int getEmployeeID() {
        return this.id;
    }

    public void setManager(Employee e) {
        this.manager = e;
    }

    public Employee getManager() {
        return this.manager;
    }

    public boolean equals(Employee other) {
        return this.id == other.id;
    }

    public String toString() {
        return uniqueId + " " + name;
    }

    public String employeeStatus() {
        return "Employee";
    }
}
