
import java.io.*;

class LowBalanceException extends Exception {
    public String toString() {
        return "Balance should not be less than 5000";
    }
}

public class ExceptionClassDemo {

    static void fun1() {
        System.out.println(10 / 0);
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        try {
            fun2();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        fun3();
    }

}
