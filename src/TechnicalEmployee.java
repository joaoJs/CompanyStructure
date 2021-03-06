public class TechnicalEmployee extends Employee{
    private int checkins = 0;
    private int id;


    public TechnicalEmployee(String name) {
        super(name, 75000);
    }

    public void checkin() {
        this.checkins++;
    }

    public void setCheckins(int c) {
        if (c == 0) {
            checkins = c;
        }
    }

    public int getCheckins() {
        return checkins;
    }

    public double getBaseSalary() {
        return super.getBaseSalary();
    }

    public String employeeStatus() {
        return super.toString() + " has " + checkins + " successful check ins ";
    }

}
