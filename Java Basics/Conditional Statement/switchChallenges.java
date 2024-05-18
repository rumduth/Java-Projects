import java.util.*;

public class switchChallenges {
    static Scanner sc = new Scanner(System.in);

    static void displayDayName() {
        int day;
        System.out.println("Enter day: ");
        day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    static void displayMonth() {
        int month;
        System.out.println("Enter month: ");
        month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month");

        }
    }

    static void displayTypeOfWebsite() {
        String website;
        sc.nextLine();
        System.out.println("Enter website URL: ");
        website = sc.nextLine();
        String type = website.substring(website.lastIndexOf(".") + 1);
        switch (type) {
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organization");
                break;
            case "net":
                System.out.println("Network");
                break;
            case "gov":
                System.out.println("Goverment");
                break;
            default:
                System.out.println("Invalid Website");
        }
    }

    public static void main(String args[]) {

        int option;
        while (true) {
            System.out.println(
                    "Enter option you want:\n1: Display name of a day based on number\n2: Display name of a month based on number\n3: Display type of webiste");
            option = sc.nextInt();
            if (option == 1) {
                displayDayName();
            } else if (option == 2) {
                displayMonth();
            } else if (option == 3) {
                displayTypeOfWebsite();
            }
            System.out.println("\n");
        }
    }
}
