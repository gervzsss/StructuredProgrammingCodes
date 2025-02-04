import java.util.Scanner;

public class QuizTryCatchParse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(":");
        String input = scan.nextLine();

        try {
            Double.parseDouble(input);
            System.out.println("Valid");
        } catch (NumberFormatException e) {
            System.out.println("Invalid");
        }

        scan.close();
    }
}
