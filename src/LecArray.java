/*
 * int nums[]
 * int[] nums
 * int nums[] = new int[s]     // s = size of the array
 * int nums = {1,5,6,7,8}      // index 0 1 2 3 4
 */

/*
 * 
 */

public class LecArray {
    // public static void main(String[] args) {

    // int[] nums = {1,5,6,7,8};

    // for (int i = 0; i < nums.length ; i++) {
    // System.out.println(nums[1]);
    // }
    // }

    public static void main(String[] args) {
        int[][] table = {
            {1,2,3,4},
            {2,3,4,5},
            {3,4,5,6}
        };

        System.out.print(table[0][1]); //? answer is 2
        System.out.println();
        System.out.print(table[1][1]); //? answer is 3
    }
}
