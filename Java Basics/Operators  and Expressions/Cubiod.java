import java.util.*;

public class Cubiod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float height, length, breadth, area, volume;
        System.out.println("Enter height, length and breadth: ");
        height = sc.nextFloat();
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        area = (height * length + length * breadth + breadth * height) * 2;
        volume = height * length * breadth;
        System.out.println("Total area: " + area + "\nVolume: " + volume);

    }
}
