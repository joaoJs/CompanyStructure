public class SoftwareEngineer extends TechnicalEmployee{
    private boolean accessToCode = false;

    public SoftwareEngineer(String name) {
        super(name);
        super.setCheckins(0);
    }

    public boolean getCodeAccess() {
        return accessToCode;
    }

    public void setCodeAccess(boolean access) {
        accessToCode = access;
    }

    public int getSuccessfulCheckIns() {
        return super.getCheckins();
    }

    public boolean checkInCode() {
        if (accessToCode) {
            super.checkin();
            return true;
        } else {
            accessToCode = false;
            return false;
        }
    }

    public String employeeStatus() {
        return super.employeeStatus();
    }

}
