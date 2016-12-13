
public class Learning_Statics {
	public static void main(String[] args) {
		artichoke member1 = new artichoke("Test", "Name");
		artichoke member2 = new artichoke("Fake", "Last");
		artichoke member3 = new artichoke("First", "Last");
		
		System.out.println(artichoke.getMembers());
	}
}
