import java.util.Scanner;

class ActivityPosNegZer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Num: ");
        int num = scan.nextInt();

        scan.close();

        if (num == 0) {
            System.out.println("The Integer is Zero");
        } else if (num < 0) {
            System.out.println("The Integer is Negative");
        } else {
            System.out.println("The Integer is Positive");
        }
    }
}
