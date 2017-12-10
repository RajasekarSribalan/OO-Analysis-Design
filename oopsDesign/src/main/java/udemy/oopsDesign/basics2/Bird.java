package udemy.oopsDesign.basics2;

public class Bird extends Animal{

	public Bird(String name, int height, int weightinLbs) {
		super(name, height, weightinLbs);
	}

	public void fly() {
		System.out.println("Flying....");
	}

}
