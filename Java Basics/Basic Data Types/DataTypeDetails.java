import java.lang.*;

public class DataTypeDetails {
    public static void main(String args[]) {
        int x = -5;
        System.out.println(Integer.toBinaryString(x));

        for (char c = 0x0370; c <= 0x03FF; c++) {
            System.out.print(c + " ");
        }

    }
}
