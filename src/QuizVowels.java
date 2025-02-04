import java.util.Scanner;

public class QuizVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String uVowels = "AEIOU";
        String lVowels = "aeiou";

        System.out.print("Enter a String: ");
        String input = scan.nextLine();

        if (input.length() >= 2) {
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(input.length() - 1);

            boolean firstIsUpperVowel = uVowels.indexOf(firstChar) != -1;
            boolean lastIsUpperVowel = lVowels.indexOf(lastChar) != -1;

            if (firstIsUpperVowel && lastIsUpperVowel) {
                System.out.println("Valid String");
            } else {
                System.out.println("Invalid String");
            }
        }
        scan.close();
    }
}
