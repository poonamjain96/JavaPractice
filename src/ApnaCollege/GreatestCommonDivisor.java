package ApnaCollege;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
                int n1 = s.nextInt();
        int n2 = s.nextInt();
        while(n1!=n2) {
            if (n1 > n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        }
        System.out.println("GCD is :"+n2);

    }
}
