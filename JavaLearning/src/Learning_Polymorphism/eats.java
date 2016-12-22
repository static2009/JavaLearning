package Learning_Polymorphism;

public class eats {
	public static void main(String[] args){
		/*
		//TNB 55
		fruit testArray[] = new fruit[2];
		testArray[0] = new orange();
		testArray[1] = new apple();
		
		for(int x = 0; x < 2; ++x){
			testArray[x].eat();
			*/
			
		glutton thom = new glutton();
		fruit fr = new fruit();
		fruit or = new orange();
		
		thom.digest(fr);
		thom.digest(or);
	}
}
