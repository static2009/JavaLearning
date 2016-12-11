import java.util.Scanner;
import java.util.Random;

public class TNB_Learning_15to26 {
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
		
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		System.out.println("Enter name of first gf here: ");
		String temp = input.nextLine();
		tunaObject.setName(temp);
		tunaObject.saying();
		input.close();
		
		//TNB #17
		tuna tunaObject = new tuna("Kelsey");
		tuna tunaObject2 = new tuna("Nicole");
		tunaObject.saying();
		tunaObject2.saying();

		//TNB #18
		int age = 50;
		
		if(age < 50){
			System.out.println("You are young");
		}else{
			System.out.println("You are old");
			if(age > 75){
				System.out.println("you are REALLY old");
			}else{
				System.out.println("You aren't really that old");
			}
		}

		//TNB #19
		int age = 45;
		
		if(age >= 60){
			System.out.println("You are a senior citizen.");
		}else if(age >= 50){
			System.out.println("You are in your fifties");
		}else if( age >= 40){
			System.out.println("You are in your fourties");
		}else{
			System.out.println("You are  a young buck.");
		}
		
		//TNB #20
		int age = 25;
		
		System.out.println(age > 50 ? "You are old" : "You are young");

		//TNB #21
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		while (counter < 10){
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		average = total / 10;
		System.out.println("Your grade is: " + average);
		input.close();

		//TNB #22
		for (int counter = 6; counter <= 21; counter+=3){
			System.out.println(counter);
		}

		//TNB #23
		double amount;
		double principle = 10000;
		double rate = .01;
		
		for (int day=1; day<=20; day++){
			amount = principle*Math.pow(1 + rate, day);
			System.out.println(day + "   " + amount);
		}

		//TNB #24
		int counter = 0;
		
		do{
			System.out.println(counter);
			counter++;
		}while(counter <= 10);

		//TNB #25
		System.out.println("The aboslute value of -26.7 is: " + Math.abs(-26.7));
		System.out.println("The next highest value of 7.4 is: " + Math.ceil(7.4));
		System.out.println("The next lowest value of 7.8 is: " + Math.floor(7.8));
		System.out.println("The highest of value between 8.6 and 5.2 is: " + Math.max(8.6, 5.2));
		System.out.println("The lowest value between 8.6 and 5.2 is: " + Math.min(8.6, 5.2));
		System.out.println("5 to the power of 3 is: " + Math.pow(5, 3));
		System.out.println("the square root of 9 is: " + Math.sqrt(9));
		*/
		//TNB #26
		Random dice = new Random();
		int number;
		
		for (int counter=1; counter<=10; counter++){
			number = 1+dice.nextInt(6);
			System.out.println(number + " ");
		}
	}
}
