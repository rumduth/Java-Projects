public class printingDemo {

    public static void main(String args[]) {
        // --- println --- //
        // int a = 10;
        // float b = 12.55f;
        // char c = 'A';
        // String str = "Hello";

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(str);

        // --- printf with conversion and argument index---
        // int x = 10;
        // float y = 12.56f;
        // char z = 'A';
        // String str = "Java Program";

        // // System.out.printf("Hello %d %f %c World\n", x, y, z);
        // System.out.printf("%1$d %2$f %1$d\n", x, y);

        // --printf with flag
        int a = 10;
        float b = 3.45f;
        String str = "java";
        System.out.printf("%05d\n", a);
        System.out.printf("%6.1f\n", b);
        System.out.printf("%06.1f\n", b);
        System.out.printf("%020s\n", str);
    }

}
