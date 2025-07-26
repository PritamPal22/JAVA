import java.util.*;

public class TowerOfHanoi {
    public static void TowerOfHanoi(int N,String S,String H,String D) {
        if(N==1) {
            System.out.println("Transfer disk "+N+" from: "+S+" to "+D);
            return;
        }
        TowerOfHanoi(N-1, S, D, H);
        System.out.println("Transfer disk "+N+" from: "+S+" to "+D);
        TowerOfHanoi(N-1, H, S, D);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the variable X: ");
        System.out.print("Enter the Terns N: ");
        int N  = sc.nextInt();
        System.out.println("");

        TowerOfHanoi(N, "S", "H", "D");
    }
}