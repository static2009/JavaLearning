import java.util.Scanner;
public class Learning {
	public static void main(String args[]) {
		/*
		//TNB #4
		System.out.println("Hello, Java");
		//TNB #5
		double tuna;
		tuna = 5.28;
		//The below stays on the same line until "println"
		System.out.print("I want ");
		System.out.print(tuna);
		System.out.println(" movies");
		//The below moves to new line due to "println"
		System.out.print("apples");
		//TNB #6
		Scanner bucky = new Scanner(System.in);
		System.out.println(bucky.nextLine());
		
		//TNB #7
		Scanner bucky = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter First Num: ");
		fnum = bucky.nextDouble();
		System.out.println("Enter Second Num: ");
		snum = bucky.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
		bucky.close();
		
		//TNB #8
		int girls, boys, people; //Defines people, later I'll add them together
		girls = 6;
		boys = 3;
		people = girls + boys;
		System.out.println(people);
		
		int dogs, cats, pets; //Defines pets, later I'll add them together
		dogs = 2;
		cats = 1;
		pets = dogs + cats;
		System.out.println(pets);
		
		int stuff; //Variable used to divide the amount of people against pets
		stuff = people / pets;
		System.out.println(stuff);
		
		int things; //Variable which takes the remainder between people and pets and gets the modulus against people
		things = people % stuff;
		System.out.println(things);
		
		//TNB #9
		int tuna = 5;
		int bass = 18;
		int ahi = 10;
		int swordfish = 3;
		int salmon = 4;
		
		System.out.println(++tuna); //should print 6
		System.out.println(bass++); //should print 18
		System.out.println(bass--); //should print 19
		System.out.println(bass); //should print 18
		ahi += 3;
		System.out.println(ahi); //should print 13
		swordfish += salmon;
		System.out.println(swordfish); //adds swordfish and salmon together to result in 7
		
		//TNB #10
		int fnum = 6;
		int snum = 9;
		int tnum = 3;
		if (fnum == 9) {
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
		if (snum < 18) {
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		if (tnum != 4) {
			System.out.println("no");
		}else{
			System.out.println("yes");
		}
		*/
		
		//TNB #11
		int boy, girl;
		boy = 18;
		girl = 40;
		
		if (boy > 10 && girl < 60) {
			System.out.println("You can enter");
		}else{
			System.out.println("YOU. SHALL NOT. PASS!!");
		}
		int cat, dog;
		cat = 3;
		dog = 15;
		if (cat > 5 || dog < 13) {
			System.out.println("Young'un");
		}else{
			System.out.println("MMMMMMMMMnope.");
		}
	}
}