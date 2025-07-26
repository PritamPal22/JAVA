import java.util.*;

public class Fibonacci {
    public static int RecursionFibonaci(int N) {
        if(N==0)
            return 0;
        if(N==1)
            return 1;
        return RecursionFibonaci(N-2)+RecursionFibonaci(N-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Terns N: ");
        int N  = sc.nextInt();
        
        System.out.println("The Fibbonacci Series is:- ");
        for(int i=0;i<N;i++) {
            System.out.printf("%d\t",RecursionFibonaci(i));
        }
    }
}