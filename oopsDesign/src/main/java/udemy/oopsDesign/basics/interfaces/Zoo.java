package udemy.oopsDesign.basics.interfaces;

public class Zoo
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {

        Animal animal1 = new Animal("Dog", 12, 18);
        animal1.eat();
        animal1.walk();

        Sparrow sparrow = new Sparrow("Dove", 11, 17);
        sparrow.eat();
        sparrow.fly();
        sparrow.walk();
        
        Chicken chick = new Chicken("Dove", 11, 17);
        chick.eat();
        // chick.fly(); cannot call this method because we did not implement Flyable interface
        chick.walk();

    }
}
