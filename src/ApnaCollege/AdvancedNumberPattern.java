package ApnaCollege;

import java.util.Scanner;

public class AdvancedNumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        /*
             1
            1 2
           1 2 3
          1 2 3 4

        for (int i=1; i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }*/
        /*
        1111
        222
        33
        4
         */
        for (int i =1;i<=n;i++)
        {
            for (int j=i;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}