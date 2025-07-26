import java.util.Scanner;

public class Compare 
{
    public static void main(String[] args) 
    {
        Scanner Num = new Scanner(System.in);
        System.out.println("ENter the Two Numbers:");
        int Number1 = Num.nextInt();
        int Number2 = Num.nextInt();
        if(Number1 > Number2)
        System.out.printf("The Greater Number is: %d.\n",Number1);
        else if(Number2 > Number1)
        System.out.printf("The Greater Number is: %d.\n",Number2);
        else
        System.err.println("The two Numbers are Equal.");
    }
}
        
        