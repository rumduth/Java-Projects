
public class StringChallenges {
    public static void main(String args[]) {

        String str = "programmer@gddmail.com";

        // Find usetr name and domain name form email
        String userName = str.substring(0, str.indexOf("@"));
        String domain = str.substring(str.indexOf("@") + 1);
        System.out.printf("Username: %s\nDomain: %s\n", userName, domain);

        // Find if the email id is on gmail
        if (domain.startsWith("gmail")) {
            System.out.printf("%s is a valid email\n", str);
        } else {
            System.out.println("It's not a valid email");
        }
    }
}
