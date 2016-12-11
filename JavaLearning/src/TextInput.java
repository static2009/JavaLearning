import java.util.Scanner;

public class TextInput {
	
	
		public static void main(String[] args) 
		{
			Scanner scan1 = new Scanner (System.in);
			System.out.println("Enter value: ");
			int user_input_number = scan1.nextInt();
			System.out.println("Value is: " + user_input_number);
			
			Scanner scan2 = new Scanner (System.in);
			System.out.println("Enter decimal: ");
			double user_input_double = scan2.nextDouble();
			System.out.println("Value is: " + user_input_double);
			
			Scanner scan3 = new Scanner (System.in);
			System.out.println("Enter String: ");
			String user_input_string = scan3.nextLine();
			System.out.println("String is: " + user_input_string);
			
			scan1.close();
			scan2.close();
			scan3.close();
		}
}
