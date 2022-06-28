package ApnaCollege;

import java.util.Scanner;

public class SumOfOddNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to calculated:");
        int n = s.nextInt();
        oddSum(n);
    }
    public static void oddSum(int n)
    {
        int sum =0;
        for (int i =1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum = sum + i;
            }

        }
        System.out.println("Total sum of odd number is: "+sum);
    }
}

//.java --> java compiler [jgava code into bycode] --> .class --> lower language which is understandable to machine
