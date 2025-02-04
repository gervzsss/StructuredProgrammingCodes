public class AssignmentSortingMethods {

    private static void ascendingSort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    private static void descendingSort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] < num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    private static void sort(int num[]) {
        for (int Num : num) {
            System.out.print(Num + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        int num[] = { 10, 51, 86, 22, 71, 38, 99, 1, 64, 45 };

        System.out.println("\nOriginal Array:");
        sort(num);

        System.out.println("Ascending order:");
        ascendingSort(num);
        sort(num);

        System.out.println("Descending order:");
        descendingSort(num);
        sort(num);

    }
}