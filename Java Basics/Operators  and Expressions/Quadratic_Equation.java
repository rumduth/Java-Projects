import java.util.*;

public class Quadratic_Equation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        double delta, x1, x2;
        System.out.println("Enter a, b, c: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("The equation has no solution");
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("The equation has 1 solution: " + x1);
        } else {
            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has 2 solution: " + x1 + ' ' + x2);

        }

    }
}
