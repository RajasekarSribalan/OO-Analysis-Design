package udemy.oopsDesign.basics2;

public class Zoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Animal animal1 = new Animal("Dog", 12, 18);
		animal1.eat();
		animal1.walk();

		Bird bird1 = new Bird();
		bird1.fly();

	}
}
