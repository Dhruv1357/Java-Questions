
import java.util.Scanner;

public class Array1 
{

    public static void main(String[] args) 
    {
        System.out.println("Enter the number of students: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] a = new int[size];

        System.out.println("Enter the marks of students: ");
        Scanner scan2 = new Scanner(System.in);
        
        for (int i = 0; i < size; i++) 
        {
            a[i] = scan2.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            System.out.println("Marks of Student "+(i+1)+": "+a[i]);
        }
    }
}
