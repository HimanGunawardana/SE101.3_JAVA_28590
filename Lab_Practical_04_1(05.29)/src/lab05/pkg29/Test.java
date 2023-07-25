package lab05.pkg29;

public class Test {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setData(100, "Bogdan", "Lecturer");
        
        Employee e2 = new Employee();
        e2.setData(200, "Bird", "Software Engineer");
        
        System.out.println("Emplyoee ID: "+e1.getEmpID());
        System.out.println("Emplyee Name: "+e1.getEmpName());
        System.out.println("Employee Designation: "+e1.getDesignation()+"\n");
        
        System.out.println("Emplyoee ID: "+e2.getEmpID());
        System.out.println("Emplyee Name: "+e2.getEmpName());
        System.out.println("Employee Designation: "+e2.getDesignation());
        
    }
}
