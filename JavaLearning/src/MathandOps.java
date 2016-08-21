
import java.util.Scanner;

public class MathandOps 
{

	int x , y , z;
	
	public MathandOps()
	{
		
	}
		public void Addition() 
		{
			Scanner add1 = new Scanner(System.in);
			int x = add1.nextInt();
			Scanner add2 = new Scanner(System.in);
			int y = add2.nextInt();
			int sum = x + y;
			System.out.println("Sum of " + x + "and " + y + "is " + sum);
			
			add1.close();
			add2.close();
		}
		
		public void Subtraction()
		{
			Scanner sub1 = new Scanner(System.in);
			int x = sub1.nextInt();
			Scanner sub2 = new Scanner(System.in);
			int y = sub2.nextInt();
			int difference = x - y;
			System.out.println("Difference of " + x + "and " + y + "is " + difference);
			
			sub1.close();
			sub2.close();
		}
		
		public void Division()
		{
			Scanner div1 = new Scanner(System.in);
			int x = div1.nextInt();
			Scanner div2 = new Scanner(System.in);
			int y = div1.nextInt();
			int division = x / y;
			System.out.println("Division of " + x + "and " + y + "is " + division);
			
			div1.close();
			div2.close();
		}
	
	public void main(String[] args)
	{
		MathandOps Test = new MathandOps();
		System.out.println(Test);
	}
	
}
