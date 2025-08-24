import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] B = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        BubbleSort(B);
        //sc.close();
    }
    public static void BubbleSort(int[] B) {
        int n = B.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (B[j] > B[j + 1]) {
                    // swap B[j] and B[j+1]
                    int temp = B[j];
                    B[j] = B[j + 1];
                    B[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println(); 
    }
}
        