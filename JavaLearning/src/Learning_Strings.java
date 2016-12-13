
public class Learning_Strings {
	public static void main(String[] args){
		Taco tacoObject = new Taco(4, 5, 6);
		Queso quesoObject = new Queso("Greg", tacoObject);
		
		System.out.println(quesoObject);
	}
}
