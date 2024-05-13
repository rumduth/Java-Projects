import java.lang.*;
import java.util.*;

class Keyboard {
    public static void main(String args[]){

    Scanner s = new Scanner(System.in);
    System.out.println("What is your name? ");
    String name = s.nextLine();
    System.out.println("Welcome, "+name);
    }
}
