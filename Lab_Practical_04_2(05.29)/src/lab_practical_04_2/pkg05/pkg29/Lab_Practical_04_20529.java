
package lab_practical_04_2.pkg05.pkg29;

public class Lab_Practical_04_20529 {

    public static void main(String[] args) {
        
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); 

    }
    
}
