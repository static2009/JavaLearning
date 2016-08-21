
import java.util.Scanner;

public class MathandOps 
{

	int x , y , z;
	
	public MathandOps()
	{
		
	}
		public static void Addition() 
		{
			Scanner add1 = new Scanner(System.in);
			System.out.println("First value: ");
			int x = add1.nextInt();
			System.out.println("Second value: ");
			int y = add1.nextInt();
			int sum = x + y;
			System.out.println("Sum of " + x + " and " + y + " is " + sum);
			
			add1.close();
		}
		
		public static void Subtraction()
		{
			Scanner sub1 = new Scanner(System.in);
			System.out.println("First value: ");
			int x = sub1.nextInt();
			System.out.println("Second value: ");
			int y = sub1.nextInt();
			int difference = x - y;
			System.out.println("Difference of " + x + " and " + y + " is " + difference);
			
			sub1.close();
		}
		
		public static void Division()
		{
			Scanner div1 = new Scanner(System.in);
			System.out.println("First value: ");
			int x = div1.nextInt();
			System.out.println("Second value: ");
			int y = div1.nextInt();
			int division = x / y;
			System.out.println("Division of " + x + " and " + y + " is " + division);
			
			div1.close();
		}
		
		public static void Operator()
		{
			Scanner operator = new Scanner(System.in);
			System.out.println("Define operator: ");
			String test = operator.nextLine();
			
			operator.close();
		}
	
	public static void main(String[] args)
	{
		
		MathandOps.Addition();
		MathandOps.Subtraction();
		MathandOps.Division();
	}
	
}
