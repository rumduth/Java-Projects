
class NegativeDimensionException extends Exception {
    public String toString() {
        return "Negative Dimension";
    }
}

public class ThrowDemo {
    // static int meth1() {
    // return 10 / 0;
    // }

    // static void meth2() {
    // meth1();
    // }

    // static void meth3() {
    // meth2();
    // }

    static int area(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0)
            throw new NegativeDimensionException();
        return l * b;
    }

    static void meth1() throws NegativeDimensionException {
        System.out.println(area(10, -10));
    }

    public static void main(String args[]) {
        // try {
        // meth3();
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        try {
            meth1();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
