package udemy.oopsDesign.basics.inheritance;

public class Fish extends Animal{
	public Fish(String name, int height, int weightinLbs) {
		super(name, height, weightinLbs);
	}

	public void swim() {
		System.out.println("Swimming....");
	}
}
