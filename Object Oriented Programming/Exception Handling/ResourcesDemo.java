import java.io.*;
import java.util.*;

public class ResourcesDemo {

    static void Divide() throws Exception {
        // fi = new FileInputStream("mytext.txt");
        // try {
        // sc = new Scanner(fi);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(a / c);
        // } finally {
        // sc.close();
        // fi.close();
        // }

        try (FileInputStream fi = new FileInputStream("mytext.txt"); Scanner sc = new Scanner(fi)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b);
        }
        // sc.close();
    }

    public static void main(String[] args) throws Exception {
        try {
            Divide();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}