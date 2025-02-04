import java.util.Scanner;

class QuizMedian {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1 = scan.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = scan.nextInt();

        System.out.print("Enter Num3: ");
        int num3 = scan.nextInt();

        int median;
        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            median = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            median = num2;
        } else {
            median = num3;
        }

        System.out.println("Median is: " + median);

        scan.close();
    }
}
