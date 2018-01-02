package udemy.oopsDesign.basics.abstractclass;

public class Sparrow extends Bird implements Flyable
{

    public Sparrow(String name, int height, int weightinLbs)
    {
        super(name, height, weightinLbs);
    }

    public void fly()
    {
       System.out.println("Flying");
        
    }

   

}
