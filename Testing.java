import java.util.Scanner;
class Student
{
    String name;
    long roll_no;
    float cgpa;

    public String toString()
    {
        return "Name : "+ name +"\nRoll Number : "+ roll_no +" \nCGPA : "+ cgpa;
    }
}


public class Testing 
{
    public static void main(String[] args)
        {

            Student s1 = new Student();
            Student s2 = new Student();

            s1.name = "Dhruv";
            s1.roll_no = 2501010046L;
            s1.cgpa = 9.0F;

            Scanner scan = new Scanner(System.in);
            
            s2.name = scan.next();
            s2.roll_no = scan.nextLong();
            s2.cgpa = scan.nextFloat();
            
            System.out.println(s1);
            System.out.println(s2);

        }
}
