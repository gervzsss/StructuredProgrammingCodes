import java.util.Scanner;

public class ActivityMethods {

    public static void mTable(int input) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(input + " x " + i + " = " + (input * i));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input: ");
        int input = scan.nextInt();

        mTable(input);

        scan.close();
    }
}
