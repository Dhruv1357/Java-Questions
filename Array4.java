import java.util.Scanner;

public class Array4 
{
    public static void main(String[] args) 
    {
        int cities,students, classrooms, schools;
        System.out.println("Enter the number of cities, students, classrooms and schools:");
        Scanner scan1 = new Scanner(System.in);
        cities = scan1.nextInt();
        students = scan1.nextInt();
        classrooms = scan1.nextInt();
        schools = scan1.nextInt();

        int[][][][] a = new int[cities][schools][classrooms][students];

        System.out.println("Enter the marks of the students:");
        Scanner scan2 = new Scanner(System.in);

        for (int i = 0; i < cities; i++) 
        {
            for (int j = 0; j < schools; j++) 
            {
                for (int k = 0; k < classrooms; k++) 
                {
                    for(int l=0;l<students;l++)
                    {
                        a[i][j][k][l] = scan2.nextInt();
                    }
                }
            }
        }

        for (int i = 0; i < cities; i++) 
        {
            for (int j = 0; j < schools; j++) 
            {
                for (int k = 0; k < classrooms; k++) 
                {
                    for(int l=0;l<students;l++)
                    {
                        System.out.println("The marks of student "+(l+1)+" of classroom "+(k+1)+" of school "+(j+1)+" of city "+(i+1)+": "+a[i][j][k][l]);
                    }
                }
            }
        }
    }
}