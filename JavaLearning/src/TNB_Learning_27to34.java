import java.util.Random;

public class TNB_Learning_27to34 {
	public static void main(String[] args){
		/*
	//TNB #27
		int bucky[] = new int[10];
		
		bucky[0] = 87;
		bucky[1] = 543;
		bucky[9] = 65;
		
		System.out.println(bucky[9]);
		
		int madderoz[] = {2, 4, 5, 7, 9};
		System.out.println(madderoz[3]); //Should print 7
		
		String gladderoz[] = {"This", "is", "an", "array"};
		System.out.println(gladderoz[3]);//Should print 'array'
		
		double lame[] = {2.2, 4.32, 5.6, 8.2, 9.0};
		System.out.println(lame[2]);//Should print 5.6

	//TNB #28
		System.out.println("Index\tValue");
		int madderoz[] = {32, 12, 18, 54, 2};
		for (int counter = 0;counter < madderoz.length;counter++){
			System.out.println(counter + "\t" + madderoz[counter]);
		}
		
		String gladderoz[] = {"This", "is", "an", "awesome", "array", "!"};
		for (int count = 0;count < gladderoz.length;count++){
			System.out.println(count + "\t" + gladderoz[count]);
		}

	//TNB #29
		int madderoz[] = {21, 16, 86, 21, 3};
		int sum = 0;
		
		for (int counter = 0;counter < madderoz.length;counter++){
			sum += madderoz[counter];
		}
		
		System.out.println("the sum of these numbers is: " + sum);
		
		String gladderoz[] = {"This ", "is ", "an ", "even ", "better ", "array."};
		String concat = "";
		
		for (int counter = 0; counter < gladderoz.length;counter++){
			concat += gladderoz[counter];
		}
		
		System.out.println(concat);

	//TNB #30
		Random rand = new Random();
		int freq[] = new int[7];
		
		for (int roll = 1; roll < 1000; roll++){
			++freq[1 + rand.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		
		for (int face = 1; face < freq.length;face++){
			System.out.println(face + "\t" + freq[face]);
		}

	//TNB #31
		int madderoz[] = {3, 4, 5, 6, 7};
		int total = 0;
		
		for (int x: madderoz){
			total += x;
		}
		
		System.out.println(total);
		
	//TNB #32
		int madderoz[] = {3, 4, 5, 6, 7};
		change(madderoz);
		
		for (int y : madderoz){
			System.out.println(y);
		}

	//TNB #33
		int firstarray[][] = {{8, 9, 10, 11}, {12, 13, 14, 15}};
		
		System.out.println(firstarray[0][1]);//Should print 9
		
		int secondarray[][] = {{30, 31, 32, 33}, {43}, {4, 5, 6}};
		
		System.out.println(secondarray[1][0]);//Should print 43
		*/
	//TNB #34
		int firstarray[][] = {{8, 9, 10, 11}, {12, 13, 14, 15}};
		int secondarray[][] = {{30, 31, 32, 33}, {43}, {4, 5, 6}};
		System.out.println("a\tb\tc\td\te\tf");
		display(firstarray);
		System.out.println();
		System.out.println("a\tb\tc\td\te\tf");
		display(secondarray);
	}
	//TNB #32
	public static void change(int x[]){
		for (int counter = 0; counter < x.length; counter++){
			x[counter] += 5;
		}
	}
	//TNB #34
	public static void display(int x[][]){
		for (int row = 0; row < x.length; row++){
			for (int column = 0; column < x[row].length; column++){
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}
}
