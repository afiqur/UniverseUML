package ARP;

abstract class Animal {
	protected double height, weight;

	public Animal(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	abstract void animalDisplay();

	abstract boolean isMammal();

}

