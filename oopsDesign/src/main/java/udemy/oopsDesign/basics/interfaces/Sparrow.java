package udemy.oopsDesign.basics.interfaces;

public class Sparrow extends Bird implements Flyable
{

    public Sparrow(String name, int height, int weightinLbs)
    {
        super(name, height, weightinLbs);
    }

    public void fly()
    {
        System.out.println("Sparrow flying....");

    }

}
