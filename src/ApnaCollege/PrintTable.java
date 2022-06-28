package ApnaCollege;

import java.util.Scanner;

public class PrintTable {
    public static void printTable(int n)
    {
        for (int i =1;i<=10;i++)
        {
            int table = i*n;
            System.out.println(table);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number:");
        int n = s.nextInt();
        printTable(n);
    }
}
