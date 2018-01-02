package udemy.oopsDesign.basics.abstractclass;

public class Fish extends Animal{
	public Fish(String name, int height, int weightinLbs) {
		super(name, height, weightinLbs);
	}

	public void swim() {
		System.out.println("Swimming....");
	}

    @Override
    public void move()
    {
        System.out.println("Fish swim...");
        
    }
}
