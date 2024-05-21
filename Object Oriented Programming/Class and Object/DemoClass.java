class Product {
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    public Product(String item, String n, double p, double q) {
        setItem(item);
        setName(n);
        setPrice(p);
        setQty(qty);
    }

    public String getItem() {
        return itemNo;
    }

    public void setItem(String id) {
        itemNo = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int q) {
        qty = q;
    }
}

class Rectangular {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double l) {
        if (l <= 0)
            length = 0;
        else
            length = l;
    }

    public void setBreadth(double b) {
        if (b <= 0) {
            breadth = 0;
        } else {
            breadth = b;

        }
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

public class DemoClass {

    static class Circle {
        public double radius;

        public double area() {
            return Math.PI * radius * radius;
        }

        public double perimeter() {
            return 2 * radius * Math.PI;
        }

        public double circumference() {
            return perimeter();
        }
    };

    static class Cyclinder {
        private double radius;
        private double height;

        public Cyclinder(double r, double h) {
            radius = r;
            height = h;
        }

        public Cyclinder(double r) {
            height = 1;
            setRadius(r);
        }

        public double getRadius() {
            return radius;
        }

        public double getHeight() {
            return height;
        }

        public void setRadius(double r) {
            radius = (r >= 0) ? r : 0;
        }

        public void setHeight(double h) {
            height = (h >= 0) ? h : 0;
        }

        public void setDimensions(double r, double h) {
            setRadius(r);
            setHeight(h);
        }

        public double lidArea() {
            return 2 * radius * radius * Math.PI;
        }

        public double totalSurfaceArea() {
            return 2 * radius * Math.PI * height + lidArea();
        }

        public double volume() {
            return lidArea() * height / 2;
        }
    }

    static class Student {
        int roll_no;
        String name;
        String course;
        int grades[] = new int[3];

        public int sum() {
            int sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];
            }
            return sum;
        }

        public double average() {
            return sum() / grades.length;
        }

        public String grade() {
            double grade = average();
            if (grade >= 70) {
                return "A";
            } else if (grade >= 60) {
                return "B";
            } else if (grade >= 50) {
                return "C";
            } else if (grade >= 40) {
                return "D";
            } else {
                return "F";
            }
        }

    }

    public static void main(String args[]) {

        System.out.println("Circle");
        Circle c1 = new Circle();
        c1.radius = 7;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
        System.out.println("------------------");
        System.out.println("Rectangular");
        Rectangular r = new Rectangular();
        r.setBreadth(-10);
        r.setLength(40);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());
        System.out.println("------------------");

        System.out.println("Cylinder");
        Cyclinder cyclinder = new Cyclinder(7, 10);
        System.out.println(cyclinder.getHeight());

        System.out.println("------------------");

        System.out.println("Student");
        Student student = new Student();
        student.grades[0] = 90;
        student.grades[1] = 100;
        student.grades[2] = 70;
        System.out.println(student.sum());
        System.out.println(student.average());
        System.out.println(student.grade());

    }
}
