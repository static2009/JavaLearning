import java.util.Scanner;

public class Learning {
	public static void main(String[] args){
		/* TNB #15
		tuna tunaObject = new tuna();
		tunaObject.simpleMessage();
		
		TNB #16
		Scanner input = new Scanner (System.in);
		tuna tunaObject = new tuna();
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		tunaObject.simpleMessage(name);
		input.close();
		*/
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		System.out.println("Enter name of first gf here: ");
		String temp = input.nextLine();
		tunaObject.setName(temp);
		tunaObject.saying();
		input.close();
	}
}
