public class Abstract {

    static abstract class Shape {
        abstract public double perimeter();

        abstract public double area();
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double r) {
            radius = r;
        }

        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        public double area() {
            return radius * radius * Math.PI;
        }
    }

    static class Rectangle extends Shape {
        double length;
        double breadth;

        public Rectangle(double l, double b) {
            length = l;
            breadth = b;
        }

        public double perimeter() {
            return 2 * (length + breadth);
        }

        public double area() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        System.out.println(r.area());

        Shape s = r;
        System.out.println(s.perimeter());
    }
}
