
import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        int students, classrooms, schools;
        System.out.println("Enter the number of students, classrooms and schools:");
        Scanner scan1 = new Scanner(System.in);
        students = scan1.nextInt();
        classrooms = scan1.nextInt();
        schools = scan1.nextInt();

        int[][][] a = new int[schools][classrooms][students];

        System.out.println("Enter the marks of the students:");
        Scanner scan2 = new Scanner(System.in);

        for (int i = 0; i < schools; i++) 
        {
            for (int j = 0; j < classrooms; j++) 
            {
                for (int k = 0; k < students; k++) 
                {
                    a[i][j][k] = scan2.nextInt();
                }
            }
        }

        for (int i = 0; i < schools; i++) 
        {
            for (int j = 0; j < classrooms; j++) 
            {
                for (int k = 0; k < students; k++) 
                {
                    System.out.println("The marks of student "+(k+1)+" of classroom "+(j+1)+" of school "+(i+1)+": "+a[i][j][k]);
                }
            }
        }
    }
}
