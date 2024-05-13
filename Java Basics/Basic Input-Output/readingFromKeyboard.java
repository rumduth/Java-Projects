import java.lang.*;
import java.util.*; //This package is for scanner -> allow to get input from keyboard
public class readingFromKeyboard {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 2 number: ");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("Sum is: " + c);
    
    }
}
