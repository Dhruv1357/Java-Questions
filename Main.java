import java.util.Scanner;

abstract class Shape
{
    float area;
    
    abstract public void acceptInput();
    abstract public void compute();
    
    public void disp()
    {
        System.out.println("The area of the shape is: " + area);
    }
}

class Square extends Shape
{
    float length;
    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the square: ");
        length = scan.nextFloat();
    }
    public void compute()
    {
        area = length * length;
    }
}

class Rectangle extends Shape
{
    float length,breadth;
    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        length = scan.nextFloat();
        System.out.println("Please enter the breadth of the rectangle: ");
        breadth = scan.nextFloat();
    }
    public void compute()
    {
        area = length * breadth;
    }
}

class Circle extends Shape
{
    float radius;
    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        radius = scan.nextFloat();
    }
    public void compute()
    {
        area = 3.14f * radius * radius;
    }
}
class Calc
{
    public static void run(Shape s)
    {
        s.acceptInput();
        s.compute();
        s.disp();
    }
}

public class Main
{
	public static void main(String[] args) 
	{
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Calc.run(s);
		Calc.run(r);
		Calc.run(c);
	}
}
