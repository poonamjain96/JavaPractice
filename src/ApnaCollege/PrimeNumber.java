package ApnaCollege;

import java.util.Scanner;

public class PrimeNumber {
    public static void prime(int n){
        int i=2;
        if(n==1||n==0)
            System.out.println("Not Prime number");
        if(n==i)
            System.out.println("Prime Number");
        if(n%i==0)
            System.out.println("Not Prime Number");
        i++;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        prime(n);
    }
}

