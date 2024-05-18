import java.util.*;

public class MenuDriven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String option;
        while (true) {
            System.out.println("MENU\n1. ADD\n2. SUB\n3. MUL\n4. DIV");
            System.out.println("Enter your option");
            option = sc.nextLine();
            switch (option) {
                case "ADD":
                    System.out.println("Enter two numbers:");
                    int a, b;
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.printf("%d + %d = %d\n", a, b, a + b);
                    sc.nextLine();
                    break;
                case "SUB":
                    System.out.println("Enter two numbers:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.printf("%d - %d = %d\n", a, b, a - b);
                    sc.nextLine();
                    break;
                case "MUL":
                    System.out.println("Enter two numbers:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.printf("%d x %d = %d\n", a, b, a * b);
                    sc.nextLine();

                case "DIV":
                    System.out.println("Enter two numbers:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    if (b == 0) {
                        System.out.println("Denominator cannot be zeron");
                        sc.nextLine();

                        break;
                    }
                    System.out.printf("%d / %d = %f", a, b, 1.f * a / b);
                    sc.nextLine();

                    break;
                default:
                    System.out.println("NO SUPPORT OPERATION\n");

            }
            System.out.println("");
        }
    }
}
