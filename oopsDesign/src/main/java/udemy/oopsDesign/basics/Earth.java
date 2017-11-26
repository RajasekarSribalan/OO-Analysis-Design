package udemy.oopsDesign.basics;

public class Earth {
	public static void main(String[] args) {
		Human tom = new Human();
		tom.name = "Tom hardy";
		tom.age = 27;
		tom.heightInInches = 72;
		tom.eyeColor = "Brown";

		tom.speak();
		tom.eat();
		tom.walk();
	}
}
