enum Dept {
    CS, IT, CIVIL, ECE
}

public class EnumDemo {
    public static void main(String[] args) {
        Dept d = Dept.CS;
        System.out.println(d);
        System.out.println(d.ordinal());
        System.out.println(d.name());
    }
}
