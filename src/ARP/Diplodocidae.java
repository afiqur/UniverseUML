package ARP;

public class Diplodocidae extends Dinosaur implements Drinking {

	public Diplodocidae(double height, double weight, int size, String eatingHabit) {
		super(height, weight, size, eatingHabit);

	}

	public void diplodocidaeDisplay() {
		super.animalDisplay();
		super.isMammal();
		super.dinosaurDisplay();
		super.destroyEverything();
	}

	public void drinks() {
		System.out.println("Diplodocidae Drinks Water...");
	}
}


