package ARP;

public class Dinosaur extends Animal {

	public int size;
	public String eatingHabit;

	public Dinosaur(double height, double weight, int size, String eatingHabit) {
		super(height, weight);
		this.size = size;
		this.eatingHabit = eatingHabit;
	}

	public void animalDisplay() {
		System.out.println("Height: " + height + "feet, Weight: " + weight);
	}

	public boolean isMammal() {
		return false;
	}

	public void dinosaurDisplay() {
		System.out.println("Dinosaur size: " + size + ", Dinosaur eating Habit: " + eatingHabit);

	}

	public void destroyEverything() {
		System.out.println("Dinosaur is Destroying Everything...");
	}

}


