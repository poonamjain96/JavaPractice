package ApnaCollege;

import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Age :");
        int age = s.nextInt();
eligibleAge(age);
    }
    public static void eligibleAge(int age)
    {
        if(age>18)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible");
    }
}
