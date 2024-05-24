public class MethodOverriding {

    static class A {
    };

    static class B extends A {
    };

    static class Super {
        public A display() {
            System.out.println("Super Display");
            return new A();
        }
    }

    static class Sub extends Super {
        public B display(int x) {
            System.out.println("Sub Display");
            return new B();
        }
    }

    public static void main(String args[]) {
        Sub s = new Sub();
        s.display();
        s.display(2);
    }
}
