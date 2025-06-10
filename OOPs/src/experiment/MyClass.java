package experiment;

public class MyClass 
{
    private int number; // Instance variable

    public MyClass(int number)  //local variable parameter
    {
        this.number = number; // Accessing instance variable using "this"
    }

    public void printNumber() 
    {
        System.out.println("Instance variable number: " + this.number); // Accessing instance variable using "this"
    }
    
    
    
    
}