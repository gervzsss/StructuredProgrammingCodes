import java.util.Scanner;

public class MidtermsPalindrome {
    static boolean isPalindrome(String word) {

        word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();        

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {

            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Word: ");
        String word = scan.nextLine();

        if (isPalindrome(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        scan.close();
    }
}
