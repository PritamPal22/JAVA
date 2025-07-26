import java.util.Scanner;

public class HollowPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Symboll: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter No of terns n: ");
        int n = sc.nextInt();
        PrintHollowLowerLeftRightAngleTringle(ch, n);

    }

    public static void PrintHollowLowerLeftRightAngleTringle(char ch, int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(i==n||j==1||i==j) {
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