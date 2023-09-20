package management;

public class Director extends Manager {
    private double budget;
    public Director(String _name, String _nationalInsurance, double _salary, String _deptName, double _budget) {
        super(_name, _nationalInsurance, _salary, _deptName);
        this.budget=_budget;
    }

    public double getBudget() {
        return budget;
    }
    public double bonus(){
        return super.bonus()*2;
    }
}
