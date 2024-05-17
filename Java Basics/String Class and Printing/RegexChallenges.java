import java.util.*;

public class RegexChallenges {
    static void checkBinary(String data) {
        if (data.matches("[01]*"))
            System.out.printf("%s is matched Binary Form\n", data);
        else
            System.out.println("Data is not matched Binary Form ");
    }

    static void checkHexaDecimal(String data) {
        if (data.matches("[0-9A-Fa-f]*"))
            System.out.printf("%s is matched Hexadecimal Form\n", data);
        else
            System.out.println("Data is not matched Hexadecimal Form ");
    }

    static void checkDateFormat(String data) {
        if (data.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"))
            System.out.printf("%s is matched Date Format\n", data);
        else
            System.out.println("Data is not matched Date Format ");
    }

    static void removeSpecialCharacters(String data) {
        System.out.println("Before: " + data);
        data = data.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("After: " + data);
    }

    static String removeExtraSpaces(String data) {
        System.out.println("Before: " + data);
        data = data.replaceAll("\\s+", " ").trim();
        System.out.println("After: " + data);
        return data;

    }

    static void findNumberofwords(String data) {
        System.out.println("Data: " + data);
        data = removeExtraSpaces(data);
        int len = data.split(" ").length;
        System.out.println("Words: " + len);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int option;
        String data;
        while (true) {
            System.out.println(
                    "Enter options\n1: Check Binary\n2: Check Hexa-Decimal\n3: Check Date Format(dd/mm//yyyy)\n4: Remove Special Characters from a string\n5: Remove extra spaces from string\n6: Find number of words in a String");
            option = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter data: ");
            data = sc.nextLine();
            if (option == 1) {
                checkBinary(data);
            } else if (option == 2) {
                checkHexaDecimal(data);
            } else if (option == 3) {
                checkDateFormat(data);
            } else if (option == 4) {
                removeSpecialCharacters(data);
            } else if (option == 5) {
                removeExtraSpaces(data);
            } else if (option == 6) {
                findNumberofwords(data);
            } else if (option == 20)
                break;
        }

    }
}
