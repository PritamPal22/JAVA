import java.util.Scanner;

public class OddEven 
{
    public static void main(String[] args) 
    {
        Scanner Num = new Scanner(System.in);
        System.out.print("Enter the number to Check: ");
        int Number = Num.nextInt(); 
        if(Number%2 == 0)
        {
            System.out.println("The Entered number is Even.");
        }  
        else
        {
            System.out.println("The Entered number is Odd.");
        }
    }
}