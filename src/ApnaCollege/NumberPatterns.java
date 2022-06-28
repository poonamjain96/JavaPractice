package ApnaCollege;

import java.util.Scanner;

public class NumberPatterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = s.nextInt();
        /*for (int i =1; i<=n; i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++)
        {
            for (int j=1; j<=(n-i)+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int number = 1;
        for (int i =1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }*/
        /*for (int i =1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    for (int i =1;i<=n;i++) {
        for (int j =1; j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for (int j=1;j<=n;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
        for(int i=1; i<=n; i++) {

            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for (int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();

        }*/
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int j=1;j<=(n-i)*2;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
