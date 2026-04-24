import java.util.Scanner;
public class Array2 
{
    public static void main(String[] args) 
    {
        int students,classrooms;
        System.out.println("Enter the number of students and classrooms: ");
        Scanner scan1 = new Scanner(System.in);

        students = scan1.nextInt();
        classrooms = scan1.nextInt();
        
        int[][] a = new int[classrooms][students];

        System.out.println("Enter the marks of students: ");
        Scanner scan2 = new Scanner(System.in);

        for(int i=0;i<classrooms;i++)
        {
            for(int j=0;j<students;j++)
            {
                a[i][j] = scan2.nextInt();
            }
        }

        for(int i=0;i<classrooms;i++)
        {
            for(int j=0;j<students;j++)
            {
                System.out.println("The marks of student "+(j+1)+" of classroom "+(i+1)+": "+a[i][j]);   
            }
        }
    }
    
}