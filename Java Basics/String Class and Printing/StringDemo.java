public class StringDemo {
    public static void main(String args[]) {

        // There are 3 ways to craeate String
        char c[] = { 'A', 'B', 'C', 'D' };
        String str1 = new String(c);

        byte b[] = { 65, 66, 67, 68 };
        String str2 = new String(b);

        String str3 = new String("Java");

    }
}
