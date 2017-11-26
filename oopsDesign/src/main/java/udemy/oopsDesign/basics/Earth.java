package udemy.oopsDesign.basics;

public class Earth {
	public static void main(String[] args) {
		Human tom = new Human("Tom hardy", 27, 72, "Brown");
		Human rajasekar = new Human("Rajasekar", 27, 65, "black");

		tom.speak();
		rajasekar.speak();
	}
}
