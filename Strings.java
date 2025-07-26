
public class Strings {
    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);

        //CONCAINATION OF STRINGS

        /*String FirstName = "Pritam";    
        String LastName = "Pal";
        String FullName = FirstName + " " + LastName;
        System.out.println("Full Name: " + FullName);*/

        /*System.out.print("Enter First String: ");
        String FirstString = sc.nextLine();
        System.out.print("Enter Second String: ");
        String SecondString = sc.nextLine();

        //String Concatenation
        String ConcatenatedString = FirstString + " " + SecondString;
        System.out.println("Concatenated String: " + ConcatenatedString); 
        System.out.println("Length of Concatenated String: " + ConcatenatedString.length());*/

        //charAt() method
        /*for(int i=0;i<ConcatenatedString.length();i++) {
            System.out.println("Character at index " + i + ": " + ConcatenatedString.charAt(i));
        }*/
       
        //Substring() method
        /*System.out.print("Enter start index for substring: ");
        int SI = sc.nextInt();
        System.out.print("Enter end index for substring: ");
        int EI = sc.nextInt();
        String SubS = ConcatenatedString.substring(SI,EI);
        System.out.println("The Substring is : "+ SubS);*/

        //CompareTo() method
        /*int comparisonResult = FirstString.compareTo(SecondString);
        if (comparisonResult < 0) {
            System.out.println("First String is lexicographically less than Second String.");
        } else if (comparisonResult > 0) {
            System.out.println("First String is lexicographically greater than Second String.");
        } else {
            System.out.println("Both strings are equal.");
        } */

        //STRING BUILDER
        StringBuilder sb = new StringBuilder("Pritam");
        System.out.println("Original StringBuilder: " + sb);
        //Set  char at index
        sb.setCharAt(3, 'y');
        System.out.println("String after setCharAt: " + sb);
        //Insert character at index
        sb.insert(sb.length(), 'P');
        System.out.println("String after insert: " + sb);
        //Delete character at index
        sb.delete(3, sb.length());
        System.out.println("String after delete: " + sb);
        //Append character at index
        sb.append("tam");
        System.out.println("String after append: " + sb);

        //Reverse of a String
        for(int i=0;i<sb.length()/2;i++) {
            int front =i;
            int back = sb.length()-1-i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println("The Reverse of the String is: " + sb);
    }
}