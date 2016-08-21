

public class Animal 
{
	
	//Class Variables
	String animalType , animalBreed , a = "missing";
	int animalAge;
	float animalWeight , animalHeight;
	
	//Class Constructors
	public Animal() 
	{

	}
	
	public Animal(String type , String breed) 
	{
		this.animalType = type;
		this.animalBreed = breed;
	}
	
	public Animal(int age) 
	{
		this.animalAge = age;
	}
	
	public Animal(float weight, float height) 
	{
		this.animalWeight = weight;
		this.animalHeight = height;
	}
	
	//Class Methods
	public void type() 
	{
		if (animalType != null) {
		System.out.println(animalType);
		}
		else {
			System.out.println(a);
		}
	}
	
	public void breed() 
	{
		if (animalBreed != null) {
			System.out.println(animalBreed);
		}
		else {
			System.out.println(a);
		}
	}
	
	public void age() 
	{
		System.out.println(animalAge);
	}
	
	public void weight() 
	{
		System.out.println(animalWeight);
	}
	
	public void height() 
	{
		System.out.println(animalHeight);
	}

	
	public static void main(String[] args) 
	{
		/*
		 * Testing Methods and Constructors
		 * Will expand with other classes 
		 * in the future, but for now
		 * this will work
		 */
		Animal Bear = new Animal();
		Bear.type();
		Bear.breed();
		Bear.age();
		Bear.weight();
		Bear.height();
		
	}
	
}
