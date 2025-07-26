import java.util.Scanner;

public class Function {

    /*public static int Factorial(int n) {
        int Fact = 1;
        int i=1;
        if(n<0){
            System.out.println("Factorial is not defined for negative numbers.");
            return -2; // Indicating an error condition
        }
        else{
            while(i<=n){ 
            Fact = Fact * i;
            i++;
        } 
        return Fact;
        } 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Terns(n) to Factorial: ");
        int n = sc.nextInt();
        System.out.println("The Factorial is: "+ Factorial(n));
    }*/

    public static int AverageNOdds(int n, int[] Sum){
        int Addition=0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(Sum[i] % 2 !=0){
                count++;
                Addition += Sum[i];
            }
        }
        return Addition / count; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] Sum = new int[n];       
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            Sum[i] = sc.nextInt();
        }
        System.out.println("The Average of Odd Numbers is: " + AverageNOdds(n, Sum));  
    }
}