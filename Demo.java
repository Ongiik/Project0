//Benen Kim
//CS1400
//Assignment 5
//11/17/2021
public class Demo {
    public static void main(String[] args)
    {
        Person person1 = new Person("Ryan", "apples", 24);
        Person person2 = new Person(person1);
        Superhero superhero1 = new Superhero("Ryan", "Apples", 24, 
                                            "Jett", "Flying", "WATCH THIS!!");
        Superhero superhero2 = new Superhero("Devin", "Oranges", 23, 
                                            "Raze", "Explosives", "It's party time!");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(superhero1);
        System.out.println(superhero2);
        superhero1.catchVillain();
        superhero2.catchVillain();
        superhero1.villainsCaught();
        if(person1.equals(person2))
            System.out.println("Person 1 and "
                            + "Person 2 are equal.");
        else
            System.out.println("Person 1 and "
                            + "Person 2 are not equal.");
        if(superhero1.equals(superhero2))
            System.out.println("Superhero 1 and "
                            + "Superhero 2 are equal.");
        else
            System.out.println("Superhero 1 and "
                            + "Superhero 2 are not equal.");
        superhero1.speak();
        superhero2.speak();
        
    }
}
