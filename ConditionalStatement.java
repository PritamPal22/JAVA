import java.util.*;

/*public class ConditionalStatement 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Age: ");
        int age = sc.nextInt();
        
        if (age >= 18) 
        {
            System.out.println("The Person is an Adult.\nThe Person is also Eligible for Vote.");
        } 
        else 
        {
            System.out.println("The Person is a Minor.\nThe Person is Not Eligible for Vote.");
        }
        sc.close();
    }
}*/

public class ConditionalStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Between(1-3):");
        int Button = sc.nextInt();
        //System.out.println("Enter the Choice:");
        switch (Button) {
            case 1 -> System.out.println("Namaste");
            case 2 -> System.out.println("Bonjour");
            case 3 -> System.out.println("Hello");
            default -> System.err.println("Invalid Choice! Please Select Between(1-3).");
            /*case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("Bonjour");
                break;
            case 3:
                System.out.println("Hello");
                break;
            default:
                System.err.println("Invalid Choice! Please Select Between(1-3).");*/
        }
    }
}
