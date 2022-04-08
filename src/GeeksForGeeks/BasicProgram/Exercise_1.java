
//Java Program to Read The Number From Standard Input
package GeeksForGeeks.BasicProgram;

import java.util.Scanner;

public class Exercise_1 {
    public static void main (String[] Args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = s.next();
        System.out.println("Enter your Age :");
        int age = s.nextInt();
        System.out.print("Name:"+name+ "\nAge:"+age);


    }
}
