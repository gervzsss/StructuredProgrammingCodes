import java.util.Scanner;

public class ActivityLoop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input: ");
        int input = scan.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
