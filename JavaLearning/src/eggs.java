public class eggs {
	private int sum;
	private final int NUMBER;
	
	public eggs(int x){
		NUMBER = x;
	}
	public void add(){
		sum += NUMBER;
	}
	public String toString(){
		return String.format("sum = %d\n", sum);
	}
}
