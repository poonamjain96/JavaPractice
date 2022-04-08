package Udemy;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String to reverse:");
        String str = s.next();
        String reverse = "";
        for (int i = str.length()-1;i>=0;i--)
        {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Rever String :"+reverse);
        //Check if palindrome
        if(str.equals(reverse))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome String");
        }
    }
}
