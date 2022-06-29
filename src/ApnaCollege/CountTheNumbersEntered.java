package ApnaCollege;

import java.util.Scanner;

public class CountTheNumbersEntered {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to start or 0 to stop:");
        int input = s.nextInt();
        int positive =0, negative =0, zeros =0;
        while (input == 1)
        {
            System.out.println("Enter Number:");
            int number = s.nextInt();
            if(number>0)
                positive++;
            if(number<0)
                negative++;
            if(number==0)
                zeros++;
            System.out.println("Enter 1 to start or 0 to stop:");
            input = s.nextInt();
        }
        System.out.println("Positive number Count:"+positive);
        System.out.println("Zeros number Count:"+zeros);
        System.out.println("Negative number Count:"+negative);
    }
}
