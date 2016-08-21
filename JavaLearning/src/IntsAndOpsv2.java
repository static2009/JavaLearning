import java.util.Scanner;
public class IntsAndOpsv2 {
	
	public IntsAndOpsv2()
	{
		
	}
	

	
	public void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		int first = x.nextInt();
		Scanner y = new Scanner(System.in);
		int second = x.nextInt();
		Scanner userOperator = new Scanner(System.in);
		String operator = userOperator.next();
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(operator);
		
		x.close();
		y.close();
		userOperator.close();
	}
}
