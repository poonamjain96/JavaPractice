package ApnaCollege;

import java.util.Scanner;

public class Finonacci {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter n:");
        int n = s.nextInt();
        int a = 0, b=1,temp;
        System.out.println(a);
        for (int i=2;i<=n;i++)
        {
            System.out.println(b);
            temp = b;
            b=b+a;
            a=temp;
        }
    }
}
