import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //System.err.print("Enter the Number of Terns:");
        //int i = sc.nextInt();
        /*for (int i = 1;i<10 ; i++) {
            System.out.printf("%d\t",i);
        }
        System.out.print("\n");*/

        /*int j=0;
        while(j<=1000000){
            System.out.println(j);
            j++;
        }*/

//SUM OF N TERN
        /*System.out.print("Enter Number of terns: ");
        int n =sc.nextInt();
        int i=0,Sum=0;
        while(i<=n){
            Sum = Sum+i;
            i++;
        }
        System.out.printf("The sum of n terns is: %d\n",Sum);*/

//PRINT ALL EVEN AND ODD NUMNERS STILL N TERNS
       /* System.out.print("Enter Number of terns: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("The Even Numbers are:");
        while (i <= n) {
            if(i%2==0)
                System.out.printf("%d\t",i);
            i++;
        }
        System.out.print("\n");*/

//PRIME NUMBERS IN A GIVEN RANGE     
        System.out.print("Enter the Starting range S:  ");
        int S = sc.nextInt();
        System.out.print("Enter The Ending range E:  ");
        int E = sc.nextInt();
        System.out.println("The Prime Numbers are:");
        for(int i=S; i <= E; i++) {
            if(i<2){
                continue;
            }
            int count = 0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.printf("%d\t",i);
            }     
        }
        System.out.print("\n"); 
        sc.close();
    }
}