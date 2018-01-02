package udemy.oopsDesign.basics.abstractclass;

public class Zoo
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {

        Sparrow sparrow = new Sparrow("Dove", 11, 17);
        //sparrow.move();

        Fish fish = new Fish("Shark", 11, 17);
        //fish.move();
        
        moveAnimal(sparrow);
        moveAnimal(fish);
    }
    

    public static void moveAnimal(Animal animal)
    {
        animal.move();
    }
}
