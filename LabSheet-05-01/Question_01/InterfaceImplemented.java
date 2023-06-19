package lab.pkg12.pkg06.pkg2023;

public class InterfaceImplemented implements MyFirstInterface{
    
    @Override
    public void display() {
        // Changing the value of x is not allowed
        // x = 20; // This would result in a compilation error

        System.out.println("The value of x is: " + x);
    }
}
