class MyObject {
    public String toString() {
        return "My Object";
    }
}

public class Demo {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());

        MyObject m = new MyObject();
        System.out.println(m);
    }
}
