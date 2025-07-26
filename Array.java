//import java.lang.*;
import java.util.*;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the terns of elements: ");
        int N = sc.nextInt();
        int[] Arr = new int[N];
        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            System.out.printf("Element[%d]: ",i+1);
            Arr[i] = sc.nextInt();
        }

        //System.out.println("The maximum element in the array is: " + MaxElement(Arr));
        //System.out.println("The minimum element in the array is: " + MinElement(Arr));
        //OneDSorting(Arr);
    }
    /*public static int MaxElement(int[] Arr) {
        int Max = Arr[0];
        for (int i = 1; i < Arr.length; i++) {
            if(Arr[i]< Max) {
                Max = Arr[i];
            }
        }
        return Max;
    }*/

    /*public static int MinElement(int[] Arr) {
        int Min = Arr[0];
        for (int i = 1; i < Arr.length; i++) {
            if(Arr[i]> Min) {
                Min = Arr[i];
            }
        }
        return Min;
    }*/

    /*public static void OneDSorting(int[] Arr) {
        System.out.println("Sorted Array is:");
        for (int i = 0; i < Arr.length - 1 ; i++) {
            for (int j = 0; j < Arr.length - i - 1; j++) {
                int temp;
                if (Arr[j] > Arr[j + 1]) {
                    temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }*/ 
}