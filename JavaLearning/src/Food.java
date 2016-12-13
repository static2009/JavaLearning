import java.util.EnumSet;

public class Food {
	public static void main(String[] args) {
		for(potato cooking : potato.values())
			System.out.printf("%s\t%s\t%s\n", cooking, cooking.getDesc(), cooking.getQuantity());
		
		System.out.println("\nAnd now for the range of constants!!!\n");
		for(potato cooking : EnumSet.range(potato.mashed, potato.roasted))
			System.out.printf("%s\t%s\t%s\n", cooking, cooking.getDesc(), cooking.getQuantity());
	}
}
