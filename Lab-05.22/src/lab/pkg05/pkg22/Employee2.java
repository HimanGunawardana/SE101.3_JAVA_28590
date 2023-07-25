
package lab.pkg05.pkg22;

public class Employee2 {
    //input data
    private String Name;
    private int Age;
    private int Salary;
    
    //constructer
    //constructer name must be the same as the class name
    public Employee2(String N,int Ag,int Sal)
    {
        this.Name=N;
        this.Age=Ag;
        this.Salary=Sal;
    }
    
    public String getName()
    {
        return Name;
    }
    public int getAge()
    {
        return Age;
    }
    public int getSalary()
    {
        return Salary;
    }
    
    
}
