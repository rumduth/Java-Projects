
public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10, b = 5, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Bye");

        int A[] = { 30, 20, 10, 40, 0 };
        try {
            c = A[0] / A[2];
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }
        System.out.println("Bye");
    }
}
