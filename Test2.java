class Employee
{
    String name;
    int EmpId;
    float salary;

    public String toString()
    {
        return "Name : "+ name +"\nEmployee Id : "+ EmpId +"\nSalary : "+ salary;
    }
}

public class Test2 
{
    public static void main(String[] args) 
    {
        
        Employee e1 = new Employee();
        e1.EmpId = 34558;
        e1.salary = 45678;

        Employee e2 = new Employee();
        e2 = e1;

        e2.name = "EEE";

        Class ref = e1.getClass();
        
        System.out.println(e2);
        System.out.println(ref);
    }
}
