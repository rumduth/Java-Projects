
import java.util.*;

public class BitwiseChallenge {
    public static void main(String args[]) {
        int option = 0;
        Scanner sc = new Scanner(System.in);

        while (option != 1 && option != 2) {
            System.out.println("Enter option: 1. Swapping, 2: Storing two 4 bits number in one byte");
            option = sc.nextInt();
            if (option == 1) {
                int a = 10;
                int b = 15;
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
                System.out.println(a + "    " + b);
            } else if (option == 2) {

                byte a = 14, b = 8;
                byte c;

                c = (byte) (a << 4);
                c |= b;
                System.out.println("Form bytes of c: " + Byte.toString(c));
                a = (byte) ((c & 0b11110000) >> 4);
                b = (byte) (c & 0b00001111);
                System.out.println(a + " " + b);

                // c = (byte) (a << 4);
                // c = (byte) (c | b);

                // System.out.println((c & 0b11110000) >> 4);
                // System.out.println((c & 0b00001111) >> 4);
                // byte c = 14, d = 4;
                // byte e;
                // e = (byte) (c << 4);
                // e = (byte) (e | d);
                // System.out.println((e & 0b11110000) >> 4);
                // System.out.println((e & 0b00001111));

            }
        }
    }
}
