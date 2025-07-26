import java.util.Scanner;

public class AdvancedPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Symboll: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter No of terns n: ");
        int n = sc.nextInt();
        
        //PrintSolidDamru(ch, n);
        PrintHollowDamru(ch, n);
        //PrintNumberPyramid(ch, n);
        //printDiamondPattern(ch, n);
    }

    /*public static void PrintSolidDamru(char ch, int n) {
        //UPPER HALF
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.printf("%c",ch);
            }
            for(int j=1;j<=(2*(n-i));j++) {           
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.printf("%c",ch);
            }
            System.out.println();
        }
        //LOWER HALF
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.printf("%c",ch);
            }
            for(int j=1;j<=(2*(n-i));j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.printf("%c",ch);
            }
            System.out.println();
            
        }
    }*/

    public static void PrintHollowDamru(char ch, int n){
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(j==1||i==j) {
                    System.out.printf("%c",ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=(2*(n-i));j++) {           
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                if(j==1||i==j) {
                    System.out.printf("%c",ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //LOWER HALF
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                if(j==1||i==j) {
                    System.out.printf("%c",ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=(2*(n-i));j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                if(j==1||i==j) {
                    System.out.printf("%c",ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*public static void PrintNumberPyramid(char ch, int n) {
       
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.printf(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.printf("%d"+" ",i);
            }
            System.out.println(" ");
        }
    }*/

    /*public static void printDiamondPattern(char ch, int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.printf(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.printf("%c",ch);
            }
            for(int j=2;j<=i;j++){
                System.out.printf("%c",ch);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.printf(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.printf("%c",ch);
            }
            for(int j=2;j<=i;j++){
                System.out.printf("%c",ch);
            }
            System.out.println();
        }
    }*/
}
