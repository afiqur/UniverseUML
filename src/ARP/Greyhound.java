package ARP;

public class Greyhound extends Dog implements Drinking {

	public Greyhound(double height, double weight) {
		super(height, weight);

	}

	public String speedy() {
		return "Greyhound is Speedy...";
	}

	public void greyhoundDisplay() {
		super.animalDisplay();
		super.isMammal();
		super.waggingTail();
	}

	public void drinks() {
		System.out.println("Greyhound Drinks Water...");
	}

}


