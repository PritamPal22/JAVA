import java.util.*;

class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] S = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }
        SelectionSort(S);
        //sc.close();
    }
    public static void SelectionSort(int[] S) {
        int n = S.length;
        for (int i = 0; i < n - 1; i++) {
            int Smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (S[j] < S[Smallest]) {
                    Smallest = j;
                }
            }
            // swap S[i] and S[Smallest]
            int temp = S[i];
            S[i] = S[Smallest];
            S[Smallest] = temp;
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(S[i] + " ");
        }
        System.out.println(); 
    }
}