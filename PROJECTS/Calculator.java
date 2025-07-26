
/*public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        float a = sc.nextFloat();    
        System.out.println("Enter the Second Number:");  
        float b = sc.nextFloat();
        System.out.println("Enter the Operation to be Performed (+, -, *, /):");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+' -> System.out.printf("Sum is %f.\n",(a + b));
            case '-' -> System.out.printf("Difference is %f\n",(a - b));
            case '*' -> System.out.printf("Product is %f",(a * b));
            case '/' -> {
                if (b != 0) {
                    System.out.printf("The division is %f",(a / b));
                } 
                else {
                    System.err.println("Undifined");
                }
            }
            default -> System.err.println("Invalid Operation! Please use +, -, *, or /.");
        }
    }
}*/

/**
 * The Calculator class provides basic arithmetic operations
 * such as addition, subtraction, multiplication, and division.
 * 
 * @author Pritam
 * @version 1.0
 */
public class Calculator {

    /**
     * Adds two integers.
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first number.
     * 
     * @param a the first number
     * @param b the second number
     * @return the result of a minus b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * 
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first number by the second number.
     * 
     * @param a the numerator
     * @param b the denominator (must not be zero)
     * @return the result of division
     * @throws ArithmeticException if b is zero
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    /**
     * Main method to test the Calculator functions.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(10, 4));
        System.out.println("Multiplication: " + calc.multiply(2, 6));
        System.out.println("Division: " + calc.divide(20, 4));
    }
}
