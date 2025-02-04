import java.util.Scanner;

public class ActivityLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input: ");
        int n = scan.nextInt();

        int y = 0;

        for (int i = 1; i <= n; i++) {
            y += i;
            System.out.print(i);
            
            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + y);
        
        scan.close();

    }
}
