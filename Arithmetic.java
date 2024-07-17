package ekta; 
import java.util.*;
public class Arithmetic {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This line will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }
    }
}
