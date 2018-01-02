package udemy.oopsDesign.basics.abstractclass;

public class Bird extends Animal{

	public Bird(String name, int height, int weightinLbs) {
		super(name, height, weightinLbs);
	}

    @Override
    public void move()
    {
        System.out.println("Flapping wings......");
        
    }

}
