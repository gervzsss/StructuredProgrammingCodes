import java.util.Scanner;

public class ActivityMethodPrimeNum {

    public static boolean prime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();

        if (prime(num)) {
            System.out.println(num + " is a prime Number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        scan.close();
    }
}
