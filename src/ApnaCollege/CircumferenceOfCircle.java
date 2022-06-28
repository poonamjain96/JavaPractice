package ApnaCollege;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius:");
        int r = s.nextInt();
circumference(r);
    }
    public static void circumference(int r)
    {
        double pi = 3.14;
        double circumference = 2*pi*r;
        System.out.println(circumference);
    }
}
