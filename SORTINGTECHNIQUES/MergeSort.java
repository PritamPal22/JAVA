import java.util.*;
class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] M = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            M[i] = sc.nextInt();
        }
        Divide(M, 0, n - 1);
      
        //sc.close();
    }

    public static void Divide(int[] M, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            Divide(M, left, mid);
            Divide(M, mid + 1, right);
            Conquer(M, left, mid, right);
        }
        if (left == 0 && right == M.length - 1) {
            System.out.println("Sorted array:");
            for (int i = 0; i < M.length; i++) {
                System.out.print(M[i] + " ");
            }
            System.out.println(); 
        }
    }


    public static void Conquer(int[] M, int left, int mid, int right) {
        int[] Merge = new int[right - left + 1];
        int idx1 = left;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= right) {
            if (M[idx1] <= M[idx2]) {
                Merge[x++] = M[idx1++];
            } else {
                Merge[x++] = M[idx2++]; 
            }
        }
        while (idx1 <= mid) {
            Merge[x++] = M[idx1++];
        }
        while (idx2 <= right) {
            Merge[x++] = M[idx2++];
        }

        //If call conquer the it activce
        for (int i = 0, j = left; i < Merge.length; i++, j++) {
            M[j] = Merge[i];
        }
    }
}