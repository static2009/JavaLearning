public class Animal {
	
	//Class Variables
	String animalType;
	String animalBreed;
	int animalAge;
	Double animalWeight;
	Double animalHeight;
	
	public Animal() {
		animalType = "missing";
		animalBreed = "missing";
	}
	
	public Animal(String info) {
		this.animalType = info;
	}
	
	public Animal(int age) {
		this.animalAge = age;
	}
	
	public void type() {
		System.out.println(animalType);
	}

	
	public static void main(String[] args) {
		Animal Bear = new Animal("Bear");
		System.out.println(Bear);
		
	}
	
}
