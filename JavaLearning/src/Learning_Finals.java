public class Learning_Finals {
	public static void main(String[] args) {
		eggs eggsObject = new eggs(10);
		
		for(int i = 0; i < 5; i++){
			eggsObject.add();
			System.out.printf("%s", eggsObject);
		}
	}
}
