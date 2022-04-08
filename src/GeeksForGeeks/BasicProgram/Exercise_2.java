//Java Program to Get Input from the User using Buffered Class
package GeeksForGeeks.BasicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_2 {
    public static void main (String[] agrs) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name :");
        String name = r.readLine();
        System.out.println(name);
        System.out.println("Enter Age :");
        int age = Integer.parseInt(r.readLine());
        System.out.println(age);
        System.out.println("Enter Amount:");
        float amount = Float.parseFloat(r.readLine());
        System.out.println(amount);


    }

}
