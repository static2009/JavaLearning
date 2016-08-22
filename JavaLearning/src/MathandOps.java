
import java.util.Scanner;

public class MathandOps 
{

	int x , y , z;
	
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
	
	public static void main(String[] args)
	{
		Scanner operator = new Scanner(System.in);
		System.out.println("Define Operator: ");
		String user_input = operator.nextLine();
		
		switch (user_input.toLowerCase())
		{
			case  "addition": Addition();
				break;
			case "subtraction": Subtraction();
				break;
			case "division": Division();
				break;
			default: System.out.println("You're a failure!");
		}
		
		operator.close();
	}
	
}
