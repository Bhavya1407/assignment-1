import java.lang.FunctionalInterface;

// this is functional interface
@FunctionalInterface
interface MyInterface{

    // abstract method
    double calculate();
}

public class Simpleinterest {

    public static void main( String[] args ) {
    	double p=1, r=1, t=1;
    	double SI=(p*t*r)/100;

    
    System.out.println("Simple interest = " + SI);
    } 
}
