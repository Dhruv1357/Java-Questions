import java.util.Scanner;
public class JaggedArray1 
{
    public static void main(String[] args) 
    {
        int students, classrooms, schools;
        System.out.println("Enter the number of schools:");
        Scanner scan = new Scanner(System.in);
        
        schools = scan.nextInt();
        int[][][] a = new int[schools][][];

        for(int i=0;i<schools;i++)
        {
            System.out.println("Enter the number of classrooms in school "+(i+1));
            classrooms = scan.nextInt();
            a[i] = new int[classrooms][];
        }
        for(int i=0;i<schools;i++)
        {
            for(int j=0;j< a[i].length ;j++)
            {
                System.out.println("Enter the number of students in classroom "+(j+1)+" of school "+(i+1));
                students = scan.nextInt();
                a[i][j] = new int[students];
            }
        }
        for (int i = 0; i < schools; i++) 
            {
                for (int j = 0; j < a[i].length; j++) 
                {
                    for(int k=0;k<a[i][j].length;k++)
                    {
                        System.out.println("Enter the marks of student "+(k+1)+" of classroom "+(j+1)+" of school "+(i+1));
                        a[i][j][k] = scan.nextInt();
                    }
                }
            }

        for (int i = 0; i < schools; i++) 
            {
                for (int j = 0; j < a[i].length; j++) 
                {
                    for(int k=0;k<a[i][j].length;k++)
                    {
                        System.out.println("The marks of student "+(k+1)+" of classroom "+(j+1)+" of school "+(i+1)+": " +a[i][j][k]);
                    }
                }
            }
    }
}
