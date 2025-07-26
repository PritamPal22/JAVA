import java.util.*;

public class Recursion1 {

    /*public static int PrintSumOfNNaturalNumbers(int N) {
        
        if(N==0)
            return 0;

        return N + Printsum(N-1);
    }*/

    /*public static int Factorial(int N) {
        if(N==1 || N==0)
            return 1;
        return N*Factorial(N-1);
    }*/

    /*public static int CalculatePower(int X, int N) {  //STACK HEIGHT = logn/log2
        if(N==0)
            return 1;
        if(X==0)
            return 0;
        if(N%2 == 0) {
            return CalculatePower(X, N/2) * CalculatePower(X, N/2);
        }
        else {
            return CalculatePower(X, N/2) * CalculatePower(X, N/2) * X;
        }
    }*/

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the variable X: ");
        int X  = sc.nextInt();
        System.out.print("Enter the Terns N: ");
        int N  = sc.nextInt();

        //System.out.println("The sum of first " + N + " natural numbers is: " + PrintSumOfNNaturalNumbers(N));
        //System.out.println("The factorial of " + N + " is: " + Factorial(N));

        //System.out.println("The X^N is: "+ CalculatePower(X, N));
    }

}