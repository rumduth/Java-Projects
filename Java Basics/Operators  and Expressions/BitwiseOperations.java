import java.util.*;

public class BitwiseOperations {
    public static void main(String[] args) {
        // int x = 10, y = 6, z;
        // z = x & y;

        int x = -0b1010;
        int y = 0b0110;
        int z;
        z = x & y;
        System.out.println(Integer.toBinaryString(x));
    }
}
