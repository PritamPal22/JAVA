import java.util.Scanner;

public class NumberPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to print: ");
        int n = sc.nextInt();
        //NumberLowerLeftRightAngleTriangle(n);
        //NumberUpperLeftRightAngleTriangle(n);
        //FloydTriangle(n);
        //Number01Tringle(n);
        //NumberSameLowerLeftrightAngleTriangle(n);
        NumberPalindromeEquilateralTriangle(n);
    }

    /*public static void NumberLowerLeftRightAngleTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d\t",j);
            }
            System.out.printf("\n\n\n\n");
        }
    }*/

    /*public static void NumberUpperLeftRightAngleTriangle(int n) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.printf("%d\t",j);
            }
            System.out.printf("\n\n\n\n");
        } 
    }*/

    /*public static void FloydTriangle(int n) {
        int Number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d\t",Number);
                Number++;
            } 
            System.out.printf("\n\n\n\n");
        }
    }*/

    /*public static void Number01Tringle(int n) {
        int Number = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(Number%2 != 0) { //if((i+j)%2 == 0)
                    System.err.print("1\t");
                }
                else {
                    System.err.print("0\t");
                }
                Number++;
            }
            System.out.printf("\n\n\n\n");
        }
    }*/

    /*public static void NumberSameLowerLeftrightAngleTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d\t",i);
            }
            System.out.printf("\n\n\n\n");
        }
    }*/

    public static void NumberPalindromeEquilateralTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.printf("\t");
            }
            for(int j=i;j>=1;j--){
                System.out.printf("%d\t",j);
            }
            for(int j=2;j<=i;j++){
                System.out.printf("%d\t",j);
            }
            System.out.printf("\n\n\n\n");
        }
    }   
}