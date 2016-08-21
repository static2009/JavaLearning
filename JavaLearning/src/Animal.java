public class Animal {
	
	//Class Variables
	String animalType;
	String animalBreed;
	Double animalAge;
	Double animalWeight;
	Double animalHeight;
	
	public Animal() {
		animalType = "missing";
		animalBreed = "missing";
	}
	
	public Animal(String info) {
		this.animalType = info;
	}

	
	public static void main(String[] args) {
		Animal animal1 = new Animal("Bear");
		System.out.println(animal1);
		
	}
	
}
