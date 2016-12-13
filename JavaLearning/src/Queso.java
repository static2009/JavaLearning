
public class Queso {
	private String name;
	private Taco birthday;
	
	public Queso(String theName, Taco theDate){
		name = theName;
		birthday = theDate;
	}
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
