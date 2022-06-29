package ApnaCollege;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = s.nextInt();
        System.out.println("Enter Power number");
        int n = s.nextInt();
        int result =1;
        for(int i=1;i<n;i++)
        {
            result = result*x;
        }
        System.out.println(result);
    }
}
