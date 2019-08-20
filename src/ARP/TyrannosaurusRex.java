package ARP;

public class TyrannosaurusRex extends Dinosaur implements Drinking {

	public TyrannosaurusRex(double height, double weight, int size, String eatingHabit) {
		super(height, weight, size, eatingHabit);

	}

	public void tyrannosaurusRexDisplay() {
		super.animalDisplay();
		super.isMammal();
		super.dinosaurDisplay();
		super.destroyEverything();
	}

	public void drinks() {
		System.out.println("TyrannosaurusRex Drinks Water...");
	}
}


