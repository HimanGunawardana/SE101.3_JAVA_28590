
package lab.pkg05.pkg22.ii;

public class Employee {
    
    private String name;
    private double salary;
    private double bonus;
    
    
    public Employee(String N,double Salary,double Bonus)
    {
        this.name=N;
        this.salary=Salary;
        this.bonus=Bonus;
    }
    
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public double getBonus()
    {
        return bonus;
    }
}
