package Udemy;

import java.util.Scanner;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes)
    {
        if(kilobytes<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            int YY = kilobytes/1024;
            int ZZ = kilobytes%1024;
            System.out.println(+kilobytes+"KB = "+YY+"MB and " +ZZ+ "KB");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter kilobytes:");
        int kb = s.nextInt();
        printMegaBytesAndKiloBytes(kb);
    }
}
