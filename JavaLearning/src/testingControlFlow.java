import java.util.Scanner;
public class testingControlFlow 
{
	//Method which controls the flow to other methods.
	public static void harambe()
	{
		//Ask User if Harambe is a God.
		Scanner isGod = new Scanner(System.in);
		System.out.println("Is Harambe a God?  y/n");
		String harambe = isGod.nextLine();
		//In the instance of the User selecting 'y', the fillerMethod runs.
		while (harambe.equals("y"))
		{
			fillerMethod();
			Scanner end = new Scanner(System.in);
			System.out.println("Would you like to exit? y/n");
			String endCheck = end.nextLine();
			if (endCheck == "y")
			{
				exit(); //Run the exit method.
			}
			else
			{
				//Tried to make it more complex than necessary. Oops!
				continue;
			}
			end.close();
		}
		exit();
		isGod.close();
	}
	//The golden chest of the program. 
	public static void fillerMethod()
	{
		System.out.println("This is filler with Harambe Ipsum");
		System.out.println("");
		System.out.println("sixteen of train just the letters have a HaramBAE for");
		System.out.println("");
		System.out.println("zoo their has Can't tell banana you're have When Harambe");
		System.out.println("Thanks for participating!");
	}
	//Method for checking if the User is sure they want to exit.
	public static void exit()
	{
		Scanner check1 = new Scanner(System.in);
		System.out.println("Exit? y/n");
		String checked = check1.nextLine();
		//If they are sure they want to exit, then print a response and terminate.
		if (checked == "y")
		{
			System.out.println("Exiting...");
		}
		//If they do not want to exit, return to Harambe, but this is currently broken.
		else if (checked == "n")
		{
			harambe();
		}
		//Make sure the User chooses an option.
		else
		{
			System.out.println("Please choose an option :)");
			System.out.println(" ");
			exit();
		}
		check1.close();
	}
	public static void main(String[] args)
	{
		//Run the flow control method.
		harambe();
	}
}