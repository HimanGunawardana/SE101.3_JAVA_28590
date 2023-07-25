
package lab05.pkg29;

public class Employee {
    private int empID;
    private String empName;
    private String empDesignation;
    
    //setter
    public void setData(int empID,String empName,String empDesignation){
        this.empID = empID;
        this.empName = empName;
        this.empDesignation = empDesignation;
    }
    
//    public void setEmpId(int empID){
//        this.empID = empID;
//    }
    //getter
    public int getEmpID(){
        return empID;
    }
    
//    public void setEmpName(String empName){
//        this.empName = empName;
//    }
    //getter
    public String getEmpName(){
        return empName;
    }
    
//    public void setDesignation(String empDesignation){
//        this.empDesignation = empDesignation;
//    }
    //getter
    public String getDesignation(){
        return empDesignation;
    }
    
    
}
