//import java.lang.*;
import java.util.*;

public class BitwiseOperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = sc.nextInt();

        /*int Quotient;
        int Remainder;
        double B;
        int count = 0;
        do { 
            Quotient = N/2;
            Remainder = N%2;
            B = Math.pow(10,count)+Remainder;
            count++;
        } while (Quotient>=2);
        double Binary = B + (Math.pow(10,count) + Remainder);
        System.out.println("The Binary of " + N + "is: " + Binary);*/

        String binaryString = Integer.toBinaryString(N);
        System.out.println("The Binary of " + N + " is: " + binaryString);

        System.out.print("Enter the position to operate bitwise operater: ");        
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        System.out.print("Enter Q/q for  Quit or C/c to continue: ");
        char choice = sc.next().charAt(0);

        //Get Bit Operator
        /*while(true) {
            if (choice == 'Q' || choice == 'q') {
                System.out.println("Exiting the program.");
                break;
            } 
            else if(choice == 'C' || choice == 'c') {
                if((bitMask & N) == 0) {
                    System.out.println("The wanted bit is zero (0)");
                    //break;
                } else {
                    System.out.println("The wanted bit is Non zero (1)");
                    //break;
                }
            }
            else {
                System.out.println("Invalid choice. Please enter Q/q to quit or C/c to continue.");
            }
            System.out.print("Enter Q/q for Quit or C/c to continue: ");
            choice = sc.next().charAt(0);
        }*/

        //Set Bit Operator
        /*while(true) {
            if (choice == 'Q' || choice == 'q') {
                System.out.println("Exiting the program.");
                break;
            } 
            else if(choice == 'C' || choice == 'c') {
                int NewNumber = N | bitMask;
                System.out.println("The New Number after setting the bit at position " + pos + " is: " + NewNumber);
                //break;
            }
            else {
                System.out.println("Invalid choice. Please enter Q/q to quit or C/c to continue.");
            }
            System.out.print("Enter Q/q for Quit or C/c to continue: ");
            choice = sc.next().charAt(0);
        }*/

        //Clear Bit Operator
        while(true) {
            if (choice == 'Q' || choice == 'q') {
                System.out.println("Exiting the program.");
                break;
            } 
            else if(choice == 'C' || choice == 'c') {
                int Number1 = ~bitMask;
                int Number2 = N & Number1;
                System.out.println("The New Number after setting the bit at position " + pos + " is: " + Number2);
                //break;
            }
            else {
                System.out.println("Invalid choice. Please enter Q/q to quit or C/c to continue.");
            }
            System.out.print("Enter Q/q for Quit or C/c to continue: ");
            choice = sc.next().charAt(0);
        }
    }
}