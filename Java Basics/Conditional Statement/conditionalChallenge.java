import java.util.*;

public class conditionalChallenge {
    static Scanner sc = new Scanner(System.in);

    static void checkNumberOddOrEven() {
        int number;
        System.out.println("Enter number: ");
        number = sc.nextInt();
        if (number % 2 == 1) {
            System.out.printf("%d is odd\n", number);
        } else {
            System.out.printf("%d is even\n", number);
        }
    }

    static void checkYoungPerson() {
        int age;
        System.out.println("Enter age: ");
        age = sc.nextInt();
        if (age >= 14 && age <= 55)
            System.out.printf("Person with %d is young\n", age);
        else
            System.out.printf("People with %d is not young\n", age);
    }

    static void checkGrades() {
        int totalGrades = 0;
        int n;
        System.out.println("How many grades you have?");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter grades: ");
            int grade = sc.nextInt();
            totalGrades += grade;
        }
        double avg = (double) totalGrades / n;
        if (avg >= 70)
            System.out.printf("With %.2f average, your grade is: A", avg);
        else if (avg >= 60)
            System.out.printf("With %f average, your grade is: B", avg);
        else if (avg >= 50)
            System.out.printf("With %f average, your grade is: C", avg);
        else if (avg >= 40)
            System.out.printf("With %f average, your grade is: D", avg);
        else
            System.out.printf("With %f average, your grade is: F", avg);

    }

    static void findRadix() {
        String number;
        System.out.println("Enter number: ");
        sc.nextLine();
        number = sc.nextLine();
        if (number.matches("[01]+")) {
            System.out.printf("%s has radix: 2 - Binary\n", number);
        } else if (number.matches("[0-7]+")) {
            System.out.printf("%s has radix: 8 - Octal\n", number);
        } else if (number.matches("[0-9]+")) {
            System.out.printf("%s has radix: 10 - Decimal\n", number);
        } else if (number.matches("[0-9A-F]+")) {
            System.out.printf("%s has radix: 16 - Hexa\n", number);
        } else {
            System.out.println("Do not match any");
        }
    }

    static void isLeapYear() {
        int year;
        System.out.println("Enter year: ");
        year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is a leap year\n", year);
                } else
                    System.out.printf("%d is not a leap year\n", year);
            } else {
                System.out.printf("%d is a leap year\n", year);
            }
        } else {
            System.out.printf("%d is not a leap year\n", year);
        }
    }

    static void displayDayName() {
        String[] dayName = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int day;
        System.out.println("Enter day: ");
        day = sc.nextInt();
        if (day >= 1 && day <= 7)
            System.out.printf("%d is %s\n", day, dayName[day - 1]);
    }

    static void findWebsiteInformation() {
        String website;
        sc.nextLine();
        System.out.println("Enter website: ");
        website = sc.nextLine();

        String protocol = website.substring(0, website.indexOf(":"));
        String type = website.substring(website.lastIndexOf(".") + 1);
        if (protocol.equals("http")) {
            System.out.println("Protocol is Hyper Tex Transfer Protocol");
        } else if (protocol.equals("ftp")) {
            System.out.println("Protocol is File Transfer Protocol");
        } else {
            System.out.println("Invalid Protocol and Website");
            return;
        }

        if (type.equals("com")) {
            System.out.println("Type of the website: Commercial");
        } else if (type.equals("org")) {
            System.out.println("Type of the website: Organization");
        } else if (type.equals("net")) {
            System.out.println("Type of the website: Network");
        } else {
            System.out.println("Invalid Protocol and Website");
            return;
        }
    }

    public static void main(String args[]) {

        int option;
        while (true) {
            System.out.printf(
                    "Enter your options\n1: Find a number is odd or even\n2: Find person is young or not young\n3: Find grades for given mark\n4: Find radix of a number given in a string\n5: Find a given year is a leap year\n6: Display name of a day based on number\n7: Find type of website and the protocol used\n");
            option = sc.nextInt();
            if (option == 1) {
                checkNumberOddOrEven();
            } else if (option == 2) {
                checkYoungPerson();
            } else if (option == 3) {
                checkGrades();
            } else if (option == 4) {
                findRadix();
            } else if (option == 5) {
                isLeapYear();
            } else if (option == 6) {
                displayDayName();
            } else if (option == 7) {
                findWebsiteInformation();
            }
            System.out.println("\n");
        }
    }
}