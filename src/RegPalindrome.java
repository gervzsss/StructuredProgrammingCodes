import java.util.Scanner;

public class RegPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String normalized = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        boolean isPalindrome = true;
        int length = normalized.length();
        for (int i = 0; i < length / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("The string " + input + " is a palindrome.");
        } else {
            System.out.println("The string " + input + " is not a palindrome.");
        }
        scanner.close();
    }
}
