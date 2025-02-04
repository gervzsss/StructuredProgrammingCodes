import java.util.Scanner;

class ActivityXplusY {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("x: ");
        int x = scan.nextInt();

        System.out.print("y: ");
        int y = scan.nextInt();

        scan.close();

        System.out.println(x + y); // Method 1

        // Method 2

        // int sum = x + y;

        // System.out.println(sum);
    }
}
