package ApnaCollege;

import java.util.Scanner;

public class AdvancedPatterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n=");
        int n = s.nextInt();
        /*for(int i =1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }*/
        //============================================================
        //*      *
        //**    **
        //* *  * *
        //*  **  *
        //*  **  *
        //* *  * *
        //**    **
        //*      *
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==1 || j==1 || j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int j=1;j<=(n-i)*2;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==1 || j==1 || j==i)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==1 || j==1 || j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int j=1;j<=(n-i)*2;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==1 || j==1 || j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
