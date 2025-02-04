public class LecLoopDowhile {

    static int x = 10;

    static void Example1() { // Do While Example 1
        
        do {
            System.out.println(x);
            x--;
        } while (x >= 0);
    }

    static void Example2() { // Do While Example 2
        
        do {
            System.out.println(x);
            x--;
        } while (x == 0);
    }

    public static void main(String[] args) {

        // Example1();

        // Example2();

    }
}
