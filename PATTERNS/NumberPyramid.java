import java.util.Scanner;

public class NumberPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Symboll: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter No of terns n: ");
        int n = sc.nextInt();
        
        NumberPyramid(ch, n);
    }
     public static void NumberPyramid(char ch, int n) {
       
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.printf(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.printf("%d"+" ",i);
            }
            System.out.println(" ");
        }
    }
}