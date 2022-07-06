package ApnaCollege;

import java.util.Scanner;

//Find the maximum & minimum number in an array of integers.
public class ArrayExercise3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = s.nextInt();
        int[] number = new int[size];
        for (int i =0;i<size;i++)
        {
            number[i]=s.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(number[i]<min)
            {
                min = number[i];
            }
            if(number[i]>max)
            {
                max = number[i];
            }
        }
        System.out.println("min:"+min);
        System.out.println("Max:"+max);
    }
}
