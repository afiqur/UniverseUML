package ARP;

public class Poodle extends Dog implements Drinking {

	public Poodle(double height, double weight) {
		super(height, weight);

	}

	public String cute() {
		return "Poodle is Cute...";
	}

	public void poodleDisplay() {
		super.animalDisplay();
		super.isMammal();
		super.waggingTail();
	}

	public void drinks() {
		System.out.println("Greyhound Drinks Water...");
	}

}


