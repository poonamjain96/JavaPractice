package ApnaCollege;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Number:");
        int a = s.nextInt();
        int b = s.nextInt();
        greaterNumber(a,b);

    }
    public static void greaterNumber(int a, int b)
    {
        if(a>b)
            System.out.println(a+" is greater than "+b);
        if (b>a)
            System.out.println(b+" is greater than "+a);
        else
            System.out.println("Both "+a+ " & " +b+ "are equal");
    }
}
