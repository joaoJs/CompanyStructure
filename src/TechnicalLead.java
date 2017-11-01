import java.util.*;
public class TechnicalLead extends TechnicalEmployee{
    private double baseSalary;
    private int headCount = 4;
    private ArrayList<SoftwareEngineer>reports = new ArrayList<>();

    public TechnicalLead(String name) {
        super(name);
        baseSalary = super.getBaseSalary() * 1.3;
    }

    public boolean hasHeadCount() {
        return this.reports.size() < this.headCount;
    }

    public boolean addReport(SoftwareEngineer e) {
        if (hasHeadCount()) {
            this.reports.add(e);
            e.setManager(this);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<SoftwareEngineer> getReports() {
        return reports;
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
        if (this.reports.contains(e) && e.getCodeAccess()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus) {
        return false;
    }


    public String getTeamStatus() {
        String s = "";
        if (this.reports.size() == 0) {
            s = "and no direct reports yet";
        } else {
            s += "and is managing:\n";
            for (int i = 0; i < reports.size(); i++) {
                s += reports.get(i).employeeStatus() + "\n";
            }
        }
        return super.employeeStatus() + s;
    }

}
