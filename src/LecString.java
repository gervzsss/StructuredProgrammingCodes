class LecString {
    public static void main(String[] args) {

        String txt = "Hello";

        System.out.println(txt);

        System.out.println(txt.length());

        System.out.println(txt.toUpperCase()); // Outputs "hello"

        System.out.println(txt.toLowerCase()); // Outputs "HELLO"

        String txt1 = "Please locate where 'locate' occurs!";
        System.out.println(txt1.indexOf("locate")); // Outputs 7

    }
}
