import java.util.Scanner;

public class QuizMoveTheZeros {
    public static void lastzero(int[] arr) {
        int nozero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nozero] = arr[i];
                nozero++;
            }
        }

        while (nozero < arr.length) {
            arr[nozero] = 0;
            nozero++;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number of elements: ");
        int num = scan.nextInt();

        int[] arr = new int[num];
        System.out.println("Input array:");
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        lastzero(arr);

        System.out.println("Output:");
        printArray(arr);

        scan.close();
    }
}
