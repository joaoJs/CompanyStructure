public class BusinessEmployee extends Employee {
    private double bonusBudget = 0;

    public BusinessEmployee(String name) {
        super(name, 50000);
    }

    public double getBonusBudget() {
        return bonusBudget;
    }

    public String employeeStatus() {
        return super.toString() + " " + bonusBudget;
    }

}
