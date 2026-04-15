import java.util.Scanner;
public class Array
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of classrooms: ");
        
        Scanner scan1 = new Scanner(System.in);
        int classrooms = scan1.nextInt();
        
        System.out.println("Enter the number of students: ");

        Scanner scan2 = new Scanner(System.in);
        int students = scan2.nextInt();

        int[][] arr = new int[classrooms][students];
        
        for(int i=1;i<=classrooms;i++)
        {
            for(int j=1;j<=students;j++)
            {
                System.out.println("Enter the marks of Student "+ j +" of classroom "+i);
                Scanner scan3 = new Scanner(System.in);
                arr[i-1][j-1] = scan3.nextInt();
            }
        }

        for(int i=1;i<=classrooms;i++)
        {
            for(int j=1;j<=students;j++)
            {
                System.out.println("Marks of Student "+ j +" of classroom "+ i +" are: "+ arr[i-1][j-1]);
            }
        }
        
    }
}
