import java.util.Scanner;

public class RegineJavier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements in first array: ");
        int size1 = scan.nextInt();

        int[] firstArray = new int[size1];

        System.out.println("Enter elements of the array in first array: ");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = scan.nextInt();
        }

        System.out.print("Enter number of elements in second array: ");
        int size2 = scan.nextInt();
        
        int[] secondArray = new int[size1];


        System.out.println("Enter elements of the second array: ");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = scan.nextInt();
        }

        int finalSize = Math.max(size1, size2);

        System.arraycopy(firstArray, 0, secondArray, 0, finalSize);

        System.out.print("[");
        for (int i = 0; i < finalSize; i++) {
            System.out.print(secondArray[i]);
            if (i < finalSize - 1) 
            System.out.print(", ");
        }
        System.out.print("]");

        scan.close();
    }
}