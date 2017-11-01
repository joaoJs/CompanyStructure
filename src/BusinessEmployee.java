public class BusinessEmployee extends Employee {
    private double bonusBudget = 0;

    public BusinessEmployee(String name) {
        super(name, 50000);
    }

    public double getBonusBudget() {
        return bonusBudget;
    }

    public void setBonusBudget(double b) {
        this.bonusBudget = b;
    }

    public String employeeStatus() {
        return super.toString() + " with a budget of " + bonusBudget;
    }

    public double getBaseSalary() {
        return super.getBaseSalary();
    }

}
