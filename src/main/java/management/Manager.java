package management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;
    public Manager(String _name, String _nationalInsurance, double _salary, String _deptName) {
        super(_name, _nationalInsurance, _salary);
        this.deptName=_deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
