package staff;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Employee {
    private String name;
    private String nationalInsurance;
    private double salary;
    public Employee(String _name, String _nationalInsurance, double _salary){
        this.name=_name;
        this.nationalInsurance=_nationalInsurance;
        this.salary=_salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String _name) {
        if (_name!=null&&_name!="") {
            this.name = _name;
        }else {
            System.out.println("noooo can't do that silly");
        }
    }
    public String getNI(){
        return nationalInsurance;
    }
    public double getSalary(){
        return salary;
    }
    public void raise(double amount){
        if (amount>=0){
            this.salary+=amount;
        }else {
            System.out.println("raises cannot be negative");
        }
    }
    public double bonus(){
        return salary/100;
    }
}
