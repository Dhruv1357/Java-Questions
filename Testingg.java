import java.util.Scanner;

public class Testingg
{
    public static void main(String[] args) 
    {
        int size;
        System.out.println("Enter the number of students:");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        int[] marks = new int[size];

        System.out.println("Enter the marks of Student 1: ");
        Scanner marks0 = new Scanner(System.in);
        marks[0] = marks0.nextInt();

        System.out.println("Enter the marks of Student 2: ");
        Scanner marks1 = new Scanner(System.in);
        marks[1] = marks1.nextInt();

        System.out.println("Enter the marks of Student 3: ");
        Scanner marks2 = new Scanner(System.in);
        marks[2] = marks2.nextInt();


        System.out.println("Enter the marks of Student 4: ");
        Scanner marks3 = new Scanner(System.in);
        marks[3] = marks3.nextInt();


        System.out.println("Enter the marks of Student 5: ");
        Scanner marks4 = new Scanner(System.in);
        marks[4] = marks4.nextInt();

        System.out.println("The marks of the students are: "+ marks[0] +" "+ marks[1] +" "+ marks[2] +" "+ marks[3] +" "+ marks[4]);


    }    
}
