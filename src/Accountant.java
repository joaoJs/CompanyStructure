public class Accountant extends BusinessEmployee{
    private TechnicalLead teamSupporting = null;

    public Accountant(String name) {
        super(name);
        super.setBonusBudget(0);
    }

    public TechnicalLead getTeamSupported() {
        return teamSupporting;
    }

    public void supportTeam(TechnicalLead lead) {
        this.teamSupporting = lead;
        super.setBonusBudget(75000);
    }

    public boolean approveBonus(double bonus) {
        if (teamSupporting == null || bonus > super.getBonusBudget()) {
            return false;
        } else {
            return true;
        }
    }

    public String employeeStatus() {
        return super.employeeStatus() + " and is supporting " + teamSupporting;
    }

    //@Override
    public double getBaseSalary() {
        return super.getBaseSalary();
    }

//    public void setBonusBudget(double b) {
//        super.setBonusBudget(b);
//    }
}
