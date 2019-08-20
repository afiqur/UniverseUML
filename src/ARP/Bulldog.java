package ARP;

public class Bulldog extends Dog implements Drinking {

	public Bulldog(double height, double weight) {
		super(height, weight);

	}

	public String angry() {
		return "Bulldog is Angry...";

	}

	public void bulldogDisplay() {
		super.animalDisplay();
		super.isMammal();
		super.waggingTail();
	}

	public void drinks() {
		System.out.println("Bulldog Drinks Water...");
	}

}


