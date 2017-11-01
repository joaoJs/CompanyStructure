import java.util.*;
public class BusinessLead extends Accountant{
    private int headCount = 10;
    private double baseSalary;
    private ArrayList<Accountant>reports = new ArrayList<>();
    private double bonusBudget;

    public BusinessLead(String name) {
        super(name);
        this.baseSalary = super.getBaseSalary() * 2;
        this.bonusBudget = super.getBonusBudget();
    }

    public boolean hasHeadCount() {
        return this.reports.size() < this.headCount;
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        System.out.println(e.getBaseSalary());
        if (hasHeadCount()) {
            reports.add(e);
            e.setManager(this);
            this.bonusBudget += e.getBaseSalary() * 1.1;
            e.supportTeam(supportTeam);
            return true;
        } else {
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus) {
        if (bonus < bonusBudget) {
            e.setBaseSalary(e.getBaseSalary() + bonus);
            this.bonusBudget -= bonus;
            return true;
        } else {
            return false;
        }
    }

    public boolean approveBonus(Employee e, double bonus) {
        for (int i = 0; i < this.reports.size(); i++) {
            Accountant accountant = reports.get(i);
            if (accountant.getTeamSupported() != null && accountant.getTeamSupported() == e.getManager()) {
                if (accountant.approveBonus(bonus)) {
                    e.setBaseSalary(e.getBaseSalary() + bonus);
                    return true;
                }
            } else {
                return false;
            }
        }
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

