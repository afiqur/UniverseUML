package ARP;

public class Human extends Animal implements Drinking {

	public Human(double height, double weight) {
		super(height, weight);
	}

	public void animalDisplay() {
		System.out.println("Human is the best animal...");
		System.out.println("Human height: " + height + "feet, Human Weight: " + weight);
	}

	public boolean isMammal() {
		return true;
	}

	public void drinks() {
		System.out.println("Human Drinks Water...");
	}
}

