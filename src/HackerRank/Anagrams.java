package HackerRank;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()==b.length())
        {
            a = a.toLowerCase();
           b = b.toLowerCase();
            char[] ArrayA = a.toCharArray();
            char[] ArrayB = b.toCharArray();
            Arrays.sort(ArrayA);
            Arrays.sort(ArrayB);
            boolean result = Arrays.equals(ArrayA,ArrayB);
            if(result)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println(ret?"Anagrams":"NotAnagrams");
    }
}
