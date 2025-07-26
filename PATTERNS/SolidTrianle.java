import java.util.Scanner;

public class SolidTrianle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre the Symbol that you can use: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter No of terns to print: ");
        int n = sc.nextInt();
        
        
        printSolidLowerLeftRightAgleTringle(n, ch);
        printSolidUpperLeftRightAgleTringle(n, ch);
        printSolidLowerRightRightAgleTringle(n, ch);
        printSolidUpperRighttRightAgleTringle(n, ch);
    }

    public static void printSolidLowerLeftRightAgleTringle(int n, char ch) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%c\t",ch);
            }
            System.out.printf("\n\n\n\n");
        }
    }

    public static void printSolidUpperLeftRightAgleTringle(int n, char ch) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.printf("%c\t",ch);
            }
            System.out.printf("\n\n\n\n");
        }
    }

    public static void printSolidLowerRightRightAgleTringle(int n, char ch) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.printf("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.printf("%c\t",ch);
            }
            System.out.printf("\n\n\n\n");
        }
    }
    
    public static void printSolidUpperRighttRightAgleTringle(int n, char ch) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.printf("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.printf("%c\t",ch);
            }
            System.out.printf("\n\n\n\n");
        }
    }
}