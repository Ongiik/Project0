//Benen Kim
//CS1400
//Assignment 5
//11/17/2021
public class Superhero extends Person{
    String superName;
    String superpower;
    String catchphrase;
    static int totalNumberVillainsCaught;
    //constructor
    public Superhero(String name, String food, int a, String n, String s, String c)
    {
        super(name, food, a);
        this.superName = n;
        this.superpower = s;
        this.catchphrase = c;
    }
    //setters
    public void setName(String n)
    {
        this.superName = n;
    }
    public void setSuperpower(String s)
    {
        this.superpower = s;
    }
    public void setCatchphrase(String c)
    {
        this.catchphrase = c;
    }
    //getters
    public String getName()
    {
        return superName;
    }
    public String getSuperpower()
    {
        return superpower;
    }
    public String getCatchphrase()
    {
        return catchphrase;
    }

    public void speak()
    {
        System.out.println(catchphrase + " Wapam!");
    }
    public void catchVillain()
    {
        totalNumberVillainsCaught++;
    }
    public void villainsCaught()
    {
        System.out.println("Number of Villains Caught: " + totalNumberVillainsCaught);
    }
    public String toString()
    {
        String sentence = ". Superhero Name: " + superName + ", Superpower: " 
                            + superpower + ", Catchphrase: " + catchphrase;
        return super.toString() + sentence;
    }
}
