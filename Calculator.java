
package tests;
public class Calculator {
	
	public int add(int a, int b) {
       return a + b;
   }
	
	public double divide(double a, double b) {
       if (b == 0) {
           throw new ArithmeticException("Cannot divide by zero");
       }
       return a / b;
   }
  
}

