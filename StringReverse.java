import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        System.out.println(" please enter the string to be reversed...");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String reverseString ="";

        for (int i=inputString.length()-1; i>= 0; i-- ){
            reverseString = reverseString+inputString.charAt(i);
        }
        System.out.println(" the reversed string is ... " + reverseString);

    }
}
