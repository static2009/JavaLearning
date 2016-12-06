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
		*/
		//TNB #7
		Scanner bucky = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter First Num: ");
		fnum = bucky.nextDouble();
		System.out.println("Enter Second Num: ");
		snum = bucky.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}
