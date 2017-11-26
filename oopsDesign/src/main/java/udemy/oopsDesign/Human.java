package udemy.oopsDesign;

/**
 * class Human
 *
 */
public class Human {

	String name;
	int age;
	int heightInInches;
	int eyeColor;

	public Human() {

	}

	private void speak() {
		System.out.println("Hello there, my name is " + name);
		System.out.println("I am " + age + " years old");
		System.out.println("I am " + heightInInches + " inches in height");
		System.out.println("My eye color is " + eyeColor);
	}

	private void eat() {
		System.out.println("eating ...");
	}

	private void walk() {
		System.out.println("walking ...");
	}

}
