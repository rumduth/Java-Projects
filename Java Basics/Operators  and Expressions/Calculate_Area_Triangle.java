import java.util.*;

class Triangle_Area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int options = 0;
        while (options != 1 && options != 2) {
            System.out.println("Enter 1 or 2 for different formula to caculate Area of Triangle");
            options = sc.nextInt();
            if (options == 1) {
                float base, height, area;
                System.out.println("Enter base and height: ");
                base = sc.nextFloat();
                height = sc.nextFloat();
                area = 1f / 2 * base * height;
                System.out.println("Area of the triangle is: " + area);
            }
            if (options == 2) {
                float a, b, c, s;
                double area;
                System.out.println("Enter a,b,c: ");
                a = sc.nextFloat();
                b = sc.nextFloat();
                c = sc.nextFloat();
                s = 1f / 2 * (a + b + c);
                area = Math.sqrt(s * (s + a) * (s + b) * (s + c));
                System.out.println("Area of the triangle is: " + area);
            }
        }

    }
}
