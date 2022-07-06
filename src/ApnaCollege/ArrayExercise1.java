package ApnaCollege;

import java.util.Scanner;

//Find the given number in array
public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = s.nextInt();
        int [] number = new int[size];
        for (int i=0;i<size;i++)
        {
            number[i]=s.nextInt();
        }
        int x = s.nextInt();
        for (int i=0;i<size;i++)
        {
            if(x==number[i])
            {
                System.out.println(i);
            }
        }
    }
}
