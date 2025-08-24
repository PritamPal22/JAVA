import java.util.*;

class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] I = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            I[i] = sc.nextInt();
        }
        InsertionSort(I);
        //sc.close();
    }
    public static void InsertionSort(int[] I) {
        int n = I.length;
        for (int i = 1; i < n; i++) {
            int key = I[i];
            int j = i - 1;
            while (j >= 0 && I[j] > key) {
                I[j + 1] = I[j];        
                j --;
            }
            I[j + 1] = key;
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(I[i] + " ");
        }
        System.out.println(); 
    }
}