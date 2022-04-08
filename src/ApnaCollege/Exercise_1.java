package ApnaCollege;

import javax.xml.soap.SOAPPart;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        /*String name = s.nextLine();
        System.out.println(name);
        System.out.print(name);
        System.out.print(name);*/
        int n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println("");
        }

    }
}
