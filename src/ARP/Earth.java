package ARP;

public class Earth {

	Human human;

	public Earth(Human human) {
		this.human = human;
	}

	public static void main(String[] args) {
		Human human = new Human(5.8, 76);
		human.animalDisplay();
		System.out.println("Is Human Mammal ? "+ human.isMammal());
		human.drinks();

		Bulldog bulldog = new Bulldog(1.5, 15);
		System.out.println(bulldog.angry());
		bulldog.bulldogDisplay();
		System.out.println("Is Bulldog Mammal ? "+ bulldog.isMammal());
		bulldog.drinks();

		Poodle poodle = new Poodle(2.5, 10);
		System.out.println(poodle.cute());
		poodle.poodleDisplay();
		System.out.println("Is Poodle Mammal ? "+ poodle.isMammal());
		poodle.drinks();

		Greyhound greyhound = new Greyhound(3.5, 12);
		System.out.println(greyhound.speedy());
		greyhound.greyhoundDisplay();
		System.out.println("Is Greyhound Mammal ? "+ greyhound.isMammal());
		greyhound.drinks();

		TyrannosaurusRex tyrannosaurusRex = new TyrannosaurusRex(100, 10000, 10000, "Non Vegetarian...");
		tyrannosaurusRex.tyrannosaurusRexDisplay();
		System.out.println("Is TyrannosaurusRex Mammal ? "+ tyrannosaurusRex.isMammal());
		tyrannosaurusRex.drinks();

		Diplodocidae diplodocidae = new Diplodocidae(150, 15000, 15000, "Vegetarian...");
		diplodocidae.diplodocidaeDisplay();
		System.out.println("Is Diplodocidae Mammal ? "+ tyrannosaurusRex.isMammal());
		diplodocidae.drinks();

	}

}


