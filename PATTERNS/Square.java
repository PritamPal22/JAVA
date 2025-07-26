import java.util.Scanner;

public class Square {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre the Symbol that you can use: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter No of terns to print: ");
        int n = sc.nextInt();
        
        printSolidSquare(n, ch);
        printHollowSquare(n, ch);
    }


    public static void printSolidSquare(int n, char ch) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%c\t",ch);
            }
            System.out.printf("\n\n\n\n");
        }
    }

    public static void printHollowSquare(int n, char ch) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.printf("%c\t",ch);
                } 
                else {
                    System.out.printf("\t");
                }               
            }
            System.out.printf("\n\n\n\n");
        }
    }
}