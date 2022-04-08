package Udemy;

import java.util.Scanner;

public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay <= 23) {
            if (barking == true && (hourOfDay > 8 || hourOfDay < 22)) {
                return true;
            }

        }
            return false;

    }

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter if dog is barking in true or false:");
        boolean b = s.nextBoolean();
            System.out.println("Enter hour of day:");
        int h = s.nextInt();

        boolean barking = shouldWakeUp(b,h);
        System.out.println(barking);
    }
}
