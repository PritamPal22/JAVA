import java.util.Scanner;

public class Rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre the Symbol that you can use: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter No of terns to print: ");
        int n = sc.nextInt();
        
        SolidRectangle(n, ch);
    }

    public static void SolidRectangle(int n, char ch) {
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%c\t",ch);
            }
            System.out.println();
        }
    }
}