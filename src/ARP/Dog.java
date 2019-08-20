package ARP;

public class Dog extends Animal {

	public Dog(double height, double weight) {
		super(height, weight);

	}

	public void animalDisplay() {
		System.out.println("Height: " + height + "feet, Weight: " + weight);
	}

	public boolean isMammal() {
		
		return true;
	}

	public void waggingTail() {
		System.out.println("Dog is wagging Tail...");
	}
}


