package ApnaCollege;
//Take an array of names as input from the user and print them on the screen.
import java.util.Scanner;

public class ArrayExercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = s.nextInt();
        String [] name = new String[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter name"+(i+1)+":");
            name[i]=s.next();
        }
        for (int i=0;i<name.length;i++)
        {
            System.out.println("Name "+(i+1)+ " is :" +name[i]);

        }
    }
}
