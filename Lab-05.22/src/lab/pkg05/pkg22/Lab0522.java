
package lab.pkg05.pkg22;

public class Lab0522 {

    public static void main(String[] args) {
        
        //Employee1
        Employee em = new Employee();
        
        em.setName("Himan");
        System.out.println("Name is: "+em.getName());
        
        em.setAge(25);
        System.out.println("Age is: "+em.getAge());
        
        em.setSalary(30000);
        System.out.println("Salary is: "+em.getSalary());
        
        //Employee2
        Employee2 em2 = new Employee2("Henuka", 24, 34600);
        System.out.println("Name "+em2.getName());
        System.out.println("Age "+em2.getAge());
        System.out.println("Salary "+em2.getSalary());
    }
    
}
