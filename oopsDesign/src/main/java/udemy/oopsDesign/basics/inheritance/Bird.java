package udemy.oopsDesign.basics.inheritance;

public class Bird extends Animal{

	public Bird(String name, int height, int weightinLbs) {
		super(name, height, weightinLbs);
	}

	public void fly() {
		System.out.println("Flying....");
	}

}
