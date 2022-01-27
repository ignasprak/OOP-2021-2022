package ie.tudublin;

public class Cat extends Animal //Cat class being inherited from the animal class
{
    int numLives; //initialising variable

    public int getNumLives() //when a method is public, that means it can be accessed by other objects
    {
        return this.numLives; //why do we use this and return here?
    }

    public void setNumlives(int numLives)
    {
        this.numLives = numLives;
    }

    public Cat(String name)
    {
        super(name);
        numLives = 9;
    }

    public void Kill() //void cannot return values
    {
        // return numLives;
        if (this.numLives <= 0)
        {
            System.out.println("dead X-X");
        }
        else
        {
            System.out.println("ouchie! 0-0");
            this.numLives -= 1;
        }
    }

}

