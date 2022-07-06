package ApnaCollege;

import java.util.Scanner;

//Take an array of numbers as input and check if it is an array sorted in ascending order
public class ArrayExercise4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = s.nextInt();
        int[] number = new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter number"+(i+1)+" :");
            number[i]=s.nextInt();
        }
        boolean isAscending =true;
        for(int i=0;i<number.length-1;i++)
        {
            if(number[i]>number[i+1])
            {
                isAscending = false;
            }
        }
        if(isAscending)
            System.out.println("Numbers in array are in ascending order.");
        else
            System.out.println("Number in array are not in ascending order.");
    }
}
