import java.util.*;
class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] Q = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            Q[i] = sc.nextInt();
        }
        Divide(Q, 0, n - 1);
      
        //sc.close();
    }

    public static void Divide(int[] Q, int low, int high) {
        if (low < high) {
            int pivotIndex = Conquer(Q, low, high);
            Divide(Q, low, pivotIndex - 1);
            Divide(Q, pivotIndex + 1, high);
        }
        if (low == 0 && high == Q.length - 1) {
            System.out.println("Sorted array:");
            for (int i = 0; i < Q.length; i++) {
                System.out.print(Q[i] + " ");
            }
            System.out.println(); 
        }
    }

    public static int Conquer(int[] Q, int low, int high) {
        int pivot = Q[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (Q[j] <= pivot) {
                i++;
                // swap Q[i] and Q[j]
                int temp = Q[i];
                Q[i] = Q[j];
                Q[j] = temp;
            }
        }
        // swap Q[i + 1] and Q[high] (or pivot)
        int temp = Q[i + 1];
        Q[i + 1] = Q[high];
        Q[high] = temp;
        return i + 1;
    }
}