import java.util.*;

class loopChallenges {

    static Scanner sc = new Scanner(System.in);

    static void displayMultiplicationTable() {
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
        System.out.println("---------");
    }

    static void findSumofNNumbers() {
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.printf("Total of first %d number: %d\n", n, sum);
        System.out.println("---------");
    }

    static void numberFactorial() {
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        if (n == 0) {
            System.out.printf("Factorial of %d is: %d\n", n, 1);
            return;
        }
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        System.out.printf("Factorial of %d is: %d\n", n, f);
        System.out.println("---------");

    }

    static void diplayDigit() {
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        if (n == 0)
            System.out.println(0);
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            System.out.println(r);
        }
        System.out.println("---------");
    }

    static void isArmstrong() {
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        if (n == 0) {
            System.out.printf("%d is Armstrong number\n", n);
            System.out.println("---------");
            return;
        }
        double sum = 0;
        int copy_n = n;
        while (n > 0) {
            sum += Math.pow((n % 10), 3);
            n = n / 10;
        }
        if (sum == copy_n)
            System.out.printf("%d is Armstrong number\n", copy_n);
        else
            System.out.printf("%d is not Armstrong number\n", copy_n);
        System.out.println("---------");
    }

    static void countDigits() {
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        if (n == 0) {
            System.out.printf("%d has 1 digit\n", n);
            System.out.println("---------");
            return;
        }
        String s = Integer.toString(n);
        System.out.printf("%d has %d digit\n", n, s.length());
        System.out.println("---------");

    }

    static void reverseNumber() {
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        int reverse = 0;
        int copy_n = n;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        System.out.printf("Reverse of %d is %d\n", copy_n, reverse);
        System.out.println("---------");
    }

    static void isPalindrome() {
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        int reverse = 0;
        int copy_n = n;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        if (reverse == copy_n) {
            System.out.printf("%d is a palidrome number\n", copy_n);
        } else {
            System.out.printf("%d is not a palidrome number\n", copy_n);
        }
        System.out.println("---------");

    }

    static void displayNumberinWords() {
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        String words = Integer.toString(n);
        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);
            switch (c) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                default:
                    break;

            }

        }
        System.out.println("\n---------");
    }

    static void displayAP() {
        int a, d, n;
        System.out.print("Enter a, d and n: ");
        a = sc.nextInt();
        d = sc.nextInt();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a + d * i);
        }
        System.out.println("\n---------");
    }

    static void displayGP() {
        int a, r, n;
        System.out.print("Enter a, r and n: ");
        a = sc.nextInt();
        r = sc.nextInt();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", (int) (a * Math.pow(r, i)));
        }
        System.out.println("\n---------");

    }

    static void displayFibonacci() {
        int a, b, c, n;
        System.out.print("Enter a, b, n: ");
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a);
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("\n---------");
    }

    static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("---------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
        System.out.println("---------");

        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%02d ", count);
                count++;
            }
            System.out.println();

        }
        System.out.println("---------");

    }

    static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("---------");

        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.printf("%02d ", count);
            }
            System.out.println();
        }
        System.out.println("---------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("---------");

    }

    static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j < i)
                    System.out.print(" - ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= 5 - i)
                    System.out.print(" - ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("---------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= 5 - i)
                    System.out.print("   ");
                else
                    System.out.print(" * ");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

    }

    /**
     * @param args
     */
    public static void main(String args[]) {
        int option;
        while (true) {
            System.out.println(
                    "Enter your options:\n1. Display multiplication table\n2. Find Sum of n Numbers\n3. Factorial of a Number");
            System.out.println(
                    "4. Display digits\n5. Count digits of a number\n6. Finding if a number is Armstrong\n7. Reverse a number\n8. Check a number is palidrome");
            System.out.println("9. Display a number in words even with tailing 0");
            System.out.println("10. Display AP series\n11. Display GP series\n12. Display fibonacci series");
            System.out.println("13. Pattern 1\n14. Pattern 2\n15. Pattern 3");
            option = sc.nextInt();
            if (option == 1)
                displayMultiplicationTable();
            else if (option == 2)
                findSumofNNumbers();
            else if (option == 3)
                numberFactorial();
            else if (option == 4)
                diplayDigit();
            else if (option == 5)
                countDigits();
            else if (option == 6)
                isArmstrong();
            else if (option == 7)
                reverseNumber();
            else if (option == 8)
                isPalindrome();
            else if (option == 9)
                displayNumberinWords();
            else if (option == 10)
                displayAP();
            else if (option == 11)
                displayGP();
            else if (option == 12)
                displayFibonacci();
            else if (option == 13) {
                pattern1();
            } else if (option == 14) {
                pattern2();
            } else if (option == 15) {
                pattern3();
            }
        }
    }
}
