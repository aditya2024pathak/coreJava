import java.util.Scanner;

public class StringReverseRecursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String reverse = reverseIt(input);
        System.out.println(reverse);



    }
    public static  String reverseIt(String input){

        if(input == null || input.length() <=1)
            return input;

        return reverseIt(input.substring(1)) + input.charAt(0);
    }
}
