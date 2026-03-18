/**
*Importing the Scanner class which is stored inside the java.util package.
*/
import java.util.Scanner;

/**
*Taking the input from the first user and storing it inside a variable one.
*/
class One
{
	static int guess1()
	{
		System.out.println("First guess : ");
		Scanner x = new Scanner(System.in);
		int one = x.nextInt();
		return one;

	}

}

/**
*Taking the input from the second user and storing it inside a variable two.
*/
class Two
{
	static int guess2()
	{
		System.out.println("Second guess : ");
		Scanner x = new Scanner(System.in);
		int two = x.nextInt();
		return two;

	}

}

/**
*Taking the input from the third user and storing it inside a variable three.
*/
class Three
{
	static int guess3()
	{
		System.out.println("Third guess : ");
		Scanner x = new Scanner(System.in);
		int three = x.nextInt();
		return three;

	}

}

/**
*Comparing the guessed number with all the three numbers given by the three players and printing the output accordingly.
*/
class Compare
{
	static void compare(int a,int x, int y, int z)
	{
		if(a == x)
		{
			System.out.println("Player 1 won.");
		}
		else if(a == y)
		{
			System.out.println("Player 2 won.");
		}
		else if(a == z)
		{
			System.out.println("Player 3 won.");
		}
		else
		{
			System.out.println("Better Luck Next Time.");
		}
	}

}

/**
*The main class which will be executed for the whole problem.
*/
public class Launch
{
	public static void main(String[] args)
	{
		System.out.println("Guess the number : ");
		Scanner scanned = new Scanner(System.in);
		int number = scanned.nextInt();
		
		int first = One.guess1();
		int second = Two.guess2();
		int third = Three.guess3();

		Compare.compare(number, first, second, third);

	}


}