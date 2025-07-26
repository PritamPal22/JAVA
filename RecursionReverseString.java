import java.util.*;

public class RecursionReverseString {
    public static void ReverseString(String str, int idx) {
        if(idx == 0) {
            System.out.println(str.charAt(idx));
            return;
            }
        System.out.print(str.charAt(idx));
        ReverseString(str, idx-1);
    }

    /*public static void CharOccurence(String str, char ch) {
        
        for(int i=0;i<str.length();i++) {
            if(ch == str.charAt(i)) {
                System.out.println("The character is in At: "+i);
            }
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        ReverseString(str, str.length()-1);

        /*System.out.print("Enter the character that you want to find: ");
        char ch = sc.next().charAt(0);
        CharOccurence(str, ch);*/
    }
}
